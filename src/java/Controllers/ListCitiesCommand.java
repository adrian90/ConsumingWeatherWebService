package Controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.servlet.ServletException;

public class ListCitiesCommand extends FrontCommand {

    @Override
    public void process() throws NamingException, SQLException {

        request.setAttribute("album", "objeto");
        
        try {
            forward("/ListCities.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(ListCitiesCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ListCitiesCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}