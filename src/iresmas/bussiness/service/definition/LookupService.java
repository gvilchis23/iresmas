/**
 * 
 */
package iresmas.bussiness.service.definition;

import iresmas.persistence.dao.LookupDao;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public interface LookupService extends Service {
	
	public void setLookupDao(LookupDao dao);

}
