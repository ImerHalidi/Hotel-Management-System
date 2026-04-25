package HM2.Classess;

abstract class HotelService {
    protected int id;
    protected String description;
    protected double baseCost;

    public HotelService(int id,String description,double baseCost){
        this.id=id;
        this.description=description;
        this.baseCost=baseCost;
    }

    public abstract double calculateCost();
    public double getCost(){
        return calculateCost();
    }
    

    public String toString(){
        return id+" - "+description+" Cost: "+calculateCost();
    }
}
