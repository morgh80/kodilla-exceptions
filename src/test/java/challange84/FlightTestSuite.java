package challange84;

import com.kodilla.exception.challenge84.Flight;
import com.kodilla.exception.challenge84.FlightSearch;
import com.kodilla.exception.challenge84.RouteNotFoundException;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FlightTestSuite {

    @Test
    public void isFalseWhenAirportIsNotInList() {
        // Given
        Map<String, Boolean> availableAirports = new HashMap<>();
        availableAirports.put("JFK", true);
        availableAirports.put("SXF", false);
        FlightSearch flightSearch = new FlightSearch(availableAirports);
        Flight NBYtoZTE = new Flight("NBY", "ZTE");
        Boolean result = false;

        //When
        try {
            result = flightSearch.findFlight(NBYtoZTE);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Then
        Assert.assertEquals(false, result);
    }

    @Test
    public void isFalseWhenAirportIsUnavailable() {
        // Given
        Map<String, Boolean> availableAirports = new HashMap<>();
        availableAirports.put("JFK", true);
        availableAirports.put("SXF", false);
        FlightSearch flightSearch = new FlightSearch(availableAirports);
        Flight NBYtoZTE = new Flight("NBY", "SXF");
        Boolean result = false;

        //When
        try {
            result = flightSearch.findFlight(NBYtoZTE);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Then
        Assert.assertEquals(false, result);
    }

    @Test
    public void isTrueWhenAirporstIsAvailable() {
        // Given
        Map<String, Boolean> availableAirports = new HashMap<>();
        availableAirports.put("JFK", true);
        availableAirports.put("SXF", false);
        FlightSearch flightSearch = new FlightSearch(availableAirports);
        Flight NBYtoZTE = new Flight("NBY", "JFK");
        Boolean result = false;

        //When
        try {
            result = flightSearch.findFlight(NBYtoZTE);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Then
        Assert.assertEquals(true, result);

    }


}
