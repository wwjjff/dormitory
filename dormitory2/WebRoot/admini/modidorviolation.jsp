<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'modidorviolation.jsp' starting page</title>
    
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
    
   <form action="${pageContext.request.contextPath }/modidormitoryviolation.action" method="post" role="">
   
区域：
       <select name="dormitory.area">
          <option  value="东区">东区</option>
          <option  value="西区">西区</option>
          <option  value="南区">南区</option>
          <option  value="北区">北区</option>
        </select><br>
       
    
   楼宇：
       <select name="dormitory.building" >
          <option  value="一栋">一栋</option>
          <option  value="二栋">二栋</option>
          <option  value="三栋">三栋</option>
          <option  value="四栋">四栋</option>
        </select><br>
     宿舍号：<input type="text" name="dormitory.hostel" value="${dormitory.hostel}"/><br>
    处理编号：<input type="text" name="dormitory.number" value="${dormitory.number}"/><br>    
    登记时间：<input type="text" name="dormitory.time" value="${dormitory.time}"/><br>
     联系电话：<input type="text" name="dormitory.phone" value="${dormitory.phone}"/><br>
      违纪信息：<input type="text" name="dormitory.information" value="${dormitory.information}"/><br>
      处理结果：<input type="text" name="dormitory.result"  value="${dormitory.result}"/><br>
   <input type="submit" value="修改"/>
   </form>
  </body>
</html>
