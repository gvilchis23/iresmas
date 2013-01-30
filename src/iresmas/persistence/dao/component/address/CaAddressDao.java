/**
 * 
 */
package iresmas.persistence.dao.component.address;

import iresmas.persistence.dao.Dao;
import iresmas.persistence.entity.component.address.CaAddress;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public interface CaAddressDao extends Dao {
	
	/**
	 * Salva un domicilio.
	 * @param address Domicilio a salvar.
	 */
	void saveAddress(CaAddress address);
	
	/**
	 * Borra un domicilio.
	 * @param idAddress Identificador del domicilio.
	 */
	void removeAddress(Integer idAddress);
	
	/**
	 * Obtiene un domicilio en espefico.
	 * @param idAddress Idnetificador del domicilio.
	 * @return Domicilio solicitado.
	 */
	CaAddress getAddress(Integer idAddress);

}
