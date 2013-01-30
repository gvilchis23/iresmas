/**
 * 
 */
package iresmas.persistence.dao.hibernate.component.address;

import iresmas.persistence.dao.component.address.CaAddressDao;
import iresmas.persistence.dao.hibernate.BaseDaoHibernate;
import iresmas.persistence.entity.component.address.CaAddress;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public class CaAddressDaoHibernate extends BaseDaoHibernate implements
		CaAddressDao {

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.component.address.CaAddressDao#getAddress(java.lang.Integer)
	 */
	public CaAddress getAddress(Integer idAddress) {
		return (CaAddress)getHibernateTemplate().get(CaAddress.class, idAddress);
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.component.address.CaAddressDao#removeAddress(java.lang.Integer)
	 */
	public void removeAddress(Integer idAddress) {
		CaAddress address = getAddress(idAddress);
		getHibernateTemplate().delete(address);

	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.component.address.CaAddressDao#saveAddress(iresmas.persistence.entity.component.address.CaAddress)
	 */
	public void saveAddress(CaAddress address) {
		getHibernateTemplate().saveOrUpdate(address);
	}

}
