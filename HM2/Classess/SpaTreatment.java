package HM2.Classess;

import HM2.Interface.Bookable;

class SpaTreatment extends HotelService implements Bookable{
    private boolean booked=false;
    private int hours;

    public SpaTreatment(int id,String desc,double baseCost,int hours){
        super(id, desc, baseCost);
        this.hours=hours;
        
    }
    public double calculateCost(){
        return baseCost*hours;
    }

    public boolean isBooked(){
        return booked;
    }
    public void book(){
        booked=true;
    }
    public String toString(){
        return "SpaTreatment: "+super.toString();
    }
    
}
