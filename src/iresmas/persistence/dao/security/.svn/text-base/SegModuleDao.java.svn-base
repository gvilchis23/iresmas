/**
 * 
 */
package iresmas.persistence.dao.security;

import java.util.List;

import iresmas.persistence.dao.Dao;
import iresmas.persistence.entity.security.SegModule;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public interface SegModuleDao extends Dao {
	
	/**
	 * Obtiene una lsiat con todos los modulos del sistema.
	 * @return Lista llena.
	 */
	List<SegModule> getModules();
	
	/**
	 * Guada la infomacion de un modulo.
	 * @param module Informacion del modulo.
	 */
	void saveModule(SegModule module);
	
	/**
	 * Lista los modulos asociados a un padre.
	 * @param moduleFather Modulo padre.
	 * @return Lista con la informacion de los submodulos.
	 */
	List<SegModule> getChildList(SegModule moduleFather);
	

}
