
package appointmentschedular;

public abstract class Login{
    private String user;
    private String pass;
    private String email;
    public Login(){
        user = "";
        pass = "";
        email = "";
    }
    public Login(String user, String pass, String email)
    {
        this.user = user;
        this.pass = pass;
        this.email = email;
    }
    public String getUser()
    {
        return user;
    }
    public String getPass()
    {
        return pass;
    }
    public String getEmail()
    {
        return email;
    }
    public void setUser(String user)
    {
        this.user = user;
    }
    public void setPass(String pass)
    {
        this.pass = pass;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    abstract public void saveUserInfo();
    abstract public Boolean login(String user,String passs);
}
