/*
/**
* 
* 
* Identification comments:
*   Name: Sarthak Shinde
*   Homework/Lab 3B Assignment - Interfaces and Arrays
*   Due Date: 03-03-23
*   Email Address: sps6944@psu.edu
*   @version 1.0
*   
* 
* Beginning comments
* Filename: View.java
* author:   Sarthak Shinde
* Overview: The View class represents the user interface of an application, and it is responsible for presenting data to the 
            user and receiving input from them. It is typically used in the Model-View-Controller (MVC) architectural pattern, 
            where the View is the part of the application that interacts with the user and displays information. The public class 
            View is declared but there are no methods or fields defined in it.
*/

package View;

import View.Airlines.ManageAirlineFrame;
import View.Trips.ManageTripsFrame;
import View.Passenger.ManagePassengerFrame;

import java.awt.*;
import java.util.ArrayList;

public class View {
    FirstFrame ff;
    ManagePassengerFrame msf;

    ManageAirlineFrame mcf;

    ManageTripsFrame mef;



    public View()
    {
        ff = new FirstFrame();
        msf = new ManagePassengerFrame();
        mcf = new ManageAirlineFrame();
        mef = new ManageTripsFrame();
    }

    public void centerInitialSetupPassenger(int linesBeingDisplayed, int size) {
        msf.getIp().getCp().setLayout(new GridLayout(linesBeingDisplayed+1,size));
        msf.getIp().getCp().createButtons((linesBeingDisplayed+1) * size);
    }

    public void centerInitialSetupAirline(int linesBeingDisplayed, int size) {
        mcf.getairline_ip().getCtp().setLayout(new GridLayout(linesBeingDisplayed+1,size));
        mcf.getairline_ip().getCtp().createButtons((linesBeingDisplayed+1) * size);
    }

    public void centerInitialSetupTrips(int linesBeingDisplayed, int size) {
        mef.gettrip_ip().getCtp().setLayout(new GridLayout(linesBeingDisplayed+1,size));
        mef.gettrip_ip().getCtp().createButtons((linesBeingDisplayed+1) * size);
    }

    public void centerUpdateAirline(ArrayList<ArrayList<String>> lines, ArrayList<String> headers) {
        for (int i = 0; i < headers.size(); i++)
        {
            mcf.getairline_ip().getCtp().getAllButtons().get(i).setText(headers.get(i));
        }

        for (int row_no = 0; row_no < lines.size(); row_no++)
        {
            for (int col_no = 0; col_no < headers.size(); col_no++)
            {
                int button_no = row_no * headers.size() + headers.size() + col_no;
                String button_txt = lines.get(row_no).get(col_no);

                mcf.getairline_ip().getCtp().getAllButtons().get(button_no).setText(button_txt);
            }
        }
    }


    public void centerUpdatePassenger(ArrayList<ArrayList<String>> lines, ArrayList<String> headers) {
        for (int i = 0; i < headers.size(); i++)
        {
            msf.getIp().getCp().getAllButtons().get(i).setText(headers.get(i));
        }

        for (int row_no = 0; row_no < lines.size(); row_no++)
        {
            for (int col_no = 0; col_no < headers.size(); col_no++)
            {
                int button_no = row_no * headers.size() + headers.size() + col_no;
                String button_txt = lines.get(row_no).get(col_no);

                msf.getIp().getCp().getAllButtons().get(button_no).setText(button_txt);
            }
        }
    }
    public void centerUpdateTrips(ArrayList<ArrayList<String>> lines, ArrayList<String> headers) {
        for (int i = 0; i < headers.size(); i++)
        {
            mef.gettrip_ip().getCtp().getAllButtons().get(i).setText(headers.get(i));
        }

        for (int row_no = 0; row_no < lines.size(); row_no++)
        {
            for (int col_no = 0; col_no < headers.size(); col_no++)
            {
                int button_no = row_no * headers.size() + headers.size() +col_no;
                String button_txt = lines.get(row_no).get(col_no);

                mef.gettrip_ip().getCtp().getAllButtons().get(button_no).setText(button_txt);
            }
        }
    }


    public void setFf(FirstFrame ff) {
        this.ff = ff;
    }

    public FirstFrame getFf() {
        return ff;
    }

    public void setMsf(ManagePassengerFrame msf) {
        this.msf = msf;
    }

    public ManagePassengerFrame getMsf() {
        return msf;
    }

    public void setMcf(ManageAirlineFrame mcf) {
        this.mcf = mcf;
    }

    public ManageAirlineFrame getMcf() {
        return mcf;
    }

    public void setMef(ManageTripsFrame mef) {
        this.mef = mef;
    }
    public ManageTripsFrame getMef() {
        return mef;
    }
}

