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
        /*每次点击这个按钮都从第一条记录开始查*/
        currentPageNumber = 1;
        getData(currentPageNumber, pageSize = $(this).val())
    });
    $("#selectPage").change(function () {
        /*每次点击这个按钮都从第一条记录开始查*/
        currentPageNumber = 1;
        getData(currentPageNumber, pageSize = $(this).val())
    });

    $("#firstPage").on('click', function () {
        getData(1, pageSize);
    });

    $("#prevPage").on('click', function () {
        if (currentPageNumber === 1) {
            alert("已经是第一页了");
            getData(currentPageNumber, pageSize);
            return false;
        } else {
            getData(currentPageNumber -= 1, pageSize);
        }
    });


    $("#nextPage").on('click', function () {
        if (currentPageNumber === totalPageCount) {
            alert("已经是最后一页");
            getData(currentPageNumber, pageSize);
            return false;
        } else {
            getData(currentPageNumber += 1, pageSize);
        }
    });
    $("#lastPage").on('click', function () {
        getData(totalPageCount, pageSize);
    });
    $(".query").on('click', function () {
        /*每次点击这个按钮都从第一条记录开始查*/
        currentPageNumber = 1;
        $tbody.empty();
        $.get("page", {
                currentPageNumber: currentPageNumber,
                pageSize: pageSize,
                sname: $("#stuName").val().trim(),
                tname: $("#teaName").val().trim()
            },
            function (data) {
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
                totalPageCount = Math.ceil(data.rowsData.length / pageSize);
                currentPageNumber = data.currentPageNumber;
                totalRowsCount = data.totalRowsCount;
                /*动态添加分页页码*/
                listPagingPage();
            }
            , 'json');
    })
});

/**
 * 动态添加分页页码
 */
function listPagingPage() {
    let $pagingPage = $("#pagingPage");
    $pagingPage.empty();
    for (let index = 1; index <= totalPageCount; index++) {
        $pagingPage.append('<a href ="javascript:void(0);" id=' + index + '>' + index + '</a>');
    }

    $("#pagingPage a").on('click', function () {
        currentPageNumber = $(this).text();
        getData($(this).text(), pageSize)
    });
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
    /*动态添加分页页码*/
    listPagingPage();
}

/**
 *发送请求,向服务器请求指定页码的数据
 * @param currentPageNumber 当前页面数
 * @param pageSize 每页显示数据
 */
function getData(currentPageNumber, pageSize) {
    $tbody.empty();
    $.get("page", {currentPageNumber: currentPageNumber, pageSize: pageSize},
        function (data) {
            ajaxCall(data)
        }
        , 'json');
}


