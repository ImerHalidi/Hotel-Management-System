package HM2.Classess;

abstract class Staff {
    protected int id;
    protected String name;
    protected String department;

    public Staff(int id,String name,String department){
        this.id=id;
        this.name=name;
        this.department=department;
    }

    public abstract void performduty();

    public void greet(){
        System.out.println("Hello");

    }
    public void greet(String guestname){
        System.out.println("Hello "+guestname);
    }

    public String toString(){
        return id+" - "+name+" ("+department+")";
    }

    

}
