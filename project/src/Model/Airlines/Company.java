package Model.Airlines;

public class Company {
    private String CompanyName;
    private String Country;
    private String headquarters;
    public Company(){
        System.out.println("Creating a Company");
    }
    public Company(String CompanyName,String Country,String Headquarters){
        this.setCompanyName(CompanyName);
        this.setCountry(Country);
        this.setHeadquarters(Headquarters);
    }
    public void setCompanyName(String CompanyName)
    {
        this.CompanyName = CompanyName;
    }
    public void setCountry(String Country)
    {
        this.Country = Country;
    }
    public void setHeadquarters(String headquarters)
    {
        this.headquarters = headquarters;
    }
    public String getCompanyName()
    {
        return this.CompanyName;
    }
    public String getCountry()
    {
        return this.Country;
    }
    public String getHeadquarters()
    {
        return this.headquarters;
    }
    public void display(){
        System.out.println("Airline Name:"+getCompanyName() );
        System.out.println("Airline Country:"+getCountry() );
        System.out.println("Airline Headquarters:"+getHeadquarters() );
    }
}
