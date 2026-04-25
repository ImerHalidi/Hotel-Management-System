package HM2.Classess;

 class FrontDeskStaff extends Staff {
    public FrontDeskStaff(int id,String name){
        super(id, name,"Front Desk");
    }

    public void performduty(){
        System.out.println(name+" is checking in guests");
    }

    public String tosString(){
        return "FrontDesk: "+super.toString();
    }

}
