<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'dormitoryviolation2.jsp' starting page</title>
    
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
  <table >
 
  <tr>
  <td><a href="${pageContext.request.contextPath }/admini/adddorviolation.jsp">增加</a></td>
   <form action="${pageContext.request.contextPath }/querydormitoryviolation2.action" method="post"  role="form">
  
<label>区域：</label>
       <select name="dormitory.area" class="form-control">
          <option  value="东区">东区</option>
          <option  value="西区">西区</option>
          <option  value="南区">南区</option>
          <option  value="北区">北区</option>
        </select>
      
    
 <label> 楼宇：</label>
       <select name="dormitory.building" class="form-control">
          <option  value="一栋">一栋</option>
          <option  value="二栋">二栋</option>
          <option  value="三栋">三栋</option>
          <option  value="四栋">四栋</option>
        </select>
       
  <label>宿舍编号：</label><input type="text" name="dormitory.hostel"/> 
   <input type="submit" value="搜索" class=".btn-primary"/>
   </form></tr>
   </table>
  </body>
</html>
