<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
</head>

<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">提醒工具</a></li>
    <li><a href="#">添加备忘</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    <div class="formtitle"><span>添加备忘</span></div>
    
    <ul class="forminfo">
    <li><label>房号</label><input name="" type="text" class="dfinput" /></li>
    <li><label>提醒时间</label><input name="" type="text" class="dfinput" /></li>
    <li><label>待办事项</label><textarea name="" cols="" rows="" class="textinput"></textarea></li>
    <li><label>&nbsp;</label><input name="" type="button" class="scbtn" value="保存"/>&nbsp;&nbsp;&nbsp;<input name="" type="reset" class="scbtn2" value="重置"/></li>
    </ul>
    
    
    </div>


</body>

</html>
