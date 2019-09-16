<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
    <head>
        <title>省市联动</title>
        <script src = "js/jquery-12.js"></script>
        <script>
            $(function () {
                cityChange("#province", 0, "省");
            });


            function cityChange(ele, pid, title) {
                if (title === '市') {
                    $("#province").siblings().empty();
                }
                $(ele).html("<option>" + "--请选择" + title + "--</option>");
                $.ajax({
                    type: "POST",
                    url: 'find',
                    data: {pid: pid},
                    dataType: "JSON",
                    success: function (res) {
                        for (let item of res) {
                            $(ele).append("<option value=" + item.areaId + ">" + item.areaName + "</option>");
                        }
                    },
                    error: function (error) {
                        console.log(error);
                    }
                });
            }
        </script>
    </head>
    <%--  User: anti  --%>
    <%--  DateTime: 2019/9/16 17:22  --%>
    <body>
        <label for = "province">省:</label><select id = "province" onchange = "cityChange('#city',this.value,'市')">
        <option selected>--请选择省--</option>
    </select>
        <label for = "city">市</label><select id = "city" onchange = "cityChange('#county',this.value,'区/县')">
        <option>--请选择市--</option>
    </select>
        <label for = "county">县/区:</label><select id = "county">
        <option>--请选择县/区--</option>
    </select>
    </body>
</html>
