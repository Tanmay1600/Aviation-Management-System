package View.Trips;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TripsTablePanel extends JPanel {

    ArrayList<JButton> trip_buttons = new ArrayList<>();

    public TripsTablePanel()
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
            trip_buttons.add(b);
            this.add(b);
            validate();
            repaint();
        }

    }

    public void setButtonText(int button_no, String button_text) {
        trip_buttons.get(button_no).setText(button_text);
    }

    public ArrayList<JButton> getAllButtons()
    {
        return trip_buttons;
    }

}
