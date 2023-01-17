package Servlet;

import Database.LogInData;
import Model.Persons;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(  "/loginServlet")
public class LogInServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("hello ");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Persons persons = new Persons();
        persons.setUserName(username);
        persons.setPassword(password);

        LogInData logInData = new LogInData();
        if (logInData.validate(persons)) {
            response.sendRedirect("HomePage.jsp");
//            getServletContext().getRequestDispatcher("/Homepage.jsp").forward(request, response);
        } else {
            response.sendRedirect("LogIn.jsp");
        };

    }
}
