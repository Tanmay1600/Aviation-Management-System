package View.Airlines;

import Model.Model;

import javax.swing.*;

public class editAirlinePanel extends JPanel {
    JTextField txt_get_airline_idx;
    JButton getAirlineBtn;
    JTextField txt_Airline_Name;
    JTextField txt_country;
    JTextField txt_headquarters;
    JTextField txt_Fleetsize;
    JButton editAirlineBtn;
    Model m1 =new Model();

    public editAirlinePanel()
    {

        txt_Airline_Name = new JTextField();
        txt_country = new JTextField();
        txt_headquarters = new JTextField();
        txt_Fleetsize = new JTextField();
        editAirlineBtn = new JButton("Edit Airline");
        txt_get_airline_idx = new JTextField();
        getAirlineBtn = new JButton("Get Airline to Edit");

        txt_Airline_Name.setText("txt_Airline_Name");
        txt_country.setText("txt_country");
        txt_headquarters.setText("txt_headquarters");
        txt_Fleetsize.setText("txt_Fleetsize");
        txt_get_airline_idx.setText("get airline id");

        add(txt_get_airline_idx);
        add(getAirlineBtn);
        add(txt_Airline_Name);
        add(txt_country);
        add(txt_headquarters);
        add(txt_Fleetsize);
        add(editAirlineBtn);
    }

    public JTextField getTxt_Airline_Name() {
        return txt_Airline_Name;
    }

    public JTextField getTxt_country() {
        return txt_country;
    }

    public JTextField getTxt_headquarters() {
        return txt_headquarters;
    }

    public JTextField getTxt_Fleetsize() {
        return txt_Fleetsize;
    }

    public JButton getEditAirlineBtn() {
        return editAirlineBtn;
    }

    public JTextField getTxt_get_airline_idx() {
        return txt_get_airline_idx;
    }
    public JButton getGetAirlineBtn() {
        return getAirlineBtn;
    }
    public void setTxt_Airline_Name(JTextField txt_Airline_Name) {
        this.txt_Airline_Name = txt_Airline_Name;
    }

    public void setTxt_country(JTextField txt_country) {
        this.txt_country = txt_country;
    }

    public void setTxt_headquarters(JTextField txt_headquarters) {
        this.txt_headquarters = txt_headquarters;
    }

    public void setTxt_Fleetsize(JTextField txt_Fleetsize) {
        this.txt_Fleetsize = txt_Fleetsize;
    }

    public void setEditAirlineBtn(JButton editAirlineBtn) {
        this.editAirlineBtn = editAirlineBtn;
    }

    public void setTxt_get_airline_idx(JTextField txt_get_airline_idx) {
        this.txt_get_airline_idx = txt_get_airline_idx;
    }

    public void setGetAirlineBtn(JButton getAirlineBtn) {
        this.getAirlineBtn = getAirlineBtn;
    }
}
