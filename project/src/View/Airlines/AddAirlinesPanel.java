package View.Airlines;

import javax.swing.*;

public class AddAirlinesPanel extends JPanel {

    JTextField txt_Airline_name;
    JTextField txt_Country;
    JTextField txt_Headquarters;
    JTextField txt_FleetSize;
    JButton addAirlineBtn;

    public AddAirlinesPanel()
    {

        txt_Airline_name = new JTextField();
        txt_Country = new JTextField();
        txt_Headquarters = new JTextField();
        txt_FleetSize = new JTextField();
        addAirlineBtn = new JButton("Add Airline");


        txt_Airline_name.setText("txt_Airline_name");
        txt_Country.setText("txt_Country");
        txt_Headquarters.setText("txt_Headquarters");
        txt_FleetSize.setText("txt_FleetSize");

        add(txt_Airline_name);
        add(txt_Country);
        add(txt_Headquarters);
        add(txt_FleetSize);
        add(addAirlineBtn);
    }

    public JTextField getTxt_Airline_name() {
        return txt_Airline_name;
    }

    public JTextField getTxt_Country() {
        return txt_Country;
    }

    public JTextField getTxt_Headquarters() {
        return txt_Headquarters;
    }

    public JTextField getTxt_FleetSize() {
        return txt_FleetSize;
    }

    public JButton getAddAirlineBtn() {
        return addAirlineBtn;
    }

    public void setTxt_Airline_name(JTextField txt_Airline_name) {
        this.txt_Airline_name = txt_Airline_name;
    }

    public void setTxt_Country(JTextField txt_Country) {
        this.txt_Country = txt_Country;
    }

    public void setTxt_Headquarters(JTextField txt_Headquarters) {
        this.txt_Headquarters = txt_Headquarters;
    }

    public void setTxt_FleetSize(JTextField txt_FleetSize) {
        this.txt_FleetSize = txt_FleetSize;
    }

    public void setAddAirlineBtn(JButton addAirlineBtn) {
        this.addAirlineBtn = addAirlineBtn;
    }
}
