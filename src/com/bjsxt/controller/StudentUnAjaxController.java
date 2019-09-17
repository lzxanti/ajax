package com.bjsxt.controller;

import com.bjsxt.service.StudentService;
import com.bjsxt.service.impl.StudentServiceImpl;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作用：
 * <p>@author anti</p>
 * <p>QQ：1972401425</p>
 * <p>Date：2019/9/17 15:57 </p>
 * <p>Version：1.0</p>
 * <p>Description：</p>
 */
@WebServlet("/studentUnAjax")
public class StudentUnAjaxController extends HttpServlet {
    private StudentService service = new StudentServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        req.setAttribute("stus", service.findStudent());
        req.getRequestDispatcher("unajax-show.jsp").forward(req, resp);
    }
}