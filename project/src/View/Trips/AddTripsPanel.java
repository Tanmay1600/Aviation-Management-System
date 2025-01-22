package View.Trips;

import javax.swing.*;

public class AddTripsPanel extends JPanel {

    JTextField txt_Airline_id;
    JTextField txt_pass_id;
    JTextField txt_Boarding_date;
    JTextField txt_Ticket_price;
    JButton addTripsBtn;

    public AddTripsPanel()
    {

        txt_Airline_id = new JTextField();
        txt_pass_id = new JTextField();
        txt_Boarding_date = new JTextField();
        txt_Ticket_price = new JTextField();
        addTripsBtn = new JButton("Add Trips");


        txt_Airline_id.setText("Airline_id");
        txt_pass_id.setText("pass_id");
        txt_Boarding_date.setText("Boarding_date");
        txt_Ticket_price.setText("Ticket_price");

        add(txt_Airline_id);
        add(txt_pass_id);
        add(txt_Boarding_date);
        add(txt_Ticket_price);
        add(addTripsBtn);
    }

    public JTextField getTxt_Airline_id() {
        return txt_Airline_id;
    }

    public JTextField getTxt_pass_id() {
        return txt_pass_id;
    }

    public JTextField getTxt_Boarding_date() {
        return txt_Boarding_date;
    }

    public JTextField getTxt_Ticket_price() {
        return txt_Ticket_price;
    }

    public JButton getAddTripsBtn() {
        return addTripsBtn;
    }

    public void setTxt_Airline_id(JTextField txt_Airline_id) {
        this.txt_Airline_id = txt_Airline_id;
    }

    public void setTxt_pass_id(JTextField txt_pass_id) {
        this.txt_pass_id = txt_pass_id;
    }

    public void setTxt_Boarding_date(JTextField txt_Boarding_date) {
        this.txt_Boarding_date = txt_Boarding_date;
    }

    public void setTxt_Ticket_price(JTextField txt_Ticket_price) {
        this.txt_Ticket_price = txt_Ticket_price;
    }

    public void setAddTripsBtn(JButton addEnrollBtn) {
        this.addTripsBtn = addTripsBtn;
    }
}
