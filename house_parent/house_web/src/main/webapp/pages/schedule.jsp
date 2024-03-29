<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<base href="${pageContext.request.contextPath }/">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <title>看房日程</title>
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
			<span class="fl box-s">合肥<i class="iconfont icon-iconfontarrowdown-copy"></i></span>
			<p class="fl bt">看房日程</p>
			<a href="#" class="fr"><i class="iconfont icon-sousuo fl"></i></a>
		</div>
		
		<div class="clearfloat" id="main">
			<div class="schedule clearfloat">
				<div class="notice">
					<div class="tab-hd clearfloat">
						<ul class="tab-nav clearfloat">
						  <li><a href="${pageContext.request.contextPath }/house/SelectAllDistrict.do?situation=0">进行中的约看</a></li>
						  <li><a href="${pageContext.request.contextPath }/house/SelectAllDistrict.do?situation=1">已完成的约看</a></li>
						</ul>
					</div>
					<c:forEach items="${dlist }" var="list">
					<div class="tab-bd clearfloat">
						<div class="tab-pal">
							<div class="content clearfloat box-s">
								<div class="topsche-top box-s clearfloat">
									<p class="fl add">
										<i class="iconfont icon-map"></i>
										合肥·出租房
									</p>
									<p class="fl time">
										<i class="iconfont icon-time"></i>
										<fmt:formatDate value="${list.indate }"/>
										
									</p>
									<c:if test="${list.situation==0 }">
										<p class="tit fr">
										正在确认
										</p>
									</c:if>
									
									
									<c:if test="${list.situation==1 }">
										<p class="tit titwo fr">
										租住此房
										</p>
									</c:if>
								</div>
					    		<div class="list clearfloat fl box-s">
					    			<a href="${pageContext.request.contextPath }/house/findHouseById.do?hid=${list.hid}">
						    			<div class="tu clearfloat">
						    				<span></span>
						    				<img src="${list.image }"/>
						    			</div>
						    			<div class="right clearfloat">
						    				<div class="tit clearfloat">
						    					<p class="fl">${list.housename }</p>
						    					<span class="fr">${list.money }<samp>元/月</samp></span>
						    				</div>
						    				<p class="recom-jianjie">${list.specification } |  ${list.model }  | ${list.fitment }</p>
						    				<div class="recom-bottom clearfloat">
						    					<span><i class="iconfont icon-duihao"></i>随时住</span>
						    					<span><i class="iconfont icon-duihao"></i>家电齐全</span>
						    				</div>
						    			</div>
					    			</a>
					    		</div>					    		
					    	</div>	
					</div>
				</div>
				
				</c:forEach>
				
			</div>
		</div>
		</div>
		<footer class="page-footer fixed-footer" id="footer">
			<ul>
				<li>
					<a href="index.jsp">
						<i class="iconfont icon-shouyev1"></i>
						<p>首页</p>
					</a>
				</li>
				<li>
					<a href="lease.jsp">
						<i class="iconfont icon-chuzuwo"></i>
						<p>我要出租</p>
					</a>
				</li>
				<li class="active">
					<a href="schedule.jsp">
						<i class="iconfont icon-richengbiao"></i>
						<p>看房日程</p>
					</a>
				</li>
				<li>
					<a href="sign.jsp">
						<i class="iconfont icon-gerenzhongxin"></i>
						<p>个人中心</p>
					</a>
				</li>
			</ul>
		</footer>
	</body>
	<script type="text/javascript" src="js/jquery-1.8.3.min.js" ></script>
	<script type="text/javascript" src="js/jquery.SuperSlide.2.1.js" ></script>
	<script type="text/javascript" src="slick/slick.min.js" ></script>
	<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
	<script type="text/javascript" src="js/tchuang.js" ></script>
	<script type="text/javascript" src="js/hmt.js" ></script>
	<script type="text/javascript">
	</script>
</html>
