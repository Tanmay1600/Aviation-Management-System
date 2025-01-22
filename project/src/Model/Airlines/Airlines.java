package Model.Airlines;

import java.io.SyncFailedException;
import java.util.ArrayList;

/**
 * Identification comments:
 * Name: Niraj Chaudhari
 * Experiment No: 03
 * Experiment Title:Interactive Object Creation: Empowering Users to Generate Objects
 through Java Input
 * Experiment Date:23/01/2024
 * @version 1.0
 *
 *
 * Beginning comments:
 * Filename: Airlines.java
 * @author: Niraj Chaudhari
 * Overview: This is the Airlines class. In this file we have achieved the following
 * - Created Attributes
 * --- int airline_ID
 * --- String airlineName
 * --- String country
 * --- String fleetSize
 * --- String Headquarter;
 *
 * - Created Setters and Getters
 * - Created a Display Function to call the getters and display Instance data
 *
 */
public class Airlines extends Company {
    private static int airline_count=0;
    //Declaring variables
    public int AirlineID;

    public int fleetSize;
    public static int getAirline_count(){
        return airline_count;
    }

    public Airlines()
    {
        airline_count++;
        this.setAirlineID(airline_count);
    }
    public Airlines(String CompanyName , String Country ,String Headquarters , int FleetSize)
    {
        super(CompanyName, Country, Headquarters);
        airline_count++;
        this.setAirlineID(airline_count);
        this.setFleetSize(FleetSize);
    }
    public Airlines(int AirlineID, String CompanyName , String Country ,String Headquarters , int FleetSize)
    {
        super(CompanyName, Country, Headquarters);
        airline_count++;
        this.setAirlineID(AirlineID);
        this.setFleetSize(FleetSize);
    }

    public void setAirlineID(int airlineID)
    {
        this.AirlineID = airlineID;
    }
    //Creating Setters

    public void setFleetSize(int fleetSize)
    {
        this.fleetSize = fleetSize;
    }

    //Creating Getters
    public int getAirlineID() {
        return AirlineID;
    }

    public int getFleetSize()
    {
        return fleetSize;
    }
    ///Display Airline data
    public void display(){
        super.display();
        System.out.println("Airline ID:"+getAirlineID() );
        System.out.println("Airline Fleet Size:"+getFleetSize() );
    }
//    Declaring Function bodies which are declared in airlreview interface


}