package iresmas.persistence.dao.hibernate.security;

import iresmas.persistence.dao.ComCatalogDao;
import iresmas.persistence.dao.security.SegRoleDao;
import iresmas.persistence.dao.security.SegUserDao;
import iresmas.persistence.entity.component.address.CaAddress;
import iresmas.persistence.entity.component.address.CaCity;
import iresmas.persistence.entity.component.address.CaCountry;
import iresmas.persistence.entity.component.address.CaState;
import iresmas.persistence.entity.security.SegRole;
import iresmas.persistence.entity.security.SegUser;

import java.util.Date;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SegUserDaoHibernateTest extends TestCase {
	
	private SegUserDao userDao;
	private SegRoleDao roleDao;
	private ComCatalogDao catalogDao;

	protected void setUp() throws Exception {
		super.setUp();
		ApplicationContext context = new ClassPathXmlApplicationContext("iresmas/persistence/dao/hibernate/applicationContext-hibernate.xml");
		userDao = (SegUserDao)context.getBean("userDao");
		roleDao = (SegRoleDao)context.getBean("roleDao");
		catalogDao = (ComCatalogDao)context.getBean("comCatalogDao");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		userDao = null;
	}

	public void testGetUser() {
		SegUser user = userDao.getUser(1);
		
		assertNotNull(user);
	}
//
//	public void testRemoveUser() {
//		fail("Not yet implemented"); // TODO
//	}

//	public void testSaveUser() {
//		SegUser user = new SegUser();
//	
//		//DOMICILIO
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
//		address.setIdAddress(1);
//		
//		user.setAddress(address);
//		user.setBirthDay(new Date());
//		user.setCelNumber("1234567890");
//		user.setChangeStatusDate(new Date());
//		user.setCurp("ASDF890807HDFSS09");
//		user.setEmployeeEmail("employee@email.com");
//		user.setEndVigency(new Date());
//		user.setEntryDate(new Date());
//		user.setFirstName("RUBEN");
//		user.setIdArea(1);
//		user.setLastName("ARIZONA");
//		user.setLastSessionDate(new Date());
//		user.setNss("12345678901");
//		user.setPassword("user");
//		user.setPersonalEmail("personal@email.com");
//		user.setPersonalPhoneNumber("1234567890");
//		user.setRfc("ASDF890807");
//		
//		SegRole role = roleDao.getRole(1);
//		user.setRole(role);
//		user.setSex(1);
//		user.setStartVigency(new Date());
//		user.setStatusEmployee(catalogDao.getCatalog(2));
//		user.setSupervisor(null);
//		user.setUserName("user");
//		
//		userDao.saveUser(user);
//		
//		assertNotNull(user.getIdEmployee());
//		
//		
//	}

//	public void testGetUsers() {
//		fail("Not yet implemented"); // TODO
//	}

}
