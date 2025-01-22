package View.Passenger;

import javax.swing.*;

public class deletePassPanel extends JPanel {
    JTextField txt_pass_id;
    JButton deletePassBtn;
    public deletePassPanel(){
        txt_pass_id=new JTextField();
        deletePassBtn=new JButton("Delete Passenger");

        txt_pass_id.setText("txt_pass_id");

        add(txt_pass_id);
        add(deletePassBtn);
    }

    public void setDeletePassBtn(JButton deletePassBtn) {
        this.deletePassBtn = deletePassBtn;
    }

    public void setTxt_pass_id(JTextField txt_pass_id) {
        this.txt_pass_id = txt_pass_id;
    }

    public JButton getDeletePassBtn() {
        return deletePassBtn;
    }

    public JTextField getTxt_pass_id() {
        return txt_pass_id;
    }
}
