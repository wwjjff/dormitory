<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'personviolation2.jsp' starting page</title>
    
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
    <table class="table">
 
  <tr class="form-control">
  <td><a href="${pageContext.request.contextPath }/admini/addperviolation.jsp"">增加</a></td>
   <form action="${pageContext.request.contextPath }/querypersonviolation2.action" method="post" class="form-inline" role="form" >
    <label for="name">学号：</label>   
  <input type="text" name="person.userid" class="info" placeholder="请输入要查询的学号"/> 
   <input class="btn btn-primary" type="submit" value="搜索"/>
   </form>
   </tr>
 
   </table>
  </body>
</html>
