public class UserProfile 
{
    private String username;
    private String email;
    private String password;

    public String getusername()
    {
        return username;
    }

    public void setusername(String username)
    {
        this.username = username;
    }

    public String getemail()
    {
        return email;
    }

    public void setemail(String email)
    {
        this.email = email;
    }

    public String getpassword()
    {
        return password;
    }

    public void setpassword(String password)
    {
        if(password.length() >= 8)
        {
            this.password = password;
        }
        else
        {
            System.out.println("The password length should be minimum of 8");
        }
    }

    public static void main(String[] args) 
    {
        UserProfile user = new UserProfile();
        user.setusername("Gnani");
        user.setemail("gnani@email.com");
        user.setpassword("gnani");

        System.out.println("User Name is : " + user.getusername() + " the eamil of user is : " + user.getemai() + "and the password of user is : " + user.getpassword());
    }
}
