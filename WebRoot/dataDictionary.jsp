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
$(".select2").uedSelect({
		width : 160
	});
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
    <li><a href="#">日志查询</a></li>
    <li><a href="#">高级查询</a></li>
    </ul>
    </div>

    <div class="formbody">

    <div id="usual1" class="usual">
    
    <div class="formtitle"><span>系统日志</span></div>

    <ul class="seachform1">
    <li><label>查询字段</label><input name="name" type="text" class="scinput1"/></li>
     <li><input type="submit" value="查询" class="selectebtn"/></li>
     </ul>
<!--     <li><label>入住日期</label><input name="model.inDate" type="text" class="scinput1" /></li>
    <li><label>离店日期</label><input name="model.outDate" type="text" class="scinput1" /></li> 
    <li><label>消费金额</label><input name="price" type="text" class="scinput1" /></li>-->
    </form>
    </ul>
    <!--
    <ul class="seachform1">
    <li class="sarchbtn"><label>&nbsp;</label><input  type="submit" class="scbtn" value="查询"/>&nbsp;&nbsp; 
    <input type="reset" class="scbtn1" value="重置"/></li>  
    </form></ul>
    -->

    <script language="javascript">
	$(document).ready(function()
{
    $(".scbtn1").click(function()
    {
        if( $(".seachform2").hasClass("hideclass"))
        {
            $(".seachform2").removeClass("hideClass");
        }
        else
        {
            $(".seachform2").addClass("hideClass");
        }
    });
});

	
	</script>
    
    
    <script type="text/javascript">
$(document).ready(function(){
  $(".scbtn1").click(function(){
  $(".seachform2").fadeIn(200);
  }); 


});
</script>

    
    
    
    
    
    <table class="tablelist">
    	<thead>
    	<tr>
        <th><input name="" type="checkbox" value="" checked="checked"/></th>
        <th>字段</th>
        <th>类型</th>
        <th>是否为null</th>
        <th>默认</th>
        <th>注释</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="o" items="${ordersList}">
        <tr>
        <td><input name="" type="checkbox" value="" /></td>
        <td>${o.id}</td>
        <td>${o.name}</td>
        <td>${o.idCard}</td>
        <td>${o.room.numb}</td>
        <td>${o.inDate}</td>
        <td>${o.outDate}</td>
        <td>${o.price}</td>
        </tr> 
        </c:forEach>
       
        </tbody>
    </table>
    

       
	</div> 
    </div>
</body>

</html>
