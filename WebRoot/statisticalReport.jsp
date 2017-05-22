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
<title>报表统计</title>
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

<script type="text/javascript">
window.onload=function(){
	document.getElementById("btn1").className="selected";
	document.getElementById("outCome").style.display="none";
};

function s1(){
	document.getElementById("btn1").className="selected";
	document.getElementById("btn2").className="normal";
	document.getElementById("inCome").style.display="block";
	document.getElementById("outCome").style.display="none";
	}
function s2(){
	document.getElementById("btn2").className="selected";
	document.getElementById("btn1").className="normal";
	document.getElementById("outCome").style.display="block";
	document.getElementById("inCome").style.display="none";
	}
</script>
</head>

<body class="sarchbody">

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">统计报表</a></li>
    <li><a href="#">高级查询</a></li>
    </ul>
    </div>

    <div class="formbody">
    
    <div class="itab">
    <ul> 
    <li><a id="btn1" href="#tab1" class="selected" onclick="javascript:s1()">入库报表</a></li> 
    <li><a id="btn2" href="#tab2" onclick="javascript:s2()">出库报表</a></li> 
  	</ul>
    </div>

    <div id="usual1" class="usual">
    
    

    <ul class="seachform1"><form action="record!queryReport" method="post">
    <li><label>开始时间</label><input name="name" type="text" class="scinput1"/></li>
    <li><label>结束时间</label><input name="idCard" type="text" class="scinput1"/></li>
     <li><label>材料号</label><input name="room.numb" type="text" class="scinput1"/></li>
     <li><input type="submit" value="查询" class="selectebtn"/></li>
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

    
    
    <!-- 
    <div class="formtitle"><span>入库报表</span></div>
     -->
    
    
    
    <div class="tabson" id="inCome">
    <table class="tablelist" >
    	<thead>
    	<tr>
        <th><input name="" type="checkbox" value="" checked="checked"/></th>
        <th>入库时间</th>
        <th>库位编号</th>
        <th>入库类型</th>
        <th>库区</th>
        <th>托盘类型</th>
        <th>操作人员</th>
        <th>材料号</th>
        <th>材料名称</th>
        <th>材料规格</th>
        <th>数量</th>
        <th>单位</th>
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
    
    <div id="outCome" class="tabson">
    <table class="tablelist"  >
    	<thead>
    	<tr>
        <th><input name="" type="checkbox" value="" checked="checked"/></th>
        <th>出库日期</th>
        <th>库位编号</th>
        <th>出库类型</th>
        <th>库区</th>
        <th>托盘类型</th>
        <th>操作人员</th>
        <th>材料号</th>
        <th>材料名称</th>
        <th>材料规格</th>
        <th>数量</th>
        <th>单位</th>
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
    </div>
</body>

</html>
