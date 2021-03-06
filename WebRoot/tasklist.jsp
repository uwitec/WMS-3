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
<title>库存管理</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.idTabs.min.js"></script>
<script type="text/javascript" src="js/select-ui.min.js"></script>
<script type="text/javascript" src="editor/kindeditor.js"></script>

<script type="text/javascript">
    KE.show({
        id : 'content7',
        cssPath : './index.css'
    });
  </script>
  
<script type="text/javascript">
$(document).ready(function(e) {

	$(".select3").uedSelect({
		width : 152
	});
});
</script>
</head>

<body class="sarchbody">

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">库存管理</a></li>
    <li><a href="#">高级查询</a></li>
    </ul>
    </div>

      <div class="formtitle"><a href="#" class="more1">更多</a>任务列表</div>    

<ul class="seachform"><form action="task!queryTask">
    
    <li><label>关键字</label><input name="" type="text" class="scinput" /></li>
    <li><label>库位号</label>  
    <div class="vocation">
    <select class="select3">
    <option>全部</option>
    <option>1-1-2</option>
    <option>1-2-2</option>
    </select>
    </div>
    </li>
    
    <li><label>类型</label>  
    <div class="vocation">
    <select class="select3">
    <option>全部</option>
    <option>其他</option>
    </select>
    </div>
    </li>
    
    <li><label>日期</label>  
    <div class="vocation">
    <select class="select3">
    <option>全部</option>
    <option>其他</option>
    </select>
    </div>
    </li>
    
    <li><label>&nbsp;</label><input name="" type="button" class="scbtn" value="查询"/></li>
    </form>
</ul>

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
    
    <c:forEach var="t" items="${tasklist}">  
    <tr>
    <td class="index">${t.id}</td>
    <td>入库:${t.inPosition} 出库:${t.outPosition}</td>
    <td>${t.type}<p>${t.inLine}${t.outLine}</p></td>
    <td>${t.state}</td>
    <td>${t.pri}</td>
    <td><a href="task!taskMoveUp"><img src="images/up.png" style="height: 20px; width: 20px; "/></a></td>
    <td><a href="task!taskMoveDown"><img src="images/down.png" style="height: 20px; width: 20px; "/></a></td>
    <td><a href="task!deleteTask"><img src="images/t03.png" /></a></td>
    <td><a href="TaskAction!startTask?id=${t.id}"><img src="images/fjt.png" /></a></td>
    </tr>
    </c:forEach> 
    
    </tbody>
    
    </table>
    </div>
</body>

</html>
