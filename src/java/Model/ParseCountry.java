
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


public class ParseCountry {
    public class ParseXMLString {

  public String getListCities(String Country) {
      
    String cities = getCitiesByCountry(Country);
            
    try {
        DocumentBuilderFactory dbf =
            DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        InputSource is = new InputSource();
        is.setCharacterStream(new StringReader(cities));

        Document doc = db.parse(is);
        NodeList nodes = doc.getElementsByTagName("Country");

        // iterate the employees
        for (int i = 0; i < nodes.getLength(); i++) {
           Element element = (Element) nodes.item(i);

           NodeList name = element.getElementsByTagName("name");
           Element line = (Element) name.item(0);
           System.out.println("Name: " + getCharacterDataFromElement(line));

           NodeList title = element.getElementsByTagName("title");
           line = (Element) title.item(0);
           System.out.println("Title: " + getCharacterDataFromElement(line));
        }
    }
    catch (Exception e) {
        e.printStackTrace();
    }
    /*
    output :
        Name: John
        Title: Manager
        Name: Sara
        Title: Clerk
    */    
      return null;
    
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

    private static String getCitiesByCountry(java.lang.String countryName) {
        WebService.GlobalWeather service = new WebService.GlobalWeather();
        WebService.GlobalWeatherSoap port = service.getGlobalWeatherSoap12();
        return port.getCitiesByCountry(countryName);
    }

}
