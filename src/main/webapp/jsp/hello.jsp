<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	
	function forwardFile(){
		var xmlhttp = null;
		if(window.XMLHttpRequest){
			xmlhttp = new XMLHttpRequest();
		}else{
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.open("POST","../hello.do?method=tofileupload",false);
		xmlhttp.send();
		xmlhttp.responseText;
	}
</script>
</head>
<body>
	<h1>Hello my dear !</h1>
	<button onclick="forwardFile()">异步请求</button>
	<a href="jsp/fileupload.jsp" >跳转</a>
</body>
</html>