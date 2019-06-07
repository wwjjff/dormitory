<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div id="right">
    <a href="queryhydropower.action">水电查询</a>
    <a href="querypersonviolation.action">个人违纪</a>
    <a href="querydormitoryviolation.action">宿舍违纪</a>
     <a href="${pageContext.request.contextPath }/student/repair.jsp">宿舍报修</a>
     <a href="queryrepair.action">报修查询</a>
     <a href="logout.action">注销退出</a>
    
<p>你的信息如下</p>
<hr>
<p>账号:${sessionScope.student.userid} </p>
<p>密码：${sessionScope.student.passwd}</p>
<p>姓名：${sessionScope.student.name}</p>
<p>IP地址：${sessionScope.student.ip}</p>
<p>年级：${sessionScope.student.grade}</p>
<p>宿管会联系：${sessionScope.student.housemaster}</p>
<p>宿舍地址：${sessionScope.student.area}${sessionScope.student.building}${sessionScope.student.hostel}</p>
</div>
  </body>
</html>
