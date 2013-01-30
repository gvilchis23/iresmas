/**
 * 
 */
package iresmas.persistence.dao.security;

import java.util.List;

import iresmas.persistence.dao.Dao;
import iresmas.persistence.entity.security.SegRole;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public interface SegRoleDao extends Dao {
	
	/**
	 * Guarda o actualiza un rol.
	 * @param role Informacion con el rol a persistir.
	 */
	void saveRole(SegRole role);
	
	/**
	 * Realiza el borrado de un rol en base a su identificador.
	 * @param idIresmasRole Identificador del rol.
	 */
	void removeRole(Integer idIresmasRole);
	
	/**
	 * Obtiene la informacion de un rol en base a su identificador.
	 * @param idIresmasRole Identificador del rol.
	 * @return Informacion del rol solicitado.
	 */
	SegRole getRole(Integer idIresmasRole);
	
	/**
	 * Obtiene una lista con los roles existentes.
	 * @return Lista con los roles existentes.
	 */
	List<SegRole> getRoles();

}
