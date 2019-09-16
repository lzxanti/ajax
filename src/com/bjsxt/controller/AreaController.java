package com.bjsxt.controller;

import com.bjsxt.pojo.Area;
import com.bjsxt.service.AreaService;
import com.bjsxt.service.impl.AreaServiceImpl;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 作用：
 * <p>@author anti</p>
 * <p>QQ：1972401425</p>
 * <p>Date：2019/9/16 17:41 </p>
 * <p>Version：1.0</p>
 * <p>Description：</p>
 */
@WebServlet("/find")
public class AreaController extends HttpServlet {
    private AreaService service = new AreaServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String pid = req.getParameter("pid");
        List<Area> areas = service.findCityById(Integer.parseInt(pid));
        resp.getWriter().println(new Gson().toJson(areas));
    }
}