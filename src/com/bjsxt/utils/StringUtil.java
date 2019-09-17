package com.bjsxt.utils;

/**
 * 作用：
 * <p>@author anti</p>
 * <p>QQ：1972401425</p>
 * <p>Date：2019/9/17 19:44 </p>
 * <p>Version：1.0</p>
 * <p>Description：</p>
 */
public class StringUtil {
    /**
     * 判断参数是否为空
     *
     * @param params 参数
     * @return 不为空true;
     */
    public static boolean isEmpty(String... params) {
        for (String param : params) {
            if (null == param || "".equals(param)) {
                return false;
            }
        }
        return true;
    }
}