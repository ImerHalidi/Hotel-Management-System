package Class;
abstract class Room1 {
    protected int roomnumber;
    protected double price;
    protected boolean isbooked;
    protected User bookedBy;
    protected int capacity;

    public Room1(int roomnumber,double price,int capacity){
        this.roomnumber=roomnumber;
        this.price=price;
        this.capacity=capacity;
        this.isbooked=false;

    }

    public boolean hasconsecutivevacantdays(boolean[] week){
        int count=0;
        for(boolean day:week){
            if(!day){
                count++;
                if(count>=3)return true;
            }
            else{
                count=0;
            }
        }
        return false;
    }
}
