package Model.Trips;
import Model.Airports.*;
import Model.Airlines.*;

public class Trips {
    private Passenger airport_temp;
    private String Boarding_date;
    private int Ticket_Price;
    private Airlines airline_temp;

    public Trips(Passenger p,Airlines a, String date, int tic_price){
        setAirport_temp(p);
        setBoarding_date(date);
        setTicket_Price(tic_price);
        setAirline_temp(a);
    }

    public void setAirport_temp(Passenger airport_temp) {
        this.airport_temp = airport_temp;
    }
    public void setAirline_temp(Airlines airline_temp) {
        this.airline_temp = airline_temp;
    }


    public void setBoarding_date(String Boarding_date) {
        this.Boarding_date = Boarding_date;
    }

    public void setTicket_Price(int ticket_Price) {
        this.Ticket_Price = ticket_Price;
    }

    public Passenger getAirport_temp() {
        return airport_temp;
    }
    public Airlines getAirline_temp() {
        return airline_temp;
    }

    public String getBoarding_date() {
        return Boarding_date;
    }

    public int getTicket_Price() {
        return Ticket_Price;
    }

}
