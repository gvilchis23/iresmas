/**
 * 
 */
package iresmas.persistence.dao.hibernate;

import java.util.List;

import iresmas.persistence.dao.ComCustomerDao;
import iresmas.persistence.entity.ComCustomer;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public class ComCustomerDaoHibernate extends BaseDaoHibernate implements
		ComCustomerDao {

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.ComCustomerDao#getCustomer(java.lang.Integer)
	 */
	public ComCustomer getCustomer(Integer idCustomer) {
		return (ComCustomer)getHibernateTemplate().get(ComCustomer.class, idCustomer);
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.ComCustomerDao#getCustomers()
	 */
	public List<ComCustomer> getCustomers() {
		List<ComCustomer> customerList = null;
		customerList = (List<ComCustomer>)getHibernateTemplate().find("form ComCustomer order by FIRSTNAME");
		return customerList;
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.ComCustomerDao#removeCustomer(java.lang.Integer)
	 */
	public void removeCustomer(Integer idCustomer) {
		ComCustomer customer = getCustomer(idCustomer);
		getHibernateTemplate().delete(customer);

	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.ComCustomerDao#saveCustomer(iresmas.persistence.entity.ComCustomer)
	 */
	public void saveCustomer(ComCustomer customer) {
		getHibernateTemplate().saveOrUpdate(customer);

	}

}
