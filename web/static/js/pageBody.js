document.write('<script src="page.js" type="text/javascript" charset="utf-8"></script>');
document.write('<script src="footer.js" type="text/javascript" charset="utf-8"></script>');

/**
 * 执行ajax的回调函数
 * @param data 服务器响应的数据
 */
function ajaxCall(data) {
    $.each(data.rowsData, function (index, item) {
        $tbody.append(
            "<tr>\n" +
            "<td>" + item.sid + "</td>\n" +
            "<td>" + item.sname + "</td>\n" +
            "<td>" + item.sage + "</td>\n" +
            "<td>" + item.teacher.tname + "</td>\n" +
            " </tr>");
    });
    console.log(data);
    pageSize = data.pageSize;
    totalPageCount = data.totalPageCount;
    currentPageNumber = data.currentPageNumber;
    /*动态添加分页页码*/
    listPagingPage();
}