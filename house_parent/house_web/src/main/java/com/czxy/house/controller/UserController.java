package com.czxy.house.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.czxy.house.domain.User;
import com.czxy.house.service.UserService;
import com.czxy.house.util.RandomCode;
import com.czxy.house.util.SmsUtils;

@Controller	
@RequestMapping(path="/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	
	/**
	 * 用户注册
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping(path="/regist.do")
	public String regist(User user,Model model){
		
		User u = userService.regist(user);
		if(u!=null){
			/*model.addAttribute("msg", "注册成功，请登录");*/
			return "forward:/sign.jsp";
		}else{
			model.addAttribute("msg", "该手机号已被注册！");
			return "forward:/register.jsp";
		}
		
	}
	
	
	
	/**
	 * 用户登录
	 * @param user
	 * @param model
	 * @param session
	 * @return
	 */
		@RequestMapping(path="/login.do")
		public String login(User user,Model model,HttpSession session){
			User u = userService.login(user);
			if(u!=null){
				session.setAttribute("u", u);
				return "forward:/pages/p-center.jsp";
			}else{
				model.addAttribute("msg", "手机号或密码错误");
				return "sign";
			}
			
		}
	
		
		/**
		 * 验证验证码  和用户名输入是否正确
		 * @param model
		 * @param session
		 * @param u
		 * @param checkCode
		 * @return
		 */
		@RequestMapping(path = "/update1.do")
		public String update1(Model model, HttpSession session, User u, @RequestParam String checkCode) {
			String verCode = (String) session.getAttribute("verCode");
			if (verCode.equalsIgnoreCase(checkCode)) {
				User user = userService.update1(u.getUsername());
				if (user != null) {
					session.setAttribute("user", user);
					return "forward:/pages/short.jsp";
				}
				model.addAttribute("msg", "用户名输入有误,请重新输入");
				return "modify";
			} else {
				model.addAttribute("msg", "验证码有误,请重新输入");
				return "modify";
			}
		}
		/**
		 * 修改密码
		 * @param user
		 * @return
		 */
		@RequestMapping(path = "/updatePwd.do")
		public String updatePwd(User user) {
			userService.updatePwd(user);
			return "complete";
		}
		/**
		 * 回显用户数量 用ajax
		 * @return
		 */
		@RequestMapping(path="/findUserNum.do")
		public @ResponseBody Integer findUserNum(){
			
			int num = userService.findUserNum();
			
			return num;
		}	
	
		
		/**
		 * 发送手机验证码
		 * @throws Exception 
		 */
		@RequestMapping(path="/activateCode.do")
		public void activateCode(HttpServletRequest request,HttpSession session) throws Exception{
			String phone = request.getParameter("phone");
			String code = RandomCode.genCode();
			
			session.setAttribute("code", code);
			SmsUtils.sendSms(phone, code);
		}
		
		/**
		 * 修改密码时验证码校验
		 * @throws IOException 
		 */
		@RequestMapping(path="/validateCode.do")
		public String validateCode(HttpServletRequest request,HttpSession session,HttpServletResponse response) throws Exception{
			String phoneVerCode = (String) request.getAttribute("phoneVerCode");
			System.out.println(phoneVerCode);
			//从session域中获取生成的验证码
			String code = (String) session.getAttribute("code");
			if(!phoneVerCode.equals(code)){
				session.setAttribute("msg", "验证码错误");
				return "short";
			}else{
				return "lose";
			}
		}
		
		/**
		 * 修改密码
		 */
		@RequestMapping(path="/sendCode.do")
		public String sendCode(HttpServletRequest request,HttpSession session,HttpServletResponse response,User user){
			userService.updatePwd(user);
			//从session 域中移除user对象
			session.removeAttribute("u");
			return "complete";
		}
		
		/**
		 * 注册时验证码
		 * @param phoneVercode
		 * @param session
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping(path="/validateCodes.do")
		public String  validateCode(@RequestParam(name="phoneVercode") String phoneVercode,HttpSession session,Model model) throws Exception{
		 	
			String  code = (String) session.getAttribute("code");
			
			if (!phoneVercode.equals(code)) {
				model.addAttribute("msg", "验证码不正确！");
				return "register";
			}
			return "sign";
		}
}
