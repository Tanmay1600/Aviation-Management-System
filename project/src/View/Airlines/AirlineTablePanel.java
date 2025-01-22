package View.Airlines;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AirlineTablePanel extends JPanel {

    ArrayList<JButton> airline_buttons = new ArrayList<>();

    public AirlineTablePanel()
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
            airline_buttons.add(b);
            this.add(b);
            validate();
            repaint();
        }

    }

    public void setButtonText(int button_no, String button_text) {
        airline_buttons.get(button_no).setText(button_text);
    }

    public ArrayList<JButton> getAllButtons()
    {
        return airline_buttons;
    }

}
