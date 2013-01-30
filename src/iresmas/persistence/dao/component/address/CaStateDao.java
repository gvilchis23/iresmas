/**
 * 
 */
package iresmas.persistence.dao.component.address;

import java.util.List;

import iresmas.persistence.dao.Dao;
import iresmas.persistence.entity.component.address.CaCountry;
import iresmas.persistence.entity.component.address.CaState;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public interface CaStateDao extends Dao {
	
	/**
	 * Recupera una lisat con los estados
	 * @return Regresa la lista de los estados.
	 */
	List<CaState> getStates();
	
	/**
	 * Obtiene los estados por pais.
	 * @param country Pais sobre el cual se realiza la bisqueda.
	 * @return Lista de estados por pais.
	 */
	List<CaState> getStatesByCountry(CaCountry country);
	
	/**
	 * Obtiene l ainformacion de un estado en espefico.
	 * @param idState Identificador del estado.
	 * @return informacion del estado solicitado.
	 */
	CaState getState(Integer idState);
	
	/**
	 * Realiza el guardado o actualizacion de un estado.
	 * @param state Estado a ser guardado o actualizado.
	 */
	void saveState(CaState state);
	
	/**
	 * Borra un estado en especifico.
	 * @param idState Identificador del estado a borrar.
	 */
	void removeState(Integer idState);

}
