<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'repair.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script language=JavaScript src="js/wpCalendar.js" ></script>
  </head>
  
  <body>
   <form action="repair.action" width="500" height="150" border="1" align="center" method="post">
  <p>  
    区域：<select name="repair.area">
          <option  value="东区">东区</option>
          <option  value="西区">西区</option>
          <option  value="南区">南区</option>
          <option  value="北区">北区</option>
        </select>
   楼宇：<select name="repair.building">
          <option  value="一栋">一栋</option>
          <option  value="二栋">二栋</option>
          <option  value="三栋">三栋</option>
          <option  value="四栋">四栋</option>
        </select>
   </p>   
   <p>
    宿舍编号：<input type="text" name="repair.hostel"/>
   </p> 
    <p>
    报修人姓名：<input type="text" name="repair.name"/>
   </p> 
     <p>
    报修人帐号：<input type="text" name="repair.userid"/>
   </p> 
   <p>
   报修时间：<input type="text" name="repair.time" onfocus="showCalendar(this)"/>
   </p>
    <p>
   报修信息：<input type="text" name="repair.information"/>
   </p>
    <p>
   联系电话：<input type="text" name="repair.phone"/>
   </p> 
   <input type="submit" value="提交"/>
   </form>
  </body>
</html>
