package View.Passenger;

import Model.Model;

import javax.swing.*;

public class editPasspanel extends JPanel{
    JTextField txt_get_pass_idx;
    JButton getpassBtn;
    JTextField txt_pass_name;
    JTextField txt_tic_no;
    JTextField txt_des;
    JTextField txt_size;
    JTextField txt_loc;
    JButton editpassBtn;
    Model m1 =new Model();

    public editPasspanel()
    {

        txt_pass_name = new JTextField();
        txt_tic_no = new JTextField();
        txt_des = new JTextField();
        txt_size = new JTextField();
        txt_loc=new JTextField();
        editpassBtn = new JButton("Edit Passenger");
        txt_get_pass_idx = new JTextField();
        getpassBtn = new JButton("Get Passenger to Edit");

        txt_pass_name.setText("txt_pass_name");
        txt_tic_no.setText("txt_tic_no");
        txt_des.setText("txt_des");
        txt_size.setText("txt_size");
        txt_loc.setText("txt_loc");
        txt_get_pass_idx.setText("get Passenger id");

        add(txt_get_pass_idx);
        add(getpassBtn);
        add(txt_pass_name);
        add(txt_tic_no);
        add(txt_des);
        add(txt_size);
        add(txt_loc);
        add(editpassBtn);
    }

    public JTextField getTxt_pass_name() {
        return txt_pass_name;
    }

    public JTextField getTxt_tic_no() {
        return txt_tic_no;
    }

    public JTextField getTxt_des() {
        return txt_des;
    }

    public JTextField getTxt_size() {
        return txt_size;
    }

    public JButton getEditpassBtn() {
        return editpassBtn;
    }

    public void setTxt_loc(JTextField txt_loc) {
        this.txt_loc = txt_loc;
    }

    public JTextField getTxt_loc() {
        return txt_loc;
    }

    public JTextField getTxt_get_pass_idx() {
        return txt_get_pass_idx;
    }
    public JButton getGetpassBtn() {
        return getpassBtn;
    }
    public void setTxt_pass_name(JTextField txt_pass_name) {
        this.txt_pass_name = txt_pass_name;
    }

    public void setTxt_tic_no(JTextField txt_tic_no) {
        this.txt_tic_no = txt_tic_no;
    }

    public void setTxt_des(JTextField txt_des) {
        this.txt_des = txt_des;
    }

    public void setTxt_size(JTextField txt_size) {
        this.txt_size = txt_size;
    }

    public void setEditpassBtn(JButton editpassBtn) {
        this.editpassBtn = editpassBtn;
    }

    public void setTxt_get_pass_idx(JTextField txt_get_pass_idx) {
        this.txt_get_pass_idx = txt_get_pass_idx;
    }

    public void setGetpassBtn(JButton getpassBtn) {
        this.getpassBtn = getpassBtn;
    }
}
