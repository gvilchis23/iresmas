/**
 * 
 */
package iresmas.bussiness.service.impl;

import iresmas.bussiness.service.definition.Service;
import iresmas.persistence.dao.Dao;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Implementa los metodos definidos como base de un servicio.
 * @author Cristopher Cerrillo Callejas
 *
 */
public class BaseService implements Service {
	
	protected final Log log = LogFactory.getLog(getClass());
    protected Dao dao = null;
    

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.Manager#getObject(java.lang.Class, java.io.Serializable)
	 */
	public Object getObject(Class clazz, Serializable id) {
		return dao.getObject(clazz, id);
	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.Manager#getObjetcts(java.lang.Class)
	 */
	public List getObjetcts(Class clazz) {
		return dao.getObjects(clazz);
	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.Manager#removeObject(java.lang.Class, java.io.Serializable)
	 */
	public void removeObject(Class clazz, Serializable id) {
		dao.removeObject(clazz, id);

	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.Manager#saveObject(java.lang.Object)
	 */
	public void saveObject(Object object) {
		dao.saveObject(object);

	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.Manager#setDao(iresmas.persistence.dao.Dao)
	 */
	public void setDao(Dao dao) {
		this.dao = dao;

	}

}
