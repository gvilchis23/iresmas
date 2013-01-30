/**
 * 
 */
package iresmas.persistence.dao.hibernate;

import iresmas.persistence.dao.ComCatalogDao;
import iresmas.persistence.entity.ComCatalog;

import java.util.List;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public class ComCatalogDaoHibernate extends BaseDaoHibernate implements
		ComCatalogDao {

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.ComCatalogDao#getCatalog(java.lang.Integer)
	 */
	public ComCatalog getCatalog(Integer idComCatalog) {
		return (ComCatalog) getHibernateTemplate().get(ComCatalog.class, idComCatalog);
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.ComCatalogDao#getCatalogChildrens(java.lang.Integer)
	 */
	public List<ComCatalog> getCatalogChildrens(ComCatalog catalogFather) {
		List<ComCatalog> listChildrens = null;
		listChildrens = getHibernateTemplate().find("from comcatalog where IDCATALOGFATHER =? order by SHORTHDESCRIPTION", catalogFather);
		return listChildrens;
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.ComCatalogDao#getCatalogs()
	 */
	public List<ComCatalog> getCatalogs() {
		List<ComCatalog> list = null;
		list = (List<ComCatalog>)getHibernateTemplate().find("from ComCatalog");
		return list;
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.ComCatalogDao#removeCatalog(java.lang.Integer)
	 */
	public void removeCatalog(Integer idComCatalog) {
		ComCatalog comCatalog = getCatalog(idComCatalog); 
		getHibernateTemplate().delete(comCatalog);

	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.ComCatalogDao#saveCatalog(iresmas.persistence.entity.ComCatalog)
	 */
	public void saveCatalog(ComCatalog comCatalog) {
		getHibernateTemplate().saveOrUpdate(comCatalog);

	}

}
