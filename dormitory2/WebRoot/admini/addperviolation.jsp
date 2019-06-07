<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addperviolation.jsp' starting page</title>
    
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
   
  
   <form action="${pageContext.request.contextPath }/addpersonviolation.action" method="post">
     学号：<input type="text" name="person.userid" /><br>  
     用户名 ：<input type="text" name="person.name" /><br>
     性别：<input type="text" name="person.sex" /><br>     
      区域：<select name="person.area">
          <option  value="东区">东区</option>
          <option  value="西区">西区</option>
          <option  value="南区">南区</option>
          <option  value="北区">北区</option>
        </select>   
       楼宇：<select name="person.building">
          <option  value="一栋">一栋</option>
          <option  value="二栋">二栋</option>
          <option  value="三栋">三栋</option>
          <option  value="四栋">四栋</option>
        </select><br>
       宿舍：<input type="text" name="person.hostel" /> <br> 
   处理编号：<input type="text" name="person.number" /><br>   
      登记时间：<input type="text" name="person.time"/><br>
      违纪信息：<input type="text" name="person.information"/> <br>
       处理结果：<input type="text" name="person.result" /><br>
   <input type="submit" value="提交"/>
   </form>
  </body>
</html>
