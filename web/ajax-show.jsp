<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
    <head>
        <title>ajax方式获取表格</title>
        <script src = "js/jquery-12.js"></script>
        <script>
            $(function () {
                $.get("studentAjax", function (res) {
                    $("#content").empty();
                    $.each(res, function (index, item) {
                        $("#content").append(
                            "<tr>\n" +
                            "<td>" + item.sid + "</td>\n" +
                            "<td>" + item.sname + "</td>\n" +
                            "<td>" + item.sage + "</td>\n" +
                            "<td>" + item.teacher.tname + "</td>\n" +
                            " </tr>");
                    })
                }, 'json');
            });
        </script>
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

            </tbody>

        </table>
    </body>
</html>
