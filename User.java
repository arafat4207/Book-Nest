import java.io.Serializable;

public abstract class User implements Serializable {

    private String  fullname ;
    private String username ;
    private String  password ;

    public User ( String fullname , String username , String password ){
        this.fullname = fullname ;
        this.username = username ;
        this. password = password ;
    }

    public String getfullname(){
        return fullname ;
    }
    public String  getuserName(){
        return username ;
    }

    public String getPassword()
    {
        return password ;
    }

    public abstract String getRole();


}    