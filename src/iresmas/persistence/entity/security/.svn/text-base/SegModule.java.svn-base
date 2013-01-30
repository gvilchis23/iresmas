/**
 * 
 */
package iresmas.persistence.entity.security;

import java.io.Serializable;
import java.util.Set;

/**
 * Representa la informacion contenida por modulo en el sistema.
 * @author Cristopher Cerrillo Callejas
 *
 */
public class SegModule implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer idIresmasModule;
	private String moduleName;
	private SegModule moduleFather;
	private int accessPrivilege;
	private int addPrivilege;
	private int modifyPrivilege;
	private int deletePrivilege;
	private int executePrivilege;
	
	private Set<SegRole> roles;
	
	public Integer getIdIresmasModule() {
		return idIresmasModule;
	}
	public void setIdIresmasModule(Integer idIresmasModule) {
		this.idIresmasModule = idIresmasModule;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public SegModule getModuleFather() {
		return moduleFather;
	}
	public void setModuleFather(SegModule moduleFather) {
		this.moduleFather = moduleFather;
	}
	public int getAccessPrivilege() {
		return accessPrivilege;
	}
	public void setAccessPrivilege(int accessPrivilege) {
		this.accessPrivilege = accessPrivilege;
	}
	public int getAddPrivilege() {
		return addPrivilege;
	}
	public void setAddPrivilege(int addPrivilege) {
		this.addPrivilege = addPrivilege;
	}
	public int getModifyPrivilege() {
		return modifyPrivilege;
	}
	public void setModifyPrivilege(int modifyPrivilege) {
		this.modifyPrivilege = modifyPrivilege;
	}
	public int getDeletePrivilege() {
		return deletePrivilege;
	}
	public void setDeletePrivilege(int deletePrivilege) {
		this.deletePrivilege = deletePrivilege;
	}
	public int getExecutePrivilege() {
		return executePrivilege;
	}
	public void setExecutePrivilege(int executePrivilege) {
		this.executePrivilege = executePrivilege;
	}
	public Set<SegRole> getRoles() {
		return roles;
	}
	public void setRoles(Set<SegRole> roles) {
		this.roles = roles;
	}	
	
}
