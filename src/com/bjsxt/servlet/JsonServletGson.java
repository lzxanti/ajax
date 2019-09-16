package com.bjsxt.servlet;

import com.bjsxt.pojo.UserGson;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 作用：
 * <p>@author anti</p>
 * <p>QQ：1972401425</p>
 * <p>Date：2019/9/16 14:42 </p>
 * <p>Version：1.0</p>
 * <p>Description：</p>
 */
@WebServlet("/gson")
public class JsonServletGson extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        UserGson user1 = new UserGson(name, 31);
        UserGson user2 = new UserGson(name, 32);
        UserGson user3 = new UserGson(name, 33);
        UserGson user4 = new UserGson(name, 34);
        ArrayList<Object> list = new ArrayList<>();
        list.add(user1);
        Collections.addAll(list, user2, user3, user4);
        resp.getWriter().println(new Gson().toJson(list));
    }
}