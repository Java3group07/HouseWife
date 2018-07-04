<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<base href="${pageContext.request.contextPath }/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <title>付房租</title>
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
    <link rel="stylesheet" type="text/css" href="js/jquery.datetimepicker.css"/>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/jquery.datetimepicker.full.js"></script>
    
	<script type="text/javascript">
		$(window).load(function(){
			$(".loading").addClass("loader-chanage")
			$(".loading").fadeOut(300)
		})
		
	$(function(){
		$("#datetimepicker2").blur(function(){
			var url ="${pageContext.request.contextPath}/order/data.do";
			var data ={"startTime":$("#datetimepicker").val(),
					"endTime":$("#datetimepicker2").val()};
			$.post(url,data,function(zz){
				$(zz).each(function(i,n){
					 if(n<=2592000000 ){
							$("#d01").prop("value","1");
						}
						if(n>=2592000000 ){
							$("#d01").prop("value","2");
						} 
						if(n>=7776000000){
							$("#d01").prop("value","3");
						}
						if(n>=10368000000){
							$("#d01").prop("value","4");
						}
						if(n>=12960000000){
							$("#d01").prop("value","5");
						}
						if(n>=15552000000){
							$("#d01").prop("value","6");
						}
						if(n>=18144000000){
							$("#d01").prop("value","7");
						}
						if(n>=20736000000){
							$("#d01").prop("value","8");
						}
						if(n>=23328000000){
							$("#d01").prop("value","9");
						}
						if(n>=25920000000){
							$("#d01").prop("value","10");
						}
						if(n>=28512000000){
							$("#d01").prop("value","11");
						}
						if(n>=31104000000){
							$("#d01").prop("value","12");
						}
						$("#d01").prop("type","text");
						
				})
			},"json")
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
		<div class="headertwo clearfloat" id="header">
			<a href="javascript:history.go(-1)" class="fl box-s"><i class="iconfont icon-arrow-l fl"></i></a>
			<p class="fl">付房租</p>
		</div>
		
		<div class="pay clearfloat" id="main">
			<div class="pay-top clearfloat">
				<ul>
					<li class="cur">
						<span>1</span>
						<p>提交信息</p>
					</li>
					<li>
						<span>2</span>
						<p>订单确认</p>
					</li>
					<li>
						<span>3</span>
						<p>租客付款</p>
					</li>
					<li>
						<span>4</span>
						<p>付款成功</p>
					</li>
				</ul>
				<span class="hline">
					<samp class="bline"></samp>
				</span>				
			</div>
			<!--
FieldTypeComment
pack_idint(11) NOT NULL合同id
hidint(11) NULL房屋id
picturevarchar(400) NULL图片
uidint(11) NULL用户id
contract_timedate NULL签约时间
start_timedate NULL合同开始日
end_timedate NULL合同结束日
renting_moneydouble NULL租房押金
terrace_moneydouble NULL平台佣金
			  -->
			<form action="${pageContext.request.contextPath }/house/findAllHouse1.do?hid=${house.hid}" method="post">
			<input type="hidden" name="hid" value="${order.oid }"/>
			<div class="land-ctent clearfloat pay-bottom">
				<ul>
					<li class="box-s clearfloat" >
						<p class="tit fl">租房信息</p>
						<p class="xinxi fr" >${house.housename }</p>
					</li>
					<li class="box-s clearfloat">
						<p class="tit fl">房屋住址</p>
						<p class="xinxi fr">${house.address }</p>
					</li>
					<li class="box-s clearfloat">
						<p class="tit fl">合同开始日</p>
						 <input type="text" id="datetimepicker"  name="startTime"/>
						
					</li>
					<li class="box-s clearfloat">
						<p class="tit fl">合同结束日</p>
						 <input type="text"  id="datetimepicker2"  name="endTime"/>
					</li>
					<li class="box-s clearfloat">
						<p class="tit fl">租房押金</p>
						<input type="text" name="rpledge" id="" value="" placeholder="请输入您的租房押金" class="fl day" />
						<i class="iconfont icon-arrowright fl"></i>
					</li>
					<li class="box-s clearfloat">
						<p class="tit fl">每月租金</p>
						<!-- <p class="xinxi price fr">500元</p> -->
						<input type="text" name="rent" id="" value="${house.money }元" placeholder="每月租金" class="fl day" />
						<i class="iconfont icon-arrowright fl"></i>
					</li>
					<li class="box-s clearfloat">
						<p class="tit fl">本次支付几月</p>
						 <input type="hidden" name="thisPay" id="d01" value=""  class="fl day daytwo" />
						<i ></i> 
						<div>
							
						</div>
					</li>
					<li class="box-s clearfloat">
						<p class="tit fl">其他费用</p>
						<input type="text" name="otherCost" id="" value="100" placeholder="水、电、煤等费用" class="fl day" />
					</li>
					<li class="box-s clearfloat">
						<p class="tit fl">平台佣金</p>
				<input class="xinxi huise fr"  type="text" name="commission" id="" value="" placeholder="平台佣金" />
					</li>
				</ul>
				<input type="submit" value="下一步" class="pay-btn clearfloat">
			</div>
			</form>
		</div>
	</body>
	<script type="text/javascript" >
	$.datetimepicker.setLocale('en');
	$('#datetimepicker').datetimepicker({
		dayOfWeekStart : 1,
		lang:'en',
		disabledDates:['2018/01/08','2018/01/09','2018/01/10'],
		startDate:	'2018/01/05'
		});
	
	$('#datetimepicker2').datetimepicker({
		dayOfWeekStart : 1,
		lang:'en',
		disabledDates:['2018/01/08','2018/01/09','2018/01/10'],
		startDate:	'2018/01/05'
		});
	//$('#datetimepicker').datetimepicker({value:'2015/04/15 05:03',step:10});
	</script>
	<script src="js/fastclick.js"></script>
	<script src="js/mui.min.js"></script>
	<script type="text/javascript" src="js/hmt.js" ></script>
</html>
