﻿<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/jquery.js"></script>
<script type="text/javascript">
$(function(){	
	//顶部导航切换
	$(".nav li a").click(function(){
		$(".nav li a.selected").removeClass("selected")
		$(this).addClass("selected");
	})	
})	
</script>


</head>

<body style="background:url(images/topbg.gif) repeat-x;">

    <div class="topleft">
    <a href="main_zj.jsp" target="_parent"><img src="images/logo.png" title="系统首页" /></a>
    </div>
        
    <ul class="nav">
      <li><a href="stockManager.jsp" target="rightFrame" ><img src="images/icon03.png" title="库存管理" /><h2>库存管理</h2></a></li>
    <li><a href="trayManager.jsp" target="rightFrame" ><img src="images/icon02.png" title="托盘管理" /><h2>托盘管理</h2></a></li>
    <li><a href="statisticalReport.jsp" target="rightFrame"><img src="images/icon14.png" title="统计报表" /><h2>统计报表</h2></a></li>
    <li><a href="queryLog.jsp" target="rightFrame" ><img src="images/icon16.png" title="日志查询" /><h2>日志查询</h2></a></li>
    <li><a href="dataDictionary.jsp" target="rightFrame" ><img src="images/icon01.png" title="数据字典" /><h2>数据字典</h2></a></li>
    <li><a href="userManager.jsp"  target="rightFrame"><img src="images/icon12.png" title="系统设置" /><h2>用户管理</h2></a></li>
    </ul>
            
    <div class="topright">    
    <ul>
    <li><span><img src="images/help.png" title="帮助"  class="helpimg"/></span><a href="#">帮助</a></li>
    <li><a href="#">关于</a></li>
    <li><a href="login.jsp" target="_parent">退出</a></li>
    </ul>
     
    <div class="user">
    <span>admin</span>
    <i>消息</i>
    <b>5</b>
    </div>    
    
    </div>

</body>
</html>
