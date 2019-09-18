package com.bjsxt.service.impl;

import com.bjsxt.mapper.PageMapper;
import com.bjsxt.pojo.Student;
import com.bjsxt.service.PageService;

import java.util.List;

/**
 * 作用：
 * <p>@author anti</p>
 * <p>QQ：1972401425</p>
 * <p>Date：2019/9/17 15:59 </p>
 * <p>Version：1.0</p>
 * <p>Description：</p>
 */
public class PageServiceImpl extends BaseServiceImpl<PageMapper> implements PageService {
    @Override
    public List<Student> findStudent() {
        return mapper.findStudent();
    }

    @Override
    public int getTotalRowCount(String sname, String tname) {
        return mapper.getTotalRowCount(sname,tname);
    }

    @Override
    public List<Student> findStudentByPage(int currentPageNumber, int pageSize) {
        return mapper.findStudentByPage(currentPageNumber, pageSize);
    }

    @Override
    public List<Student> findStudentByPageLikeName(int currentPageNumber, int pageSize, String sname, String tname) {
        return mapper.findStudentByPageLikeName(currentPageNumber,pageSize,sname,tname);
    }
}