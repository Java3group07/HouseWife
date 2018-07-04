<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="zh-CN">
<head>
<base href="${pageContext.request.contextPath }/">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=no">
<title>首页</title>
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
	$(window).load(function() {
		$(".loading").addClass("loader-chanage")
		$(".loading").fadeOut(300)
	})
	$(function(){
		/*一级分类  */
		var url = "${pageContext.request.contextPath}/user/findUserNum.do";
		var params={};
		
		$.ajax({
			url:url,
			date:JSON.stringify(params),
			type:"post",
			success:function(date){
				$(date).each(function(i,n){
					$("#num").append("<p class='header-num'>房嫂已为<span>"+n+"</span>用户成功租房！</p><p class='header-da'>轻松租房 乐享生活</p>")
				});
			},
			error:function(){
				
			},
			"contentType":"application/json;charset=UTF-8",
		})
	})
	
	$(function(){
		 $("#ss").blur(function(){
			 /*一级分类  */
				var url = "${pageContext.request.contextPath}/house/findHouseByName.do";
				var params={"housename":$(this).val()};
				
				$.ajax({
					url:"${pageContext.request.contextPath}/house/findHouseByName.do?housename="+encodeURI(encodeURI($(this).val())),
/* 					date:JSON.stringify(params), */
					type:"get",
					success:function(date){
						$(date).each(function(i,n){
							var str = "<a href=${pageContext.request.contextPath}/house/findHouseById.do?hid="+n.hid+">"+n.housename+"</a>";
						$(".tags").append(str);
						});
					},
					error:function(){
						
					}
				})
			 
			 
		 })
		
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
	<!--header star-->
	<div class="header clearfloat">
		<div class="tu clearfloat">
			<img src="img/index-banner.jpg" />
		</div>
		<header class="mui-bar mui-bar-nav"> <a class="btn" href="#">
			<p>
				合肥<i class="iconfont icon-iconfontarrowdown-copy"></i>
			</p>
		</a>
		<div class="top-sch-box flex-col">
			<div class="centerflex">
				<i class="fdj iconfont icon-sousuo"></i>
				<div class="sch-txt">请输入您要搜索的内容</div>
			</div>
		</div>
		</header>
		<div class="header-tit clearfloat" id="num">
			
		</div>
	</div>
	<!--header end-->
	<div id="main" class="mui-clearfix">
		<!-- 搜索层 -->
		<div class="pop-schwrap">
			<div class="ui-scrollview">
				<div class="poo-mui clearfloat box-s">
					<div class="mui-bar mui-bar-nav clone poo-muitwo">
						<div class="top-sch-box flex-col">
							<div class="centerflex">
								<i class="fdj iconfont icon-sousuo"></i> <input
									class="sch-input mui-input-clear" type="text" name="housename" id="ss"
									placeholder="请输入您要搜索的内容" />
							</div>
						</div>
					</div>
					<a href="javascript:;" class="mui-btn mui-btn-primary btn-back"
						href="#">取消</a>
				</div>
				<div class="scroll-wrap">
					<div class="mui-scroll">
						<div class="sch-cont">
							<div class="section ui-border-b">
								<div class="tit">热门搜索</div>
								<div class="tags">
									<!-- <span class="tag">大溪地</span><span class="tag">大溪地</span><span
										class="tag">大溪地</span> <span class="tag">大溪地</span><span
										class="tag">大溪地</span><span class="tag">大溪地</span> <span
										class="tag">大溪地</span><span class="tag">大溪地</span><span
										class="tag">大溪地</span> -->
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="cation clearfloat">
			<ul class="clearfloat">
				<li><a
					href="${pageContext.request.contextPath }/house/findById.do?state=0">
						<img src="img/fang.png" />
						<p>整租</p>
				</a></li>
				<li><a
					href="${pageContext.request.contextPath }/house/findById.do?state=1">
						<img src="img/chuang.png" />
						<p>合租</p>
				</a></li>
				<li><a
					href="${pageContext.request.contextPath }/house/findById.do?state=2">
						<img src="img/bao.png" />
						<p>短租</p>
				</a></li>
				<li><a
					href="${pageContext.request.contextPath }/house/findById.do?state=3">
						<img src="img/lou.png" />
						<p>写字楼</p>
				</a></li>
				<li><a href="pages/map.jsp"> <img src="img/map.png" />
						<p>地图找房</p>
				</a></li>
				<li><a href="${pageContext.request.contextPath }/house/findAllHouse.do"> <img src="img/people.png" />
						<p>我要成为房东</p>
				</a></li>
				<li><a href="join.jsp"> <img src="img/woshou.png" />
						<p>加盟</p>
				</a></li>
				<li><a href="life-service.jsp"> <img src="img/self.png" />
						<p>生活服务</p>
				</a></li>
			</ul>
		</div>

		<div class="recom clearfloat">
			<div class="recom-tit clearfloat box-s">
				<p>热门房源推荐</p>
			</div>
			<div class="content clearfloat box-s">
					<c:forEach var="list" items="${list }" begin="0" end="2">
						<div class="list clearfloat fl box-s">
							<a href="${pageContext.request.contextPath }/house/findHouseById.do?hid=${list.hid}">
								<div class="tu clearfloat">
									<span></span> <img src="${list.image }" />
								</div>
								<div class="right clearfloat">
									<div class="tit clearfloat">
										<p class="fl">${list.housename }</p>
										<span class="fr">${list.money }<samp>元/月</samp></span>
									</div>
									<p class="recom-jianjie">${list.specification }|${list.model }m²
										|${list.fitment }</p>
									<div class="recom-bottom clearfloat">
										<span><i class="iconfont icon-duihao"></i>随时住</span>
										<span><i class="iconfont icon-duihao"></i>家电齐全</span>
									</div>
								</div>
							</a>
						</div>
				</c:forEach>
				
			</div>
		</div>
	</div>

	<footer class="page-footer fixed-footer" id="footer">
	<ul>
		<li class="active"><a href="pages/index.jsp"> <i
				class="iconfont icon-shouyev1"></i>
				<p>首页</p>
		</a></li>
		<li><a href="${pageContext.request.contextPath }/landlord/show.do"> <i class="iconfont icon-chuzuwo"></i>
				<p>我要出租</p>
		</a></li>
		<li><a href="${pageContext.request.contextPath }/house/SelectAllDistrict.do?situation=0"> <i
				class="pages/iconfont icon-richengbiao"></i>
				<p>看房日程</p>
		</a></li>
		<li><a href="pages/sign.jsp"> <i
				class="iconfont icon-gerenzhongxin"></i>
				<p>个人中心</p>
		</a></li>
	</ul>
	</footer>
</body>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script src="js/fastclick.js"></script>
<script src="js/mui.min.js"></script>
<script type="text/javascript" src="js/hmt.js"></script>
<!--插件-->
<link rel="stylesheet" href="css/swiper.min.css">
<script src="js/swiper.jquery.min.js"></script>
<!--插件-->

<!--搜索点击效果-->
<script>
	$(function() {
		var banner = new Swiper('.banner', {
			autoplay : 5000,
			pagination : '.swiper-pagination',
			paginationClickable : true,
			lazyLoading : true,
			loop : true
		});

		mui('.pop-schwrap .sch-input').input();
		var deceleration = mui.os.ios ? 0.003 : 0.0009;
		mui('.pop-schwrap .scroll-wrap').scroll({
			bounce : true,
			indicators : true,
			deceleration : deceleration
		});
		$('.top-sch-box .fdj,.top-sch-box .sch-txt,.pop-schwrap .btn-back').on(
				'click', function() {
					$('html,body').toggleClass('holding');
					$('.pop-schwrap').toggleClass('on');
					if ($('.pop-schwrap').hasClass('on')) {
						
						$('.pop-schwrap .sch-input').focus();
					}
				});

	});
</script>
</html>
