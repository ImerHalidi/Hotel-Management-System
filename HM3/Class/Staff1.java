package Class;
class Staff1 extends User{

    public Staff1(int id,String name,String role){
        super(id,name,role);
    }

    public int highestprioritytask(int[] priorities){
        int min=priorities[0];
        int index=0;
        
        for(int i=1;i<=priorities.length;i++){
            if(priorities[i]<min){
                min=priorities[i];
                index=i;
            }
        }
        return index;
    }

}
