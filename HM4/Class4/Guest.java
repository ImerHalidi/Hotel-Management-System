package HM4.Class4;

public class Guest {
    private String name;
    public Guest(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }

    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(!(o instanceof Guest))return false;
        
        return name.equals(((Guest)o).name);
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }

}
