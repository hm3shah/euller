package interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

/**
 * Write a function that takes in a List[(String,String)] representing (source, destination) flight segments and returns a List[String] that contains the itinerary that the segments represent.
 * <p>
 * E.g. itinerary(Map("YYZ":"NYC", "YVR":"SFO", "SFO":"YYZ"))
 * res0: List[String] = List(YVR, SFO, YYZ, NYC)
 */
public class ItineraryMap {


    public List<String> itineraryMap(Map<String, String> flights) {
        if (flights == null) {
            return null;
        } else {
            String origin = null;
            List<String> result = new ArrayList<>();
//        boolean foundOrigin = false;
            for (String actualOrigin : flights.keySet()) {
                boolean found = false;
                for (String originTemp : flights.keySet()) { //NYC
                    String destination = flights.get(originTemp);
                    if (actualOrigin.equals(destination)) {
                        found = true;
                    }
                }
                if (!found) {
                    origin = actualOrigin;
                }
            }
            if (origin != null) {
                result.add(origin);
                String nextOrigin = origin;
                while (nextOrigin != null) {
                    String temp = nextOrigin;
                    String next = flights.get(temp);
                    if (next != null) {
                        result.add(next);
                    }
                    nextOrigin = next;
                }
            }
            return result;
        }
    }

    @Test
    public void test() {
        assertEquals(itineraryMap(null), null);
        Map<String, String> map = new HashMap<>();
        map.put("yyz", "nyc");
//        E.g. itinerary(Map("YYZ":"NYC", "YVR":"SFO", "SFO":"YYZ"))
        map.put("yvr", "sfo");
        map.put("sfo", "yyz");
        List<String> result = Arrays.asList("yvr", "sfo", "yyz", "nyc");
        assertEquals(itineraryMap(map), result);
    }

}
