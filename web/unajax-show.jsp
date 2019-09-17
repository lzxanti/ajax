<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
    <head>
        <title>非ajax方式获取表格</title>
        <script src = "js/jquery-12.js"></script>

    </head>
    <%--  User: anti  --%>
    <%--  DateTime: 2019/9/17 15:02  --%>
    <body>
        <table border = "1px" cellpadding = "10px" cellspacing = "0px">
            <thead>
                <tr>
                    <th>学生编号</th>
                    <th>学生姓名</th>
                    <th>学生年龄</th>
                    <th>教师姓名</th>
                </tr>
            </thead>
            <tbody id = "content">
                <c:forEach items = "${stus}" var = "stu">
                    <tr>
                        <td>${stu.sid}</td>
                        <td>${stu.sname}</td>
                        <td>${stu.sage }</td>
                        <td>${stu.teacher.tname}</td>
                    </tr>
                </c:forEach>
            </tbody>

        </table>
    </body>
</html>
