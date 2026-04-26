package Class;

class LaundryService extends HotelService{
    public LaundryService(User user){
        super(user);
    }

    public double calculateCost(){
        return 15;
    }

    public void checkweight(double[] weights){
        double totalweigh=0;
        for(double w:weights){
            w+=totalweigh;
        }
        if(totalweigh>20){
            System.out.println("Warning wight exceeded!");
        }
        
    }
    

}
