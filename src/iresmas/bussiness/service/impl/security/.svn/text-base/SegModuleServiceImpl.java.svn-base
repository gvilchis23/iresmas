/**
 * 
 */
package iresmas.bussiness.service.impl.security;

import java.util.List;

import iresmas.bussiness.service.definition.security.SegModuleService;
import iresmas.bussiness.service.impl.BaseService;
import iresmas.persistence.dao.security.SegModuleDao;
import iresmas.persistence.entity.security.SegModule;

/**
 * Implementa los metodos definidos por la interfaz que implementa.
 * @author Cristopher Cerrillo Callejas
 *
 */
public class SegModuleServiceImpl extends BaseService implements
		SegModuleService {
	
	private SegModuleDao moduleDao;
	
	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.secirity.SegModuleService#setModuleDao(iresmas.persistence.dao.security.SegModuleDao)
	 */
	public void setModuleDao(SegModuleDao moduleDao) {
		this.moduleDao = moduleDao;
	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.secirity.SegModuleService#getChildList(iresmas.persistence.entity.security.SegModule)
	 */
	public List<SegModule> getChildList(SegModule moduleFather) {
		List<SegModule> moduleList = null;
		moduleList = moduleDao.getChildList(moduleFather);
		return moduleList;
	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.secirity.SegModuleService#getModules()
	 */
	public List<SegModule> getModules() {
		List<SegModule> moduleList = null;
		moduleList = moduleDao.getModules();
		return moduleList;
	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.secirity.SegModuleService#saveModule(iresmas.persistence.entity.security.SegModule)
	 */
	public void saveModule(SegModule module) {
		moduleDao.saveModule(module);

	}

	

}
