import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")



public class PizzaOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String[] toppings = request.getParameterValues("toppings");
        String address = request.getParameter("address");

        // Output the values
        System.out.println("Crust Type: " + crust);
        System.out.println("Sauce Type: " + sauce);
        System.out.println("Size Type: " + size);
        System.out.println("Toppings: ");
        if (toppings != null) {
            for (String topping : toppings) {
                System.out.println("* " + topping);
            }
        }
        System.out.println("Delivery Address: " + address);

        // Redirect back to the form page or any other page
        response.sendRedirect("pizzaOrder.jsp");
        System.out.println(response);
    }
}