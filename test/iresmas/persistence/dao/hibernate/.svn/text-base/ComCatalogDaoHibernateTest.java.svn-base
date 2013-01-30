package iresmas.persistence.dao.hibernate;

import iresmas.persistence.dao.ComCatalogDao;
import iresmas.persistence.entity.ComCatalog;
import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComCatalogDaoHibernateTest extends TestCase {
	
	private ComCatalogDao comCatalogDao;

	protected void setUp() throws Exception {
		super.setUp();
		ApplicationContext context = new ClassPathXmlApplicationContext("iresmas/persistence/dao/hibernate/applicationContext-hibernate.xml");
		comCatalogDao = (ComCatalogDao)context.getBean("comCatalogDao");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		comCatalogDao = null;
		
	}

//	public void testSaveCatalog() {
//		ComCatalog catalog = new ComCatalog();
//		catalog.setCatalogName("TEST");
////		catalog.setIdCatalogFather(null);
//		catalog.setCatalogChildrens(null);
//		catalog.setLongDescription("TEST");
//		catalog.setShortDescription("TEST");
//		catalog.setStatusCatalog(1);
//		
//		comCatalogDao.saveCatalog(catalog);
//		assertNotNull(catalog.getIdComCatalog());
//	}
//	public void testGetCatalog() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	public void testGetCatalogChildrens() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	public void testGetCatalogs() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	public void testRemoveCatalog() {
//		fail("Not yet implemented"); // TODO
//	}

	

}
