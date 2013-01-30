/**
 * 
 */
package iresmas.bussiness.service.impl.security;

import iresmas.bussiness.service.definition.security.SegRoleService;
import iresmas.bussiness.service.impl.BaseService;
import iresmas.persistence.dao.security.SegModuleDao;
import iresmas.persistence.dao.security.SegRoleDao;
import iresmas.persistence.entity.security.SegRole;

import java.util.List;

/**
 * Implementa los metodos definidos por la interfaz que implementa.
 * @author Cristopher Cerrillo Callejas
 *
 */
public class SegRoleServiceImpl extends BaseService implements SegRoleService {
	
	private SegRoleDao roleDao;
	private SegModuleDao moduleDao;
	
	
	public void setModuleDao(SegModuleDao moduleDao) {
		this.moduleDao = moduleDao;
	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.secirity.SegRoleService#setRoleDao(iresmas.persistence.dao.security.SegRoleDao)
	 */
	public void setRoleDao(SegRoleDao roleDao) {
		this.roleDao = roleDao;
	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.secirity.SegRoleService#getRole(java.lang.Integer)
	 */
	public SegRole getRole(Integer idIresmasRole) {
		SegRole role = roleDao.getRole(idIresmasRole);
		return role;
	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.secirity.SegRoleService#getRoles()
	 */
	public List<SegRole> getRoles() {
		List<SegRole> roleList = roleDao.getRoles();
		return roleList;
	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.secirity.SegRoleService#removeRole(java.lang.Integer)
	 */
	public void removeRole(Integer idIresmasRole) {
		roleDao.removeRole(idIresmasRole);
	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.secirity.SegRoleService#saveRole(iresmas.persistence.entity.security.SegRole)
	 */
	public void saveRole(SegRole role) {
		roleDao.saveRole(role);
	}

}
