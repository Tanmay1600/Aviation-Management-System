package View.Airlines;

import javax.swing.*;

public class deleteAirlinePanel extends JPanel {
    JTextField txt_airline_id;
    JButton deletAirlinebtn;
    public deleteAirlinePanel(){
        txt_airline_id=new JTextField();
        deletAirlinebtn=new JButton("Delete Airline");

        txt_airline_id.setText("txt_airline_id");

        add(txt_airline_id);
        add(deletAirlinebtn);
    }

    public void setDeletAirlinebtn(JButton deletAirlinebtn) {
        this.deletAirlinebtn = deletAirlinebtn;
    }

    public JButton getDeletAirlinebtn() {
        return deletAirlinebtn;
    }

    public void setTxt_airline_id(JTextField txt_airline_id) {
        this.txt_airline_id = txt_airline_id;
    }

    public JTextField getTxt_airline_id() {
        return txt_airline_id;
    }
}
