package iresmas.managed.security;

import iresmas.bussiness.service.definition.security.SegRoleService;
import iresmas.persistence.entity.security.SegRole;
import iresmas.webapp.action.BasePage;
import iresmas.webapp.listener.ServiceFinder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RolePermissionsForm extends BasePage implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<SegRole>  roleList = new ArrayList<SegRole>();
	private boolean visible = false;
	private String role;
	private String module;
	private String submodule;
	private String option;
	private SegRoleService segRoleService;
	
	
	public RolePermissionsForm(){
		role ="";
		module = "";
		submodule = "";
		option = "";
		loadRolesList();
		
	}


	public List<SegRole> getRoleList() {
		segRoleService = (SegRoleService)ServiceFinder.findBean("roleService");
		return segRoleService.getRoles();
	}


	public void setRoleList(List<SegRole> roleList) {
		this.roleList = roleList;
	}


	public boolean isVisible() {
		return visible;
	}


	public void setVisible(boolean visible) {
		this.visible = visible;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getModule() {
		return module;
	}


	public void setModule(String module) {
		this.module = module;
	}


	public String getSubmodule() {
		return submodule;
	}


	public void setSubmodule(String submodule) {
		this.submodule = submodule;
	}


	public String getOption() {
		return option;
	}


	public void setOption(String option) {
		this.option = option;
	}
	
	/*
	 * Metodo que se encarga de mostrar u ocultar el panel
	 */
	public void panelVisible() {
		   setVisible(true);
		    }

		public void panelNotVisible (){
			 setVisible(false);
		}


		public SegRoleService getSegRoleService() {
			return segRoleService;
		}


		public void setSegRoleService(SegRoleService segRoleService) {
			this.segRoleService = segRoleService;
		}


		public void loadRolesList(){
			segRoleService = (SegRoleService)ServiceFinder.findBean("roleService");
			setRoleList(segRoleService.getRoles());
		}

		
	
}
