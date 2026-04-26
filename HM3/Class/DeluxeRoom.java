package Class;

class DeluxeRoom extends Room1{
    protected int roomnumber;
    protected double price;
    protected int capacity;

    public DeluxeRoom(int roomnumber,double price,int capacity){
        super(roomnumber, price, capacity);
    }

    public boolean exceedsCapacity(int[] peoplepernight){

        for(int nr : peoplepernight){
            if(nr>capacity)
                return true;
        }
                return false;
            
        }
    }


