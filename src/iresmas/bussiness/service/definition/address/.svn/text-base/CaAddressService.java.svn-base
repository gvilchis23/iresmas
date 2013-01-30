/**
 * 
 */
package iresmas.bussiness.service.definition.address;

import iresmas.bussiness.service.definition.Service;
import iresmas.persistence.dao.component.address.CaAddressDao;
import iresmas.persistence.entity.component.address.CaAddress;

/**
 * Define los metodos que deben ser implementados 
 * por el servicio de domicilios.
 * @author Cristopher Cerrillo Callejas
 *
 */
public interface CaAddressService extends Service {
	
	/**
	 * Establece la instancia del dao.
	 * @param addressDao Instancia requerida.
	 */
	void setAddressDao(CaAddressDao addressDao);
	
	/**
	 * Obtiene un domicilio en especifico.
	 * @param idAddress Identificador del domicilio.
	 * @return Domicilio solicitado.
	 */
	CaAddress getAddress(Integer idAddress);
	
	/**
	 * Salva o actualiza un domicilio.
	 * @param address Domicilio a salvar.
	 */
	void saveAddress(CaAddress address);
	
	/**
	 * Borra un domicilio.
	 * @param idAddress Identificador dle domicilio.
	 */
	void removeAddress(Integer idAddress);

}
