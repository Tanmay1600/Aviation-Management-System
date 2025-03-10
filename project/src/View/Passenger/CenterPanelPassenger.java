package View.Passenger;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CenterPanelPassenger extends JPanel {

    ArrayList<JButton> buttons = new ArrayList<>();

    public CenterPanelPassenger()
    {
        super();
    }

    public void createButtons(int count)
    {
        for (int i = 1; i <= count; i++)
        {
            JButton b = new JButton();
            b.setBackground(Color.cyan);
            b.setSize(500,50);
            buttons.add(b);
            this.add(b);
            validate();
            repaint();
        }

    }

    public void setButtonText(int button_no, String button_text) {
        buttons.get(button_no).setText(button_text);
    }

    public ArrayList<JButton> getAllButtons()
    {
        return buttons;
    }

}
