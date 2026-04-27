package HM4.Class4;

import java.util.HashMap;
import java.util.Map;

public class HotelService {
    private double basecost;
    Map<String,Double>discounts=new HashMap<>();

    public HotelService(double basecost){
        this.basecost=basecost;
        discounts.put("Summer20", 0.20);
        discounts.put("Vip10", 0.10);
    }

    public double applyDisscount(String code){
        if(discounts.containsKey(code)){
            return basecost-(basecost*discounts.get(code));
        }
        return basecost;
    }

}
