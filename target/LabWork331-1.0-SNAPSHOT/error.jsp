<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 22.03.2021
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Error</title>
</head>
<body>
<h1>Произошла ошибка</h1>
<button id="go-back">Ok</button>
</body>
</html>
<script>
    document.getElementById("go-back").addEventListener('click', ()=>{
        history.back();
    });
</script>
