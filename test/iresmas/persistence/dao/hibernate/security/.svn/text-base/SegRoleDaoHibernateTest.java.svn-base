package iresmas.persistence.dao.hibernate.security;

import iresmas.persistence.dao.security.SegModuleDao;
import iresmas.persistence.dao.security.SegRoleDao;
import iresmas.persistence.entity.security.SegModule;
import iresmas.persistence.entity.security.SegRole;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SegRoleDaoHibernateTest extends TestCase {
	
	private SegRoleDao roleDao;
	private SegModuleDao moduleDao;

	protected void setUp() throws Exception {
		super.setUp();
		ApplicationContext context = new ClassPathXmlApplicationContext("iresmas/persistence/dao/hibernate/applicationContext-hibernate.xml");
		roleDao = (SegRoleDao)context.getBean("roleDao");
		moduleDao = (SegModuleDao)context.getBean("moduleDao");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		roleDao = null;
		moduleDao = null;
	}

//	public void testGetRole() {
//		fail("Not yet implemented"); // TODO
//	}
//
	public void testGetRoles() {
		List<SegRole> rolelist = null;
		rolelist = roleDao.getRoles();
		
		assertNotNull(rolelist);
	}
//
//	public void testRemoveRole() {
//		fail("Not yet implemented"); // TODO
//	}

//	public void testSaveRole() {
//		List<SegModule> modules = moduleDao.getModules();
//		SegRole role = new SegRole();
//		role.setRoleDescription("ADMINISTRADOR");
//		role.setRoleName("ADMINISTRADOR");
//		Set<SegModule> setmodules = new HashSet<SegModule>();
//		
//		for (SegModule segModule : modules) {
//			setmodules.add(segModule);
//		}
//		role.setModules(setmodules);
//		
//		roleDao.saveObject(role);
//		
//		assertNotNull(role.getIdIresmasRole());
//	}

}
