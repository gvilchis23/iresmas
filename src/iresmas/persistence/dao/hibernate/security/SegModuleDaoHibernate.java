/**
 * 
 */
package iresmas.persistence.dao.hibernate.security;

import java.util.List;

import iresmas.persistence.dao.hibernate.BaseDaoHibernate;
import iresmas.persistence.dao.security.SegModuleDao;
import iresmas.persistence.entity.security.SegModule;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public class SegModuleDaoHibernate extends BaseDaoHibernate implements
		SegModuleDao {

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.security.SegModuleDao#getModules()
	 */
	public List<SegModule> getModules() {
		List<SegModule> moduleList = null;
		moduleList = (List<SegModule>)getHibernateTemplate().find("from SegModule order by MODULENAME");
		return moduleList;
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.security.SegModuleDao#saveModule(iresmas.persistence.entity.security.SegModule)
	 */
	public void saveModule(SegModule module) {
		getHibernateTemplate().saveOrUpdate(module);

	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.security.SegModuleDao#getChildList(iresmas.persistence.entity.security.SegModule)
	 */
	public List<SegModule> getChildList(SegModule moduleFather) {
		List<SegModule> listChilds = null;
		listChilds = (List<SegModule>)getHibernateTemplate().find("from SegModule where IDMODULEFATHER = ?", moduleFather);
		return listChilds;
	}

}
