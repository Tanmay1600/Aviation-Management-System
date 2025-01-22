package View.Trips;

import javax.swing.*;

public class deleteTripsPanel extends JPanel {
    JTextField txt_airline_id;
    JTextField txt_pass_id;
    JButton deletetripsbtn;
    public deleteTripsPanel(){
        txt_airline_id=new JTextField();
        txt_pass_id=new JTextField();
        deletetripsbtn=new JButton("Delete Trips");

        txt_airline_id.setText("txt_airline_id");
        txt_pass_id.setText("txt_pass_id");

        add(txt_airline_id);
        add(txt_pass_id);
        add(deletetripsbtn);
    }

    public void setDeletAirlinebtn(JButton deleteenrollbtn) {
        this.deletetripsbtn = deleteenrollbtn;
    }

    public JButton getDeletAirlinebtn() {
        return deletetripsbtn;
    }

    public void setTxt_airline_id(JTextField txt_airline_id) {
        this.txt_airline_id = txt_airline_id;
    }

    public void setTxt_pass_id(JTextField txt_pass_id) {
        this.txt_pass_id = txt_pass_id;
    }

    public JTextField getTxt_pass_id() {
        return txt_pass_id;
    }

    public JTextField getTxt_airline_id() {
        return txt_airline_id;
    }
}
