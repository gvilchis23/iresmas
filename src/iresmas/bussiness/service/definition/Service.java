/**
 * 
 */
package iresmas.bussiness.service.definition;

import java.io.Serializable;
import java.util.List;

import iresmas.persistence.dao.Dao;

/**
 * Define los metodos que deben ser implementados por
 * todos los servicios de negocio.
 * @author Cristopher Cerrillo Callejas
 *
 */
public interface Service {
	
	/**
	 * Establece la instancia del Dao Baase.
	 * @param dao Dao requerido.
	 */
	void setDao(Dao dao);
	
	/**
	 * Obtiene una lista de objectos.
	 * @param clazz Tipo de objeto requerido.
	 * @return Lista de objetos.
	 */
	List getObjetcts(Class clazz);
	
	/**
	 * Obtiene un objeto en especifico
	 * @param clazz Tipo del objeto requerido.
	 * @param id Identificador del objeto.
	 * @return Objeto requerido.
	 */
	Object getObject(Class clazz, Serializable id);
	
	/**
	 * Guarda o actualiza un objeto.
	 * @param object Objeto a persistir.
	 */
	void saveObject(Object object);
	
	/**
	 * Borra un objeto en especifico.
	 * @param clazz Tipo del Objeto a borrar. 
	 * @param id Identificador del objeto.
	 */
	void removeObject(Class clazz, Serializable id);

}
