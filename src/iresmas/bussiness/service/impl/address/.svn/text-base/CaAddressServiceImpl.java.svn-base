/**
 * 
 */
package iresmas.bussiness.service.impl.address;

import iresmas.bussiness.service.definition.address.CaAddressService;
import iresmas.bussiness.service.impl.BaseService;
import iresmas.persistence.dao.component.address.CaAddressDao;
import iresmas.persistence.entity.component.address.CaAddress;

/**
 * Implementa los metodos definidos por la interfaz que implementa.
 * @author Cristopher Cerrillo Callejas
 *
 */
public class CaAddressServiceImpl extends BaseService implements
		CaAddressService {
	
	private CaAddressDao addressDao; 
	
	public void setAddressDao(CaAddressDao addressDao){
		this.addressDao = addressDao;
	}
	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.address.CaAddressService#getAddress(java.lang.Integer)
	 */
	public CaAddress getAddress(Integer idAddress) {
		return addressDao.getAddress(idAddress);
	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.address.CaAddressService#removeAddress(java.lang.Integer)
	 */
	public void removeAddress(Integer idAddress) {
		if (log.isDebugEnabled()) {
			log.debug("removing address: " + idAddress);
		}
		addressDao.removeAddress(idAddress);

	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.address.CaAddressService#saveAddress(iresmas.persistence.entity.component.address.CaAddress)
	 */
	public void saveAddress(CaAddress address) {
		addressDao.saveAddress(address);

	}

}
