package hms;
class User {
    private final String name;
    private final String gender;
    private final String company;
    private final String brand;
       
    public User(String name,String gender,String company,String brand)
    {
        this.name = name;
        this.gender = gender;
        this.company = company;
        this.brand=brand;
             
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getGender()
    {
        return gender;
    }
    
    
    public String getCompany()
    {
        return company;
    }
    
    public String getBrand()
    {
        return brand;
    }
    
    
    
}
