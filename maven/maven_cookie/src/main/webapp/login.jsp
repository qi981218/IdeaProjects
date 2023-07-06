<%--
  User: 陈亚琪
  Date: 2022/8/14
  Time: 16:15
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8080/userInfo/login">
    账号:<input type="text" name="username" value="${cookie.username.value}"></br>
    密码:<input type="password" name="password" value="${cookie.password.value}"></br>
    <input type="checkbox" name="gouxuan" value="ok"  ${ cookie.username.value!=null? "checked":''}>保存密码</br>
    <input type="submit" value="登录">
</form>

</body>
</html>
