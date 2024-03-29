<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<base href="${pageContext.request.contextPath }/">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=no">
<title>我的委托管理</title>
<meta name="keywords" content="">
<meta name="description" content="">
<script src="js/rem.js"></script>
<script src="js/jquery.min.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="css/base.css" />
<link rel="stylesheet" type="text/css" href="css/page.css" />
<link rel="stylesheet" type="text/css" href="css/all.css" />
<link rel="stylesheet" type="text/css" href="css/mui.min.css" />
<link rel="stylesheet" type="text/css" href="css/loaders.min.css" />
<link rel="stylesheet" type="text/css" href="css/loading.css" />
<link rel="stylesheet" type="text/css" href="slick/slick.css" />
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
		<a href="javascript:history.go(-1)" class="fl box-s"><i
			class="iconfont icon-arrow-l fl"></i></a>
		<p class="fl">我的委托管理</p>
	</div>
     
     
	<div class="clearfloat" id="main">
		<div class="schedule clearfloat">
			 <c:forEach items="${list}" var="h">
				<div class="content clearfloat box-s">
					<div class="list clearfloat fl box-s">
						<a href="${pageContext.request.contextPath }/house/findHouseById.do?hid=${h.hid}">
							<div class="tu clearfloat">
								<span></span> <img src="${h.image }" />
							</div>
							<div class="right clearfloat">
								<div class="tit clearfloat">
									<p class="fl">${h.housename}</p>
									<span class="fr">${h.money}<samp>元/月</samp></span>
								</div>
								<p class="recom-jianjie">${h.specification}|${h.model }|
									${h.fitment}</p>
								<div class="recom-bottom clearfloat">
									<span><i class="iconfont icon-duihao"></i>随时住</span> <span><i
										class="iconfont icon-duihao"></i>家电齐全</span>
								</div>
							</div>

						</a>
					</div>
					<div class="topsche-top entrust box-s clearfloat">
						<p class="tit fr entrust-btn">
							<c:if test="${h.situation ==0}">空置</c:if>
							<c:if test="${h.situation ==1 }">已出租</c:if>
						</p>
					</div>
				</div>
				</c:forEach>
		</div>
	</div>
	

	<footer class="page-footer fixed-footer" id="footer">
		<ul>
			<li><a href="pages/index.jsp"> <i
					class="iconfont icon-shouyev1"></i>
					<p>首页</p>
			</a></li>
			<li><a href="pages/lease.jsp"> <i
					class="iconfont icon-chuzuwo"></i>
					<p>我要出租</p>
			</a></li>
			<li class="active"><a href="pages/schedule.jsp"> <i
					class="iconfont icon-richengbiao"></i>
					<p>看房日程</p>
			</a></li>
			<li><a href="pages/p-center.jsp"> <i
					class="iconfont icon-gerenzhongxin"></i>
					<p>个人中心</p>
			</a></li>
		</ul>
	</footer>
</body>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/jquery.SuperSlide.2.1.js"></script>
<script type="text/javascript" src="slick/slick.min.js"></script>
<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
<script type="text/javascript" src="js/tchuang.js"></script>
<script type="text/javascript" src="js/hmt.js"></script>
</html>
