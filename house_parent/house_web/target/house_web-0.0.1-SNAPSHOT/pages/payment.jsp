<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<base href="${pageContext.request.contextPath }/">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <title>租客付款</title>
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
			<p class="fl">租客付款</p>
		</div>
		
		<div class="payment clearfloat" id="main">
			<div class="pay-top clearfloat">
				<ul>
					<li class="cur">
						<span>1</span>
						<p>提交信息</p>
					</li>
					<li class="cur">
						<span>2</span>
						<p>订单确认</p>
					</li>
					<li class="cur">
						<span>3</span>
						<p>租客付款</p>
					</li>
					<li>
						<span>4</span>
						<p>付款成功</p>
					</li>
				</ul>
				<span class="hline">
					<samp class="bline blinethree"></samp>
				</span>				
			</div>
			<div class="top clearfloat box-s">
				<span class="fl">需付款</span>
				<span class="fr">7800元</span>
			</div>
			<div class="bottom clearfloat">
				<p class="tit box-s">支付方式</p>
				<div class="pay-list clearfloat box-s">
					<ul>
						<li class="clearfloat">
							<a href="#" class="clearfloat">
								<i class="iconfont icon-zhifubao zhifubao fl"></i>
								<div class="middle clearfloat fl">
									<p class="payname">支付宝支付</p>
									<p class="tuijian">推荐有支付宝账号的用户使用</p>
								</div>
								<i class="iconfont icon-arrowright right"></i>
							</a>
						</li>
						<li class="clearfloat">
							<a href="#" class="clearfloat">
								<i class="iconfont icon-weixin weixin fl"></i>
								<div class="middle clearfloat fl">
									<p class="payname">微信支付</p>
									<p class="tuijian">推荐安装微信5.0及以上版本的使用</p>
								</div>
								<i class="iconfont icon-arrowright right"></i>
							</a>
						</li>
						<li class="clearfloat">
							<a href="#" class="clearfloat">
								<i class="iconfont icon-yinxingqia yinxingqia fl"></i>
								<div class="middle clearfloat fl">
									<p class="payname">银行卡支付</p>
									<p class="tuijian">至此储蓄卡信用卡，无需开通网银</p>
								</div>
								<i class="iconfont icon-arrowright right"></i>
							</a>
						</li>
					</ul>					
				</div>
			</div>
			<a href="success.jsp" class="pay-btn clearfloat">
				确认付款
			</a>
		</div>
	</body>
	<script type="text/javascript" src="js/jquery-1.8.3.min.js" ></script>
	<script src="js/fastclick.js"></script>
	<script src="js/mui.min.js"></script>
	<script type="text/javascript" src="js/hmt.js" ></script>
</html>
