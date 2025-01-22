package Model.Trips;

import Model.Airports.*;
import Model.Utils.Displayable;
import Model.Airlines.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class manageTrips extends FileHandlingTrips implements Displayable {
    ArrayList<Passenger> passengers = new ArrayList<Passenger>();
    ArrayList<Airlines> airlines = new ArrayList<Airlines>();
    ArrayList<Trips> Trips_data = new ArrayList<Trips>();

    ObjectMapper objectMapper = new ObjectMapper();

    private int linesBeingDisplayed;
    private int firstLineIndex;
    int lastLineIndex;
    int highlightedLine;

    public manageTrips() {
        managepass mp1 = new managepass();
        passengers = mp1.getTable();
        manageairl ma1 = new manageairl();
        airlines = ma1.getTable();


        readTripsJsonFile("C:/Users/niraj/Downloads/exp__mp (2)/exp__mp/src/Model/Trips/Enrollment_Data.json");
    }

    @Override
    public ArrayList<Trips> readTripsJsonFile(String file_path) {
        try {
            JsonNode rootNode = objectMapper.readTree(new File(file_path));

            // Iterate through JSON array
            if (rootNode.isArray()) {
                for (JsonNode node : rootNode) {
                    int airport_temp = node.get("airport_temp").asInt();
                    int airline_temp = node.get("airline_temp").asInt();
                    String Boarding_date = node.get("Boarding_date").asText();
                    int Ticket_Price = node.get("Ticket_Price").asInt();

                    Passenger p_temp_obj = null;
                    Airlines a_temp_obj = null;

                    for (int i = 0; i < passengers.size(); i++) {
                        if (airport_temp == passengers.get(i).getPassenger_ID()) {
                            p_temp_obj = passengers.get(i);
                        }
                    }

                    for (int i = 0; i < airlines.size(); i++) {
                        if (airline_temp == airlines.get(i).getAirlineID()) {
                            a_temp_obj = airlines.get(i);
                        }
                    }

                    Trips e_temp = new Trips(p_temp_obj, a_temp_obj, Boarding_date, Ticket_Price);
                    Trips_data.add(e_temp);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Trips_data;
    }

    @Override
    public void writeTripsJsonFile(String file_path, ArrayList<Trips> enroll_al) throws IOException {
        ArrayList<Map<String, Object>> enroll_to_be_written = new ArrayList<>();

        for (int i = 0; i < enroll_al.size(); i++) {
            HashMap<String, Object> data = new HashMap<>();
            data.put("airport_temp", enroll_al.get(i).getAirport_temp().getPassenger_ID());
            data.put("airline_temp", enroll_al.get(i).getAirline_temp().getAirlineID());
            data.put("Boarding_date", enroll_al.get(i).getBoarding_date());
            data.put("Ticket_Price", enroll_al.get(i).getTicket_Price());

            enroll_to_be_written.add(data);
        }

        objectMapper.writeValue(Paths.get(file_path).toFile(), enroll_to_be_written);
    }

    public ArrayList<String> getHeaders() {
        ArrayList<String> headers = new ArrayList<String>();
        headers.add("Passenger Name:");
        headers.add("Airline Name:");
        headers.add("Boarding Date:");
        headers.add("Ticket Price:");

        return headers;
    }

    @Override
    public ArrayList<String> getLine(int line) {
        ArrayList<String> enroll_details = new ArrayList<String>();

        // Check if enrollment_data is empty or if line is out of bounds
        if (!Trips_data.isEmpty() && line < Trips_data.size()) {
            enroll_details.add(Trips_data.get(line).getAirport_temp().getPassenger_name());
            enroll_details.add(Trips_data.get(line).getAirline_temp().getCompanyName());
            enroll_details.add(Trips_data.get(line).getBoarding_date());
            enroll_details.add(String.valueOf(Trips_data.get(line).getTicket_Price()));
        }

        return enroll_details;
    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> Airline_subset = new ArrayList<ArrayList<String>>();

        // Check if enrollment_data is empty
        if (!Trips_data.isEmpty()) {
            for (int i = firstLine; i <= lastLine && i < Trips_data.size(); i++) {
                Airline_subset.add(getLine(i));
            }
        }

        return Airline_subset;
    }

    @Override
    public int getFirstLineToDisplay() {
        return this.firstLineIndex;
    }

    @Override
    public int getLineToHighlight() {
        return 0;
    }

    @Override
    public int getLastLineToDisplay() {
        setLastLineToDisplay(this.firstLineIndex + this.linesBeingDisplayed - 1);
        return this.lastLineIndex;
    }

    @Override
    public int getLinesBeingDisplayed() {
        return this.linesBeingDisplayed;
    }

    @Override
    public void setFirstLineToDisplay(int firstLine) {
        this.firstLineIndex = firstLine;
    }

    @Override
    public void setLineToHighlight(int highlightedLine) {

    }

    @Override
    public void setLastLineToDisplay(int lastLine) {
        this.lastLineIndex = lastLine;
    }

    @Override
    public void setLinesBeingDisplayed(int numberOfLines) {
        this.linesBeingDisplayed = numberOfLines;
    }

    public ArrayList<Trips> getTable() {
        readTripsJsonFile("C:/Users/niraj/Downloads/exp__mp (2)/exp__mp/src/Model/Trips/Enrollment_Data.json");
        return Trips_data;
    }
    public void addNewTrip(int pass,int air,String date,int price){
        try {
            Trips_data=readTripsJsonFile("C:/Users/niraj/Downloads/exp__mp (2)/exp__mp/src/Model/Trips/Enrollment_Data.json");
            managepass mp1 = new managepass();
            passengers = mp1.getTable();
            manageairl ma1 = new manageairl();
            airlines = ma1.getTable();
            Passenger passa=passengers.get(pass);
            Airlines airl=airlines.get(air);
            Trips en=new Trips(passa,airl,date,price);
            Trips_data.add(en);
            writeTripsJsonFile("C:/Users/niraj/Downloads/exp__mp (2)/exp__mp/src/Model/Trips/Enrollment_Data.json",Trips_data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void deleteEnroll(int a,int b) {
        Trips_data = readTripsJsonFile("CC:/Users/niraj/Downloads/exp__mp (2)/exp__mp/src/Model/Trips/Enrollment_Data.json");
        managepass mp1 = new managepass();
        passengers = mp1.getTable();
        manageairl ma1 = new manageairl();
        airlines = ma1.getTable();
        for (int i = 0; i < Trips_data.size(); i++) {
            if(Trips_data.get(i).getAirline_temp().getAirlineID()==a && Trips_data.get(i).getAirport_temp().getPassenger_ID()==b){
                Trips_data.remove(i);
            }
        }
        }
    }