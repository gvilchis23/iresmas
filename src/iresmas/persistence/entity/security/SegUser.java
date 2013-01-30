/**
 * 
 */
package iresmas.persistence.entity.security;

import iresmas.persistence.entity.ComCatalog;
import iresmas.persistence.entity.ComEmployee;

import java.io.Serializable;
import java.util.Date;

/**
 * Representa la informacion de un usuario del sistema.
 * @author Cristopher Cerrillo Callejas
 *
 */
public class SegUser extends ComEmployee implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userName;
	private String password;
	private Date startVigency;
	private Date endVigency;
	private Date lastSessionDate;
	private Date changeStatusDate;
	private SegRole role;
	private ComCatalog statusUser;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getStartVigency() {
		return startVigency;
	}
	public void setStartVigency(Date startVigency) {
		this.startVigency = startVigency;
	}
	public Date getEndVigency() {
		return endVigency;
	}
	public void setEndVigency(Date endVigency) {
		this.endVigency = endVigency;
	}
	public Date getLastSessionDate() {
		return lastSessionDate;
	}
	public void setLastSessionDate(Date lastSessionDate) {
		this.lastSessionDate = lastSessionDate;
	}
	public Date getChangeStatusDate() {
		return changeStatusDate;
	}
	public void setChangeStatusDate(Date changeStatusDate) {
		this.changeStatusDate = changeStatusDate;
	}
	public SegRole getRole() {
		return role;
	}
	public void setRole(SegRole role) {
		this.role = role;
	}
	public ComCatalog getStatusUser() {
		return statusUser;
	}
	public void setStatusUser(ComCatalog statusUser) {
		this.statusUser = statusUser;
	}

}
