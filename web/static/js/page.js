/*表格体元素*/
let $tbody;
/*每页记录数*/
let pageSize;
/*当前页码数*/
let currentPageNumber;
/*总页数*/
let totalPageCount;
/*总记录数*/
let totalRowsCount;
$(function () {
    $tbody = $("#content");
    pageSize = $("input[type='radio']:checked").val();
    /*发送请求获取数据*/
    getData(1, pageSize);
    /*给单选按钮选择每页显示几条数据的监听*/
    $("input[type='radio']").on("click", function () {
        $tbody.empty();
        getData(0, pageSize = $(this).val())
    });
    $("#firstPage").on('click', function () {
        $tbody.empty();
        getData(0, pageSize);
    });


    $("#lastPage").on('click', function () {
        $tbody.empty();
        getData(currentPageNumber, pageSize);
    });

});

/**
 * 动态添加分页页码
 */
function listPagingPage() {
    let $pagingPage = $("#pagingPage");
    $pagingPage.empty();
    for (let index = 1; index <= totalPageCount; index++) {
        $pagingPage.append('<a href ="javascript:void(0);">' + index + '</a>');
    }
    $("#totalPage").html(totalPageCount);
    $("#totalCount").html(totalRowsCount);

}

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
    pageSize = data.pageSize;
    totalPageCount = data.totalPageCount;
    currentPageNumber = data.currentPageNumber;
    totalRowsCount = data.totalRowsCount;
    console.log(data);
    /*动态添加分页页码*/
    listPagingPage();
}

/**
 *发送请求,向服务器请求指定页码的数据
 * @param currentPageNumber 当前页面数
 * @param pageSize 每页显示数据
 */
function getData(currentPageNumber, pageSize) {
    $.get("page", {currentPageNumber: currentPageNumber, pageSize: pageSize},
        function (data) {
            ajaxCall(data)
        }
        , 'json');
}


