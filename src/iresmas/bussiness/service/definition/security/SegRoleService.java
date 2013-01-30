/**
 * 
 */
package iresmas.bussiness.service.definition.security;

import iresmas.bussiness.service.definition.Service;
import iresmas.persistence.dao.security.SegModuleDao;
import iresmas.persistence.dao.security.SegRoleDao;
import iresmas.persistence.entity.security.SegRole;

import java.util.List;

/**
 * Define los metodos que deben ser implementados 
 * por el servicio de Roles.
 * @author Cristopher Cerrillo Callejas
 *
 */
public interface SegRoleService extends Service {
	
	public void setModuleDao(SegModuleDao moduleDao);
	/**
	 * Establece la instancia de RoleDao.
	 * @param roleDao Parametro a establecer.
	 */
	void setRoleDao(SegRoleDao roleDao);
	
	/**
	 *  Guarda un nuevo rol.
	 * @param role Rol a guardar.
	 */
	void saveRole(SegRole role);
	
	/**
	 * Borra un rol en base a su identificador.
	 * @param idIresmasRole Identificar del rol.
	 */
	void removeRole(Integer idIresmasRole);
	
	/**
	 * Obtiene un rol en especifico en base a su identificador.
	 * @param idIresmasRole Identificador del rol.
	 * @return Rol solicitado.
	 */
	SegRole getRole(Integer idIresmasRole);
	
	/**
	 * Obtiene la lista de roles disponibles
	 * @return Lista con los roles disponibles.
	 */
	List<SegRole> getRoles();

}
