<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<base href="${pageContext.request.contextPath }/">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <title>余额提现</title>
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
			<p class="fl">余额提现</p>
		</div>
		
		<div class="carried clearfloat" id="main">
			<div class="top clearfloat box-s">
				<p class="tit fl">充值金额</p>
				<input type="text" id="" value="" class="fl" placeholder="建议转入100元以上金额" />
			</div>
			
			<div class="land-ctent land-ctenttwo bottom clearfloat">
				<ul>
					<li class="box-s clearfloat">
						<p class="tit fl">提现账号类型</p>
						<input type="text" name="" id="" value="" placeholder="请选择户型" class="fl day" />
						<i class="iconfont icon-arrowright fl"></i>
					</li>
					<li class="box-s clearfloat">
						<p class="tit fl">银行所在地区</p>
						<input type="text" name="" id="" value="" placeholder="请选择省市" class="fl day" />
						<i class="iconfont icon-arrowright fl"></i>
					</li>
					<li class="box-s clearfloat">
						<p class="tit fl">开户支行</p>
						<input type="text" name="" id="" value="" placeholder="如：高新区支行" class="fl" />
					</li>
					<li class="box-s clearfloat">
						<p class="tit fl">银行卡账号</p>
						<input type="text" name="" id="" value="" placeholder="请输入银行卡账号" class="fl" />
					</li>
					<li class="box-s clearfloat">
						<p class="tit fl">开户人姓名</p>
						<input type="text" name="" id="" value="" placeholder="请输入开户人姓名" class="fl" />
					</li>
					<li class="box-s clearfloat">
						<p class="tit fl">银行预留号码</p>
						<input type="text" name="" id="" value="" placeholder="请输入手机号码" class="fl" />
					</li>
				</ul>					
			</div>
			
			<a href="#" class="pay-btn clearfloat">
				确认提现
			</a>
		</div>
	</body>
	<script type="text/javascript" src="js/jquery-1.8.3.min.js" ></script>
	<script type="text/javascript" src="js/jquery.SuperSlide.2.1.js" ></script>
	<script type="text/javascript" src="js/hmt.js" ></script>
</html>
