package com.bjsxt.service.impl;

import com.bjsxt.mapper.PageMapper;
import com.bjsxt.mapper.StudentMapper;
import com.bjsxt.pojo.Student;
import com.bjsxt.service.PageService;
import com.bjsxt.service.StudentService;
import com.bjsxt.utils.MybatisUtil;

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
    public int getTotalRowCount() {
        return mapper.getTotalRowCount();
    }

    @Override
    public List<Student> findStudentByPage(int currentPageNumber, int pageSize) {
        return mapper.findStudentByPage(currentPageNumber, pageSize);
    }
}