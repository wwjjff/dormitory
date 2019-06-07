<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'hydropower.jsp' starting page</title>
    
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
      <table width="400" height="150" border="1" align="center">
      <tr>
      <th>地址</th>
      <th>水费</th>
      <th>电费</th>
      <th>状态</th>
      </tr>
      <tr>
      <td align="center">${sessionScope.hydropower.area}${sessionScope.hydropower.building}${sessionScope.hydropower.hostel}</td>
      <td align="center">${sessionScope.hydropower.power}</td>
      <td align="center">${sessionScope.hydropower.water}</td>
      <td align="center">${sessionScope.hydropower.state}</td>
      </tr>
      </table>
  </body>
</html>
