/**
 * 
 */
package iresmas.persistence.dao;

import java.util.List;

import iresmas.persistence.entity.ComCustomer;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public interface ComCustomerDao extends Dao {
	
	/**
	 * Salva un cliente
	 * @param customer Cliente a salvar
	 */
	void saveCustomer(ComCustomer customer);
	
	/**
	 * Borra un cliente.
	 * @param idCustomer Identificador dle cliente a borrar.
	 */
	void removeCustomer(Integer idCustomer);
	
	/**
	 * Obtiene los clientes existente en la aplicacion.
	 * @return Lista poblada con clientes.
	 */
	List<ComCustomer> getCustomers();
	
	/**
	 * Obtiene un cliente en especifico
	 * @param idCustomer Identificador del cliente
	 * @return cliente solicitado
	 */
	ComCustomer getCustomer(Integer idCustomer);
	
	

}
