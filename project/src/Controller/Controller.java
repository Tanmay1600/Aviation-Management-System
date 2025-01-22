package Controller;

import Model.Airlines.Airlines;
import Model.Model;
import Model.Airports.*;
import View.View;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class Controller {
    Model model;
    View view;

    public Controller(Model m, View v) {
        model = m;
        view = v;

        view.getFf().getManageAirlineBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Course Button Clicked");
                view.getFf().setVisible(false);
                view.getMcf().setVisible(true);
            }
        });


        view.getMcf().addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                view.getFf().setVisible(true);
            }
        });

        model.getMa().setLinesBeingDisplayed(20);
        view.centerInitialSetupAirline(model.getMa().getLinesBeingDisplayed(), model.getMa().getHeaders().size());

        model.getMa().setFirstLineToDisplay(0);
        view.centerUpdateAirline(model.getMa().getLines(model.getMa().getFirstLineToDisplay(), model.getMa().getLastLineToDisplay()), model.getMa().getHeaders());
        view.getMcf().getairline_ip().getCtp().addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                int units = e.getUnitsToScroll();
                System.out.println(units);
                int current_first_line = model.getMa().getFirstLineToDisplay();
                int current_last_line = model.getMa().getLastLineToDisplay();
                int no_of_airline = model.getMa().getTable().size();
                int no_of_display_lines = model.getMa().getLinesBeingDisplayed();
                if(units <= 0 && current_first_line == 0)
                {
                    model.getMa().setFirstLineToDisplay(0);
                }
                else if(units <= 0 && current_first_line > 0)
                {
                    int new_first_line = current_first_line + units;
                    if(new_first_line <= 0)
                    {
                        model.getMa().setFirstLineToDisplay(0);
                    }
                    else
                    {
                        model.getMa().setFirstLineToDisplay(new_first_line);
                    }
                }
                else if(units > 0 && current_last_line == no_of_airline-1)
                {
                    model.getMa().setFirstLineToDisplay(current_first_line);
                }
                else if (units > 0 && current_last_line < no_of_airline-1)
                {
                    int new_first_line = current_first_line + units;
                    if(new_first_line > no_of_airline - no_of_display_lines)
                    {
                        new_first_line = no_of_airline-no_of_display_lines;
                        model.getMa().setFirstLineToDisplay(new_first_line);
                    }
                    else
                    {
                        model.getMa().setFirstLineToDisplay(new_first_line);
                    }
                }

                view.centerUpdateAirline(model.getMa().getLines(model.getMa().getFirstLineToDisplay(), model.getMa().getLastLineToDisplay()), model.getMa().getHeaders());
            }
        });




        view.getFf().getManagePassBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getFf().setVisible(false);
                view.getMsf().setVisible(true);
            }
        });
        view.getMsf().addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                view.getFf().setVisible(true);
            }
        });
        model.getMp().setLinesBeingDisplayed(20);
        view.centerInitialSetupPassenger(model.getMp().getLinesBeingDisplayed(), model.getMp().getHeaders().size());


        model.getMp().setFirstLineToDisplay(0);
        view.centerUpdatePassenger(model.getMp().getLines(model.getMp().getFirstLineToDisplay(), model.getMp().getLastLineToDisplay()), model.getMp().getHeaders());
        view.getMsf().getIp().getCp().addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                int units = e.getUnitsToScroll();
                System.out.println(units);
                int current_first_line = model.getMp().getFirstLineToDisplay();
                int current_last_line = model.getMp().getLastLineToDisplay();
                int no_of_pass = model.getMp().getTable().size();
                int no_of_display_lines = model.getMp().getLinesBeingDisplayed();
                if(units <= 0 && current_first_line == 0)
                {
                    model.getMp().setFirstLineToDisplay(0);
                }
                else if(units <= 0 && current_first_line > 0)
                {
                    int new_first_line = current_first_line + units;
                    if(new_first_line <= 0)
                    {
                        model.getMp().setFirstLineToDisplay(0);
                    }
                    else
                    {
                        model.getMp().setFirstLineToDisplay(new_first_line);
                    }
                }
                else if(units > 0 && current_last_line == no_of_pass-1)
                {
                    model.getMp().setFirstLineToDisplay(current_first_line);
                }
                else if (units > 0 && current_last_line < no_of_pass-1)
                {
                    int new_first_line = current_first_line + units;
                    if(new_first_line > no_of_pass - no_of_display_lines)
                    {
                        new_first_line = no_of_pass-no_of_display_lines;
                        model.getMp().setFirstLineToDisplay(new_first_line);
                    }
                    else
                    {
                        model.getMp().setFirstLineToDisplay(new_first_line);
                    }
                }

                view.centerUpdatePassenger(model.getMp().getLines(model.getMp().getFirstLineToDisplay(), model.getMp().getLastLineToDisplay()), model.getMp().getHeaders());

            }
        });

        view.getFf().getManageTripsBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Trips Button Clicked");
                view.getFf().setVisible(false);
                view.getMef().setVisible(true);
            }
        });

        view.getMef().addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                view.getFf().setVisible(true);
            }
        });
        model.getMe().setLinesBeingDisplayed(20);
        view.centerInitialSetupTrips(model.getMe().getLinesBeingDisplayed(), model.getMe().getHeaders().size());

        model.getMe().setFirstLineToDisplay(0);
        view.centerUpdateTrips(model.getMe().getLines(model.getMe().getFirstLineToDisplay(), model.getMe().getLastLineToDisplay()), model.getMe().getHeaders());
        view.getMef().gettrip_ip().getCtp().addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                int units = e.getUnitsToScroll();
                System.out.println(units);
                int current_first_line = model.getMe().getFirstLineToDisplay();
                int current_last_line = model.getMe().getLastLineToDisplay();
                int no_of_trips = model.getMe().getTable().size();
                int no_of_display_lines = model.getMe().getLinesBeingDisplayed();
                if(units <= 0 && current_first_line == 0)
                {
                    model.getMe().setFirstLineToDisplay(0);
                }
                else if(units <= 0 && current_first_line > 0)
                {
                    int new_first_line = current_first_line + units;
                    if(new_first_line <= 0)
                    {
                        model.getMe().setFirstLineToDisplay(0);
                    }
                    else
                    {
                        model.getMe().setFirstLineToDisplay(new_first_line);
                    }
                }
                else if(units > 0 && current_last_line == no_of_trips-1)
                {
                    model.getMe().setFirstLineToDisplay(current_first_line);
                }
                else if (units > 0 && current_last_line < no_of_trips-1)
                {
                    int new_first_line = current_first_line + units;
                    if(new_first_line > no_of_trips - no_of_display_lines)
                    {
                        new_first_line = no_of_trips-no_of_display_lines;
                        model.getMe().setFirstLineToDisplay(new_first_line);
                    }
                    else
                    {
                        model.getMe().setFirstLineToDisplay(new_first_line);
                    }
                }

                view.centerUpdateTrips(model.getMe().getLines(model.getMe().getFirstLineToDisplay(), model.getMe().getLastLineToDisplay()), model.getMe().getHeaders());

            }
        });



        view.getMsf().addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                view.getFf().setVisible(true);
            }
        });
        view.getMcf().getairline_ip().getAcp().getAddAirlineBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt_airline_name = view.getMcf().getairline_ip().getAcp().getTxt_Airline_name().getText();
                String txt_country = view.getMcf().getairline_ip().getAcp().getTxt_Country().getText();
                String txt_headquarters = view.getMcf().getairline_ip().getAcp().getTxt_Headquarters().getText();
                String txt_fleetsize = view.getMcf().getairline_ip().getAcp().getTxt_FleetSize().getText();
                try {
                    model.getMa().addNewAirline(txt_airline_name,txt_country,txt_headquarters,Integer.valueOf(txt_fleetsize));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        view.getMsf().getIp().getAps().getAddPassBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt_name = view.getMsf().getIp().getAps().getTxt_lname().getText();
                String txt_tic_no = view.getMsf().getIp().getAps().getTxt_tic_no().getText();
                String txt_des = view.getMsf().getIp().getAps().getTxt_des().getText();
                String txt_size = view.getMsf().getIp().getAps().getTxt_size().getText();
                String txt_loc = view.getMsf().getIp().getAps().getTxt_loc().getText();
                try {
                    model.getMp().addNewPassenger(txt_name,Integer.valueOf(txt_tic_no),txt_des,Integer.valueOf(txt_size),txt_loc);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        view.getMsf().addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                view.getFf().setVisible(true);
            }
        });
        view.getMef().gettrip_ip().getAcp().getAddTripsBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt_airline_name = view.getMef().gettrip_ip().getAcp().getTxt_pass_id().getText();
                String txt_country = view.getMef().gettrip_ip().getAcp().getTxt_Airline_id().getText();
                String txt_headquarters = view.getMef().gettrip_ip().getAcp().getTxt_Boarding_date().getText();
                String txt_fleetsize = view.getMef().gettrip_ip().getAcp().getTxt_Ticket_price().getText();
                model.getMe().addNewTrip(Integer.valueOf(txt_airline_name),Integer.valueOf(txt_country),txt_headquarters,Integer.valueOf(txt_fleetsize));
            }
        });
        view.getMcf().getairline_ip().getEap().getEditAirlineBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Edit Airline Button Clicked");
                String txt_course_idx = view.getMcf().getairline_ip().getEap().getTxt_get_airline_idx().getText();
                String txt_course_id = view.getMcf().getairline_ip().getEap().getTxt_Airline_Name().getText();
                String txt_course_name = view.getMcf().getairline_ip().getEap().getTxt_country().getText();
                String txt_course_duration = view.getMcf().getairline_ip().getEap().getTxt_headquarters().getText();
                String txt_course_credits = view.getMcf().getairline_ip().getEap().getTxt_Fleetsize().getText();
                try {
                    model.getMa().editAirline(Integer.valueOf(txt_course_idx),txt_course_id,txt_course_name,txt_course_duration,Integer.valueOf(txt_course_credits));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        view.getMsf().getIp().getEpp().getEditpassBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Edit Passenger Button Clicked");
                String txt_pass_idx = view.getMsf().getIp().getEpp().getTxt_get_pass_idx().getText();
                String txt_pass_id = view.getMsf().getIp().getEpp().getTxt_pass_name().getText();
                String txt_pass_name = view.getMsf().getIp().getEpp().getTxt_tic_no().getText();
                String txt_pass_duration = view.getMsf().getIp().getEpp().getTxt_des().getText();
                String txt_pass_credits = view.getMsf().getIp().getEpp().getTxt_size().getText();
                String txt_pass_loc = view.getMsf().getIp().getEpp().getTxt_loc().getText();
                try {
                    model.getMp().editPass(Integer.valueOf(txt_pass_idx),txt_pass_id,Integer.valueOf(txt_pass_name),txt_pass_duration,Integer.valueOf(txt_pass_credits),txt_pass_loc);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        view.getMcf().getairline_ip().getDap().getDeletAirlinebtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Delete Airline Button Clicked");
                String txt_course_idx = view.getMcf().getairline_ip().getDap().getTxt_airline_id().getText();
                model.getMa().deleteairline(Integer.valueOf(txt_course_idx));
            }
        });
        view.getMsf().getIp().getDpp().getDeletePassBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt_airline_idx = view.getMsf().getIp().getDpp().getTxt_pass_id().getText();
                model.getMp().deletePass(Integer.valueOf(txt_airline_idx));
            }
        });
        view.getMef().gettrip_ip().getDep().getDeletAirlinebtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt_airl_idx = view.getMef().gettrip_ip().getDep().getTxt_airline_id().getText();
                String txt_pass_idx = view.getMef().gettrip_ip().getDep().getTxt_pass_id().getText();
                model.getMe().deleteEnroll(Integer.valueOf(txt_airl_idx),Integer.valueOf(txt_pass_idx));
            }
        });

    }
}