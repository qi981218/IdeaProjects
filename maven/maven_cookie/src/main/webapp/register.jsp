<%--
  User: 陈亚琪
  Date: 2022/8/14
  Time: 19:35
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        function flush() {
            document.querySelector("#img1").src = "/userInfo/checkCodeImg?" + new Date().getTime();
        }
    </script>
</head>
<body>
<form action="http://localhost:8080/userInfo/register">
    账号:<input type="text" name="username" value=""></br>
    密码:<input type="text" name="password" value=""></br>
    <img src="/userInfo/checkCodeImg" id="img1" onclick="flush()">
    <span onclick="flush()"> <b>看不清换一张</b></span></br>
    <h3 style="color: red">${msc}</h3>
    <input type="text" name="yzm" value="" placeholder="请输入验证码"></br>
    <input type="submit" value="注册">
</form>

</body>
</html>
