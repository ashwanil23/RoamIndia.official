package india.roam.registration.page.roamindia;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

public class LogoutServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
            response.sendRedirect("index.html");
        }else {
            response.sendRedirect("index.html");
        }
    }

}