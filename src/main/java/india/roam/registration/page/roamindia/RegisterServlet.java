package india.roam.registration.page.roamindia;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {


    public void init() {

    }
    public RegisterServlet() {
        super();
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String username = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        String fullname = request.getParameter("fullname");
//        if (userDao.isValid(username, password)) {
//            HttpSession session = request.getSession();
//            session.setAttribute("username", username);
//            session.setAttribute("password", password);
//            response.sendRedirect("index.jsp");
//        }
        if(password.equals(confirmPassword)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            session.setAttribute("fullname", fullname);
            response.sendRedirect("welcome.jsp?fullname="+fullname);
        }
        else {
            response.sendRedirect(request.getContextPath() + "/register.jsp?error=1");
        }
    }
}
