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
$(function(e) {
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
    <li><a href="#tab2">管理员列表</a></li>  
    <li><a href="#tab1">新增管理员</a></li>
    </ul></div>
   
  	<div id="tab2" class="tabson">
    <ul class="seachform">
    <form action="user!queryUser" method="post">
    <li><label>姓名</label><input name="name" type="text" class="scinput" /></li>  
    <li><label>权限</label>  
    <div class="vocation">
    <select class="select2" name="rank">
    <option value="">不限</option>
    <option value="普通管理员">普通管理员</option>
    <option value="高级管理员">高级管理员</option>
    <option value="高级管理员">超级管理员</option>
    </select>
    </div>
    </li>
    <li><label>&nbsp;</label><input name="" type="submit" class="scbtn" value="查询"/></li>
    </form>
    </ul>  
    <table class="tablelist">
    	<thead>
    	<tr>
        <th><input name="" type="checkbox" value="" checked="checked"/></th>
        <th>姓名</th>
        <th>电话</th>
        <th>登录名</th>
        <th>密码</th>
        <th>权限</th>
        <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="a" items="${adminList}"> 
        <tr>
        <td><input name="" type="checkbox" value="${a.id}" /></td>
        <td>${a.name}</td>
        <td>${a.phone}</td>
        <td>${a.username}</td>
        <td>******<input type="hidden"value="${a.password}"/></td>
        <td>${a.rank}</td>
        <td><a href="user!upDateUser?id=${a.id}" class="tablelink">修改</a>&nbsp;&nbsp;
        <a href="user!deleteUser?id=${a.id}" class="tablelink" onclick="javascript:return confirm('你确定要删除用户?')"> 删除</a></td>
        </tr> 
  </c:forEach>
        </tbody>
    </table>
    </div>  

	</div> 
    <div id="tab1" class="tabson">
    <ul class="forminfo">
    <form action="login!addUser" method="post">
    <li><label>登录名</label><input name="model.username" type="text" class="dfinput" /></li>
    <li><label>密码</label><input name="model.password" type="password" class="dfinput" /></li>
    <li><label>姓名</label><input name="model.name" type="text" class="dfinput" /></li>
    <li><label>电话</label><input name="model.phone" type="text" class="dfinput" /></li>
    <li><label>权限</label>
    <div class="vocation">
    <select class="select1" name="model.rank">
    <option value="普通管理员">普通管理员</option>
    <option value="高级管理员">高级管理员</option>
    <option value="高级管理员">超级管理员</option>
    </select>
    </div>
    <li><label>&nbsp;</label><input type="submit" class="scbtn" value="添加"/>&nbsp;&nbsp;&nbsp;
    <input type="reset" class="scbtn1" value="重置"/></li>
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
