package Class;

class BookingManager {

    public Room1 findFirstAvailable(Room1[] rooms ){
        for(Room1 r:rooms){
            if(!r.isbooked)return r;
            }
            return null;
            
        }

        public void printBookedUsers(Room1[] rooms){
            for(Room1 r:rooms){
                if(r.isbooked && r.bookedBy!=null){
                    System.out.println(r.bookedBy.name);
                }
            }

        }

        public void validateDates(String[] in,String[] out)throws Exception{
            
            for(int i=0;i<in.length;i++){
                if(out[i].compareTo(in[i])<=0){
                    throw new Exception("invalid dates at index "+i);
                }
            }

            
        }



    }

