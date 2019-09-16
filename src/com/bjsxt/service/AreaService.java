package com.bjsxt.service;

import com.bjsxt.pojo.Area;

import java.util.List;

/**
 * 作用：
 * <p>@author anti</p>
 * <p>QQ：1972401425</p>
 * <p>Date：2019/9/16 17:36 </p>
 * <p>Version：1.0</p>
 * <p>Description：</p>
 */
public interface AreaService {
    List<Area> findCityById(int id);
}