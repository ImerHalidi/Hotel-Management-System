import java.time.LocalDate;

public class Booking {
    private int id;
    private Room room;
    private Guest guest;
    private LocalDate checkIn;
    private LocalDate checkOut;

public Booking (int id,Room room,Guest guest,LocalDate checkin,LocalDate checkOut){
    this.id=id;
    this.room=room;
    this.guest=guest;
    this.checkIn=checkin;
    this.checkOut=checkOut;

}

    public int Getid(){return id;}
    public Room Getroom(){return room;}
    public Guest Getguest(){ return guest;}
    public LocalDate Getcheckin(){return checkIn;}
    public LocalDate Getcheckout(){return checkOut;}


    public String toString(){
        return "Booking Id: "+id+", Guest Name: "+guest.getName()+", Room Id: "+room.Getid()+",From: "+checkIn+", To: "+checkOut;
    }


}
