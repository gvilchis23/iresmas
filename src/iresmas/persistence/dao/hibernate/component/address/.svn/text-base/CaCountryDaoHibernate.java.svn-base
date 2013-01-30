/**
 * 
 */
package iresmas.persistence.dao.hibernate.component.address;

import java.util.List;

import iresmas.persistence.dao.component.address.CaCountryDao;
import iresmas.persistence.dao.hibernate.BaseDaoHibernate;
import iresmas.persistence.entity.ComCatalog;
import iresmas.persistence.entity.component.address.CaCountry;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public class CaCountryDaoHibernate extends BaseDaoHibernate implements CaCountryDao {

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.component.address.CaCountryDao#getCountries()
	 */
	public List<CaCountry> getCountries() {
		List<CaCountry> list = null;
		list = getHibernateTemplate().find("from CaCountry order by COUNTRYNAME");
		return list;
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.component.address.CaCountryDao#getCountry(java.lang.Integer)
	 */
	public CaCountry getCountry(Integer idCountry) {
		return (CaCountry)getHibernateTemplate().get(ComCatalog.class, idCountry);
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.component.address.CaCountryDao#removeCountry(java.lang.Integer)
	 */
	public void removeCountry(Integer idCountry) {
		CaCountry country = getCountry(idCountry);
		getHibernateTemplate().delete(country);

	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.component.address.CaCountryDao#saveCountry(iresmas.persistence.entity.component.address.CaCountry)
	 */
	public void saveCountry(CaCountry caCountry) {
		getHibernateTemplate().saveOrUpdate(caCountry);

	}

}
