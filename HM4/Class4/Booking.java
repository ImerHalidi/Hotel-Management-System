package HM4.Class4;

import java.time.LocalDate;

public class Booking {
    private String ID;
    private Guest guest;
    private Room room;
    LocalDate checkin;
    LocalDate checkout;

    public Booking(String ID,Guest guest,Room room,LocalDate checkin,LocalDate checkout){
        this.ID=ID;
        this.guest=guest;
        this.room=room;
        this.checkin=checkin;
        this.checkout=checkout;

    }
    public String getId(){
        return ID;
    }
    public Guest getGuest(){
        return guest;
    }
    public Room getRoom(){
        return room;
    }
    public LocalDate getCheckin(){
        return checkin;
    }
    
    public LocalDate getCheckout(){
        return checkout;
    }

    public double getCost(){
         long days = checkin.until(checkout).getDays();
       
        return days*room.getRate();

    }

}
