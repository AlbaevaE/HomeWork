import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class MyHomeWork extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        req.getRequestDispatcher("test.jsp").forward(req,resp);
        out.println("<html>");
        out.println("<head> c</head>");
        out.println("<body> %=" + new Date() + "%</body>");
        out.println("</html>"); // не пойму как правильно вывести

    }

}
