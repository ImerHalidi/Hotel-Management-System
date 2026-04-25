package HM2.Classess;

import java.util.*;

import HM2.Interface.Chargeable;


 class Hotel {
    private List<HotelService>services=new ArrayList<>();
    private List<Staff>stafflist=new ArrayList<>();

    public void addService(HotelService service){
        services.add(service);
    }

    public void addstaff(Staff st){
        stafflist.add(st);
    }

    public void showallServices(){
        for(HotelService s:services){
            System.out.println(s);
        }
    }

    public void showallstaff(){
        for(Staff st:stafflist){
            System.out.println(st);
            st.performduty();
        }
    }

    public double calculatetotal(List<Chargeable>list){
        double total=0;
        for(Chargeable c:list){
            total+=c.getCost();
        }
        return total;

    }

}

