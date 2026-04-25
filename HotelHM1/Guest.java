package HotelHM1;
public class Guest {
    private int id;
    private String name;
    private String email;

public Guest(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
       
    }

    //geters
    public int getId(){return id;}
    public String getName(){ return name;}
    public String getEmail(){return email;}

    public String toString(){
        return "Guest Id: "+id+", Guest FullName: "+name+", Guest Email: "+email;
    }
    


}
