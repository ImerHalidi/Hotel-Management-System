package Class;

 class FrontDeskStaff extends Staff1 {

    public FrontDeskStaff(int id, String name, String role) {
        super(id, name, role);
    }

    public void handleComplaints(String[] complaints){
        for(String c : complaints){
            switch(c){
                case "wifi": System.out.println("Check internet"); break;
                case "noise": System.out.println("Warn guest"); break;
                case "cleanliness": System.out.println("Call housekeeping"); break;
                default: System.out.println("Other issue");
            }
        }
    }
}