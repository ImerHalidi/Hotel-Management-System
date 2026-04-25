package HM2.Classess;
import java.util.*;

import HM2.Interface.Chargeable;
public class Main {
    public static void main(String[] args){

        Hotel hotel=new Hotel();
        
        HotelService s1=new RoomService(1, "Food Delivery", 10, 3);
        HotelService s2=new SpaTreatment(1, "Relax Spa", 20, 2);
        hotel.addService(s1);
        hotel.addService(s2);

        Staff st1=new FrontDeskStaff(1, "Imer");
        Staff st2=new HousekeepingStaff(1, "Beqir");
        hotel.addstaff(st1);
        hotel.addstaff(st2);

        hotel.showallServices();
        hotel.showallstaff();

        List<Chargeable>list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(new Booking(50));
        System.out.println("Total: "+hotel.calculatetotal(list));

        Room room=new Room(101);
        room.book();
        System.out.println(room);
    }
}
