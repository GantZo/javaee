package ru.geekbrains.javaee.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = CatalogServlet.NAME, urlPatterns = {"/catalog"})
public class CatalogServlet extends HttpServlet {

    public static final String NAME = "CatalogServlet";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("title", "Каталог");
        req.getRequestDispatcher("/WEB-INF/shop/catalog.jsp").forward(req, resp);
    }
}
