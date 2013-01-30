/**
 * 
 */
package iresmas.persistence.dao.hibernate;

import java.io.Serializable;
import java.util.List;

import iresmas.persistence.dao.Dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public class BaseDaoHibernate extends HibernateDaoSupport implements Dao {
	
	protected final Log log = LogFactory.getLog(getClass());

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.Dao#getObject(java.lang.Class, java.io.Serializable)
	 */
	public Object getObject(Class<Object> clazz, Serializable id) {
		Object object = getHibernateTemplate().get(clazz, id);
		if (object == null) {
			throw new ObjectRetrievalFailureException(clazz, id);
		}
		return object;
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.Dao#getObjects(java.lang.Class)
	 */
	public List<Object> getObjects(Class<Object> clazz) {
		return getHibernateTemplate().loadAll(clazz);
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.Dao#removeObject(java.lang.Class, java.io.Serializable)
	 */
	public void removeObject(Class clazz, Serializable id) {
		getHibernateTemplate().delete(getObject(clazz, id));

	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.Dao#saveObject(java.lang.Object)
	 */
	public void saveObject(Object object) {
		getHibernateTemplate().saveOrUpdate(object);

	}

}
