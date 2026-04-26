package Class1;

import java.time.LocalDate;



public class Main {
    public static void main(String[] args) {

       Hotel hotel =new Hotel("My hotel");

       //dhomat
       Room r1=new Room(1,"Standard",50);
       Room r2=new Room(2,"Deluxe",100);

       hotel.addRoom(r1);
       hotel.addRoom(r2);

       //guests
       Guest g1= new Guest(1, "Imer Halidi", "Imerhalidi14@gmail.com");

       //Booking
       Booking b1= new Booking(1,r1,g1,LocalDate.of(2026, 5, 1),LocalDate.of(2026, 5, 5));

        hotel.makeBooking(b1);
        hotel.ShowRooms();
        hotel.showBooking();
        
        hotel.cancelBooking(1);

        hotel.ShowRooms();

       

    }
}