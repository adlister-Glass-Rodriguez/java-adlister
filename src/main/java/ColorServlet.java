import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "pickColor", urlPatterns = "/pickColor")
public class ColorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String color = request.getParameter("color");
        String redirectURL = "viewColor?color=" + color;
        response.sendRedirect(redirectURL);
    }
}