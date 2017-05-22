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
<link href="css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.idTabs.min.js"></script>
<script type="text/javascript" src="js/select-ui.min.js"></script>
<script type="text/javascript" src="editor/kindeditor.js"></script>

  
<script type="text/javascript">
$(document).ready(function(e) {
    $(".select3").uedSelect({
		width : 100
	});
    $(".select1").uedSelect({
		width : 345			  
	});
	$(".select2").uedSelect({
		width : 167  
	});	
});
</script>
</head>

<body>  
    <div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">管理员中心</a></li>
    </ul>
    </div>
    
    
    <div class="formbody">   
    <div id="usual1" class="usual"> 
    
    <div class="formtitle"><span>虚拟任务</span></div>
   
  	<div id="tab2" class="tabson">
     
    <ul class="forminfo">
    <ul class="forminfo">
    <form action="record!visualWork" method="post">
    
    <li><label>类型</label>
    <div class="vocation">
    <select class="select1" name="model.rank">
    <option value="">入库任务</option>
    <option value="">出库任务</option>
    <option value="">倒垛任务</option>
    </select></div></li>
    <li><label>入库库位</label>
    <div class="vocation">
    <select class="select1" name="model.rank">
    <option value="0">1-1-1</option>
    <option value="1">1-1-2</option>
    <option value="2">2-2-2</option>
    </select></div></li>
    <li><label>出库信息</label><input name="model.phone" type="text" class="dfinput"/></li>
   <li><label>出库库位</label>
    <div class="vocation">
    <select class="select1" name="model.rank">
    <option value="0">1-1-1</option>
    <option value="1">1-1-2</option>
    <option value="2">2-2-2</option>
    </select></div></li>
    <li><label>出库数量</label><input name="model.phone" type="text" class="dfinput"/></li>
    
    <li><label> </label><input type="submit" class="scbtn" value="开始任务"/>   
    <input type="reset" class="scbtn1" value="取消"/></li>
    </li></li></form>
    </ul>
    </ul>
    </div>  

	</div> 
    
    
   
	<script type="text/javascript"> 
      $("#usual1 ul").idTabs(); 
    </script>   
    <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>
    </div>
</body>

</html>
