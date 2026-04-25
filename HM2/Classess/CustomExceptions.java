package HM2.Classess;

public class CustomExceptions {

}

class RoomUnavailableException  extends Exception{
    public RoomUnavailableException(){}
    public RoomUnavailableException(String msg){
        super(msg);
    }
}

class invalidbookingdatesexception extends Exception{
    public invalidbookingdatesexception(){}
    public invalidbookingdatesexception(String msg){
        super(msg);
    }

class ServiceNotFoundException extends Exception{

    public ServiceNotFoundException(){}
    public ServiceNotFoundException(String msg){
        super(msg);
    }
    
}
    
}