package Class;

import java.security.Provider.Service;



class Hotel {
     Room1[] rooms;
     HotelService[] services;

    public Hotel(Room1[] rooms,HotelService[] services){
        this.rooms=rooms;
        this.services=services;
    }

    public void printUserRooms(User user){
        for(Room1 r:rooms){
            if(r.bookedBy != null && r.bookedBy.id == user.id){
                System.out.println("Room: "+r.roomnumber);
            }
        }
    }

    public double totalServiceCost(User user){
        double total=0;
        double totalSum=total;

        for(HotelService s:services){
            if(s.user.id==user.id){
                total+=s.calculateCost();
            }
        }
        return total;

        
    }

    public void checkPrices(Room1[] rooms){
        for(Room1 r:rooms){
            if(r.price<=0){
                System.out.println("Invalid price rooms"+r.roomnumber);
            }
        }
    }


    public void checkDuplicateBookings(Room1[] rooms) 
        throws DuplicateGuestBookingException {

    for (int i = 0; i < rooms.length; i++) {
        for (int j = i + 1; j < rooms.length; j++) {

            if (rooms[i].bookedBy != null &&
                rooms[j].bookedBy != null &&
                rooms[i].bookedBy.id == rooms[j].bookedBy.id) {

                throw new DuplicateGuestBookingException(
                    "Duplicate booking found for user ID: " 
                    + rooms[i].bookedBy.id
                );
            }
        }
    }

    System.out.println("No duplicate bookings found.");
}


}
