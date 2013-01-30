/**
 * 
 */
package iresmas.persistence.dao.component.address;

import java.util.List;

import iresmas.persistence.dao.Dao;
import iresmas.persistence.entity.component.address.CaCity;
import iresmas.persistence.entity.component.address.CaState;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public interface CaCityDao extends Dao {
	
	/**
	 * Salva una ciudad.
	 * @param city Ciudad a salvar.
	 */
	void saveCity(CaCity city);
	
	/**
	 * Borra un ciudad.
	 * @param idCity Identificador de la ciudad.
	 */
	void removeCity(Integer idCity);
	
	/**
	 * Obtiene la lista todas las ciudades. 
	 * @return Lista con las ciudades.
	 */
	List<CaCity> getCities();
	
	/**
	 * Realiza una bsuqueda en base al estado.
	 * @param state Estado usado como criterio de busqueda.
	 * @return Lisat con las ciudades por estado.
	 */
	List<CaCity> getCitiesByState(CaState state);
	
	/**
	 * Obtiene la informacion de una ciudad en base a su identificador.
	 * @param idCity Identificador de la ciudad.
	 * @return Informacion de la ciudad solicitada.
	 */
	CaCity getCity(Integer idCity);

}
