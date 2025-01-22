package Model.Airlines;
import Model.Utils.Displayable;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import Model.Airports.FileHandelingAirports;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

public class manageairl extends FileHandlingAirlines implements Displayable{
    ArrayList<Airlines> airlines = new ArrayList<Airlines>();

    ObjectMapper objectMapper = new ObjectMapper();

    private int linesBeingDisplayed;
    private int firstLineIndex;
    int lastLineIndex;
    int highlightedLine;

    public manageairl(){
        readAirlJsonFile("C:/Users/niraj/Downloads/exp__mp (2)/exp__mp/src/Model/Airlines/Airline_Data.json");
    }
    public ArrayList<Airlines> readAirlJsonFile(String file_path)
    {
        try {
            JsonNode rootNode = objectMapper.readTree(new File(file_path));

            // Iterate through JSON array
            airlines.clear();
            if (rootNode.isArray()) {
                for (JsonNode node : rootNode) {
                    int airlineID = node.has("airlineID") ? node.get("airlineID").asInt() : 0; // Default value is 0
                    String companyName = node.has("companyName") ? node.get("companyName").asText() : ""; // Default value is empty string
                    int fleetSize = node.has("fleetSize") ? node.get("fleetSize").asInt() : 0; // Default value is 0
                    String country = node.has("country") ? node.get("country").asText() : ""; // Default value is empty string
                    String headquarters = node.has("headquarters") ? node.get("headquarters").asText() : ""; // Default value is empty string
                    Airlines stud = new Airlines(airlineID,companyName,country,headquarters,fleetSize);
                    airlines.add(stud);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return airlines;
    }

    public void writeAirlJsonFile(String file_path, ArrayList<Airlines> airlines) throws IOException {
        //objectMapper.writeValue(Paths.get("src/Model/Students/students.json").toFile(), students);
        objectMapper.writeValue(Paths.get(file_path).toFile(),airlines);
    }

    public void setStudentsTable(ArrayList<Airlines> airlines) {
        this.airlines = airlines;
    }

    public ArrayList<String> getHeaders() {
        ArrayList<String> headers = new ArrayList<String>();
        headers.add("Airline Id");
        headers.add("Airline Name");
        headers.add("Country");
        headers.add("Headquarters");
        headers.add("FleetSize");

        return headers;
    }
    @Override
    public ArrayList<String> getLine(int line) {
        ArrayList<String> student_details = new ArrayList<String>();

        student_details.add(String.valueOf(airlines.get(line).getAirlineID()));
        student_details.add(airlines.get(line).getCompanyName());
        student_details.add(airlines.get(line).getCountry());
        student_details.add(airlines.get(line).getHeadquarters());
        student_details.add(String.valueOf(airlines.get(line).getFleetSize()));

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
        return airlines;
    }
    public void addNewAirline(String Airline_name, String Country, String Headquarters, int Fleetsize) throws IOException {
        airlines=readAirlJsonFile("C:/Users/niraj/Downloads/exp__mp (2)/exp__mp/src/Model/Airlines/Airline_Data.json");
        int x=airlines.size();
        Airlines temp_stud = new Airlines(Airline_name,Country, Headquarters,Fleetsize);
        airlines.add(temp_stud);
        writeAirlJsonFile("C:/Users/niraj/Downloads/exp__mp (2)/exp__mp/src/Model/Airlines/Airline_Data.json",airlines);

    }public void editAirline(int edit_course_idx,String Airline_name, String Country, String Headquarters, int Fleetsize) throws IOException {
        airlines=readAirlJsonFile("C:/Users/niraj/Downloads/exp__mp (2)/exp__mp/src/Model/Airlines/Airline_Data.json");
        airlines.get(edit_course_idx).setCompanyName(Airline_name);
        airlines.get(edit_course_idx).setCountry(Country);
        airlines.get(edit_course_idx).setHeadquarters(Headquarters);
        airlines.get(edit_course_idx).setFleetSize(Fleetsize);
        writeAirlJsonFile("C:/Users/niraj/Downloads/exp__mp (2)/exp__mp/src/Model/Airlines/Airline_Data.json",airlines);
    }
    public void deleteairline(int airline_idx){
        try {
            airlines=readAirlJsonFile("C:/Users/niraj/Downloads/exp__mp (2)/exp__mp/src/Model/Airlines/Airline_Data.json");
            airlines.remove(airline_idx);
            writeAirlJsonFile("C:/Users/niraj/Downloads/exp__mp (2)/exp__mp/src/Model/Airlines/Airline_Data.json",airlines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

