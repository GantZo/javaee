package ru.geekbrains.javaee.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = MainServlet.NAME, urlPatterns = {"/main"})
public class MainServlet extends HttpServlet {

    public static final String NAME = "MainServlet";

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("title", "Главная страница");
        req.getRequestDispatcher("/WEB-INF/shop/main.jsp").forward(req, resp);
    }
}
