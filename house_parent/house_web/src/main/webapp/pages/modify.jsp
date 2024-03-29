<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<base href="${pageContext.request.contextPath }/">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <title>修改密码</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <script src="js/rem.js"></script> 
    <script src="js/jquery.min.js" type="text/javascript"></script>
    <script src="js/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/base.css"/>
    <link rel="stylesheet" type="text/css" href="css/page.css"/>
    <link rel="stylesheet" type="text/css" href="css/all.css"/>
    <link rel="stylesheet" type="text/css" href="css/mui.min.css"/>
    <link rel="stylesheet" type="text/css" href="css/loaders.min.css"/>
    <link rel="stylesheet" type="text/css" href="css/loading.css"/>
    <link rel="stylesheet" type="text/css" href="slick/slick.css"/>
	<script type="text/javascript">
		
		function flushCheckCode(obj) {
			obj.src = (obj.src + '?' + new Date())
		}
		
		//刷新验证码
		$(function() {
			$("#photo").click(
				function() {
					$(this).prop(
						"src",
						"${pageContext.request.contextPath }/user/verifyCode.do&time"+ new Date().getTime())
				})
		})

		$(function() {
	        //实现手机验证码的发送
	        $("#PhoneVercodeBtn").click(function(){
	     	 var regex = /^1(3|5|6|7|8)\d{9}$/;
	          var phone = $("#phone").val();
				 if(!regex.test(phone)){
	   				alert("手机输入有误!");
	   				return false;
				 }
	        });
	     });
		
		
		
		$(window).load(function(){
			$(".loading").addClass("loader-chanage")
			$(".loading").fadeOut(300)
		})
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
			<p class="fl">修改密码</p>
		</div>
		
		<div class="modify clearfloat" id="main">
		<form action="${pageContext.request.contextPath }/user/update1.do" method="post">
			<ul>
				<li class="clearfloat">
					<input type="text" name="username" id="username"   placeholder="手机/邮箱/用户名" class="sname" />
				</li>
				<li class="clearfloat">
					<input type="text" name="checkCode" id="checkCode"  placeholder="请输入右图验证码" class="syzma fl" />
					<span class="fl"><img src="${pageContext.request.contextPath }/verify/verifyCode.do" onclick=flushCheckCode(this) alt="点击刷新验证码" style="cursor: hand" /></span>
					<!-- <a  class="fr">换一张</a> -->
				</li>
				<li><span>${msg }</span></li>
			</ul>
			<input type="submit" value="下一步" class="pay-btn clearfloat">
			<!-- <a id="a" class="pay-btn clearfloat">
				下一步
			</a> -->
			</form>
		</div>		
	</body>
	<script type="text/javascript" src="js/jquery-1.8.3.min.js" ></script>
	<script type="text/javascript" src="js/jquery.SuperSlide.2.1.js" ></script>
	<script type="text/javascript" src="slick/slick.min.js" ></script>
	<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
	<script type="text/javascript" src="js/tchuang.js" ></script>
	<script type="text/javascript" src="js/hmt.js" ></script>
</html>
