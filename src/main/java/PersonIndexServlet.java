import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/Product")
public class PersonIndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
        Product p1 = new Product("Cellphone", 1000);
        Product p2 = new Product("Laptop", 2000);
        Product p3 = new Product("Coffee Mug", 100);

        List<Product> products = new ArrayList<>(Arrays.asList(
                p1,
                p2,
                p3
    }

}
