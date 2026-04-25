package HM2.Classess;

import HM2.Interface.Chargeable;

class Booking implements Chargeable {
    private double price;

    public Booking(double price){
        this.price=price;
    }

    public double getCost(){
        return price;
    }

}
