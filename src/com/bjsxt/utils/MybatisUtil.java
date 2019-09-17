package com.bjsxt.utils;

import com.bjsxt.mapper.AreaMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * 作用：
 * <p>@author anti</p>
 * <p>QQ：1972401425</p>
 * <p>Date：2019/9/17 16:00 </p>
 * <p>Version：1.0</p>
 * <p>Description：</p>
 */
public class MybatisUtil {
    private SqlSession sqlSession;

    /**
     * 获取mapper
     *
     * @param tClass mapper的class
     * @param <T>    实际Mapper类型
     * @return mapper
     */
    public static <T> T openSession(Class<T> tClass) {
        SqlSession sqlSession;
        try {
            sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml")).openSession();
            sqlSession.clearCache();
            return sqlSession.getMapper(tClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void finalize() {
        sqlSession.close();
    }
}