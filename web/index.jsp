<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
    <head>
        <title>ajax</title>
        <script>
            let xhr;
            let tip;

            function getXHR() {
                /*判断浏览器版本,IE7一下XMLHttpRequest对象不同*/
                if (window.XMLHttpRequest) {
                    xhr = new XMLHttpRequest();
                } else {
                    /*IE6-*/
                    xhr = new ActiveXObject("Microsoft.XMLHTTP");
                }
                return xhr;
            }

            function check() {
                getXHR();
                let username = document.getElementById("username").value;
                tip = document.getElementById("tip");

                if (null != username && username != '') {
                    xhr.open("GET", "AjaxServlet?username=" + username, true);
                    xhr.onreadystatechange = call;
                    xhr.send(null);
                } else {
                    tip.innerHTML = '<h4 style="color:red">用户名不能为空</h4>';
                }

            }

            function call() {
                tip.innerHTML = xhr.responseText;
            }

        </script>
    </head>
    <%--  User: anti  --%>
    <%--  DateTime: 2019/9/16 9:10  --%>
    <body>
        <form action = "AjaxServlet">
            账号:<input type = "text" name = "username" id = "username" onblur = "check()">
            <span id = "tip"></span><br>
            密码:<input type = "password" name = "password" id = "password"><br>
            年龄:<input type = "number" name = "age" id = "age">
            <input type = "submit" value = "注册">
        </form>
    </body>
</html>
