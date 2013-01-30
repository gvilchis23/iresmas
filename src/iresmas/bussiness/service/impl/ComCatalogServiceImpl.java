/**
 * 
 */
package iresmas.bussiness.service.impl;

import java.util.List;

import iresmas.bussiness.service.definition.ComCatalogService;
import iresmas.persistence.dao.ComCatalogDao;
import iresmas.persistence.entity.ComCatalog;

/**
 * Implemnta los metodos definidos por la interfaz que implementa.
 * @author Cristoipher Cerrillo Callejas
 *
 */
public class ComCatalogServiceImpl extends BaseService implements
		ComCatalogService {

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.ComCatalogService#getCatalog(java.lang.Integer)
	 */
	public ComCatalog getCatalog(Integer idComCatalog) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.ComCatalogService#getCatalogChildrens(iresmas.persistence.entity.ComCatalog)
	 */
	public List<ComCatalog> getCatalogChildrens(ComCatalog catalogFather) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.ComCatalogService#getCatalogs()
	 */
	public List<ComCatalog> getCatalogs() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.ComCatalogService#removeCatalog(java.lang.Integer)
	 */
	public void removeCatalog(Integer idComCatalog) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.ComCatalogService#saveCatalog(iresmas.persistence.entity.ComCatalog)
	 */
	public void saveCatalog(ComCatalog comCatalog) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.ComCatalogService#setComCatalogDao(iresmas.persistence.dao.ComCatalogDao)
	 */
	public void setComCatalogDao(ComCatalogDao catalogDao) {
		// TODO Auto-generated method stub

	}

}
