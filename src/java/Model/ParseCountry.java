package Model;

import static Model.DataFromElement.getCharacterDataFromElement;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class ParseCountry {

    public static Country getListCity(String country) {
        
        List<City> cities = new ArrayList<City>();
        try {
            DocumentBuilderFactory dbf
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(WebServicesMethods.getCitiesByCountry(country)));

            Document doc = db.parse(is);
            NodeList nodes = doc.getElementsByTagName("City");
            if (nodes.getLength() == 0) return null;

            for (int i = 0; i < nodes.getLength(); i++) {
                Element line = (Element) nodes.item(i);
                City city = new City();
                city.setName(getCharacterDataFromElement(line));
                cities.add(city);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Country(country, cities);
    }

}
