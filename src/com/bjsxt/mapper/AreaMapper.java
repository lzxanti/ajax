package com.bjsxt.mapper;

import com.bjsxt.pojo.Area;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 作用：
 * <p>@author anti</p>
 * <p>QQ：1972401425</p>
 * <p>Date：2019/9/16 17:31 </p>
 * <p>Version：1.0</p>
 * <p>Description：</p>
 */
public interface AreaMapper {
    @Select("  select * from area where parentid = #{id}")
    List<Area> findCityById(int id);
}
