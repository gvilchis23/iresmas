/**
 * 
 */
package iresmas.persistence.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public interface Dao {
	
	/**
	 * Obtiene una lista de objetos.
	 * @param clazz Objeto a persistir.
	 * @return lista de objetos.
	 */
	List<Object> getObjects(Class<Object> clazz);
	
	/**
	 * Obtiene un objeto en especifico.
	 * @param clazz Tipo de objeto solicitado.
	 * @param id Identoficador del objeto.
	 * @return Objeto lleno.
	 */
	Object getObject(Class<Object> clazz, Serializable id);
	
	/**
	 * Salva o actualiza un objeto.
	 * @param object Objeto a salvar o actualizar.
	 */
	void saveObject(Object object);
	
	/**
	 * Borra un objeto en espefico.
	 * @param clazz Tipo del objeto a borrar.
	 * @param id Identificador del Objeto.
	 */
	void removeObject(Class<Object> clazz, Serializable id);

}
