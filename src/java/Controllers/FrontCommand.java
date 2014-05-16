package Controllers;

import java.io.IOException;
import java.sql.SQLException;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
;
import javax.servlet.ServletContext;



abstract public class FrontCommand {

    protected ServletContext context;
    protected HttpServletRequest request;
    protected HttpServletResponse response;

    public void init(ServletContext context, HttpServletRequest request, HttpServletResponse response) {
        this.context = context;
        this.request = request;
        this.response = response;
    }

    abstract public void process() throws NamingException, SQLException;

    public void forward(String destiny)
            throws ServletException, IOException {
        RequestDispatcher dp
                = context.getRequestDispatcher(destiny);
        dp.forward(request, response);
    }
}
