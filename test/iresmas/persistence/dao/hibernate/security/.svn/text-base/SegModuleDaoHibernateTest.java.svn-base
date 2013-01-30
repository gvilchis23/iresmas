package iresmas.persistence.dao.hibernate.security;

import java.util.List;

import iresmas.persistence.dao.security.SegModuleDao;
import iresmas.persistence.entity.security.SegModule;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class SegModuleDaoHibernateTest extends TestCase {
	
	private SegModuleDao moduleDao;

	protected void setUp() throws Exception {
		super.setUp();
		ApplicationContext context = new ClassPathXmlApplicationContext("iresmas/persistence/dao/hibernate/applicationContext-hibernate.xml");
		moduleDao = (SegModuleDao)context.getBean("moduleDao");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		moduleDao = null;
	}

	public void testGetModules() {
		List<SegModule> childList = moduleDao.getModules();
		
		assertNotNull(childList);
	}

//	public void testSaveModule() {
//		SegModule module = new SegModule();
//		module.setModuleName("SECURITY");
//		module.setModuleFather(null);
//		module.setAccessPrivilege(1);
//		module.setAddPrivilege(1);
//		module.setDeletePrivilege(1);
//		module.setExecutePrivilege(1);
//		module.setModifyPrivilege(1);
//		module.setIdIresmasModule(1);
//		
//		
//		SegModule module1 = new SegModule();
//		module1.setModuleName("ROLE-PERMISION");
//		module1.setModuleFather(module);
//		module1.setAccessPrivilege(1);
//		module1.setAddPrivilege(1);
//		module1.setDeletePrivilege(1);
//		module1.setExecutePrivilege(1);
//		module1.setModifyPrivilege(1);
//		
//		moduleDao.saveModule(module1);
//		
//		assertNotNull(module1.getIdIresmasModule());
//	}

	public void testModuleChildList() {
		SegModule module = new SegModule();
		module.setModuleName("SECURITY");
		module.setModuleFather(null);
		module.setAccessPrivilege(1);
		module.setAddPrivilege(1);
		module.setDeletePrivilege(1);
		module.setExecutePrivilege(1);
		module.setModifyPrivilege(1);
		module.setIdIresmasModule(1);
		List<SegModule> childList = moduleDao.getChildList(module);
		
		assertNotNull(childList);
	}

}
