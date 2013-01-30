package iresmas.persistence.dao.hibernate.component.address;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import iresmas.persistence.dao.component.address.CaStateDao;
import iresmas.persistence.entity.component.address.CaCountry;
import iresmas.persistence.entity.component.address.CaState;
import junit.framework.TestCase;

public class CaStateDaoHibernateTest extends TestCase {
	
	private CaStateDao stateDao;

	protected void setUp() throws Exception {
		super.setUp();
		ApplicationContext context = new ClassPathXmlApplicationContext("iresmas/persistence/dao/hibernate/applicationContext-hibernate.xml");
		stateDao = (CaStateDao)context.getBean("stateDao");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		stateDao = null;
	}

//	public void testGetState() {
//		CaState state = null;
//		state = stateDao.getState(1);
//		assertNotNull(state);
//	}

//	public void testGetStates() {
//		List<CaState> stateList = null;
//		stateList = stateDao.getStates();
//		assertNotNull(stateList);
//	}

	public void testGetStatesByCountry() {
		CaCountry country = new CaCountry();
		country.setIdCountry(133);
		country.setCountryName("MEXICO");
		country.setLongKey("MEX");
		country.setShortKey("MX");
		country.setLocalName("MEXICO");
		List<CaState> list = stateDao.getStatesByCountry(country);
		assertNotNull(list);
	}

//	public void testRemoveState() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	public void testSaveState() {
//		fail("Not yet implemented"); // TODO
//	}

}
