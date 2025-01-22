package Model.Airports;


/**
 * Identification comments:
 *   Name: Tanmay Jadhav
 *   Experiment No: 04
 *   Experiment Title:Interactive Object Creation: Empowering Users to Generate Objects through Java Input
 *   Experiment Date:23/01/2024
 *   @version 1.0
 *
 *
 * Beginning comments:
 * Filename: Airports.java
 * @author: Tanmay Jadhav
 * Overview: This is the Airports class. In this file we have achieved the following
 * - Created Attributes
 * --- int  Airport_ID
 * --- String Airport_Name
 * --- String Country_Name
 * --- String Size
 * --- String Location;
 *
 * - Created Setters and Getters
 * - Created a Display Function to call the getters and display Instance data
 *
 */


public class Airports {


    //Declaring Variables
    private  String Location;
    private int Size;


    public Airports()
    {
        System.out.println();
    }

    public Airports(int Size,String Location)
    {
        this.setSize(Size);
        this.setLocation(Location);
    }

    //Creating getters
    public String getLocation()
    {
        return this.Location;
    }
    public int getSize()
    {
        return this.Size;
    }




    //Creating Setters
    public void setLocation(String Location)
    {
        this.Location=Location;
    }
    public void setSize(int Size)
    {
        this.Size=Size;
    }




    //Display Airport data
    public void display(){
        System.out.println("Airport Country:"+getLocation() );
        System.out.println("Airport Size:"+getSize());
    }
}
