package Model.Airports;


import java.util.ArrayList;

/**
 * Identification comments:
 *   Name: Richard Joseph
 *   Experiment No: 02
 *   Experiment Title:
 *   Experiment Date:
 *   @version 1.0
 *
 *
 * Beginning comments:
 * Filename: Student.java
 * @author:  Richard Joseph
 * Overview: This is the Student class. In this file we have achieved the following
 * - Created Attributes
 * --- int student_id
 * --- String student_name
 * --- String student_email
 * --- String student_address
 * --- String student_mobile;
 *
 * - Created Setters and Getters
 * - Created a Display Function to call the getters and display Instance data
 *
 */


public class Passenger extends Airports {

    private static int passenger_count = 0;
    int passenger_ID;
    String passenger_name;
    int ticket_number;
    String destination;

    public static int getPassenger_count() {
        return passenger_count;
    }

    public Passenger() {
        passenger_count++;
        this.setPassenger_ID(passenger_count);
    }

    public Passenger(String passenger_name, int ticket_number, String destination,  int Size, String Location) {
        super(Size,Location);
        passenger_count++;
        this.setPassenger_ID(passenger_count);
        this.setPassenger_name(passenger_name);
        this.setTicket_number(ticket_number);
        this.setDestination(destination);
    }

    public Passenger(int passenger_ID, String passenger_name, int ticket_number, String destination, int Size, String Location) {
        super(Size,Location);
        passenger_count++;
        this.setPassenger_ID(passenger_ID);
        this.setPassenger_name(passenger_name);
        this.setTicket_number(ticket_number);
        this.setDestination(destination);

    }


    public void setPassenger_ID(int passenger_ID) {
        this.passenger_ID = passenger_ID;
    }

    public void setPassenger_name(String passenger_name) {
        this.passenger_name = passenger_name;
    }

    public void setTicket_number(int ticket_number) {
        this.ticket_number = ticket_number;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    public int getPassenger_ID() {
        return passenger_ID;
    }

    public String getPassenger_name() {
        return passenger_name;
    }

    public int getTicket_number() {
        return ticket_number;
    }

    public String getDestination() {
        return destination;
    }

    public void display()
    {
        System.out.println("Passenger ID;"+getPassenger_ID());
        System.out.println("Passenger Name:"+getPassenger_name());
        System.out.println("Ticket Number:"+getTicket_number());
        System.out.println("Enter Destination"+getDestination());
        super.display();
    }

}




