package Class;

abstract class HotelService {
    protected User user;

    public HotelService(User user){
        this.user=user;
    }

    abstract double calculateCost();

    public void validateCodes(char[] karakteri){
        for(char ch:karakteri){
            if(ch<'A'||ch >'Z'){
                System.out.println("Invalid Code "+ch);
            }
        }
    }

    public static void applyDiscounts(double[] costs,char[] tiers){
        if(costs.length!=tiers.length){
            System.out.println("Arrays must havethe same length ");
            return;
        }
        for(int i=0;i<costs.length;i++){
            double original=costs[i];
            double finalcost=original;
        
        char ch=tiers[i];
            if(ch=='A'){
                finalcost*=0.9;
            }
            else if(ch=='B'){
                finalcost*=0.8;
            }
             else if(ch=='C'){
                finalcost*=0.7;
            }
            else{
                System.out.println("Unknown tier "+ch);
            }
            System.out.println(original+" -> "+finalcost);
        }
    }
    }


