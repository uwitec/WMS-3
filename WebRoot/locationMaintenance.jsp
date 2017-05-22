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
<title>库位维护</title>
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
    <li><a href="#">库位维护</a></li>
    <li><a href="#">高级查询</a></li>
    </ul>
    </div>

    <div class="formbody">

    <div id="usual1" class="usual">
    <div class="formtitle"><span>库位维护</span></div>

    <ul class="forminfo">
    <form action="wareHouse!locationMaintenance" method="post">
    
    <li><label>库位号</label>
    <div class="vocation">
    <select class="select1" name="model.rank">
    <option value="0">1-1-1</option> 
    <option value="1">1-1-2</option>
    <option value="2">2-2-2</option>
    </select></div></li>
    
    <li><label>出库信息</label><input name="model.phone" type="text" class="dfinput"/></li>
    

    <li><label>出库数量</label><input name="model.phone" type="text" class="dfinput"/></li>
    
    <li><label> </label><input type="submit" class="scbtn" value="开始任务"/>   
    <input type="reset" class="scbtn1" value="取消"/></li>
    </li></li></form>
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

    
	</div> 
    </div>
</body>

</html>
