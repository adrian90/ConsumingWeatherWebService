
package Model;

import java.util.List;
import org.junit.Test;

public class ParserTests {
    
    @Test
    public void TestParserOfCountries() {
        ParseCountry parser = new ParseCountry();
        List<String> cities = parser.getListCities("Spain");
        for (String city : cities) {
            System.out.println(city);
        }
    }
    
}
