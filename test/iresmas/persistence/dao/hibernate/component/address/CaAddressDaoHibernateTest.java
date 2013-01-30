package iresmas.persistence.dao.hibernate.component.address;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import iresmas.persistence.dao.component.address.CaAddressDao;
import iresmas.persistence.entity.component.address.CaAddress;
import iresmas.persistence.entity.component.address.CaCity;
import iresmas.persistence.entity.component.address.CaCountry;
import iresmas.persistence.entity.component.address.CaState;
import junit.framework.TestCase;

public class CaAddressDaoHibernateTest extends TestCase {
	
	private CaAddressDao addressDao;

	protected void setUp() throws Exception {
		super.setUp();
		ApplicationContext context = new ClassPathXmlApplicationContext("iresmas/persistence/dao/hibernate/applicationContext-hibernate.xml");
		addressDao = (CaAddressDao)context.getBean("addressDao");
	}

//	protected void tearDown() throws Exception {
//		super.tearDown();
//		addressDao = null;
//	}
//
	public void testGetAddress() {
		CaAddress address = addressDao.getAddress(1);
		assertNotNull(address);
	}
//
//	public void testRemoveAddress() {
//		fail("Not yet implemented"); // TODO
//	}

//	public void testSaveAddress() {
//		CaCountry country = new CaCountry();
//		CaState state = new CaState();
//		CaCity city = new CaCity();
//		
//		country.setIdCountry(133);
//		country.setCountryName("MEXICO");
//		country.setLocalName("MEXICO");
//		country.setShortKey("MX");
//		country.setLongKey("MEX");
//		
//		state.setIdCountry(133);
//		state.setIdState(1);
//		state.setStateName("AGUASCALIENTES");
//		
//		city.setCityName("AGUASCALIENTES");
//		city.setIdCity(1);
//		city.setIdState(1);
//		
//		CaAddress address = new CaAddress();
//		address.setCity(city);
//		address.setCountry(country);
//		address.setState(state);
//		address.setExternalNumber("1");
//		address.setStreetName("ADMINISTRADOR");
//		address.setInternalNumber("A");
//		address.setZipNumber("09878");
//		
//		addressDao.saveAddress(address);
//		
//		assertNotNull(address.getIdAddress());
//	}

}
