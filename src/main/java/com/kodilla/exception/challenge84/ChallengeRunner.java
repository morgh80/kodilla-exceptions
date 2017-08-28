package com.kodilla.exception.challenge84;

import java.util.HashMap;
import java.util.Map;

public class ChallengeRunner {

    public static void main(String[] args) {

        Flight JFKtoWMI = new Flight("JFK", "WMI");
        Flight NBYtoZTE = new Flight("NBY", "ZTE");
        Flight FRAtoDUB = new Flight("FRA", "DUB");

        Map<String, Boolean> availableAirports = new HashMap<>();
            availableAirports.put("JFK", true);
            availableAirports.put("WMI", true);
            availableAirports.put("SXF", true);
            availableAirports.put("DUB", false);
            availableAirports.put("FRA", false);

        FlightSearch flightSearch = new FlightSearch(availableAirports);

        try {
            flightSearch.findFlight(JFKtoWMI);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
