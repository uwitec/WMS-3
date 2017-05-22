<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	$(function() {
		window.setInterval(update, 1000);
	});
	var jsonArray;
	function update() {
		var textContext = "onclick";
		$.ajax({
			type : "post",
			dataType : 'json', //接受数据格式 
			cache : false,
			data : "textContext=" + textContext,
			url : "http://localhost:8080/WMS/update",
			beforeSend : function(XMLHttpRequest) {
			},
			success : function(data) {
				var dataArray;
				var i = 0;
				var string = "[";
				while (true) {
					if (typeof (data.task[i]) == "undefined") {
						break;
					}
					dataArray = data.task[i];
					var strObj = JSON.stringify(dataArray);
					if (i == 0) {
						string += strObj;
					} else {
						string += "," + strObj;
					}
					i++;
				}
				string += "]";
				jsonArray = JSON.parse(string);
				$('#div1').empty();
				appendTable(jsonArray);
			},
			error : function() {
				//请求出错处理
				alert("Error:数据更新失败！");
			}
		});
	}

	//var jsonArray = [ {
	//	"编号" : "001",
	//	"名称" : "小苹果",
	//	"描述" : "现代神曲，大妈的最爱"
	//	}, {
	//	"编号" : "002",
	//	"名称" : "mou宝",
	//	"描述" : "想怎么玩就怎么完"
	//} ];
	var headArray = [];
	function parseHead(oneRow) {
		for ( var i in oneRow) {
			headArray[headArray.length] = i;
		}
	}
	function appendTable() {
		parseHead(jsonArray[0]);
		var div = document.getElementById("div1");
		var table = document.createElement("table");
		var thead = document.createElement("tr");
		for ( var count = 0; count < headArray.length; count++) {
			var td = document.createElement("th");
			td.innerHTML = headArray[count];
			thead.appendChild(td);
		}
		table.appendChild(thead);
		for ( var tableRowNo = 0; tableRowNo < jsonArray.length; tableRowNo++) {
			var tr = document.createElement("tr");
			for ( var headCount = 0; headCount < headArray.length; headCount++) {
				var cell = document.createElement("td");
				cell.innerHTML = jsonArray[tableRowNo][headArray[headCount]];
				tr.appendChild(cell);
			}
			table.appendChild(tr);
		}
		
		div.appendChild(table);
	}
</script>
<style>
table {
	width: 600px;
	padding: 0;
	margin: 100 auto;
	border-collapse: collapse;
}

td,th {
	border: 1px solid #ddd;
	padding: 6px 6px 6px 12px;
	color: #4f6b72;
	text-align: center;
}

th {
	background: #d3d3d3;
}
</style>
</head>
<body>
	<div id="div1"></div>
</body>
</html>