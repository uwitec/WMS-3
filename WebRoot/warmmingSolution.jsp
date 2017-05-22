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

<script type="text/javascript">
$(document).ready(function(){
  $(".tablelink").click(function(){
  $(".tip").fadeIn(200);
  });
  
  $(".tiptop a").click(function(){
  $(".tip").fadeOut(200);
});

  $(".sure").click(function(){
  $(".tip").fadeOut(100);
});

  $(".cancel").click(function(){
  $(".tip").fadeOut(100);
});

});
</script>


</head>


<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">报警处理</a></li>
    </ul>
    </div>
    
    <div class="rightinfo">
    
    <div class="tools">
    
    <div class="formtitle"><span>报警处理</span></div>
    
    <ul class="seachform1"><form action="logTable!queryWarmming">
    <li>日期&nbsp;<input name="model.inDate" type="text" class="scinput1" /></li>
    <li>——&nbsp;<input name="model.outDate" type="text" class="scinput1" /></li>
    <li>&nbsp;<input  type="submit" class="scbtn" value="查询" /> </li>
    </form>
    </ul>

    
    </div>
    
    
    <table class="tablelist">
    	<thead>
    	<tr>
        <th>选择</th>
        <th>编号</th>
        <th>位置</th>
        <th>报警设备</th>
        <th>任务类型</th>
        <th>报警时间</th>
        <th>指令信息</th>
        <th>报警内容</th>
        <th>处理方式</th>
        <th>处理人</th>
        <th>处理时间</th>
        <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr>
        <td><input name="" type="checkbox" value="" /></td>
        <td>1</td>
        <td>2</td>
        <td>1#切割机</td>
        <td>切割任务</td>
        <td>2017-03-12 17:00:00</td>
        <td>入库线到库位1-2-3</td>
        <td>堆垛机未响应</td>
        <td>堆垛机复位</td>
        <td>张三</td>
        <td>2017-03-12 17:01:00</td>
        <td><a href="#" class="tablelink" >处理</a></td>
        </tr> 
        
        <tr>
        <td><input name="" type="checkbox" value="" /></td>
        <td>1</td>
        <td>2</td>
        <td>1#切割机</td>
        <td>切割任务</td>
        <td>2017-03-12 17:00:00</td>
        <td>入库线到库位1-2-3</td>
        <td>堆垛机未响应</td>
        <td>堆垛机复位</td>
        <td>张三</td>
        <td>2017-03-12 17:01:00</td>
        <td><a href="#" class="tablelink">处理</a></td>
        </tr>
        
        <tr>
        <td><input name="" type="checkbox" value="" /></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td><a href="#" class="tablelink">处理</a>   </td>
        </tr>
        
        <tr>
        <td><input name="" type="checkbox" value="" /></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td><a href="#" class="tablelink">处理</a>  </td>
        </tr>
        
        <tr>
        <td><input name="" type="checkbox" value="" /></td>
         <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td><a href="#" class="tablelink">处理</a>  </td>
        </tr>
        
        <tr>
        <td><input name="" type="checkbox" value="" /></td>
         <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td><a href="#" class="tablelink">处理</a>   </td>
        </tr>
        
        <tr>
        <td><input name="" type="checkbox" value="" /></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td><a href="#" class="tablelink">处理</a>  </td>
        </tr>
        
        <tr>
        <td><input name="" type="checkbox" value="" /></td>
         <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td><a href="#" class="tablelink">处理</a>   </td>
        </tr>
        
        <tr>
        <td><input name="" type="checkbox" value="" /></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td><a href="#" class="tablelink">处理</a>   </td>
        </tr>        
        </tbody>
    </table>
    
   
    <div class="pagin">
    	<div class="message">共<i class="blue">1256</i>条记录，当前显示第&nbsp;<i class="blue">2&nbsp;</i>页</div>
        <ul class="paginList">
        <li class="paginItem"><a href="javascript:;"><span class="pagepre"></span></a></li>
        <li class="paginItem"><a href="javascript:;">1</a></li>
        <li class="paginItem current"><a href="javascript:;">2</a></li>
        <li class="paginItem"><a href="javascript:;">3</a></li>
        <li class="paginItem"><a href="javascript:;">4</a></li>
        <li class="paginItem"><a href="javascript:;">5</a></li>
        <li class="paginItem more"><a href="javascript:;">...</a></li>
        <li class="paginItem"><a href="javascript:;">10</a></li>
        <li class="paginItem"><a href="javascript:;"><span class="pagenxt"></span></a></li>
        </ul>
    </div>
    
    
    <div class="tip">
    	<div class="tiptop"><span>故障报警处理</span><a></a></div>
        
      <div class="tipinfo" >
        
        <p>货位：    托盘 ：    输送线位置：   报警类型：</p>
        <p>报警设备：     报警任务：   报警时间：</p>
        <p><a href="logTable!reSet"><input  type="submit" class="scbtn" value="复位" /></a> 重新发送指令</p>
        <p><a href="logTable!nextAction"><input  type="submit" class="scbtn" value="下一动作" /></a> 人工处理完毕，以完成状态处理，继续下一步</p>
        <p><a href="logTable!deleteWarm"><input  type="submit" class="scbtn" value="删除" /></a> 无效任务删除</p>
        <p><a href="logTable!upDateLocation"><input  type="submit" class="scbtn" value="跟换库位" /></a> 更换新的库位</p>
        <cite>退出请按右上角</cite>
        </div>
      
    
    </div>
    
    
    
    
    </div>
    
    <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>

</body>

</html>
