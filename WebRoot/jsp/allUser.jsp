<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户列表</title>
    
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
  
   <center>
   <s:action name="allUserAction" executeResult="false"></s:action>
   		<h1>用户信息</h1>
   		<table border="1" width="400">
   			<tr>
   			<th>用户ID</th>
   			<th>用户名</th>
   			<th>密码</th>
   			<th>用户类型</th>
   			<th>是否删除</th>
   			<th>是否更新</th>
   			</tr>
   			<s:iterator value="#request.list" id="st">
   				<tr>
   				<td align="center"><s:property value="#st.id"></s:property></td>
   				<td align="center"><s:property value="#st.name"></s:property></td>
   				<td align="center"><s:property value="#st.password"></s:property></td>
   				<td align="center"><s:property value="#st.type"></s:property></td>
   				<td> <a href="${pageContext.request.contextPath}/deleteUserAction.action?id=<s:property value="#st.id"/>" onclick="return confirm('确定删除？')">删除</a><br/></td>
   				<td> <a href="${pageContext.request.contextPath}/jsp/update.jsp?id=<s:property value="#st.id"/>">更新</a><br/></td>
   				

   				</tr>
   			</s:iterator>
   		</table>
   		<br>
   		<a href='<s:url value="/jsp/save.jsp" />'>添加用户</a>
   </center>
  </body>
</html>
