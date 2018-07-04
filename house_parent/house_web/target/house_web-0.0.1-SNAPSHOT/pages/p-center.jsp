<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<base href="${pageContext.request.contextPath }/">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <title>个人中心</title>
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
		<div class="center-header clearfloat" id="header">
			<a href="#" class="fr shezhi">设置</a>
			<div class="top fl clearfloat box-s">
				<a href="#">
					<div class="tu fl">
						<span></span>
						<img src="${u.face }"/>
					</div>
					<p class="tit fl">${u.username }</p>
					<i class="iconfont icon-arrowright fr"></i>
				</a>
			</div>
			<div class="bottom clearfloat">
				<ul>
					<li>
						<a href="pages/rent-order.jsp" class="clearfloat">
							<p>1</p>
							<p>房租订单</p>
						</a>
					</li>
					<li>
						<a href="pages/rent-order.jsp" class="clearfloat">
							<p>1</p>
							<p>待付款</p>
						</a>
					</li>
					<li>
						<a href="pages/empty-list.jsp" class="clearfloat">
							<p>0</p>
							<p>待评价</p>
						</a>
					</li>
					<li>
						<a href="pages/empty-list.jsp" class="clearfloat">
							<p>0</p>
							<p>已完成</p>
						</a>
					</li>
				</ul>
			</div>
		</div>
		
		<div class="clearfloat pcenter" id="main">
			<div class="p-list clearfloat box-s">				
				<i class="iconfont icon-caifu fl ben"></i>
				<span class="fl">我的资产</span>
			</div>
			<div class="p-fenlei clearfloat">
				<ul>
					<li>
						<a href="pages/profit.jsp" class="clearfloat">
							<p>￥19.90</p>
							<p>余额</p>
						</a>
					</li>
					<li>
						<a href="#" class="clearfloat">
							<p>3000</p>
							<p>积分</p>
						</a>
					</li>
					<li>
						<a href="pages/coupon.jsp" class="clearfloat">
							<p>3张</p>
							<p>优惠券</p>
						</a>
					</li>
				</ul>
			</div>
			<div class="p-list p-listwo clearfloat box-s">
				<a href="pages/collection.jsp" class="clearfloat">
					<i class="iconfont icon-favorite fl xing"></i>
					<span class="fl">我的收藏</span>
					<i class="iconfont icon-arrowright fr you"></i>
				</a>
			</div>
			<div class="p-list p-listwo clearfloat box-s">
				<a href="pages/pay-rent.jsp" class="clearfloat">
					<i class="iconfont icon-money fl money"></i>
					<span class="fl">付房租</span>
					<i class="iconfont icon-arrowright fr you"></i>
				</a>
			</div>
			<div class="p-list p-listhree clearfloat box-s">
				<a href="pages/contract.jsp" class="clearfloat">
					<i class="iconfont icon-hetongguanli fl hetongguanli"></i>
					<span class="fl">我的合同</span>
					<i class="iconfont icon-arrowright fr you"></i>
				</a>
			</div>
			<div class="p-list p-listhree clearfloat box-s">
				<a href="pages/entrust.jsp" class="clearfloat">
					<i class="iconfont icon-weituoguanli fl weituoguanli"></i>
					<span class="fl">我的委托管理</span>
					<i class="iconfont icon-arrowright fr you"></i>
				</a>
			</div>
			
			<div class="p-list p-listwo clearfloat box-s">
				<a href="pages/extension.jsp" class="clearfloat">
					<i class="iconfont icon-gonggao fl gonggao"></i>
					<span class="fl">我要推广</span>
					<i class="iconfont icon-arrowright fr you"></i>
				</a>
			</div>
			<div class="p-list p-listhree clearfloat box-s">
				<a href="pages/about.jsp" class="clearfloat">
					<i class="iconfont icon-gerenzhongxin fl gerenzhongxin"></i>
					<span class="fl">关于我们</span>
					<i class="iconfont icon-arrowright fr you"></i>
				</a>
			</div>
			<div class="p-list p-listhree clearfloat box-s">
				<a href="pages/modify.jsp" class="clearfloat">
					<i class="iconfont icon-lock fl lock"></i>
					<span class="fl">修改密码</span>
					<i class="iconfont icon-arrowright fr you"></i>
				</a>
			</div>
		</div>
		
		<footer class="page-footer fixed-footer" id="footer">
			<ul>
				<li>
					<a href="pages/index.jsp">
						<i class="iconfont icon-shouyev1"></i>
						<p>首页</p>
					</a>
				</li>
				<li>
					<a href="pages/lease.jsp">
						<i class="iconfont icon-chuzuwo"></i>
						<p>我要出租</p>
					</a>
				</li>
				<li>
					<a href="pages/schedule.jsp">
						<i class="iconfont icon-richengbiao"></i>
						<p>看房日程</p>
					</a>
				</li>
				<li class="active">
					<a href="pages/sign.jsp">
						<i class="iconfont icon-gerenzhongxin"></i>
						<p>个人中心</p>
					</a>
				</li>
			</ul>
		</footer>
	</body>
	<script type="text/javascript" src="js/jquery-1.8.3.min.js" ></script>
	<script type="text/javascript" src="slick/slick.min.js" ></script>
	<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
	<script type="text/javascript" src="js/tchuang.js" ></script>
	<script type="text/javascript" src="js/hmt.js" ></script>
</html>
