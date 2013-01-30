package iresmas.bussiness.service.impl.security;

import iresmas.bussiness.service.definition.security.SegUserService;
import iresmas.bussiness.service.exception.UserExistException;
import iresmas.persistence.entity.ComCatalog;
import iresmas.persistence.entity.component.address.CaAddress;
import iresmas.persistence.entity.component.address.CaCity;
import iresmas.persistence.entity.component.address.CaCountry;
import iresmas.persistence.entity.component.address.CaState;
import iresmas.persistence.entity.security.SegRole;
import iresmas.persistence.entity.security.SegUser;

import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SegUserServiceImplTest extends TestCase {
	
	private SegUserService userService;

	protected void setUp() throws Exception {
		super.setUp();
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"iresmas/bussiness/service/definition/applicationContext-service.xml",
				"iresmas/persistence/dao/hibernate/applicationContext-hibernate.xml"});
		userService = (SegUserService)context.getBean("userService");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		userService = null;
	}

//	public void testSerUserDao() {
//		fail("Not yet implemented"); // TODO
//	}

//	public void testGetUser() {
//		fail("Not yet implemented"); // TODO
//	}
//
	public void testGetUsers() {
		List<SegUser> userList = userService.getUsers();
		System.out.println(userList.size());
		assertNotNull(userList);
	}
//
//	public void testRemoveUser() {
//		fail("Not yet implemented"); // TODO
//	}

//	public void testSaveUser() throws UserExistException{
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
//		state.setIdState(9);
//		state.setStateName("DISTRITO FEDERAL");
//		
//		city.setCityName("CIUDAD DE MEXICO");
//		city.setIdCity(101);
//		city.setIdState(9);
//		
//		CaAddress address = new CaAddress();
//		address.setCountry(country);
//		address.setState(state);
//		address.setCity(city);
//		address.setExternalNumber("61");
//		address.setStreetName("ORIENTE 221");
//		address.setInternalNumber(null);
//		address.setZipNumber("08500");
//		
//		SegUser user = new SegUser();
//		user.setAddress(address);
//		user.setBirthDay(new Date());
//		user.setCelNumber("5527372554");
//		user.setChangeStatusDate(new Date());
//		user.setCurp("MEMO830523HDFRLR06");
//		user.setEmployeeEmail("guillermo_vilchis@pslcorp.com");
//		user.setEndVigency(new Date());
//		user.setEntryDate(new Date());
//		user.setFirstName("GUILLERMO");
//		user.setIdArea(1);
//		user.setLastName("VILCHIS");
//		user.setLastSessionDate(new Date());
//		user.setNss("12345654324");
//		user.setPassword("memo");
//		user.setPersonalEmail("guillermo_vilchis@pslcorp.com");
//		user.setPersonalPhoneNumber("22353812");
//		user.setRfc("MEMO830523SC1");
//		
//		SegRole role = new SegRole();
//		role.setIdIresmasRole(1);
//		user.setRole(role);
//		user.setSex(1);
//		user.setStartVigency(new Date());
//		ComCatalog catalog = new ComCatalog();
//		catalog.setIdComCatalog(2);
//		user.setSupervisor(null);
//		user.setStatusUser(catalog);
//		user.setUserName("memo");
//		
//		userService.saveUser(user);
//		
//		assertNotNull(user.getIdEmployee());
//		
//	}

}
