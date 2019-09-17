package com.bjsxt.service.impl;

import com.bjsxt.utils.MybatisUtil;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;


/**
 * 作用：
 * <p>@author anti</p>
 * <p>QQ：1972401425</p>
 * <p>Date：2019/9/17 19:06 </p>
 * <p>Version：1.0</p>
 * <p>Description：</p>
 */
public class BaseServiceImpl<T> {
    protected T mapper;
    {
        Type genType = getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        Class clazz = (Class) params[0];
        System.out.println(clazz.getName());
        mapper = (T) MybatisUtil.openSession(clazz);
    }


}