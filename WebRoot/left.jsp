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
<script language="JavaScript" src="js/jquery.js"></script>

<script type="text/javascript">
$(function(){	
	//导航切换
	$(".menuson .header").click(function(){
		var $parent = $(this).parent();
		$(".menuson>li.active").not($parent).removeClass("active open").find('.sub-menus').hide();
		
		$parent.addClass("active");
		if(!!$(this).next('.sub-menus').size()){
			if($parent.hasClass("open")){
				$parent.removeClass("open").find('.sub-menus').hide();
			}else{
				$parent.addClass("open").find('.sub-menus').show();	
			}
			
			
		}
	});
	
	// 三级菜单点击
	$('.sub-menus li').click(function(e) {
        $(".sub-menus li.active").removeClass("active");
		$(this).addClass("active");
    });
	
	$('.title').click(function(){
		var $ul = $(this).next('ul');
		$('dd').find('.menuson').slideUp();
		if($ul.is(':visible')){
			$(this).next('.menuson').slideUp();
		}else{
			$(this).next('.menuson').slideDown();
		}
	});
});
</script>


</head>

<body style="background:#fff3e1;">
	<div class="lefttop"><span></span>作业看板</div>
    
    <dl class="leftmenu">
 
    <dd>
    <div class="title"><span><img src="images/leftico01.png" /></span><a href="TaskAction!tasklist" target="rightFrame">作业状态</a></div> 
    </dd>
    
     <dd><div class="title"><span><img src="images/leftico01.png" /></span><a href="locationStatus.jsp" target="rightFrame">库位状态</a></div>
    <ul class="menuson">
        <li><cite></cite><a href="locationMaintenance.jsp" target="rightFrame">库位维护</a><i></i></li>
        <li><cite></cite><a href="locationQuery.jsp" target="rightFrame">库位查询</a><i></i></li>
        </ul>     
    </dd>  
    
      <dd><div class="title"><span><img src="images/leftico01.png" /></span><a href="TaskAction!tasklist" target="rightFrame">任务列表</a></div>
    <ul class="menuson">
        <li><cite></cite><a href="newWork.jsp" target="rightFrame">新建任务</a><i></i></li>
        <li><cite></cite><a href="visualWork.jsp" target="rightFrame">虚拟任务</a><i></i></li>
        </ul>     
    </dd>  
    
      <dd><div class="title"><span><img src="images/leftico03.png" /></span><a href="warmmingSolution.jsp" target="rightFrame">报警处理</a></div>  
    </dd>  
    
    <dd><div class="title"><span><img src="images/leftico04.png" /></span><a href="notelist.jsp" target="rightFrame">备忘工具</a></div>
    <ul class="menuson">
        <li><cite></cite><a href="notelist.jsp" target="rightFrame">待办列表</a><i></i></li>
        <li><cite></cite><a href="noteadd.jsp" target="rightFrame">添加备忘</a><i></i></li>  
    </ul>
    
    </dd>   
    
    </dl>
</body>
</html>
