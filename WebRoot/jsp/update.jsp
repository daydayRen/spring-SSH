<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>更新页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-cont
	rol" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <center>
   <s:form action="updateUserAction" method="post" >
   <tr>
     <td colspan="2" align="center">
     	<h1><s:text name="修改用户信息" /></h1><br>
     </td>
   </tr>
   <s:textfield name="user.id" key="用户id"  required="true"></s:textfield>
  <s:textfield name="user.name" key="用户名"  required="true"></s:textfield>
   <s:password name="user.password" key="密码" required="true" ></s:password>
   <s:textfield name="user.type" key="类型" required="true" ></s:textfield>
   <s:submit value="提交" ></s:submit>
   <s:reset value="重置" ></s:reset>
   
   </s:form>
  </center>
  </body>
</html>
