<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<base href="${pageContext.request.contextPath }/">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <title>加盟</title>
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
			<p class="fl">加盟</p>
		</div>
		
		<div class="clearfloat" id="main">
			<div class="recom-tit recom-titwo clearfloat box-s">
	    		<p>加盟政策</p>
	    	</div>
	    	<div class="join clearfloat box-s">
	    		<div class="top clearfloat box-s">
	    			<div class="tu">
	    				<img src="upload/3.jpg"/>
	    			</div>
	    			<p class="tit">经销商加盟</p>
	    			<p class="fu-tit">
	    				我们一直秉承顾客第一的核心价值观，以亲切、专业的服务给顾客带来优质
						的体验；公司运营15年来，已经有成熟的管理模式和经营模式，加盟店将会
						享受到公司丰厚的开业礼品支持，认真传授经验管理加盟连锁店，确保每个
						加盟商都成为百万富翁！我们的加盟政策的制定我们经过了公司运营团队及
						行业专业人士的反复论证，并在实际操作过程中听取广大加盟商朋友的建议。
	    			</p>
	    			<p class="tit">经销商加盟</p>
	    			<p class="fu-tit">
	    				我们一直秉承顾客第一的核心价值观，以亲切、专业的服务给顾客带来优质
						的体验；公司运营15年来，已经有成熟的管理模式和经营模式，加盟店将会
						享受到公司丰厚的开业礼品支持，认真传授经验管理加盟连锁店，确保每个
						加盟商都成为百万富翁！我们的加盟政策的制定我们经过了公司运营团队及
						行业专业人士的反复论证，并在实际操作过程中听取广大加盟商朋友的建议。
	    			</p>
	    		</div>
	    	</div>
	    	<div class="recom-tit recom-titwo clearfloat box-s">
	    		<p>在线加盟申请</p>
	    	</div>
	    	<div class="land-ctent clearfloat">
				<ul>
					<li class="box-s clearfloat">
						<p class="tit fl">姓名</p>
						<input type="text" name="" id="" value="" placeholder="您的姓名" class="fl" />
					</li>
					<li class="box-s clearfloat">
						<p class="tit fl">手机号</p>
						<input type="text" name="" id="" value="" placeholder="您的手机号码" class="fl" />
					</li>
					<li class="box-s clearfloat">
						<p class="tit fl">邮箱</p>
						<input type="text" name="" id="" value="" placeholder="您的常用邮箱" class="fl" />
					</li>
					<li class="box-s clearfloat">
						<p class="tit fl">详细地址</p>
						<input type="text" name="" id="" value="" placeholder="市、区/县、街道" class="fl" />
					</li>
					<li class="box-s clearfloat">
						<p class="tit fl">团队人数</p>
						<input type="text" name="" id="" value="" placeholder="团队人数" class="fl" />
					</li>
					<li class="box-s clearfloat">
						<p class="tit tit2 fl">线下中介门店数</p>
						<input type="text" name="" id="" value="" placeholder="线下门店数" class="fl" />
					</li>
				</ul>
				<a href="#loginmodal" id="modaltrigger">
					<input type="button" name="" id="" value="提交申请" class="btn" />
				</a>
			</div>
			
		</div>
		
		<!--弹窗内容 star-->
	    <div id="loginmodal" class="box-s loginmodaltwo" style="display:none;">	    	
			<form id="loginform" name="loginform" method="post" action="">		
				<div class="center"><input type="submit" name="loginbtn" id="loginbtn" class="flatbtn-blutwo hidemodal" value="" tabindex="3"></div>
			</form>
			<div class="bottom clearfloat box-s">
				<div class="login-dui clearfloat">
					<p class="tu">
						<img src="img/dui.png"/>
					</p>
					<p class="tit">
						恭喜您，申请成功！
					</p>
					<p class="fu-tit">
						请保持所填号码手机的通话畅通状态，我们的客服将会在48小时内与您取得联系。
					</p>
				</div>
				<input type="button" name="" id="" value="好的，我知道了" class="btn btn1" />
			</div>
		</div>
	    <!--弹窗内容 end-->
	</body>
	<script type="text/javascript" src="js/jquery-1.8.3.min.js" ></script>
	<script type="text/javascript" src="slick/slick.min.js" ></script>
	<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
	<script type="text/javascript" src="js/tchuang.js" ></script>
	<script type="text/javascript" src="js/hmt.js" ></script>
</html>
