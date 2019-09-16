<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
    <head>
        <title>Title</title>
        <script>
            let xhr;

            function getJson(name) {
                if (window.XMLHttpRequest) {
                    xhr = new XMLHttpRequest();
                } else {
                    xhr = new ActiveXObject("Microsoft.XMLHTTP");
                }
                xhr.open("post", "json", true);
                xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
                xhr.onreadystatechange =evalObj2Json;
                xhr.send("name=" + name);
            }

            function evalObj2Json() {
                if (xhr.readyState === 4 && xhr.status === 200) {
                    let result = xhr.responseText;
                    console.log(result);
                    eval("var user=" + result);
                    console.log(user.name);
                    console.log(user.age);
                }
            }
        </script>
    </head>
    <%--  User: anti  --%>
    <%--  DateTime: 2019/9/16 14:36  --%>
    <body>
        <button onclick = "getJson('anti')">获取JSON</button>
    </body>
</html>
