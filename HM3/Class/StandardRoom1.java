package Class;
class StandardRoom1 extends Room1{
    
    public StandardRoom1(int roomnumber,double price,int capacity){
        super(roomnumber, price, capacity);
    }

    public double applyDiscount(char[] c){
        double totalprice;
        totalprice=price;
        for(char karakteri: c){
            if(karakteri=='A'){
                totalprice*=0.9;
            }
            else if(karakteri=='B'){
                totalprice*=0.85;
            }
            else if(karakteri=='C'){
                totalprice*=0.8;
            }
        }
        return totalprice;

    }

}
