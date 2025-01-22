package View.Airlines;

import javax.swing.*;

public class ManageAirlineFrame extends JFrame {
    InitialPanelAirline airline_ip;

    public ManageAirlineFrame()
    {
        super("Manage Airlines DashBoard");
        airline_ip = new InitialPanelAirline();
        add(airline_ip);
        pack();
        setSize(950, 800);
    }

    public void setairline_ip(InitialPanelAirline course_ip) {
        this.airline_ip = course_ip;
    }

    public InitialPanelAirline getairline_ip() {
        return airline_ip;
    }
}
