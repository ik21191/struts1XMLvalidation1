package mypack;
import org.apache.struts.validator.ValidatorForm;
public class LoginForm extends ValidatorForm {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName="Please Enter Name";
    private String password;
    public LoginForm() {
        super();
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public String getUserName() {
        System.out.println("Inside getter "+this.userName);
        return this.userName;
    }
    public void setUserName(String userName) {
        System.out.println("Inside setter "+this.userName);
        this.userName = userName;
    }
    public String getPassword() {
    	System.out.println("Inside getter "+this.password);
        return this.password;
    }
    public void setPassword(String password) {
    	System.out.println("Inside setter "+this.password);
        this.password = password;
    }
}
