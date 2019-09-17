<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>

<%--显示分页条目--%>
<footer>
    <a href = "javascript:void(0);" id = "firstPage">首页</a>
    <a href = "javascript:void(0);" class = "" id = "prevPage">上一页</a>
    <span id = "pagingPage"></span>
    <a href = "javascript:void(0);" id = "nextPage">下一页</a>
    <a href = "javascript:void(0);" id = "lastPage">尾页</a>
    共<span id = "totalPage"></span>页/共<span id = "totalCount"></span>记录
    <label for = "selectPage" style = "margin-left: 20px">数量:</label>
    <select id = "selectPage">
        <option value = "1">1</option>
        <option value = "2">2</option>
        <option value = "3">3</option>
        <option value = "4">4</option>
        <option value = "5">5</option>
        <option value = "6">6</option>
        <option value = "7">7</option>
        <option value = "8">8</option>
        <option value = "9">9</option>
        <option value = "10">10</option>
    </select>

</footer>
