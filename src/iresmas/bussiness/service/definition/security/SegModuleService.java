/**
 * 
 */
package iresmas.bussiness.service.definition.security;

import iresmas.bussiness.service.definition.Service;
import iresmas.persistence.dao.security.SegModuleDao;
import iresmas.persistence.entity.security.SegModule;

import java.util.List;

/**
 * Define los metodos que deben ser implementados por 
 * el servicio de modulos.
 * @author Cristopher Cerrillo Callejas
 *
 */
public interface SegModuleService extends Service {
	
	/**
	 * Establece la instancia del dao para poder accesar 
	 * a la capa de persistencia.
	 * @param moduleDao Parametro mediante el cual se 
	 * obtiene el acceso a capa de persistencia.
	 */
	void setModuleDao(SegModuleDao moduleDao);

	/**
	 * Obtiene una lista con todos los modulos del sistema.
	 * @return Lista llena con informacion de los modulos.
	 */
	List<SegModule> getModules();
	
	/**
	 * Guada la infomacion de un modulo.
	 * @param module Informacion del modulo.
	 */
	void saveModule(SegModule module);
	
	/**
	 * Obtiene una lisat con los catalogos hijos.
	 * @param moduleFather
	 * @return Lista con los submodulos.
	 */
	List<SegModule> getChildList(SegModule moduleFather);
}
