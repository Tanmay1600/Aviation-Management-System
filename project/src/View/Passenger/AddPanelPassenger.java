package View.Passenger;

import javax.swing.*;

public class AddPanelPassenger extends JPanel {
    JTextField txt_Passenger_name;
    JTextField txt_tic_no;
    JTextField txt_des;
    JTextField txt_loc;
    JTextField txt_size;
    JButton addPassBtn;

    public AddPanelPassenger()
    {
        txt_Passenger_name = new JTextField();
        txt_tic_no = new JTextField();
        txt_des = new JTextField();
        txt_loc = new JTextField();
        txt_size = new JTextField();
        addPassBtn = new JButton("Add Passenger");
;
        txt_Passenger_name.setText("Passenger_name");
        txt_tic_no.setText("tic_no");
        txt_des.setText("des");
        txt_loc.setText("loc");
        txt_size.setText("size");

        add(txt_Passenger_name);
        add(txt_tic_no);
        add(txt_des);
        add(txt_loc);
        add(txt_size);
        add(addPassBtn);
    }


    public JTextField getTxt_lname() {
        return txt_Passenger_name;
    }

    public JTextField getTxt_tic_no() {
        return txt_tic_no;
    }

    public JTextField getTxt_loc() {
        return txt_loc;
    }

    public JTextField getTxt_des() {
        return txt_des;
    }

    public JTextField getTxt_size() {
        return txt_size;
    }

    public JButton getAddPassBtn() {
        return addPassBtn;
    }

    public void setTxt_size(JTextField txt_size) {
        this.txt_size = txt_size;
    }

    public void setAddPassBtn(JButton addPassBtn) {
        this.addPassBtn = addPassBtn;
    }

    public void setTxt_des(JTextField txt_des) {
        this.txt_des = txt_des;
    }

    public void setTxt_Passenger_name(JTextField txt_Passenger_name) {
        this.txt_Passenger_name = txt_Passenger_name;
    }

    public void setTxt_loc(JTextField txt_loc) {
        this.txt_loc = txt_loc;
    }

    public void setTxt_tic_no(JTextField txt_tic_no) {
        this.txt_tic_no = txt_tic_no;
    }

}
