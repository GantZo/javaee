package ru.geekbrains.javaee.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = CartServlet.NAME, urlPatterns = {"/cart"})
public class CartServlet extends HttpServlet {

    public static final String NAME = "CartServlet";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("title", "Корзина");
        req.getRequestDispatcher("/WEB-INF/shop/cart.jsp").forward(req, resp);
    }
}
