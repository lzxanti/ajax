<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
    <head>
        <title>Title</title>
        <script src = "js/jquery-12.js"></script>
        <script>
            function get() {
                $.ajax({
                    type: "GET",
                    url: 'gson',
                    data: {name: 'anti', age: 13},
                    /*必须写,不写得到的数据就是字符串
                    * 需要自己手动JSON.parse解析成对象*/
                    dataType: 'JSON',
                    success: function (res) {
                        for (let user of res) {
                            console.log(user.name);
                            console.log(user.age);
                        }
                    }
                });

            }

            function post() {
                $.post(
                    'gson', {name: 'anti', age: 13}, function (res) {
                        for (let user of res) {
                            console.log(user.name);
                            console.log(user.age);
                        }
                    }
                ,"JSON");
            }
        </script>
    </head>
    <%--  User: anti  --%>
    <%--  DateTime: 2019/9/16 16:13  --%>
    <body>
        <button onclick = "get()">获取数据</button>
        <button onclick = "post()">获取数据</button>
    </body>
</html>
