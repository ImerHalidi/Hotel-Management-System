package HM2.Classess;

class HousekeepingStaff extends Staff {
    public HousekeepingStaff(int id,String name){
        super(id,name,"Housekeeping");

    }
    public void performduty(){
        System.out.println(name+" is Cleaning roooms");
    }

    public String toString(){
        return "Housekeeping "+super.toString();
    }
}
