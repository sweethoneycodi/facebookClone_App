package Servlet;

import Database.SignUpData;
import Model.Persons;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "signUpServlet", value = "/signUp-Servlet")
public class SignUpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstname = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confPassword = request.getParameter("confPassword");

        Persons persons = new Persons();
        persons.setFirstName(firstname);
        persons.setLastname(lastName);
        persons.setUserName(username);
        persons.setEmail(email);
        persons.setPassword(password);
        persons.setConfPassword(confPassword);

        SignUpData signUpData = new SignUpData();
        String result = signUpData.insert(persons);
       // response.getWriter().print(result);
        response.sendRedirect("LogIn.jsp");

    }
}
