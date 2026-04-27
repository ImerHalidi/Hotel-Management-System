package HM4.Class4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hotel {
    private List<Room>rooms=new ArrayList<>();
    private Set<Guest>guest=new HashSet<>();
    private Map<String,Booking>bookings=new HashMap<>();
    private List<Staff>staffList=new ArrayList<>();


    public void addRoom(Room r){
        rooms.add(r);
    }

    public void addStaff(Staff s){
        staffList.add(s);
    }
    public void registerGuest(Guest g){
        guest.add(g);
    }

    public int getTotalNumberOfGuests(){
        return guest.size();    }

    public boolean makeBooking(Booking b){
        Room room=b.getRoom();
        if(!room.isAvailable(b.getCheckin(),b.getCheckout())){
            return false;
        }
        room.book(b.getCheckin(),b.getCheckout());
        bookings.put(b.getId(), b);
        return true;
    }

    public Booking getBookingbyId(String id){
        return bookings.get(id);
    }

    public List<Room>getAvailableRooms(LocalDate checkin,LocalDate checkout){
        List<Room>result=new ArrayList<>();
        for(Room r:rooms){
            if(r.isAvailable(checkin, checkout)){
                result.add(r);
                
            }
           
        } return result;
    }


    public List<Room>getAllAvailableRooms(LocalDate checkin,LocalDate checkout){
         return getAvailableRooms(LocalDate.now(),LocalDate.now().plusDays(1));
    }

    public List<Room>getRoomsByType(String type){
        List<Room>result=new ArrayList<>();
        for(Room r:rooms){
            if(r.getType().equalsIgnoreCase(type)){
                result.add(r);

            }
        }
        return result;
    }

    public List<String>getAllguestnames(){
        List<String>names=new ArrayList<>();
        for(Guest g:guest){
            names.add(g.getname());  
        }
        return names;
    }

    public double calculateTotalRevenue(){
        double sum=0;
        for(Booking b:bookings.values()){
            sum+=b.getCost();
        }
        return sum;
    }

    public Map<Guest,List<Booking>>getBookingsByGuest() {
        Map<Guest,List<Booking>>map=new HashMap<>();
    for(Booking b:bookings.values()){
        Guest g=b.getGuest();
        if(!map.containsKey(g)){
            map.put(g,new ArrayList<>());
            
        }
        map.get(g).add(b);
    }
    return map;
    }

    public String getMostFrequentRoomTypeBooked(){
        Map<String, Integer>count=new HashMap<>();
        for(Booking b:bookings.values()){ 
            String type=b.getRoom().getType();
            count.put(type,count.getOrDefault(type, 0)+1);
        }

            String maxType=null;
            int max=0;
            for(String t:count.keySet()){
                if(count.get(t)>max){
                    max=count.get(t);
                    maxType=t;
                }
            }
        return maxType;
        }
       
        public Set<Guest>getGuestsWithMultipleBooking(){
            Set<Guest>result=new HashSet<>();
            Map<Guest,List<Booking>>map=getBookingsByGuest();
            for(Guest g:map.keySet()){
                if(map.get(g).size()>1){
                    result.add(g);
                }
            }
            return result;
        }

        public List<Room>getRoomsWithNoBookings(){
            List<Room>result=new ArrayList<>();
            for(Room r:rooms){
                boolean hasbooking=false;
            

                for(Booking b:bookings.values()){
                    if(b.getRoom().equals(r)){
                        hasbooking=true;
                        break;
                    }
                }
                if(!hasbooking){
                    result.add(r);
                }
                
        }
        
        return result;
    }

    public Room getEarliestUnbookedRoom(LocalDate startDate){
        for(Room r:rooms){
            if(r.isAvailable(startDate,startDate.plusDays(1))){
                return r;
            }
        }
        return null;
    }

    public Map<Staff,Integer>getStaffTaskCounts(){
        Map<Staff,Integer>Map =new HashMap<>();
        for(Staff s:staffList){
             Map.put(s,s.getTaskCompleted());
        }
        return Map;

    }


    }



