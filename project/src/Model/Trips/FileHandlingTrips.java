package Model.Trips;

import java.io.IOException;
import java.util.ArrayList;

public abstract class FileHandlingTrips {
    protected abstract ArrayList<Trips> readTripsJsonFile(String file_path);
    protected abstract void writeTripsJsonFile(String file_path, ArrayList<Trips> enrolls) throws IOException;
}
