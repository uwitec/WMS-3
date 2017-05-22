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

    <div class="formbody">

    <div id="usual1" class="usual">
    <div class="formtitle"><span>库存管理</span></div>

      <ul class="seachform"><form action="wareHouse!stockManager">
    
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
       <!--  <th><input name="" type="checkbox" value="" checked="checked"/></th> -->
        <th>操作</th>
        <th>库位号</th>
        <th>托盘号</th>
        <th>入库时间</th>
        <th>材料号</th>
        <th>名称</th>
        <th>炉号</th>
        <th>钢卷号</th>
        <th>捆包号</th>
        <th>长宽高</th>
        <th>数量</th>
        <th>净重</th>
        <th>牌号</th>
        <th>厂家</th>
        <th>标准</th>
        <th>表面处理</th>
        <th>边缘状态</th>
        <th>等级</th>
        <th>日期</th>
        <th>包装班组</th>
        <th>检验员</th>
        <th>ROHS</th>
        <th>备注</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="o" items="${ordersList}">
        <tr>
        <!-- <td><input name="" type="checkbox" value="" /></td> -->
        <td>出库  切割</td>
        <td>${o.name}</td>
        <td>${o.idCard}</td>
        <td>${o.numb}</td>
        <td>${o.inDate}</td>
        <td>${o.outDate}</td>
        <td>${o.price}</td>
         <td>${o.id}</td>
        <td>${o.name}</td>
        <td>${o.idCard}</td>
        <td>${o.numb}</td>
        <td>${o.inDate}</td>
        <td>${o.outDate}</td>
        <td>${o.price}</td>
         <td>${o.id}</td>
        <td>${o.name}</td>
        <td>${o.idCard}</td>
        <td>${o.numb}</td>
        <td>${o.inDate}</td>
        <td>${o.outDate}</td>
        <td>${o.price}</td>
         <td>${o.price}</td>
          <td>${o.price}</td>
        </tr> 
        </c:forEach>
       
        </tbody>
    </table>
    

       
	</div> 
    </div>
</body>

</html>
