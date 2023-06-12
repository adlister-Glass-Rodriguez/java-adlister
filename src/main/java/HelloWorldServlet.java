import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//Finish up the Hello World Servlet
//   Create a page that displays "Hello World!" when a user visits /hello
//      Bonus
//        Make the page say "Hello, <name>!" if name is passed as part of the query string (e.g. /hello?name=codeup), otherwise default to "Hello, World!".
@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    private int pageCounter;
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        if (name == null) {
            name = "World";
        }
        out.println("<h1>Hello, " + name + "!</h1>");

//      Create a page view counter
//      Create a page that displays a number that goes up by one every time the /count page is viewed.
//         Bonus
//            Allow the user to pass a parameter in the query string to reset the counter.

        res.setContentType("text/html");
        pageCounter++;
        String reset = req.getParameter("reset");
        if (reset != null) {
            pageCounter = 0;
        }
        out.printf("<p>Page Counter: %s</p>", pageCounter);

    }
}
