package com.example.calculator;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Calculator;

@WebServlet(name = "calculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession();

        Calculator calculator = (Calculator) session.getAttribute("calculator");
        String operator = request.getParameter("op").trim();
        Integer firstOperand = Integer.parseInt(request.getParameter("op1").trim());
        Integer secondOperand = Integer.parseInt(request.getParameter("op2").trim());

        if (calculator == null) {
            calculator = new Calculator();
        }
        calculator.setFirstOperand(firstOperand);
        calculator.setSecondOperand(secondOperand);
        calculator.setOperator(operator);

        session.setAttribute("calculator", calculator);
        try {
            getServletContext().getRequestDispatcher("/calculator.jsp").forward(request, response);
        } catch (ServletException e) {
            System.out.println(e.getMessage());
        }
    }

    public void destroy() {
    }
}