/**
 * 
 */
package iresmas.bussiness.service.definition;

import java.util.List;

import iresmas.persistence.entity.ComCustomer;

/**
 * Define los metodos que deben ser implementados 
 * pro el servicio de Clientes.
 * @author Cristopher Cerrillo Callejas
 *
 */
public interface ComCustomerService extends Service {
	
	/**
	 * Realiza el salvado de un cliente.
	 * @param customer Cliente a salvar.
	 */
	void saveCustomerService(ComCustomer customer);
	
	/**
	 * Realiza el borrado de un cliente.
	 * @param idCustomer Identificador del cliente.
	 */
	void removeCustomerService(Integer idCustomer);
	
	/**
	 * Obtiene un cliente en especifico.
	 * @param idCustomer Identificador del cliente.
	 * @return Cliente solicitado.
	 */
	ComCustomer getCustomerService(Integer idCustomer);
	
	/**
	 * Obtiene la lista de clientes.
	 * @return Lista con clientes.
	 */
	List<ComCustomer> getCustomersService();

}
