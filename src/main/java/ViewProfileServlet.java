import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // if user isnt logged in, send them to login page:

        HttpSession session = request.getSession();
        String isLoggedIn = (String) session.getAttribute("isLoggedIn");
        if(isLoggedIn == null) {
            response.sendRedirect("/login");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);

//        String username = (String) request.getSession().getAttribute("user");
//
//        request.setAttribute("username", username);
//        request.getRequestDispatcher("/profile.jsp").forward(request, response);

    }
}
