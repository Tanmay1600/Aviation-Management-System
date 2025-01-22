package View;

import javax.swing.*;
import java.awt.*;

public class FirstFrame extends JFrame {
    JButton managePassBtn;
    JButton manageAirlineBtn;
    JButton manageTripsBtn;
    JPanel firstPanel;


    FirstFrame()
    {
        super("Main DashBoard");
        managePassBtn = new JButton("Manage Passengers");
        manageAirlineBtn = new JButton("Manage Airlines");
        manageTripsBtn = new JButton("Manage Trips");

        firstPanel = new JPanel();
        firstPanel.setLayout(new GridLayout(3,1,20,20));
        firstPanel.add(managePassBtn);
        firstPanel.add(manageAirlineBtn);
        firstPanel.add(manageTripsBtn);

        add(firstPanel);

        pack();
        setSize(950, 800);
        setVisible(true);
    }

    public void setFirstPanel(JPanel firstPanel) {
        this.firstPanel = firstPanel;
    }

    public void setManageAirlineBtn(JButton manageAirlineBtn) {
        this.manageAirlineBtn = manageAirlineBtn;
    }

    public void setManagePassBtn(JButton managePassBtn) {
        this.managePassBtn = managePassBtn;
    }

    public void setManageTripsBtn(JButton manageTripsBtn) {
        this.manageTripsBtn = manageTripsBtn;
    }

    public JButton getManageAirlineBtn() {
        return manageAirlineBtn;
    }

    public JButton getManagePassBtn() {
        return managePassBtn;
    }

    public JButton getManageTripsBtn() {
        return manageTripsBtn;
    }

    public JPanel getFirstPanel() {
        return firstPanel;
    }
}
