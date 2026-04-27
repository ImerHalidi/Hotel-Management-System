package HM4.Class4;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        Room r1 = new Room(1, "Single", 50);
        Room r2 = new Room(2, "Double", 100);
        Room r3 = new Room(3, "Suite", 200);

        hotel.addRoom(r1);
        hotel.addRoom(r2);
        hotel.addRoom(r3);

        Guest g1 = new Guest("Imer");
        Guest g2 = new Guest("Arta");

        hotel.registerGuest(g1);
        hotel.registerGuest(g2);

        Booking b1 = new Booking("B1", g1, r1,
                LocalDate.now(), LocalDate.now().plusDays(2));

        Booking b2 = new Booking("B2", g1, r2,
                LocalDate.now(), LocalDate.now().plusDays(3));

        hotel.makeBooking(b1);
        hotel.makeBooking(b2);

        System.out.println("Available rooms:");
        System.out.println(hotel.getAllAvailableRooms(null, null));

        System.out.println("Rooms by type (Double):");
        System.out.println(hotel.getRoomsByType("Double"));

        System.out.println("Booking by ID:");
        System.out.println(hotel.getBookingbyId("B1"));

        System.out.println("Guest names:");
        System.out.println(hotel.getAllguestnames());

        System.out.println("Revenue:");
        System.out.println(hotel.calculateTotalRevenue());

        System.out.println("Most booked type:");
        System.out.println(hotel.getMostFrequentRoomTypeBooked());

        System.out.println("Guests with multiple bookings:");
        System.out.println(hotel.getGuestsWithMultipleBooking());

        System.out.println("Rooms with no bookings:");
        System.out.println(hotel.getRoomsWithNoBookings());

        System.out.println("Earliest free room:");
        System.out.println(hotel.getEarliestUnbookedRoom(LocalDate.now()));

        // Staff demo
        Staff s1 = new Staff("John");
        s1.completeTask();
        s1.completeTask();

        hotel.addStaff(s1);

        System.out.println("Staff performance:");
        System.out.println(hotel.getStaffTaskCounts());

        // Discount demo
        HotelService service = new HotelService(100);
        System.out.println("Discounted price: " + service.applyDisscount("SUMMER20"));
    }
}
