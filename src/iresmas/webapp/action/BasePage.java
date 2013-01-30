/**
 * 
 */
package iresmas.webapp.action;

import iresmas.bussiness.service.definition.security.SegUserService;
import iresmas.bussiness.service.util.BussinesConstants;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Cristopher Cerrillo Callejas
 * @version 1.0
 *
 */
public class BasePage {
	
	public static final String jstlBundleParam = "javax.servlet.jsp.jstl.fmt.localizationContext";
	protected final Log log = LogFactory.getLog(getClass());
	protected SegUserService userService;
	protected FacesContext facesContext;
	
//	public SegUserService getUserService() {
//		return userService;
//	}
	public void setUserService(SegUserService userService) {
		this.userService = userService;
	}
	public FacesContext getFacesContext() {
		if (facesContext != null){
            // for unit tests
            return facesContext;
        }
        return FacesContext.getCurrentInstance();
	}
	public void setFacesContext(FacesContext facesContext) {
		this.facesContext = facesContext;
	}
	
	// Convenience methods ====================================================
    public String getParameter(String name) {
        return getRequest().getParameter(name);
    }

    public String getBundleName() {
        // get name of resource bundle from JSTL settings, JSF makes this too hard
        return getServletContext().getInitParameter(jstlBundleParam);
    }
	
    /**
     * Servlet API Convenience method
     * @return
     */
    protected HttpServletRequest getRequest() {
        return (HttpServletRequest) getFacesContext().getExternalContext().getRequest();
    }

    /**
     * Servlet API Convenience method
     * @return
     */
    protected HttpSession getSession() {
        return getRequest().getSession();
    }

    /**
     * Servlet API Convenience method
     * @return
     */
    protected HttpServletResponse getResponse() {
        return (HttpServletResponse) getFacesContext().getExternalContext().getResponse();
    }

    /**
     * Servlet API Convenience method
     * @return
     */
    protected ServletContext getServletContext() {
        return (ServletContext) getFacesContext().getExternalContext().getContext();
    }

    /**
     * Convenience method to get the Configuration HashMap
     * from the servlet context.
     *
     * @return the user's populated form from the session
     */
    protected Map getConfiguration() {
        Map config = (HashMap) getServletContext().getAttribute(BussinesConstants.CONFIG);

        // so unit tests don't puke when nothing's been set
        if (config == null) {
            return new HashMap();
        }

        return config;
    }

    public ResourceBundle getBundle() {
        return ResourceBundle.getBundle(getBundleName(), getRequest().getLocale());
    }

    public String getText(String key) {
        String message;

        try {
            message = getBundle().getString(key);
        } catch (java.util.MissingResourceException mre) {
            log.warn("Missing key for '" + key + "'");

            return "???" + key + "???";
        }

        return message;
    }

    public String getText(String key, Object arg) {
        if (arg == null) {
            return getBundle().getString(key);
        }

        MessageFormat form = new MessageFormat(getBundle().getString(key));

        if (arg instanceof String) {
            return form.format(new Object[] { arg });
        } else if (arg instanceof Object[]) {
            return form.format(arg);
        } else {
            log.error("arg '" + arg + "' not String or Object[]");

            return "";
        }
    }

    protected void addMessage(String key, Object arg) {
        // JSF Success Messages won't live past a redirect, so I don't use it
        //FacesUtils.addInfoMessage(formatMessage(key, arg));
        List messages = (List) getSession().getAttribute("messages");

        if (messages == null) {
            messages = new ArrayList();
        }

        messages.add(getText(key, arg));
        getSession().setAttribute("messages", messages);
    }

    protected void addMessage(String key) {
        addMessage(key, null);
    }

    protected void addError(String key, Object arg) {
        // The "JSF Way" doesn't allow you to put HTML in your error messages, so I don't use it.
        // FacesUtils.addErrorMessage(formatMessage(key, arg));
        List errors = (List) getSession().getAttribute("errors");

        if (errors == null) {
            errors = new ArrayList();
        }

        errors.add(getText(key, arg));

        getSession().setAttribute("errors", errors);
    }

    protected void addError(String key) {
        addError(key, null);
    }
    
    
    
   
}
