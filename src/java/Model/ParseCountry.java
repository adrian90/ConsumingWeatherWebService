package Model;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class ParseCountry {

    public List<String> getListCities(String Country) {

        List<String> cities = new ArrayList<String>();
        try {
            DocumentBuilderFactory dbf
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(getCitiesByCountry(Country)));

            Document doc = db.parse(is);
            NodeList nodes = doc.getElementsByTagName("City");

            for (int i = 0; i < nodes.getLength(); i++) {

                Element line = (Element) nodes.item(i);
                cities.add(getCharacterDataFromElement(line));
                System.out.println("City: " + getCharacterDataFromElement(line));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cities;
    }

    public String getCharacterDataFromElement(Element e) {
        Node child = e.getFirstChild();
        if (child instanceof CharacterData) {
            CharacterData cd = (CharacterData) child;
            return cd.getData();
        }
        return "?";
    }

    private static String getCitiesByCountry(java.lang.String countryName) {
        WebService.GlobalWeather service = new WebService.GlobalWeather();
        WebService.GlobalWeatherSoap port = service.getGlobalWeatherSoap12();
        return port.getCitiesByCountry(countryName);
    }

}
