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
    
    <title>My JSP 'dormitoryviolation.jsp' starting page</title>
    
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
    <table  class="table table-striped">
    <thead> 
      <tr class="info">
      <th>宿舍地址</th>
      <th>违纪时间</th>
      <th>联系电话</th>
      <th>违纪信息</th>
      <th>处理结果</th>
      <th>操作</th>
      </tr>
      </thead> 
      <s:iterator value="dormitoryviolation" >
       <tbody> 
      <tr class="success">
      <td align="center"><s:property value="area" /><s:property value="building" /><s:property value="hostel" /></td>   
      <td align="center"><s:property value="time" /></td>
      <td align="center"><s:property value="phone" /></td>
       <td align="center"><s:property value="information" /></td>
        <td align="center"><s:property value="result" /></td>
         <td align="center">
        
         <a href="${pageContext.request.contextPath }/dormitoryBynb.action?dormitory.number=${number}">修改</a>
         <a href="${pageContext.request.contextPath }/deletedorviolation.action?dormitory.number=${number}">删除</a>
        
         </td>
      </tr> </tbody> 
      </s:iterator>
      </table>
   <ul class="pagination">
  <li><a href="#">&laquo;</a></li>
  <li><a href="#">1</a></li>
  <li><a href="#">2</a></li>
  <li><a href="#">3</a></li>
  <li><a href="#">4</a></li>
  <li><a href="#">5</a></li>
  <li><a href="#">&raquo;</a></li>
</ul>
  </body>
</html>
