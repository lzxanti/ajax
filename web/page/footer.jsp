<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <%--  User: anti  --%>
    <%--  DateTime: 2019/9/17 18:55  --%>
    <body>
        <%--显示分页条目--%>
        <footer>
            <a href = "javascript:void(0);" id = "firstPage">首页</a>
            <a href = "javascript:void(0);" id = "prevPage">上一页</a>
            <span id = "pagingPage"></span>
            <a href = "javascript:void(0);" id = "nextPage">下一页</a>
            <a href = "javascript:void(0);" id = "lastPage">尾页</a>
            共<span id = "totalPage"></span>页/共<span id = "totalCount"></span>记录
        </footer>
    </body>
</html>
