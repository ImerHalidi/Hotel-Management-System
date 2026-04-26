package Class;
public class Main {
public static void main(String[] args) {
       
// ======================
                // USERS
                // ======================
                User u1 = new User(1, "Imer", "Guest");
                User u2 = new User(2, "Arta", "VIP");
        
                // ======================
                // ROOMS
                // ======================
                Room1 r1 = new StandardRoom1(101, 100, 2);
                Room1 r2 = new StandardRoom1(102, 200, 2);
                Room1 r3 = new DeluxeRoom(103, 300, 2);
        
                // Booking
                r1.bookedBy = u1;
                r1.isbooked = true;
        
                r2.bookedBy = u2;
                r2.isbooked = true;
        
                Room1[] rooms = {r1, r2, r3};
        
                // ======================
                // SERVICES
                // ======================
                HotelService s1 = new RoomService(u1);
                HotelService s2 = new LaundryService(u1);
        
                HotelService[] services = {s1, s2};
        
                // ======================
                // HOTEL + MANAGER
                // ======================
                Hotel hotel = new Hotel(rooms, services);
                BookingManager bm = new BookingManager();
        
                // ======================
                // 1 – Vacant days
                // ======================
                boolean[] week = {false, false, false, true, true, false, false};
                System.out.println("3 consecutive free days: " +
                        r1.hasconsecutivevacantdays(week));
        
                // ======================
                // 2 – Greeting
                // ======================
                char[] template = {'H','i',' ','#',' ','(','*',')'};
                System.out.println("Greeting: " + u1.buildGreeting(template));
        
                // ======================
                // 3 – Priorities
                // ======================
                Staff1 st = new Staff1(10, "Admin", "Staff");
                int[] priorities = {5,2,1,4};
                System.out.println("Highest priority index: " +
                        st.highestprioritytask(priorities));
        
                // ======================
                // 4 – Discount
                // ======================
                StandardRoom1 sr = (StandardRoom1) r1;
                char[] codes = {'A','B'};
                System.out.println("Discounted price: " +
                        sr.applyDiscount(codes));
        
                // ======================
                // 5 – Rooms of user
                // ======================
                System.out.println("\nRooms booked by Imer:");
                hotel.printUserRooms(u1);
        
                // ======================
                // 6 – First free room
                // ======================
                Room1 free = bm.findFirstAvailable(rooms);
                System.out.println("First free room: " +
                        (free != null ? free.roomnumber : "None"));
        
                // ======================
                // 7 – Total service cost
                // ======================
                System.out.println("Total service cost: " +
                        hotel.totalServiceCost(u1));
        
                // ======================
                // 8 – Cleaning
                // ======================
                HousekeepingStaff hs =
                        new HousekeepingStaff(20, "Clean", "Staff");
        
                char[] clean = {'C','D','D','C'};
                System.out.println("Rooms to clean: " +
                        hs.countDirtyRooms(clean));
        
                // ======================
                // 9 – Complaints
                // ======================
                FrontDeskStaff fs =
                        new FrontDeskStaff(30, "Front", "Desk");
        
                String[] complaints = {"wifi","noise","cleanliness"};
                fs.handleComplaints(complaints);
        
                // ======================
                // 10 – Capacity
                // ======================
                DeluxeRoom dr = (DeluxeRoom) r3;
                int[] people = {2,3,1};
                System.out.println("Capacity exceeded: " +
                        dr.exceedsCapacity(people));
        
                // ======================
                // 11 – Laundry weight
                // ======================
                LaundryService laundry =
                        new LaundryService(u1);
        
                double[] weights = {5,10,8};
                laundry.checkweight(weights);
        
                // ======================
                // 12 – Room service steps
                // ======================
                RoomService rs = new RoomService(u1);
                char[] steps = {'-','P','C'};
                rs.processSteps(steps);
        
                System.out.print("Steps: ");
                for(char c:steps) System.out.print(c+" ");
                System.out.println();
        
                // ======================
                // 14 – Price check
                // ======================
                hotel.checkPrices(rooms);
        
                // ======================
                // 15 – Validate codes
                // ======================
                s1.validateCodes(new char[]{'A','b','1','Z'});
        
                // ======================
                // 16 – Print booked users
                // ======================
                System.out.println("Booked users:");
                bm.printBookedUsers(rooms);
        
                // ======================
                // 18 – Date validation
                // ======================
                try {
                    String[] in = {"2025-01-01","2025-01-05"};
                    String[] out = {"2025-01-02","2025-01-04"};
        
                    bm.validateDates(in, out);
                } catch(Exception e){
                    System.out.println("Date error: "+e.getMessage());
                }
        
                // ======================
                // 19 – Static discounts
                // ======================
                double[] costs = {100,200,300};
                char[] tiers = {'A','B','X'};
        
                HotelService.applyDiscounts(costs, tiers);
        
                // ======================
                // 20 – Duplicate booking
                // ======================
                try {
                    r3.bookedBy = u1;
                    r3.isbooked = true;
        
                    hotel.checkDuplicateBookings(rooms);
                } catch(Exception e){
                    System.out.println("Duplicate booking: "+e.getMessage());
                }
        
                System.out.println("\n--- DONE ---");
            }
        }




