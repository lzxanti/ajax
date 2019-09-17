package com.bjsxt.service.impl;

import com.bjsxt.mapper.StudentMapper;
import com.bjsxt.pojo.Student;
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
public class StudentServiceImpl implements StudentService {
    private static StudentMapper mapper;

    static {
        mapper = MybatisUtil.openSession(StudentMapper.class);
    }

    @Override
    public List<Student> findStudent() {
        return mapper.findStudent();
    }
}