package com.kodilla.exception.challenge84;

import java.util.Map;

public class FlightSearch {

    private Map<String, Boolean> availableAirports;

    public FlightSearch(Map<String, Boolean> availableAirports) {
        this.availableAirports = availableAirports;
    }

    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        Boolean hasRoute = false;
        Integer isInMapCounter = 0;


        for (Map.Entry<String, Boolean> entry : availableAirports.entrySet()) {
            if (entry.getKey().equals(flight.getArrivalAirport())) {
                if (entry.getValue()) {
                    hasRoute = true;
                    System.out.println("Route found");
                } else {
                    throw new RouteNotFoundException("Arrival airport is unavailable");
                }
            }

            if (!entry.getKey().equals(flight.getArrivalAirport())) {
                isInMapCounter++;
            }

        }
        if (isInMapCounter == availableAirports.size()) {
            throw new RouteNotFoundException("Arrival airport not found in airports list");
        }

        return hasRoute;
    }

}
