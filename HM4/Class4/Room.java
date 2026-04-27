package HM4.Class4;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Room {
    private int id;
    private String type;
    private double rate;
    private Map<LocalDate, Boolean> occupancy=new HashMap<>();

    public Room(int id,String type,double rate){
        this.id=id;
        this.type=type;
        this.rate=rate;
    }

    public String getType(){ return type;}

    public double getRate(){return rate;}

    public int getId(){return id;}


    public boolean isAvailable(LocalDate checkin,LocalDate checkout){
        LocalDate date=checkin;
        while(!date.isAfter(checkout.minusDays(1))){
            if(occupancy.getOrDefault(date, false)){
                return false;
            }
            
            date=date.plusDays(1);
        }
        return true;
    }

    public void book(LocalDate checkin,LocalDate checkout){
        LocalDate date=checkin;
        while(!date.isAfter(checkout.minusDays(1))){
            occupancy.put(date,true);
            date=date.plusDays(1);
        }
    }

    public void cancel(LocalDate checkin,LocalDate checkout){
        LocalDate date=checkin;
        while(!date.isAfter(checkout.minusDays(1))){
            occupancy.put(date,false);
            date=date.plusDays(1);
        }
    }
    @Override
    public String toString(){
        return "Room"+id+" ( "+type+" ,$ "+rate+" )";
    }

}
