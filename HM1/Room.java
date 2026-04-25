
public class Room {
    private int id;
    private String type;
    private double price;
    private boolean isAvailable;
    
    //konstruktori jone default
    public Room(){
        this.id=0;
        this.type="Standard";
        this.price=50.0;
        this.isAvailable=true;
    }

    //parametri konstruktor
    public Room(int id,String type,double price){

        this.id=id;
        this.type=type;
        this.price=price;
        this.isAvailable=true;
    }

    //Marrja
    public int Getid(){return id;}
    public String getType(){ return type;}
    public double getPrice(){ return price;}
    public boolean getIsAvailable(){ return isAvailable;}

    //vendosja e tyre
    public void setAvailable(boolean available){
        this.isAvailable=available;
    }

    //kthimi ne tostring 
    public String toString(){
        return "Room Id:" + id + ", Type: "+type + ",Price: "+price+", Available: "+isAvailable;

    }

    //equals
    public boolean equals(Object objekti){

        if (this==objekti) return true;
        if(!(objekti instanceof Room))return false;
        Room r=(Room)objekti;
        return this.id==r.id;
    }





}
