package com.bjsxt.servlet;

import com.bjsxt.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 作用：
 * <p>@author anti</p>
 * <p>QQ：1972401425</p>
 * <p>Date：2019/9/16 14:42 </p>
 * <p>Version：1.0</p>
 * <p>Description：</p>
 */
@WebServlet("/json")
public class JsonServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        User user1 = new User(name, 31);
        User user2 = new User(name, 32);
        User user3 = new User(name, 33);
        User user4 = new User(name, 34);
        ArrayList<Object> list = new ArrayList<>();
        list.add(user1);
        Collections.addAll(list, user2, user3, user4);
        resp.getWriter().println(list);
    }
}