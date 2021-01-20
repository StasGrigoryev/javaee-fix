package org.example.javaee_fix.servlets;

import org.example.javaee_fix.models.User;
import org.example.javaee_fix.repos.UsersRepo;
import org.example.javaee_fix.repos.UsersRepoInMemoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {
    private UsersRepo usersRepo = new UsersRepoInMemoryImpl();

    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = usersRepo.findAll();
        req.setAttribute("usersFromServer", users);
        //
        RequestDispatcher disp = req.getRequestDispatcher("/views/signup.jsp");
        disp.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String pwd = req.getParameter("password");
        String bd = req.getParameter("birthdate");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(bd, dtf);
        User user = new User(name,pwd,birthDate);
        usersRepo.save(user);


        doGet(req, resp);
    }
}
