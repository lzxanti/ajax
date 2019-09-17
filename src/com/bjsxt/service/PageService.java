package com.bjsxt.service;

import com.bjsxt.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 作用：
 * <p>@author anti</p>
 * <p>QQ：1972401425</p>
 * <p>Date：2019/9/17 15:44 </p>
 * <p>Version：1.0</p>
 * <p>Description：</p>
 */
public interface PageService {
    List<Student> findStudent();

    int getTotalRowCount();

    List<Student> findStudentByPage(int currentPageNumber, int pageSize);

    List<Student> findStudentByPageLikeName(int currentPageNumber, int pageSize, String sname, String tname);
}
