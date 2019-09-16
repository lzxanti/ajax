<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
    <head>
        <title>Title</title>
        <script>
            let xhr;

            function change(val) {
                if (window.XMLHttpRequest) {
                    xhr = new XMLHttpRequest();
                } else {
                    xhr = new ActiveXObject("Microsoft.XMLHTTP")
                }
                xhr.open('GET', "country?country=" + val);
                xhr.onreadystatechange = call;
                xhr.send();
            }

            function call() {
                let result = xhr.responseText;
                let select = document.getElementById("food");
                result = result.replace('[', '').replace(']', '');
                let foods = result.split(", ");
                select.innerHTML = " <option selected>-请选择食品-</option>";
                for (let food of foods) {
                    select.innerHTML += " <option selected>" + food + "</option>";
                }


            }
        </script>
    </head>
    <%--  User: anti  --%>
    <%--  DateTime: 2019/9/16 11:40  --%>
    <body>
        <select id = "country" name = "country" onchange = "change(this.value)">
            <option selected value = "0">-请选择口味-</option>
            <option value = "1">日韩</option>
            <option value = "2">欧美</option>
            <option value = "3">国产</option>
        </select>

        <select id = "food" name = "food">
            <option selected>-请选择食品-</option>

        </select>
    </body>
</html>
