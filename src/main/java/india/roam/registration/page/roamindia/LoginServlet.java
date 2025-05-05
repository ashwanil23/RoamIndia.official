package india.roam.registration.page.roamindia;
import java.io.*;
import java.util.List;
import java.util.Map;

import india.roam.registration.page.dao.UserDao;
import india.roam.registration.page.dao.UserDaoImpl;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

public class LoginServlet extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;
    private static UserDao userDao = new UserDaoImpl();
    private String message;

    public void init() {

    }
    public LoginServlet() {
        super();
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String username = request.getParameter("email");
        String password = request.getParameter("password");

        if (userDao.isValidUser(username, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            Map<String, String> userDetails = userDao.fetchUserDetails(username, password);
            session.setAttribute("fullname", userDetails.get("fullname"));
            response.sendRedirect("welcome.jsp");
        }
//        if(username.equals("admin@gmail.com") && password.equals("admin")) {
//            response.sendRedirect("welcome.jsp");
//        }
        else {
            response.sendRedirect("login.jsp?error=1");
        }
    }
}
