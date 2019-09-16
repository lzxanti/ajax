package com.bjsxt.service.impl;

import com.bjsxt.mapper.AreaMapper;
import com.bjsxt.pojo.Area;
import com.bjsxt.service.AreaService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

/**
 * 作用：
 * <p>@author anti</p>
 * <p>QQ：1972401425</p>
 * <p>Date：2019/9/16 17:37 </p>
 * <p>Version：1.0</p>
 * <p>Description：</p>
 */
public class AreaServiceImpl implements AreaService {
    private static AreaMapper mapper;

    static {
        try {
            SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml")).openSession();
            mapper = sqlSession.getMapper(AreaMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Area> findCityById(int id) {
        return mapper.findCityById(id);
    }
}