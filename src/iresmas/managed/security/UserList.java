package iresmas.managed.security;

import iresmas.bussiness.service.definition.security.SegUserService;
import iresmas.persistence.entity.security.SegUser;
import iresmas.webapp.action.BasePage;
import iresmas.webapp.listener.ServiceFinder;

import java.io.Serializable;
import java.util.List;

public class UserList extends BasePage implements Serializable {

	private static final long serialVersionUID = 1L;

	private SegUser segUser;

	private boolean visible;

	public List<SegUser> getListUsers() {
		userService = (SegUserService) ServiceFinder.findBean("userService");
		List<SegUser> listUsers = userService.getUsers();
		return listUsers;
	}

	public SegUser getSegUser() {
		return segUser;
	}

	public void setSegUser(SegUser segUser) {
		this.segUser = segUser;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	public void panelVisible() {
	    setVisible(true);
	}

	public void panelNotVisible (){
		setVisible(false);
	}

}
