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
    
    <title>My JSP 'showperviolation.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 <link rel="stylesheet" href="css/bootstrap.css">
   <script src="js/bootstrap.min.js"></script>
  </head>
  
  <body>
    <table width="600" height="150" border="1" align="center">
      <tr>
      
       <th>学号</th>
      <th>姓名</th>
      <th>宿舍地址</th>
      <th>性别</th>
      <th>违纪时间</th>
      <th>违纪信息</th>
      <th>处理结果</th>
      <th>操作</th>
      </tr>
      <s:iterator value="personviolation" >
      <tr>    
      <td align="center"><s:property value="userid" /></td>
      <td align="center"><s:property value="name" /></td>
      <td align="center"><s:property value="area" /><s:property value="building" /><s:property value="hostel" /></td>
      <td align="center"><s:property value="sex" /></td>
      <td align="center"><s:property value="time" /></td>
       <td align="center"><s:property value="information" /></td>
        <td align="center"><s:property value="result" /></td>
        <td align="center">
        <a href="${pageContext.request.contextPath }/personBynb.action?person.number=${number}">修改</a>
        <a href="${pageContext.request.contextPath }/deleteperviolation.action?person.number=${number}">删除</a>
        </td>
      </tr>
      </s:iterator>
      </table>
  </body>
</html>
