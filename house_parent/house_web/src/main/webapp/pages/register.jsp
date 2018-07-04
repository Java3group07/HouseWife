<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<base href="${pageContext.request.contextPath }/">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <title>用户注册</title>
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
        	 var regex = /^1[3|4|5|7|8][0-9]{9}$/;
             var telephone = $("#telephone").val();
   			 if(!regex.test(telephone)){
      				alert("手机输入有误!");
      				return false;
   			 }
   			 
   			 //发送手机验证码
   			 
   			 $.post("${pageContext.request.contextPath}/user/activateCode.do?phone="+telephone);
   			 
   			 $(this).attr("disabled",true);//按钮禁用
   			 $(this).html(nums + '秒后重新获取');
   			 clock = setInterval("doLoop()", 1000); //一秒执行一次

   			 return false;
           });
           
   
           $("#submit").click(function(){
        	  
        	  var phoneVercode =  $("#phoneVercode").val();
        	 /*  alert(phoneVercode); */
           location.href="${pageContext.request.contextPath}/user/validateCodes.do?phoneVercode="+phoneVercode;
           })
           
           
        }); 
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
			<p class="fl">用户注册</p>
		</div>
		<form action="${pageContext.request.contextPath }/user/regist.do" method="post">
		<div class="register clearfloat" id="main">
			<ul>
				<li class="clearfloat">
					<p class="tit fl">用户名</p>
					<input type="text" name="username" id="" value="" class="shuru fl" placeholder="请输入用户名" />
				</li>
				<li class="clearfloat">
					<p class="tit fl">手机号</p>
					<input type="text" name="phone" required="required" id="telephone" value="" class="shuru fl" placeholder="请输入手机号码" />
				</li>
				<li class="clearfloat">
					<p class="tit fl">验证码</p>
					<input type="text" id="phoneVercode" name="phoneVercode" value="" class="shuru shurutwo fl" placeholder="请输入短信验证码" />
						<input type="button" id="PhoneVercodeBtn" value="获取短信验证码" class="btn fr" />
					<!-- <a href="#loginmodalt" id="modaltrigger">
					</a> -->
				</li>
				<li class="clearfloat">
					<p class="tit fl">密码</p>
					<input type="password" name="password" id="" value="" class="shuru fl" placeholder="请设置密码" />
				</li>
				<li class="clearfloat">
					<p class="tit fl">确认密码</p>
					<input type="password" name="password2" id="" value="" class="shuru fl" placeholder="请再次输入密码" />
				</li>
			</ul>
			<div><font color="red"><h4>${msg}</h4></font></div>
			<input type="submit" class="pay-btn clearfloat" value="注册"/>
			<div class="bottom clearfloat">
				<p class="fl">
					已有账号？
					<a href="sign.jsp">立即登录</a>
				</p>
			</div>
			</form>
		</div>
		
		<!-- <!--弹窗内容 star-->
	   <!--  <div id="loginmodalt" class="box-s loginmodaltwo" style="display:none;">
	    	<div class="top clearfloat box-s">
	    		<p class="tit">请输入图片验证码</p>
	    		<div class="xia clearfloat">
	    			<input type="text" id="" value="" class="yzm fl" placeholder="填写图片验证码" />
	    		<span class="fl">reties</span>
	    		<i class="iconfont icon-shuaxin fr"></i>
	    		</div>
	    	</div> -->
	
	    	
			<form id="loginform" name="loginform" method="post" action="">		
				<div class="center fl"><input type="submit" name="loginbtn" id="loginbtn" class="hidemodal" value="取消" tabindex="3"></div>
				<div class="center fl"><input type="submit" name="loginbtn" id="loginbtn" class="hidemodal" value="确定" tabindex="3"></div>
			</form>			
		</div>
	    <!--弹窗内容 end-->
	</body>
	<script type="text/javascript" src="js/jquery-1.8.3.min.js" ></script>
	<script type="text/javascript" src="js/jquery.SuperSlide.2.1.js" ></script>
	<script type="text/javascript" src="js/hmt.js" ></script>
	<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
	<script type="text/javascript" src="js/tchuang.js" ></script>
</html>
