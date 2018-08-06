package ru.geekbrains.javaee.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = ProductServlet.NAME, urlPatterns = {"/product"})
public class ProductServlet extends HttpServlet {

    public static final String NAME = "ProductServlet";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("title", "Продукт");
        req.getRequestDispatcher("/WEB-INF/shop/product.jsp").forward(req, resp);
    }
}
