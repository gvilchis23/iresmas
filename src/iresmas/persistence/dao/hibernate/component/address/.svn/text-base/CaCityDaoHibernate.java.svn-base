/**
 * 
 */
package iresmas.persistence.dao.hibernate.component.address;

import java.util.List;

import iresmas.persistence.dao.component.address.CaCityDao;
import iresmas.persistence.dao.hibernate.BaseDaoHibernate;
import iresmas.persistence.entity.component.address.CaCity;
import iresmas.persistence.entity.component.address.CaState;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public class CaCityDaoHibernate extends BaseDaoHibernate implements CaCityDao {

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.component.address.CaCityDao#getCities()
	 */
	public List<CaCity> getCities() {
		List<CaCity> cityList = null;
		cityList = (List<CaCity>)getHibernateTemplate().find("from CaCity order by CITYNAME");
		return cityList;
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.component.address.CaCityDao#getCitiesByState(iresmas.persistence.entity.component.address.CaState)
	 */
	public List<CaCity> getCitiesByState(CaState state) {
		List<CaCity> cityList = null;
		cityList = (List<CaCity>)getHibernateTemplate().find("from CaCity where IDSTATE = ? order by CITYNAME", state);
		return cityList;
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.component.address.CaCityDao#getCity(java.lang.Integer)
	 */
	public CaCity getCity(Integer idCity) {
		return (CaCity)getHibernateTemplate().get(CaCity.class, idCity);
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.component.address.CaCityDao#removeCity(java.lang.Integer)
	 */
	public void removeCity(Integer idCity) {
		CaCity city = getCity(idCity);
		getHibernateTemplate().delete(city);

	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.component.address.CaCityDao#saveCity(iresmas.persistence.entity.component.address.CaCity)
	 */
	public void saveCity(CaCity city) {
		getHibernateTemplate().saveOrUpdate(city);

	}

}
