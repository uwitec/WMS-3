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
    
    <div class="itab"><ul>
    <li><a href="#tab2">出入库任务</a></li>  
    <li><a href="#tab1">切割任务</a></li>
    </ul></div> 
   
  	<div id="tab2" class="tabson">
     
    <ul class="forminfo">
    <form action="TaskAction!addTask" method="post">
   
    <li><label>类型</label>
    <div class="vocation">
    <select class="select1" name="task.type">
    <option value="入库">入库任务</option>
    <option value="出库">出库任务</option>
    <option value="盘库">盘库任务</option>
    </select></div></li>
    
    <li><label>优先级</label>
    <div class="vocation">
    <select class="select1" name="task.pri">
    <option value="低">低</option>
    <option value="中">中</option>
     <option value="高">高</option>
    </select></div><li>
    
    <li><label>入库库位</label>
    <div class="vocation">
    <select class="select1" name="task.inPosition">
    <option value=""></option>
    <option value="1-1-1">1-1-1</option>
    <option value="1-1-2">1-1-2</option>
    <option value="2-2-2">2-2-2</option>
    </select></div></li>
       <li><label>入库输送线</label>
    <div class="vocation">
    <select class="select1" name="task.inLine">
     <option value=""></option>
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
    <option value="6">6</option>
    </select></div></li>
   <li><label>出库库位</label>
    <div class="vocation">
    <select class="select1" name="task.outPosition">
    <option value=""></option>
    <option value="1-1-1">1-1-1</option>
    <option value="1-1-2">1-1-2</option>
    <option value="2-2-2">2-2-2</option>
    </select></div></li>
    <li><label>出库输送线</label>
    <div class="vocation">
    <select class="select1" name="task.outLine">
     <option value=""></option>
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
    <option value="6">6</option>
    </select></div></li>
    <li><label>出库数量</label><input name="task.materAmount" type="text" class="dfinput" /></li>
    
    <li><label>&nbsp;</label><input type="submit" class="scbtn" value="加入列表"/>&nbsp;&nbsp;&nbsp;
    <input type="reset" class="scbtn1" value="取消"/></li>
    </form>
    </ul>
    </div>  

	</div> 
    <div id="tab1" class="tabson">
    <ul class="forminfo">
   <form action="TaskAction!addTask" method="post">
     <li><label>原料选择</label>
    <div class="vocation">
    <select class="select1" name="model.rank">
    <option value="普通管理员">1-4-4 规格信息</option>
    <option value="高级管理员">1-4-5 规格信息</option>
    <option value="高级管理员">1-4-6 规格信息</option>
    </select></div><li>
    <li><label>原料数量</label><input name="model.username" type="text" class="dfinput" /></li>
   
    <li><label>成品规格</label><input name="model.name" type="text" class="dfinput" /></li>
    <li><label>成品库位</label>
    <div class="vocation">
    <select class="select1" name="model.rank">
    <option value="普通管理员">1-3-1 1大</option>
    <option value="高级管理员">1-2-3 2小</option>
    </select></div><li>
    <li><label>切割机号</label>
    <div class="vocation">
    <select class="select1" name="model.rank">
    <option value="高级管理员">1</option>
    <option value="高级管理员">2</option>
    </select></div><li>
    <li><label>优先级</label>
    <div class="vocation">
    <select class="select1" name="model.rank">
    <option value="高级管理员">低</option>
    <option value="高级管理员">中</option>
     <option value="高级管理员">高</option>
    </select></div><li>
    <label>&nbsp;</label><input type="submit" class="scbtn" value="加入列表"/>&nbsp;&nbsp;&nbsp;
    <input type="reset" class="scbtn1" value="取消"/></li>
    </form>
    </ul>
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
