package View.Passenger;

import javax.swing.*;

public class ManagePassengerFrame extends JFrame {
    InitialPanelPassenger ip;

    public ManagePassengerFrame()
    {
        super("Manage Passenger DashBoard");
        ip = new InitialPanelPassenger();
        add(ip);
        pack();
        setSize(950, 800);
    }

    public void setIp(InitialPanelPassenger ip) {
        this.ip = ip;
    }

    public InitialPanelPassenger getIp() {
        return ip;
    }
}
