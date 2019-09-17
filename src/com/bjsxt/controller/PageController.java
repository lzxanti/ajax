package com.bjsxt.controller;

import com.bjsxt.pojo.PageBean;
import com.bjsxt.pojo.Student;
import com.bjsxt.service.PageService;
import com.bjsxt.service.impl.PageServiceImpl;
import com.bjsxt.utils.StringUtil;
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
@WebServlet("/page")
public class PageController extends HttpServlet {
    private PageService service = new PageServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String cp = req.getParameter("currentPageNumber");
        String ps = req.getParameter("pageSize");
        if (StringUtil.isEmpty(ps, cp)) {
            //当前页码数
            int currentPageNumber = Integer.parseInt(cp);
            //每页显示数
            int pageSize = Integer.parseInt(ps);
            //总的记录数
            int totalRowsCount = service.getTotalRowCount();
            int totalPageCount = (int) Math.ceil(((double) totalRowsCount / pageSize));
            int currentNumber = (currentPageNumber - 1) * pageSize;
            PageBean<Student> pageBean = new PageBean<>();
            System.out.println(pageBean);
            pageBean.setTotalPageCount(totalPageCount);
            pageBean.setPageSize(pageSize);
            System.out.println(currentNumber);
            pageBean.setRowsData(service.findStudentByPage(currentNumber, pageSize));
            pageBean.setTotalRowsCount(totalRowsCount);
            pageBean.setCurrentPageNumber(currentPageNumber);


            resp.getWriter().write(new Gson().toJson(pageBean));
            return;
        }
        resp.getWriter().write(new Gson().toJson(service.findStudent()));

    }
}