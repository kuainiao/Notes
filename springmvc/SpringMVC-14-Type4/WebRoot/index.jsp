<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  <body>
  ${ex.message }
  	<br>
    <form action="${pageContext.request.contextPath}/lijia/register.do" method="post">
    	生日：<input type="text" name="birthday" value="${birthday }"/><font color="red">${birthdayErrors }</font><br>
    	年龄:<input type="text" name="age" value="${age }"/><font color="red">${ageErrors }</font><br>
    	<input type="submit" value="注册"/>
    </form>
  </body>
</html>
