/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.util.MessageResources;
public class LoginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception 
        {
        LoginForm loginForm = (LoginForm) form;
        if (loginForm.getUserName().equals(loginForm.getPassword())) 
        {
        	MessageResources res=(MessageResources)getResources(request);
        	Locale locale = (Locale) request.getSession().getAttribute("org.apache.struts.action.LOCALE");
        	String myMsg=res.getMessage(locale, "test.msg");
        	System.out.println(myMsg);
        	request.setAttribute("msg",myMsg);
            return mapping.findForward(SUCCESS);
        	//return new ActionForward("/hello?name=imran", true);
            
        	/*response.setContentType("text/html");
        	PrintWriter out=response.getWriter();
        	out.println("Response of Action.");
        	out.flush();
        	return null;*/
        } else 
            return mapping.findForward(FAILURE);
     }
}
