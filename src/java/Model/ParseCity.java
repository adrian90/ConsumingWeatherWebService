package Model;

import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class ParseCity {

    public City getWeatherCity(String City, String Country) {
        City city = new City();
        city.setName(City);
        try {
            DocumentBuilderFactory dbf
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(WebServicesMethods.getWeather(City, Country)));

            Document doc = db.parse(is);
            NodeList nodes1 = doc.getElementsByTagName("Visibility");
            Element line = (Element) nodes1.item(0);
            city.setVisibility(getCharacterDataFromElement(line));
            
            NodeList nodes2 = doc.getElementsByTagName("RelativeHumidity");
            line = (Element) nodes2.item(0);
            city.setHumidity(getCharacterDataFromElement(line));
            
            NodeList nodes3 = doc.getElementsByTagName("Temperature");
            line = (Element) nodes3.item(0);
            city.setTemperature(getCharacterDataFromElement(line));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return city;
    }

    public String getCharacterDataFromElement(Element e) {
        Node child = e.getFirstChild();
        if (child instanceof CharacterData) {
            CharacterData cd = (CharacterData) child;
            return cd.getData();
        }
        return "?";
    }
}
