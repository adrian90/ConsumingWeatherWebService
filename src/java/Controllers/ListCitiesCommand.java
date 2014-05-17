package Controllers;

import Model.Country;
import Model.ParseCountry;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.servlet.ServletException;

public class ListCitiesCommand extends FrontCommand {

    @Override
    public void process() throws NamingException, SQLException {

        Country country = ParseCountry.getListCity(request.getParameter("country"));
        request.setAttribute("cities", country);
        
        try {
            forward("/ListCitiesView.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(ListCitiesCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ListCitiesCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}