<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<%@page errorPage="/error.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Задание 3</title>
    <style type="text/css">
        button {
            width: 50px;
            cursor: pointer;
            text-align: center;
        }
    </style>
</head>
<body>
<h1>Калькулятор</h1>
<form method="post">
    <input name="num1" value="${num1}"><input name="num2" value="${num2}">
    <table>
        <tr>
            <td>
                <button type="submit" name="operation" value="plus">
                    +
                </button>
            </td>
            <td>
                <button type="submit" name="operation" value="minus">
                    -
                </button>
            </td>
        </tr>
        <tr>
            <td>
                <button type="submit" name="operation" value="multiply">
                    *
                </button>
            </td>
            <td>
                <button type="submit" name="operation" value="devide">
                    /
                </button>
            </td>
        </tr>
    </table>
    <label for="result">Результат:</label><input id="result" value="${result}" readonly>
</form>
</body>
</html>