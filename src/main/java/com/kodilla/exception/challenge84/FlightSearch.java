package com.kodilla.exception.challenge84;

import java.util.Map;
import java.util.stream.Stream;

public class FlightSearch {

    private Map<String, Boolean> availableAirports;

    public FlightSearch(Map<String, Boolean> availableAirports) {
        this.availableAirports = availableAirports;
    }

// Wersja z loop for

 /*
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
    */


    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        final Boolean[] hasRoute = {false};
        final Integer[] isInMapCounter = {0}; // Na początku wywalał mi bląd, że zmienne w streamie powinny być final. Użyłem rozwiązania zasugeroanego przez Intellij, ale nie do końca je łąpię dlacze
        availableAirports.entrySet().stream()
                .forEach((Map.Entry<String, Boolean> entry) -> {
                            if (entry.getKey().equals(flight.getArrivalAirport())) {
                                if (entry.getValue()) {
                                    hasRoute[0] = true;
                                    System.out.println("Route found");
                                } else {
//                                    throw new RouteNotFoundException("Arrival airport is unavailable");
                                    System.out.println("Arrival airport is unavailable"); // po zmianie for na streama, nie Intellij nie pozwala mi rzucić wyjątkiem, nie rozumiem dlaczego. Tymczasowo zmieniłem na sout
                                }
                            }

                            if (!entry.getKey().equals(flight.getArrivalAirport())) {
                                isInMapCounter[0]++;
                            }
                        }
                );

        if (isInMapCounter[0] == availableAirports.size()) {
            throw new RouteNotFoundException("Arrival airport not found in airports list");
        }

        return hasRoute[0];
    }

}
