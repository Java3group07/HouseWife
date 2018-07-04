<%@page import="com.czxy.ssm.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<base href="${pageContext.request.contextPath }/">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <title>短信验证</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <script src="js/rem.js"></script> 
    <script src="js/jquery.min.js" type="text/javascript"></script>
    <link rel="stylesheet" type="text/css" href="css/base.css"/>
    <link rel="stylesheet" type="text/css" href="css/page.css"/>
    <link rel="stylesheet" type="text/css" href="css/all.css"/>
    <link rel="stylesheet" type="text/css" href="css/mui.min.css"/>
    <link rel="stylesheet" type="text/css" href="css/loaders.min.css"/>
    <link rel="stylesheet" type="text/css" href="css/loading.css"/>
    <link rel="stylesheet" type="text/css" href="slick/slick.css"/>
	<script type="text/javascript">
	$(window).load(function(){
		$(".loading").addClass("loader-chanage")
		$(".loading").fadeOut(300)
	})
		/*短信验证开始  */
		  var clock = '';
        var nums = 60;
        var btn;

        function doLoop() {
			nums--;
			btn = $("#PhoneVercodeBtn");
			if (nums > 0) {
				$("#PhoneVercodeBtn").text(nums+ '秒后重新获取');
			} else {
				clearInterval(clock); //清除js定时器
				$("#PhoneVercodeBtn").attr("disabled",false);
				$("#PhoneVercodeBtn").html('重新获取验证码');
				nums = 60; //重置 时间
			}
	   }
        
        $(function() {
           //实现手机验证码的发送
           $("#PhoneVercodeBtn").click(function(){
        	 var regex = /^1(3|5|6|7|8)\d{9}$/;
             var telephone = $("#telephone").val();
             
   			 if(!regex.test(telephone)){
      				alert("手机格式输入有误!");
      				return false;
   			 }
   			 
   			 //发送手机验证码
   			 $.post("${pageContext.request.contextPath}/send/sendCode.do?telephone="+telephone);
   			 
   			 $(this).attr("disabled",true);//按钮禁用
   			 $(this).html(nums + '秒后重新获取');
   			 clock = setInterval("doLoop()", 1000); //一秒执行一次

   			 return false;
           });
           
           /* //验证
           $("#phoneVercode").blur(function(){
        	   var phoneCode = $(this).val();
        	 /*   alert(phoneCode) 
        	   var url = "${pageContext.request.contextPath}/";
        	   var data = {"method":"send/validateCode.do","phoneCode":phoneCode};
        	   $.post(url,data,function(result){
        		   alert(result)
        		   if(!result){
        			   alert("验证码不正确！");
        			   $("#submit").attr("disabled",true);//按钮禁用
        		   }else{
        			   $("#submit").attr("disabled",false);//按钮禁用
        		   }
        	   },"json");
           }); */
           $("#submit").click(function(){
        	  
        	  var phoneVercode =  $("#phoneVercode").val();
        	 /*  alert(phoneVercode); */
           location.href="${pageContext.request.contextPath}/send/validateCode.do?phoneVercode="+phoneVercode;
           })
           
           
        }); 
        /*短信验证结束  */
	</script>
</head>
<!--loading页开始-->
<div class="loading">
	<div class="loader">
        <div class="loader-inner pacman">
          <div></div>
          <div></div>
          <div></div>
          <div></div>
          <div></div>
        </div>
	</div>
</div>
<!--loading页结束-->
	<body>
		<div class="headertwo clearfloat" id="header">
			<a href="javascript:history.go(-1)" class="fl box-s"><i class="iconfont icon-arrow-l fl"></i></a>
			<p class="fl">短信验证</p>
		</div>
		
		<div class="modify clearfloat" id="main">
		
			<ul>
				<li class="clearfloat">
				<%
				
				  User user = (User)request.getSession().getAttribute("user"); %>
					<input type="text" name="telephone" id="telephone" value="<%= user.getPhone() %>"  class="syzma fl" />
					<!-- <button id="PhoneVercodeBtn" class="fr">发送验证码</button> -->
					<a href="#" id="PhoneVercodeBtn" class="fr">发送验证码</a>
				</li>
				<li class="clearfloat">
					<!-- <input type="text" name="" id="" value=""  class="sname" /> -->
					<input type="text" id="phoneVercode" name="phoneVercode"
					placeholder="请输入手机短信中的验证码" class="sname" placeholder="输入手机验证码" />
				</li>	
				<li class="clearfloat">
					<span>${msg }</span>
				</li>				
			</ul>
			<a  class="pay-btn clearfloat"  id="submit">
			<!-- <input class="btn btn-danger btn-block btn-signup" id="submit" type="submit"
							value="保&nbsp;&nbsp;&nbsp;&nbsp;存" /> -->
				验证
			</a>
		</div>		
	</body>
	<script type="text/javascript" src="js/jquery-1.8.3.min.js" ></script>
	<script type="text/javascript" src="js/jquery.SuperSlide.2.1.js" ></script>
	<script type="text/javascript" src="slick/slick.min.js" ></script>
	<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
	<script type="text/javascript" src="js/tchuang.js" ></script>
	<script type="text/javascript" src="js/hmt.js" ></script>
</html>
