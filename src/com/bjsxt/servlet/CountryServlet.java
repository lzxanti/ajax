package com.bjsxt.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * 作用：
 * <p>@author anti</p>
 * <p>QQ：1972401425</p>
 * <p>Date：2019/9/16 11:51 </p>
 * <p>Version：1.0</p>
 * <p>Description：</p>
 */
@WebServlet("/country")
public class CountryServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String country = req.getParameter("country");
        List<String> foods = new LinkedList<>();
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        switch (country) {
            case "1":
                foods.add("寿司");
                foods.add("泡菜");
                foods.add("金枪鱼");
                break;
            case "2":
                foods.add("汉堡");
                foods.add("炸鸡");
                foods.add("奥尔良烤翅");
                break;
            case "3":
                foods.add("烤串");
                foods.add("火锅");
                foods.add("东北乱炖");
                break;
            default:
                foods.add("暂时没有");
                break;
        }
        resp.getWriter().println(foods);
    }
}