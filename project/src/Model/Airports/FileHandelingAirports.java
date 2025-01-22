package Model.Airports;

import java.io.IOException;
import java.util.ArrayList;

public abstract class FileHandelingAirports {
    protected abstract ArrayList<Passenger> readPassJsonFile(String file_path);
    protected abstract void writePassJsonFile(String file_path, ArrayList<Passenger> passengers) throws IOException;
}
