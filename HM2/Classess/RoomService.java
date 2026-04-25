package HM2.Classess;

class RoomService extends HotelService{
    
    private int items;
    public RoomService(int id,String desc,double baseCost,int items){
        super(id, desc, baseCost);
        this.items=items;

    }
    
    public double calculateCost(){
        return baseCost+items*5;
    }

    public String toString(){
        return "RoomService: "+super.toString();
    }
    


}
