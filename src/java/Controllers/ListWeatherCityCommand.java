
package Controllers;

import Model.ParseCity;
import Model.City;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.servlet.ServletException;


public class ListWeatherCityCommand extends FrontCommand {

    @Override
    public void process() throws NamingException, SQLException {
        
        City city = ParseCity.getWeatherCity(request.getParameter("city"), request.getParameter("country"));
        if (city.getVisibility() == null){
            request.setAttribute("checkCity", 0);
            try {
             forward("/FrontController?command=Main");
        } catch (ServletException ex) {
            Logger.getLogger(ListCitiesCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ListCitiesCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        request.setAttribute("city", city);
        try {
            forward("/ListWeatherCityView.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(ListCitiesCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ListCitiesCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
