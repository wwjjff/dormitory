<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'queryrepair.jsp' starting page</title>
    
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
   <table width="500" height="150" border="1" align="center">
      <tr>
      <th>宿舍地址</th>
      <th>报修时间</th>
      <th>联系电话</th>
      <th>报修信息</th>
      <th>报修人姓名</th>
      <th>处理状态</th>
      </tr>
      <s:iterator value="queryrepair" >
      <tr>
      <td align="center"><s:property value="area" /><s:property value="building" /><s:property value="hostel" /></td>
      <td align="center"><s:property value="time" /></td>
      <td align="center"><s:property value="phone" /></td>
       <td align="center"><s:property value="information" /></td>
        <td align="center"><s:property value="name" /></td>
        <td align="center"><s:property value="process" /></td>
      </tr>
      </s:iterator>
      </table>
  </body>
</html>
