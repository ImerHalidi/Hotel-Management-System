package HM2.Classess;
import HM2.Interface.Bookable;
 class Room implements Bookable {
    private int number;
    private boolean booked;
    
    public Room(int number){
        this.number=number;
    }
    public boolean isBooked(){
        return booked;
    }
    public void book(){
        booked=true;
    }
    public String toString(){
        return "Room "+number+" Booked: "+booked;
    }

}
