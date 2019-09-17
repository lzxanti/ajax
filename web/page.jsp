<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
    <head>
        <title>Title</title>
        <link rel = "stylesheet" href = "static/css/page.css">
        <script src = "static/js/jquery-12.js"></script>
        <script src = "static/js/page.js"></script>


    </head>
    <%--  User: anti  --%>
    <%--  DateTime: 2019/9/17 15:02  --%>
    <body>
        <div class = "container">
            <%--头部:按钮和查询条件--%>
            <%@include file = "page/header.jsp" %>
            <%--显示数据(表格)区域--%>
            <%@include file = "page/pageBody.jsp" %>
            <%--显示分页条目--%>
            <%@include file = "page/footer.jsp" %>
        </div>
    </body>
</html>
