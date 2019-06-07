<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'adddorviolation.jsp' starting page</title>
    
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
    
   <form action="${pageContext.request.contextPath }/adddormitoryviolation.action" method="post" role="form">
   
<label>区域：</label>
       <select name="dormitory.area" class="form-control">
          <option  value="东区">东区</option>
          <option  value="西区">西区</option>
          <option  value="南区">南区</option>
          <option  value="北区">北区</option>
        </select><br>
       
    
<label>  楼宇：</label>
       <select name="dormitory.building" class="form-control">
          <option  value="一栋">一栋</option>
          <option  value="二栋">二栋</option>
          <option  value="三栋">三栋</option>
          <option  value="四栋">四栋</option>
        </select><br>
  <label>宿舍号：</label><input type="text" name="dormitory.hostel" /><br> 
 <label>处理编号：</label> <input type="text" name="dormitory.number" /><br>     
  <label> 登记时间：</label><input type="text" name="dormitory.time" /><br>
   <label> 联系电话：</label><input type="text" name="dormitory.phone" /><br>
   <label> 违纪信息：</label> <input type="text" name="dormitory.information"/><br>
     <label>  处理结果：</label><input type="text" name="dormitory.result"/><br>
   <input type="submit" value="提交" class="btn btn-primary"/>
   </form>
  </body>
</html>
