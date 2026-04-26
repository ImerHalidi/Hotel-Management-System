package Class;

class RoomService extends HotelService{
    public RoomService(User user){
        super(user);
    }

    public double calculateCost(){
        return 20;
    }

    public void processSteps(char[] steps){
        int i=0;
        while(i<steps.length){
            steps[i]='X';
            i++;
        }


    }

}
