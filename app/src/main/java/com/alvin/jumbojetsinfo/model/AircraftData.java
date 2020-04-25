package com.alvin.jumbojetsinfo.model;

import com.alvin.jumbojetsinfo.R;

import java.util.ArrayList;

public class AircraftData {
    private static String[] aircraftNames = {
        "Airbus A310-300",
        "Airbus A330-900 Neo",
        "Airbus A340-600",
        "Airbus A350-800",
        "Airbus A380",
        "Boeing 747-300",
        "Boeing 747-400",
        "Boeing 777-200LR",
        "Boeing 777-300",
        "Boeing 787-9 Dreamliner"
    };

    private static String[] aircraftDetails = {
        "255 Airbus A310-300 twin-engine wide-bodied airliners have been built since 1983. The A310 is in service worldwide with airlines including Air India, Aeroflot, Air Calin, Cyprus Airways. Czech Airlines, Kuwait Airways, Air Afrique, Pakistan International Airlines and SATA. The aircraft is also in service with the Air Forces of Belgium, Germany and France and with the Defence Force of Canada.",
        "Built on the same measure as the Airbus A330-300, the A330-900neo provides a meaningful enhancement in terms of efficiency and creates a comfortable environment for passengers.",
        "Passenger Jumbo Jet with Higher Benefits and Proven Seats Airbus A340 600",
        "The Xtra Wide Body Line of Passenger Airplanes: The Undeveloped Airbus A350-800 XWB. The heavy and long-range A350 XWB has an extra wide body and was first announced in late 2006. Designed with both wing structures and a fuselage made mostly from carbon fiber reinforced polymer, this is a large airplane that can easily seat 369 passengers.",
        "Changing the Orders The Airbus A380 700",
        "As of 2018, sources indicate that two are being flown by Mahan Airlines, a privately owned Airline in Iran, one is owned by the Saudi Government for shuttling VIPs, and one, a Boeing 747-300SF is used in Belarus to shuttle freight.",
        "Impressive Seating Chart The Boeing 747 400",
        "The Longest Range Commercial Airplane Boeing 777 200LR",
        "The Boeing 777 300 Seating with comfort",
        "Unrivalled Jetliner The Boeing 787 9"
    };


    private static int[] aircraftImages = {
        R.drawable.airbus_a310_300,
        R.drawable.airbus_a330_900_neo,
        R.drawable.airbus_a340_600,
        R.drawable.airbus_a350_800,
        R.drawable.airbus_a380,
        R.drawable.boeing_747_300,
        R.drawable.boeing_747_400,
        R.drawable.boeing_777_200lr,
        R.drawable.boeing_777_300,
        R.drawable.boeing_787_9_dreamliner
    };

    private static String[] aircraftManufacturer = {
        "Airbus",
        "Airbus",
        "Airbus",
        "Airbus",
        "Airbus",
        "Boeing",
        "Boeing",
        "Boeing",
        "Boeing",
        "Boeing"
    };
    private static String[] aircraftCountry = {
        "France",
        "France",
        "France",
        "France",
        "France",
        "United States",
        "United States",
        "United States",
        "United States",
        "United States"
    };
    private static String[] aircraftPrice = {
        "US$72 Million (1998)",
        "US$296.4 million (2018)",
        "US$245 million",
        "US$254.3 million",
        "US$350 million",
        "US$83 million (1982)",
        "US$240 million",
        "US$291.2 million",
        "US$279 million",
        "US$243.6 million"
    };
    private static String[] aircraftSeats = {
        "243 seats",
        "440 seats",
        "420 seats",
        "312 seats",
        "525 seats",
        "496 seats",
        "624 seats",
        "440 seats",
        "550 seats",
        "290 seats"
    };
    private static String[] aircraftEngine = {
        "2x JT9D-7R4E1 / PW4000 / CF6-80C2 turbofan",
        "2x Rolls-Royce Trent 7000-72 turbofan",
        "4 X Rolls Royce Trent 556",
        "2 X Rolls Royce Trent XWB",
        "4 X Engine Alliance GP 7270",
        "4x Pratt & Whitney JT9D-7 / Rolls-Royce RB211-524 / GE CF6 turbofan",
        "4 X General Electric GE CF6-80C2B5F",
        "2 X General Electric GE90-115B",
        "2 X Rolls Royce RR 892",
        "2 X Rolls-Royce Trent 1000"
    };
    private static String[] aircraftMaxCruiseSpeed = {
        "893 Km/h",
        "919 Km/h",
        "933 Km/h",
        "945 Km/h",
        "1087 Km/h",
        "939 Km/h",
        "909 Km/h",
        "945 Km/h",
        "945 Km/h",
        "945 Km/h"
    };
    private static String[] aircraftTravelRange = {
        "9538 Kilometers",
        "13334 Kilometers",
        "14353 Kilometers",
        "15401 Kilometers",
        "16112 Kilometers",
        "11723 Kilometers",
        "13446 Kilometers",
        "17501 Kilometers",
        "11136 Kilometers",
        "15742 Kilometers"
    };

    public static ArrayList<Aircraft> getListData() {
        ArrayList<Aircraft> list = new ArrayList<>();
        for (int position = 0; position < aircraftNames.length; position++) {
            Aircraft aircraft = new Aircraft();
            aircraft.setName(aircraftNames[position]);
            aircraft.setDetail(aircraftDetails[position]);
            aircraft.setPhoto(aircraftImages[position]);
            aircraft.setManufacturer(aircraftManufacturer[position]);
            aircraft.setCountry(aircraftCountry[position]);
            aircraft.setPrice(aircraftPrice[position]);
            aircraft.setSeats(aircraftSeats[position]);
            aircraft.setEngine(aircraftEngine[position]);
            aircraft.setMaxCruiseSpeed(aircraftMaxCruiseSpeed[position]);
            aircraft.setTravelRange(aircraftTravelRange[position]);
            list.add(aircraft);
        }
        return list;
    }
}
