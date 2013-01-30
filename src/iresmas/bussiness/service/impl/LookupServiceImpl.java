/**
 * 
 */
package iresmas.bussiness.service.impl;

import iresmas.bussiness.service.definition.LookupService;
import iresmas.persistence.dao.LookupDao;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public class LookupServiceImpl extends BaseService implements LookupService {
	
	private LookupDao dao;

	public void setLookupDao(LookupDao dao) {
		super.dao = dao;
        this.dao = dao;
		
	}

}
