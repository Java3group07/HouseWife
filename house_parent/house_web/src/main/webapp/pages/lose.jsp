<%@page import="com.czxy.ssm.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<base href="${pageContext.request.contextPath }/">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <title>输入新密码</title>
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
		
		/* $(function(){
			$("#submit").click(function(){
			var password =$("#newpassword").val();
			var uid = $("#uid").val();
				alert(password);
				alert(uid);
				 location.href="${pageContext.request.contextPath}/user/updatePwd.do?password="+password+"&uid";
				
				
			}) */
		//})
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
			<p class="fl">输入新密码</p>
		</div>
		<form action="${pageContext.request.contextPath}/user/updatePwd.do" method="post">
		<div class="modify clearfloat" id="main">
			<ul>
			<%
				  User user = (User)request.getSession().getAttribute("user"); %>
				<input type="hidden" name="uid" value="<%= user.getUid() %>">
				<li class="clearfloat">
					<input type="password" name="password" id="password" value="" placeholder="请输入新密码" class="sname snametwo" />
				</li>
				<li class="clearfloat">
					<input type="password" name="repassword" id="repassword" value="" placeholder="请再次输入新密码" class="sname snametwo" />
				</li>	
			</ul>
			<!-- <a id="submit" class="pay-btn clearfloat">
				确认修改
			</a> -->
			<input type="submit" value="修改" class="pay-btn clearfloat">
		</div>
		</form>
	</body>
	<script type="text/javascript" src="js/jquery-1.8.3.min.js" ></script>
	<script type="text/javascript" src="js/jquery.SuperSlide.2.1.js" ></script>
	<script type="text/javascript" src="slick/slick.min.js" ></script>
	<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
	<script type="text/javascript" src="js/tchuang.js" ></script>
	<script type="text/javascript" src="js/hmt.js" ></script>
</html>
