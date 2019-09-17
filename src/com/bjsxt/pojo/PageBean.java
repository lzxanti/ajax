package com.bjsxt.pojo;

import java.util.List;

/**
 * 作用：分页的实体类
 * <p>@author anti</p>
 * <p>QQ：1972401425</p>
 * <p>Date：2019/9/17 18:26 </p>
 * <p>Version：1.0</p>
 * <p>Description：</p>
 */
public class PageBean<T> {
    /**
     * 当前页码数
     */
    private Integer currentPageNumber;
    /**
     * 每页显示大小
     */
    private Integer pageSize;
    /**
     * 分页查询出来的数据
     */
    private List<T> rowsData;

    /**
     * 总页数
     */
    private Integer totalPageCount;
    /**
     * 总记录数
     */
    private Integer totalRowsCount;

    public PageBean(Integer currentPageNumber, Integer pageSize) {
        this.currentPageNumber = currentPageNumber;
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "currentPageNumber=" + currentPageNumber +
                ", pageSize=" + pageSize +
                ", rowsData=" + rowsData +
                ", totalPageCount=" + totalPageCount +
                ", totalRowsCount=" + totalRowsCount +
                '}';
    }

    public Integer getCurrentPageNumber() {
        return currentPageNumber;
    }

    public PageBean() {
    }

    public void setCurrentPageNumber(Integer currentPageNumber) {
        this.currentPageNumber = currentPageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getRowsData() {
        return rowsData;
    }

    public void setRowsData(List<T> rowsData) {
        this.rowsData = rowsData;
    }

    public Integer getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(Integer totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public Integer getTotalRowsCount() {
        return totalRowsCount;
    }

    public void setTotalRowsCount(Integer totalRowsCount) {
        this.totalRowsCount = totalRowsCount;
    }

    public PageBean(Integer currentPageNumber, Integer pageSize, List<T> rowsData, Integer totalPageCount, Integer totalRowsCount) {
        this.currentPageNumber = currentPageNumber;
        this.pageSize = pageSize;
        this.rowsData = rowsData;
        this.totalPageCount = totalPageCount;
        this.totalRowsCount = totalRowsCount;
    }
}