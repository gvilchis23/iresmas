/**
 * 
 */
package iresmas.persistence.dao.hibernate.component.address;

import iresmas.persistence.dao.component.address.CaCountryDao;
import iresmas.persistence.entity.component.address.CaCountry;

import java.util.List;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ciuter
 *
 */
public class CaCountryDaoHibernateTest extends TestCase {
	
	private CaCountryDao dao;

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		ApplicationContext context = new ClassPathXmlApplicationContext("iresmas/persistence/dao/hibernate/applicationContext-hibernate.xml");
		dao = (CaCountryDao)context.getBean("countryDao");
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		dao = null;
	}

	public void testGetCountries(){
		List<CaCountry> list = null;
		list = dao.getCountries();
		assertNotNull(list);
		
	}
	
}
