package View.Trips;

import javax.swing.*;

public class ManageTripsFrame extends JFrame {
    InitialPanelTrips trip_ip;

    public ManageTripsFrame()
    {
        super("Manage Trips DashBoard");
        trip_ip = new InitialPanelTrips();
        add(trip_ip);
        pack();
        setSize(950, 800);
    }

    public void settrip_ip(InitialPanelTrips enroll_ip) {
        this.trip_ip = enroll_ip;
    }

    public InitialPanelTrips gettrip_ip() {
        return trip_ip;
    }
}
