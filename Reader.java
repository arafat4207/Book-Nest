public class Reader extends User{
    public Reader(String fullname , String username , String password ){
        super(fullname, username, password);
    }
    @Override 
    public String getRole(){
        return "Reader";
    }
}