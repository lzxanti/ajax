document.write('<script src="page.js" type="text/javascript" charset="utf-8"></script>');
$("#firstPage").on('click', function () {
    alert($(this))
});

/**
 * 给上一页和下一页绑定事件
 * @param ele 要绑定的元素
 * @param msg 要弹出的信息
 * @param flag  是第一页还是尾页
 * @param changePageNumber 要改变的页码数
 */
function pageTurning(ele, msg, flag, changePageNumber) {
    alert(changePageNumber)
    $(ele).on('click', function () {
        $tbody.empty();
        if (currentPageNumber === flag) {
            alert(msg);
            getData(currentPageNumber, pageSize);
            return false;
        } else {
            getData(changePageNumber, pageSize);
        }
    });
}