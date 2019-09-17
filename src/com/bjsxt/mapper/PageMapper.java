package com.bjsxt.mapper;

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
public interface PageMapper {
    List<Student> findStudent();

    int getTotalRowCount();

    List<Student> findStudentByPage(@Param("currentPageNumber") int currentPageNumber, @Param("pageSize") int pageSize);

    List<Student> findStudentByPageLikeName(
            @Param("currentPageNumber") int currentPageNumber,
            @Param("pageSize") int pageSize,
            @Param("sname") String sname,
            @Param("tname") String tname
    );
}
