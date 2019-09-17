<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <%--  User: anti  --%>
    <%--  DateTime: 2019/9/17 18:54  --%>
    <body>
        <%--头部:按钮和查询条件--%>
        <header>
            <input type = "radio" id = "one" checked name = "pageSize" value = "1">
            <label for = "one">1</label>

            <input type = "radio" id = "two" name = "pageSize" value = "2">
            <label for = "two">2</label>

            <input type = "radio" id = "three" name = "pageSize" value = "3">
            <label for = "three">3</label>
            <input type = "radio" id = "four" name = "pageSize" value = "4">
            <label for = "four">4</label>
            <br>

            <label for = "stuName">学生姓名:</label>
            <input type = "text" id = "stuName">
            <span style = "margin-left: 20px"></span>
            <label for = "teaName">教师姓名:</label>
            <input type = "text" id = "teaName">
        </header>
    </body>
</html>
