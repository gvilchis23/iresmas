/**
 * 
 */
package iresmas.persistence.dao.component.address;

import iresmas.persistence.entity.component.address.CaCountry;

import java.util.List;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public interface CaCountryDao {
	
	/**
	 * Obtiene la lista de paises.
	 * @return Lista de paises.
	 */
	List<CaCountry> getCountries();
	
	/**
	 * Obtiene un pais en especifico.
	 * @param idCountry Identificador del pais.
	 * @return Detalle del pais.
	 */
	CaCountry getCountry(Integer idCountry);
	
	/**
	 * Realiza el salvado de un pais.
	 * @param caCountry Objeto a persistir.
	 */
	void saveCountry(CaCountry caCountry);
	
	/**
	 * Realiza el borrado de un pais.
	 * @param idCountry Identificador del pais.
	 */
	void removeCountry(Integer idCountry);

}
