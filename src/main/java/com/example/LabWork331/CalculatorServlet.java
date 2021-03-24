package com.example.LabWork331;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class CalculatorServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) {
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String operation = request.getParameter("operation");

        String result = "";
        switch(operation) {
            case "plus":
                result = num1 + " + " + num2 + " = " + String.valueOf(num1 + num2);
                break;
            case "minus":
                result = num1 + " - " + num2 + " = " + String.valueOf(num1 - num2);
                break;
            case "multiply":
                result = num1 + " * " + num2 + " = " + String.valueOf(num1 * num2);
                break;
            case "devide":
                result = num1 + " / " + num2 + " = " + String.valueOf(num1 / num2);
                break;
        }

        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("result", result);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
        getServletContext().getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
