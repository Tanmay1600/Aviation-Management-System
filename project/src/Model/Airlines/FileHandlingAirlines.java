package Model.Airlines;

import Model.Airports.Passenger;

import java.io.IOException;
import java.util.ArrayList;

public abstract class FileHandlingAirlines {
    protected abstract ArrayList<Airlines> readAirlJsonFile(String file_path);
    protected abstract void writeAirlJsonFile(String file_path, ArrayList<Airlines> airlines) throws IOException;
}