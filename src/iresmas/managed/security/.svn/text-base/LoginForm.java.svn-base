package iresmas.managed.security;


/**
 * Bean utilizado en la funcionalidad de ingreso a la aplicación.
 *
 * @author Ruben Guadalupe Jasso cortes
 * 
 */

import iresmas.bussiness.service.definition.security.SegUserService;
import iresmas.common.util.Iconstants;
import iresmas.webapp.action.BasePage;
import iresmas.webapp.listener.ServiceFinder;

import java.io.Serializable;


public class LoginForm extends BasePage implements Serializable{

	private static final long serialVersionUID = 1L;
	

	
	private String user="";
	private String password="";
	
	/**
	 * Language of application
	 */
	
	private String slcLanguaje;
	   
	
	public LoginForm (){
		this.slcLanguaje = Iconstants.LOCALE_ENGLISH;
	}
	
//	public void setSegUserService(SegUserService service){
//		this.service = service;
//	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getSlcLanguaje() {
		return slcLanguaje;
	}
	/**
	 * @param slcLanguaje the slcLanguaje to set
	 */
	public void setSlcLanguaje(String slcLanguaje) {
		this.slcLanguaje = slcLanguaje;
	}
	   
	
	/**
     * Method valid access application
     * @return menu al que es direccionado el usuario.
     */
	
	public String access ()  {
		
  		String access = "";
		if(getUser()!=null && getPassword()!=null){
//			userService = (SegUserService)ctx.getBean("userService");
			userService = (SegUserService)ServiceFinder.findBean("userService");
			access = userService.loginService(user, password);
//			access="access";
			System.out.println("Esto es iresmas");
  		}else{
  			access = "";
  			System.out.println("Nada");
  		}
  		return access;
	}
	
}

