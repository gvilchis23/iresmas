/**
 * 
 */
package iresmas.persistence.dao.hibernate.component.address;

import java.util.List;

import iresmas.persistence.dao.component.address.CaStateDao;
import iresmas.persistence.dao.hibernate.BaseDaoHibernate;
import iresmas.persistence.entity.component.address.CaCountry;
import iresmas.persistence.entity.component.address.CaState;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public class CaStateDaoHibernate extends BaseDaoHibernate implements CaStateDao {

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.component.address.CaStateDao#getState(java.lang.Integer)
	 */
	public CaState getState(Integer idState) {
		return (CaState) getHibernateTemplate().get(CaState.class, idState);
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.component.address.CaStateDao#getStates()
	 */
	public List<CaState> getStates() {
		List<CaState> statesList = null;
		statesList = (List<CaState>)getHibernateTemplate().find("from CaState order by STATENAME");
		return statesList;
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.component.address.CaStateDao#getStatesByCountry(iresmas.persistence.entity.component.address.CaCountry)
	 */
	public List<CaState> getStatesByCountry(CaCountry country) {
		List<CaState> stateList = null;
		stateList = (List<CaState>)getHibernateTemplate().find("from CaState where IDCOUNTRY = ? order by STATENAME", country.getIdCountry());
		return stateList;
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.component.address.CaStateDao#removeState(java.lang.Integer)
	 */
	public void removeState(Integer idState) {
		CaState state = getState(idState);
		getHibernateTemplate().delete(state);

	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.component.address.CaStateDao#saveState(iresmas.persistence.entity.component.address.CaState)
	 */
	public void saveState(CaState state) {
		getHibernateTemplate().saveOrUpdate(state);

	}

}
