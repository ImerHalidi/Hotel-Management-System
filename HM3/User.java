 class User {
    protected int id;
    protected String name;
    protected String role;
    public User(int id,String name,String role){
        this.id=id;
        this.name=name;
        this.role=role;

    }

    public String buildGreeting(char[] template){
        String result="";
        for(char c:template){
            if(c=='*'){
                result+=role.charAt(0);
            }
            else if(c=='#'){
                result+=name;
            }
            else{
                result+=c;
            }
        }
        return result;
    }
}
