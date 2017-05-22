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
<title>欢迎登录后台管理系统</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/jquery.js"></script>
<script src="js/cloud.js" type="text/javascript"></script>

<script language="javascript">
	$(function(){
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
	$(window).resize(function(){  
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
    });
});  
</script> 

</head>

<body onLoad="pageInit();" style="background-color:#df7611; background-image:url(images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">


	<script type="text/javascript">
    
    function pageInit(){ //此方法需要在body中增加如下代码：<body onLoad="pageInit();"> 
        window.setInterval("ajaxRequest()",2000);  //设置定时调用ajax的方法，单位：毫秒，1000毫秒＝1秒
        console.log("ddd")
    } 
    
    $(document).ready(function(){
        var url = "http://hq.sinajs.cn/list=sh601006,sh601939,sh600016";   //返回 var hq_str_sh601006="xxxxxxx" 的形式数据。
        url="http://api.money.126.net/data/feed/1000002,1000001,1000881,money.api";  //返回  _ntes_quote_callback({xxxx}); 的形式数据。
        //url="http://flashquote.stock.hexun.com/Stock_Combo.ASPX?mc=1_600804&dt=T";   //返回  refreshData(xxxxxxx) 的形式数据。
        getNewData(url);
        var tg=self.setInterval("getNewData('"+url+"')",1000);//N毫秒刷新一次，单位：毫秒，1000毫秒＝1秒
        console.log("ddd")
    });

    //获取新数据
    function getNewData(url)
    {
        var durl=url//+"&t="+Math.random();
        
        //方式一：通过ajax的方式获取数据
        $.ajax({  
            cache : true,  
            url:url,
            type: 'GET', 
            dataType: 'script', 
            timeout: 2000, 
            success: function(data, textStatus, jqXHR){ 
                var str = data;
                str = hq_str_sh600016.split(',');
                $("#res")[0].innerText=str[30]+" "+str[31]+" ajax";
                console.log("fafafaf");
                
            }
        });
        
    }
     
    </script>


    <div id="mainBody">
      <div id="cloud1" class="cloud"></div>
      <div id="cloud2" class="cloud"></div>
    </div>  


<div class="logintop">    
    <span>欢迎登录后台管理界面平台</span>    
    <ul>
    <li><a href="#">回首页</a></li>
    <li><a href="#">帮助</a></li>
    <li><a href="#">关于</a></li>
    </ul>    
    </div>
    
    <div class="loginbody">
    
    <span class="systemlogo"></span> 
       
    <div class="loginbox">
    
    <form action="UserAction!login">
    <ul>
    <li><input name="" type="text" class="loginuser" value="admin" onclick="JavaScript:this.value=''"/></li>
    <li><input name="" type="text" class="loginpwd" value="密码" onclick="JavaScript:this.value=''"/></li>
    <li><input name="" type="submit" class="loginbtn" value="登录"/><label><input name="" type="checkbox" value="" checked="checked" />记住密码</label><label><a href="#">忘记密码？</a></label></li>
    </ul></form>
    
    
    </div>
    
    </div>
    
    
    
    <div class="loginbm">版权所有©2017<a href="http://www.leaddo.com">利德测控</a>  仅供内部使用，勿用于任何商业用途</div>
	
	
    
</body>

</html>
