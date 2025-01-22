package Model.Airports;
import Model.Utils.Displayable;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import Model.Airports.FileHandelingAirports;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

public class managepass extends FileHandelingAirports implements Displayable{
    ArrayList<Passenger> passengers = new ArrayList<Passenger>();

    ObjectMapper objectMapper = new ObjectMapper();

    private int linesBeingDisplayed;
    private int firstLineIndex;
    int lastLineIndex;
    int highlightedLine;

    public managepass(){
        readPassJsonFile("C:/Users/niraj/Downloads/exp__mp (2)/exp__mp/src/Model/Airports/passenger_details.json");
    }
    public ArrayList<Passenger> readPassJsonFile(String file_path)
    {
        try {
            JsonNode rootNode = objectMapper.readTree(new File(file_path));

            // Iterate through JSON array
            passengers.clear();
            if (rootNode.isArray()) {
                for (JsonNode node : rootNode) {
                    int passenger_ID = node.has("passenger_ID") ? node.get("passenger_ID").asInt() : 0; // Default value is 0
                    String passenger_name = node.has("passenger_name") ? node.get("passenger_name").asText() : ""; // Default value is empty string
                    int ticket_number = node.has("ticket_number") ? node.get("ticket_number").asInt() : 0; // Default value is 0
                    String destination = node.has("destination") ? node.get("destination").asText() : ""; // Default value is empty string
                    int Size = node.has("Size") ? node.get("Size").asInt() : 0; // Default value is 0
                    String Location = node.has("Location") ? node.get("Location").asText() : ""; // Default value is empty string

                    Passenger stud = new Passenger(passenger_ID, passenger_name, ticket_number, destination,Size, Location);
                    passengers.add(stud);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return passengers;
    }

        public void writePassJsonFile(String file_path, ArrayList<Passenger> passengers) throws IOException {
        //objectMapper.writeValue(Paths.get("src/Model/Students/students.json").toFile(), students);
        objectMapper.writeValue(Paths.get(file_path).toFile(),passengers);
    }

    public void setStudentsTable(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public ArrayList<String> getHeaders() {
        ArrayList<String> headers = new ArrayList<String>();
        headers.add("Passenger Id");
        headers.add("Passenger Name");
        headers.add("Ticket Number");
        headers.add("Destination");
        headers.add("Size");
        headers.add("Location");

        return headers;
    }
    @Override
    public ArrayList<String> getLine(int line) {
        ArrayList<String> student_details = new ArrayList<String>();
        student_details.add(String.valueOf(passengers.get(line).getPassenger_ID()));
        student_details.add(passengers.get(line).getPassenger_name());
        student_details.add(String.valueOf(passengers.get(line).getTicket_number()));
        student_details.add(passengers.get(line).getDestination());
        student_details.add(String.valueOf(passengers.get(line).getSize()));
        student_details.add(passengers.get(line).getLocation());

        return student_details;
    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> students_subset = new ArrayList<ArrayList<String>>();

        for (int i = firstLine; i <= lastLine; i++) {
            students_subset.add(getLine(i));
        }
        return students_subset;
    }

    @Override
    public int getFirstLineToDisplay() {
        return firstLineIndex;
    }

    @Override
    public int getLineToHighlight() {
        return highlightedLine;
    }

    @Override
    public int getLastLineToDisplay() {
        setLastLineToDisplay(getFirstLineToDisplay() + getLinesBeingDisplayed() - 1);
        return lastLineIndex;
    }

    @Override
    public int getLinesBeingDisplayed() {
        return linesBeingDisplayed;
    }

    @Override
    public void setFirstLineToDisplay(int firstLine) {
        this.firstLineIndex = firstLine;
    }

    @Override
    public void setLineToHighlight(int highlightedLine) {
        this.highlightedLine = highlightedLine;
    }

    @Override
    public void setLastLineToDisplay(int lastLine) {
        this.lastLineIndex = lastLine;
    }

    @Override
    public void setLinesBeingDisplayed(int numberOfLines) {
        this.linesBeingDisplayed = numberOfLines;
    }

    public ArrayList getTable() {
        return passengers;
    }
    public void addNewPassenger(String passenger_name, int ticket_number, String destination, int Size, String Location) throws IOException {
        readPassJsonFile("C:/Users/niraj/Downloads/exp__mp (2)/exp__mp/src/Model/Airports/passenger_details.json");
        int x=passengers.size();
        Passenger temp_stud = new Passenger(x+1,passenger_name, ticket_number, destination,Size, Location);;
        passengers.add(temp_stud);
        writePassJsonFile("C:/Users/niraj/Downloads/exp__mp (2)/exp__mp/src/Model/Airports/passenger_details.json",passengers);

    }
    public void editPass(int edit_course_idx,String name,int tic_no,String Des,int size,String loc) throws IOException {
        passengers=readPassJsonFile("C:/Users/niraj/Downloads/exp__mp (2)/exp__mp/src/Model/Airports/passenger_details.json");
        passengers.get(edit_course_idx).setPassenger_name(name);
        passengers.get(edit_course_idx).setTicket_number(tic_no);
        passengers.get(edit_course_idx).setDestination(Des);
        passengers.get(edit_course_idx).setSize(size);
        passengers.get(edit_course_idx).setLocation(loc);
        writePassJsonFile("C:/Users/niraj/Downloads/exp__mp (2)/exp__mp/src/Model/Airports/passenger_details.json",passengers);
    }
    public void deletePass(int pass_idx){
        try {
            passengers=readPassJsonFile("C:/Users/niraj/Downloads/exp__mp (2)/exp__mp/src/Model/Airports/passenger_details.json");
            passengers.remove(pass_idx);
            writePassJsonFile("C:/Users/niraj/Downloads/exp__mp (2)/exp__mp/src/Model/Airports/passenger_details.json",passengers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

