package Class;

 class HousekeepingStaff extends Staff1 {

    public HousekeepingStaff(int id, String name, String role) {
        super(id, name, role);
    }

    public int countDirtyRooms(char[] status){
        int count = 0;
        for(char c : status){
            if(c == 'D') count++;
        }
        return count;
    }
}
