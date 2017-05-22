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
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jsapi.js"></script>
<script type="text/javascript" src="js/format+zh_CN,default,corechart.I.js"></script>		
<script type="text/javascript" src="js/jquery.gvChart-1.0.1.min.js"></script>
<script type="text/javascript" src="js/jquery.ba-resize.min.js"></script>

<script type="text/javascript">
window.onload=function(){
	document.getElementById("s1").className="selected";
	document.getElementById("tab2").style.display="none";
	};
function s1(){
	document.getElementById("s1").className="selected";
	document.getElementById("s2").className="normal";
	document.getElementById("tab1").style.display="block";
	document.getElementById("tab2").style.display="none";
	}	
function s2(){
	document.getElementById("s2").className="selected";
	document.getElementById("s1").className="normal";
	document.getElementById("tab2").style.display="block";
	document.getElementById("tab1").style.display="none";
	}
		</script>
</head>


<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">工作台</a></li>
    </ul>
    </div>
    
    
    <div class="mainbox">
    
    <div class="mainleft">
    
    
    <div class="leftinfo" style="height:500px;" >
    <div class="listtitle">库位状态</div>
        
       <div class="formbody">
    
    
    <div id="usual1" class="usual"> 
    
    <div class="itab">
  	<ul> 
    <li><a id="s1" href="#tab1" class="selected" onclick="javascript:s1()">第1排</a></li> 
    <li><a id="s2" href="#tab2" onclick="javascript:s2()">第2排</a></li> 
  	</ul>
    </div> 
    
  	<div id="tab1" class="tabson">
    
    
     <script type="text/javascript">
var m=6,n=1;
document.write("<table  style='margin-top:30px;margin-left:30px;border-right:1px solid white;border-bottom:1px solid white;'>");
for(m=6;m>=1;m--);
{document.write("<tr>");
for(n=1;n<=14;n++)
    {   
         if(m+n==11){
         document.write("<td  style='border-left:1px solid white;border-top:1px solid white;width:60px;height:60px;background:red;text-align:center;'> <a href='#' style='cursor:hand'>");   
         }else 
         if(m+n==18){
         document.write("<td style='border-left:1px solid white;border-top:1px solid white;width:60px;height:60px;background:blue;text-align:center;'><a href='#' style='cursor:hand'>");  
         }else{
         document.write("<td style='border-left:1px solid white;border-top:1px solid white;width:60px;height:60px;background:orange;text-align:center;'><a href='#' style='cursor:hand'>");  
         }
         
		document.write("1-"+m+"-"+n);
	    document.write("</a></td>");	
		}
	document.write("</tr>");	
}


document.write("</table>");

</script>
    
    </div> 
    
    
  	<div id="tab2" class="tabson">
    
     <script type="text/javascript">
var m=6,n=1;
document.write("<table  style='margin-top:30px;margin-left:30px;border-right:1px solid white;border-bottom:1px solid white;'>");
for(m=6;m>=1;m--)
{document.write("<tr>");
for(n=1;n<=14;n++)
    {   
         if(m+n==7){
         document.write("<td  style='border-left:1px solid white;border-top:1px solid white;width:60px;height:60px;background:red;text-align:center;'> <a href='#' style='cursor:hand'>");   
         }else 
         if(m+n==15){
         document.write("<td style='border-left:1px solid white;border-top:1px solid white;width:60px;height:60px;background:blue;text-align:center;'><a href='#' style='cursor:hand'>");  
         }else{
         document.write("<td style='border-left:1px solid white;border-top:1px solid white;width:60px;height:60px;background:orange;text-align:center;'><a href='#' style='cursor:hand'>");  
         }
         
		document.write("1-"+m+"-"+n);
	    document.write("</a></td>");	
		}
	document.write("</tr>");	
}


document.write("</table>");

</script>
    
    
    </div>  
       
	</div> 
 
	<script type="text/javascript"> 
      $("#usual1 ul").idTabs(); 
    </script>
    
    <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>
    
    
    
    
    
    </div>
    
    </div>
    <!--leftinfo end-->
    
    
    
    
    
    </div>
    <!--mainleft end-->
    
    
    <div class="mainright">
    
    
    <div class="dflist" style="height:500px;">
    <div class="listtitle">库位详情</div>    
    <ul class="tools" style="line-height:25px;padding-left:14px; padding-top:15px;text-indent:11px;">
    <li style="font-size:15px;">编号:$｛state｝</li>
    <li style="font-size:15px;">状态:$｛state｝</li>
    <li style="font-size:15px;">托盘:$｛id｝</li>
    <li style="font-size:15px;">物料:$｛id｝</li>
    <li style="font-size:15px;">时间:$｛id｝</li>
    <li style="font-size:15px;">托盘类型:$｛state｝</li>
    <li style="font-size:15px;">其他:$｛state｝</li>
    <li style="font-size:15px;">其他:$｛state｝</li>
    <li >&nbsp;</li>
        <ul class="toolbar">
        <a href="wareHouse!newWork"><li style="font-size:15px;"><span><img src="images/t04.png" /></span>入库</a></li>
        <a href="wareHouse!newWork"><li style="font-size:15px;"><span><img src="images/t03.png" /></span>出库</li></a>
        </ul>
        
    </ul>        
    </div>
    
    
    
    
    

    
    
    </div>
    <!--mainright end-->
    
    
    </div>



</body>
<script type="text/javascript">
	setWidth();
	$(window).resize(function(){
		setWidth();	
	});
	function setWidth(){
		var width = ($('.leftinfos').width()-12)/2;
		$('.infoleft,.inforight').width(width);
	}
</script>
</html>
