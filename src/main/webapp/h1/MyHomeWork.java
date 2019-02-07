import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;

public class MyHomeWork extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        req.getRequestDispatcher("test.jsp").forward(req,resp);
        out.println("<html>");
        out.println("<head> time-date </head>");
        out.println("<body> <p>" + new Date() + "</p></body>");
        out.println("</html>"); // сервлет со временем работает, после добавления второго выдает ошибку 500

        Random rm = new Random();
        int sum = 0;
        int max =100;
        int min =1;
        int a = rm.nextInt((max-min)+min+1);
        out.println("<html>");
        out.println("<head> sum </head>");
        out.println("body>  %=" +(sum+=a)+"%</body>");
        out.println("</html>");

        out.println("html>");
        out.println("<head> google </head>");
        out.println("<body> %=www.google.com%</body>");
        out.println("/html");


    }

}
