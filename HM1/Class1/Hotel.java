package Class1;
import java.util.ArrayList;

import Class1.Room;

public class Hotel {
    private String name;
    private ArrayList<Room> rooms;
    private ArrayList<Booking> bookings;

    public Hotel(String name) {
        this.name = name;
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    // Add room
    public void addRoom(Room room){
        rooms.add(room);
    }

    //e bejme booking
    public void makeBooking(Booking booking){
        if(booking.Getroom().getIsAvailable()){
            booking.Getroom().setAvailable(false);
            bookings.add(booking);
            System.out.println("Booking successfull");
        }
        else{
            System.out.println("Room not available");
            
        } 
        
    }

    public void cancelBooking(int bookingid){
        for(Booking b : bookings){
            if(b.Getid()==bookingid){
                b.Getroom().setAvailable(true);
                bookings.remove(b);
                System.out.println("Booking cancellet");
                return;
            }
        }
        System.out.println(" booking not found");
    }
    //shfaqja e dhomave
    public void ShowRooms(){
        for(Room r : rooms){
            System.out.println(r);
        }
    }

    //fshfaqja e booking
    public void showBooking(){
        for(Booking b : bookings){
            System.out.print(b);
        }
    }

}