<i><%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%
		String path = request.getContextPath();
		String basePath = request.getScheme() + "://"
				+ request.getServerName() + ":" + request.getServerPort()
				+ path + "/";
	%> <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jsapi.js"></script>
<script type="text/javascript"
	src="js/format+zh_CN,default,corechart.I.js"></script>
<script type="text/javascript" src="js/jquery.gvChart-1.0.1.min.js"></script>
<script type="text/javascript" src="js/jquery.ba-resize.min.js"></script>
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<script type="text/javascript">
	$(function() {
		window.setInterval(update, 1000);
	});
	function update() {
		$
				.ajax({
					type : "post",
					dataType : 'json', //接受数据格式 
					cache : false,
					data : "text:" + "update",
					url : "http://localhost:8080/WMS/update",
					beforeSend : function(XMLHttpRequest) {
					},
					success : function(data) {
						document.getElementById("rkx_status").innerHTML = data.rkx.status;
						//$("#rkx_status")[0].innerHTML = data.rkx.status;
						document.getElementById("rkx_workstatus").innerHTML = data.rkx.workstatus;

						document.getElementById("qgj1_status").innerHTML = data.qgj1.status;
						document.getElementById("qgj1_workstatus").innerHTML = data.qgj1.workstatus;

						$("#cpx1_status")[0].innerHTML = data.cpx1.status;
						$("#cpx1_workstatus")[0].innerHTML = data.cpx1.workstatus;

						$("#ddj_status")[0].innerHTML = data.ddj.status;
						$("#ddj_workstatus")[0].innerHTML = data.ddj.workstatus;
						$("#ddj_error")[0].innerHTML = data.ddj.error;

						$("#qgj2_status")[0].innerHTML = data.qgj2.status;
						$("#qgj2_workstatus")[0].innerHTML = data.qgj2.workstatus;

						$("#cpx2_status")[0].innerHTML = data.cpx2.status;
						$("#cpx2_workstatus")[0].innerHTML = data.cpx2.workstatus;

						$("#ckx_status")[0].innerHTML = data.ckx.status;
						$("#ckx_workstatus")[0].innerHTML = data.ckx.workstatus;

						var i = 0;
						while (true) {
							if (typeof (data.task[i]) == "undefined") {
								break;
							}
							var a = "a" + i;
							document.getElementById(a).href = "TaskAction!startTask?id="
									+ data.task[i].id;
							var tr = "tr" + i;
							document.getElementById(tr).style.visibility = "visible";
							var id = "id" + i;
							document.getElementById(id).innerHTML = data.task[i].id;
							var inposition = "inposition" + i;
							document.getElementById(inposition).innerHTML = data.task[i].inposition;
							var outposition = "outposition" + i;
							document.getElementById(outposition).innerHTML = data.task[i].outposition;
							var type = "type" + i;
							document.getElementById(type).innerHTML = data.task[i].type;
							var state = "state" + i;
							document.getElementById(state).innerHTML = data.task[i].state;
							var pri = "pri" + i;
							document.getElementById(pri).innerHTML = data.task[i].pri;
							i++;
							if (i > 4) {
								break;
							}
						}
					},
					error : function() {
						//请求出错处理
						alert("Error:数据更新失败！");
					}
				});

	}
</script>
<script type="text/javascript">
	$(function() {
		var fixHelperModified = function(e, tr) {
			var $originals = tr.children();
			var $helper = tr.clone();
			$helper.children().each(function(index) {
				$(this).width($originals.eq(index).width());
			});
			return $helper;
		}, updateIndex = function(e, ui) {
			$('td.index', ui.item.parent()).each(function(i) {
				$(this).html(i + 1);
			});
		};
		$("#sort tbody").sortable({
			helper : fixHelperModified,
			stop : updateIndex
		}).disableSelection();
	});
</script>
<script type="text/javascript">
	gvChartInit();
	jQuery(document).ready(function() {

		jQuery('#myTable5').gvChart({
			chartType : 'PieChart',
			gvSettings : {
				vAxis : {
					title : 'No of players'
				},
				hAxis : {
					title : 'Month'
				},
				width : 650,
				height : 250
			}
		});
	});
</script>
<script type="text/javascript">
	$(function() {
		var fixHelperModified = function(e, tr) {
			var $originals = tr.children();
			var $helper = tr.clone();
			$helper.children().each(function(index) {
				$(this).width($originals.eq(index).width());
			});
			return $helper;
		}, updateIndex = function(e, ui) {
			$('td.index', ui.item.parent()).each(function(i) {
				$(this).html(i + 1);
			});
		};
		$("#sort tbody").sortable({
			helper : fixHelperModified,
			stop : updateIndex
		}).disableSelection();
	});
</script>
</head>
<style>
tr {
	cursor: pointer;
}
</style>
<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
			<li><a href="#">工作台</a></li>
		</ul>
	</div>
	<script type="text/javascript">
		var eqdetails = function(type) {
			$.ajax({
				type : "post",
				dataType : 'json', //接受数据格式 
				cache : false,
				data : "text:" + "update",
				url : "http://localhost:8080/WMS/eqdetails?type="+type,
				beforeSend : function(XMLHttpRequest) {
				},
				success : function(data) {
					document.getElementById("eq_status").innerHTML = data.status;
					document.getElementById("eq_error").innerHTML = data.error;
				},
				error : function() {
					//请求出错处理
					alert("Error:数据更新失败！");
				}
			});
		};
	</script>
	<div class="mainbox">
		<div class="mainleft">
			<div class="leftinfo" style="height:380px;overflow:hidden;">
				<div class="listtitle">设备状态</div>
				<ul class="classlist"
					style="width:1000px; white-space : nowrap; overflow:hidden;">
					<li style="width: 240px;"><span><img
							src="images/ssx.jpg" style="height: 90px; width: 80px; " /></span>
						<h2>入库线</h2>
						<p>
							状态：<cite id="rkx_workstatus"></cite><br />任务：<cite
								id="rkx_status"></cite><br />
						</p> <a class="enter" style="width: 80px; " onclick="eqdetails('rkx')">详细信息</a></li>
					<li style="width: 240px; "><span><img
							src="images/qgj.jpg" style="height: 90px; width: 80px; " /></span>

						<h2>1#切割机原料线</h2>
						<p>
							状态：<cite id="qgj1_workstatus"></cite><br />任务：<cite
								id="qgj1_status"></cite><br />
						</p> <a onclick="eqdetails('qgj1')" class="enter"
						style="width: 80px; ">详细信息</a></li>
					<li style="width: 240px; "><span><img
							src="images/qgj.jpg" style="height: 90px; width: 80px; " /></span>

						<h2>1#切割机成品线</h2>
						<p>
							状态：<cite id="cpx1_workstatus"></cite><br />任务：<cite
								id="cpx1_status"></cite><br />
						</p> <a onclick="eqdetails('cpx1')" class="enter"
						style="width: 80px; ">详细信息</a></li>
					<li style="width: 240px; "><span><img
							src="images/ddj.jpg" style="height: 90px; width: 80px; " /></span>

						<h2>堆垛机</h2>
						<p>
							状态：<cite id="ddj_workstatus"></cite><br />任务线：<cite
								id="ddj_status"></cite><br />故障：<cite id="ddj_error"></cite>
						</p> <a onclick="eqdetails('ddj')" class="enter" style="width: 80px; ">详细信息</a></li>
					<li style="width: 240px; "><span><img
							src="images/ssx.jpg" style="height: 90px; width: 80px; " /></span>

						<h2>出库线</h2>
						<p>
							状态：<cite id="ckx_workstatus"></cite><br />任务：<cite
								id="ckx_status"></cite><br />
						</p> <a onclick="eqdetails('ckx')" class="enter" style="width: 80px; ">详细信息</a></li>
					<li style="width: 240px; "><span><img
							src="images/qgj.jpg" style="height: 90px; width: 80px; " /></span>

						<h2>2#切割机原料线</h2>
						<p>
							状态：<cite id="qgj2_workstatus"></cite><br />任务：<cite
								id="qgj2_status"></cite><br />
						</p> <a onclick="eqdetails('qgj2')" class="enter"
						style="width: 80px; ">详细信息</a></li>
					<li style="width: 240px; "><span><img
							src="images/qgj.jpg" style="height: 90px; width: 80px; " /></span>

						<h2>2#切割机成品线</h2>
						<p>
							状态：<cite id="cpx2_workstatus"></cite><br />任务：<cite
								id="cpx2_status"></cite><br />
						</p> <a onclick="eqdetails('cpx2')" class="enter"
						style="width: 80px; ">详细信息</a></li>
					<li style="width: 240px; "><span><img
							src="images/i03.png" style="height: 90px; width: 80px; " /></span>

						<h2>运行状态</h2>
						<p>
							状态：${ssxlist[6].value}<br />故障：${ssxlist[7].value}<br />
						</p> <a class="enter" style="width: 80px; ">刷新状态</a></li>
				</ul>
			</div>
			<script type="text/javascript">
				var taskdetails = function(id) {
					var tid = document.getElementById(id).innerHTML;
					$.ajax({
						type : "post",
						dataType : 'json', //接受数据格式 
						cache : false,
						data : "text:" + "update",
						url : "http://localhost:8080/WMS/taskdetails?tid="+tid,
						beforeSend : function(XMLHttpRequest) {
						},
						success : function(data) {
						},
						error : function() {
							//请求出错处理
							alert("Error:数据更新失败！");
						}
					});
				};
			</script>
			<!--leftinfo end-->
			<div class="leftinfo" style="margin-top:10px;">
				<div class="leftinfo" style="height: 300px;">
					<div class="listtitle">
						<a href="#" class="more1">更多</a>任务列表
					</div>
					<table class="imgtable" id="sort">
						<thead>
							<tr>
								<th class="index">序号</th>
								<th>任务</th>
								<th>类型</th>
								<th>状态</th>
								<th>优先级</th>
								<th>升序</th>
								<th>降序</th>
								<th>删除</th>
								<th>开始</th>
							</tr>
						</thead>
						<tbody>
							<tr id="tr0" style="visibility:hidden;">
								<td onclick="taskdetails('id0')" class="index"><cite
									id="id0"></cite></td>
								<td>入库:<cite id="inposition0"></cite> 出库:<cite
									id="outposition0"></cite></td>
								<td><cite id="type0"></cite>
									<p>${t.inLine}${t.outLine}</p></td>
								<td><cite id="state0"></cite></td>
								<td><cite id="pri0"></cite></td>
								<td><a href="task!taskMoveUp"><img src="images/up.png"
										style="height: 20px; width: 20px; " /></a></td>
								<td><a href="task!taskMoveDown"><img
										src="images/down.png" style="height: 20px; width: 20px; " /></a></td>
								<td><a href="task!deleteTask"><img src="images/t03.png" /></a></td>
								<td><a id="a0"><img src="images/fjt.png" /></a></td>
							</tr>
							<tr id="tr1" style="visibility:hidden;">
								<td onclick="taskdetails('id1')" class="index"><cite
									id="id1"></cite></td>
								<td>入库:<cite id="inposition1"></cite> 出库:<cite
									id="outposition1"></cite></td>
								<td><cite id="type1"></cite>
									<p>${t.inLine}${t.outLine}</p></td>
								<td><cite id="state1"></cite></td>
								<td><cite id="pri1"></cite></td>
								<td><a href="task!taskMoveUp"><img src="images/up.png"
										style="height: 20px; width: 20px; " /></a></td>
								<td><a href="task!taskMoveDown"><img
										src="images/down.png" style="height: 20px; width: 20px; " /></a></td>
								<td><a href="task!deleteTask"><img src="images/t03.png" /></a></td>
								<td><a id="a1"><img src="images/fjt.png" /></a></td>
							</tr>
							<tr id="tr2" style="visibility:hidden;">
								<td onclick="taskdetails('id2')" class="index"><cite
									id="id2"></cite></td>
								<td>入库:<cite id="inposition2"></cite> 出库:<cite
									id="outposition2"></cite></td>
								<td><cite id="type2"></cite>
									<p>${t.inLine}${t.outLine}</p></td>
								<td><cite id="state2"></cite></td>
								<td><cite id="pri2"></cite></td>
								<td><a href="task!taskMoveUp"><img src="images/up.png"
										style="height: 20px; width: 20px; " /></a></td>
								<td><a href="task!taskMoveDown"><img
										src="images/down.png" style="height: 20px; width: 20px; " /></a></td>
								<td><a href="task!deleteTask"><img src="images/t03.png" /></a></td>
								<td><a id="a2"><img src="images/fjt.png" /></a></td>
							</tr>
							<tr id="tr3" style="visibility:hidden;">
								<td onclick="taskdetails('id3')" class="index"><cite
									id="id3"></cite></td>
								<td>入库:<cite id="inposition3"></cite> 出库:<cite
									id="outposition3"></cite></td>
								<td><cite id="type3"></cite>
									<p>${t.inLine}${t.outLine}</p></td>
								<td><cite id="state3"></cite></td>
								<td><cite id="pri3"></cite></td>
								<td><a href="task!taskMoveUp"><img src="images/up.png"
										style="height: 20px; width: 20px; " /></a></td>
								<td><a href="task!taskMoveDown"><img
										src="images/down.png" style="height: 20px; width: 20px; " /></a></td>
								<td><a href="task!deleteTask"><img src="images/t03.png" /></a></td>
								<td><a id="a3"><img src="images/fjt.png" /></a></td>
							</tr>
							<tr id="tr4" style="visibility:hidden;">
								<td onclick="taskdetails('id4')" class="index"><cite
									id="id4"></cite></td>
								<td>入库:<cite id="inposition4"></cite> 出库:<cite
									id="outposition4"></cite></td>
								<td><cite id="type4"></cite>
									<p>${t.inLine}${t.outLine}</p></td>
								<td><cite id="state4"></cite></td>
								<td><cite id="pri4"></cite></td>
								<td><a href="task!taskMoveUp"><img src="images/up.png"
										style="height: 20px; width: 20px; " /></a></td>
								<td><a href="task!taskMoveDown"><img
										src="images/down.png" style="height: 20px; width: 20px; " /></a></td>
								<td><a href="task!deleteTask"><img src="images/t03.png" /></a></td>
								<td><a id="a4"><img src="images/fjt.png" /></a></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<!--mainleft end-->
		<div class="mainright">
			<div class="dflist" style="height:380px;">
				<div class="listtitle">设备详情</div>
				<ul class="tools"
					style="line-height:25px;padding-left:14px; padding-top:15px;text-indent:11px;">
					<li style="font-size:15px;"><cite id="eq_status"></cite></li>
					<li style="font-size:15px;"><cite id="eq_error"></cite></li>
					<li style="font-size:15px;">任务:$｛id｝</li>
					<li style="font-size:15px;">货位号:$｛id｝</li>
					<li style="font-size:15px;">托盘:$｛id｝</li>
					<li style="font-size:15px;">托盘类型:$｛state｝</li>
					<li style="font-size:15px;">时间:$｛state｝</li>
					<li style="font-size:15px;">输送线:$｛state｝</li>
					<li>&nbsp;</li>
					<ul class="toolbar">
						<a href="clWrite!stop">
							<li style="font-size:15px;"><span><img
									src="images/t04.png" /></span>暂停</li>
						</a>
						<a href="clWrite!outLine">
							<li style="font-size:15px;"><span><img
									src="images/t03.png" /></span>脱机</li>
						</a>
					</ul>
					<a></a>

				</ul>
			</div>
			<div class="dflist1" style="height: 300px; ">
				<div class="listtitle">任务详情</div>
				<ul class="tools"
					style="line-height:25px;padding-left:14px; padding-top:15px;text-indent:11px;">
					<li style="font-size:15px;">状态:$｛state｝</li>
					<li style="font-size:15px;">故障:$｛state｝</li>
					<li style="font-size:15px;">任务:$｛id｝</li>
					<li style="font-size:15px;">货位号:$｛id｝</li>
					<li style="font-size:15px;">托盘:$｛id｝</li>
					<li style="font-size:15px;">时间:$｛state｝</li>
					<li style="font-size:15px;">输送线:$｛state｝</li>
					<li>&nbsp;</li>
					<ul class="toolbar">
						<a href="task!pauseTask">
							<li style="font-size:15px;"><span><img
									src="images/t04.png" /></span>暂停</li>
						</a>
						<a href="task!deleteTask">
							<li style="font-size:15px;"><span><img
									src="images/t03.png" /></span>删除</li>
						</a>
					</ul>

				</ul>
			</div>

		</div>
		<!--mainright end-->
	</div>
</body>
<script type="text/javascript">
	setWidth();
	$(window).resize(function() {
		setWidth();
	});
	function setWidth() {
		var width = ($('.leftinfos').width() - 12) / 2;
		$('.infoleft,.inforight').width(width);
	}
</script>
	</html> </i>