/**
 * 
 */
package iresmas.bussiness.service.impl.security;

import iresmas.bussiness.service.definition.security.SegUserService;
import iresmas.bussiness.service.exception.UserExistException;
import iresmas.bussiness.service.impl.BaseService;
import iresmas.bussiness.service.util.BussinesConstants;
import iresmas.bussiness.service.util.StringUtil;
import iresmas.persistence.dao.component.address.CaAddressDao;
import iresmas.persistence.dao.security.SegUserDao;
import iresmas.persistence.entity.security.SegUser;

import java.util.List;

import org.springframework.dao.DataIntegrityViolationException;

/**
 * Implementa los metodos definidos por la interfaz que implementa.
 * @author Cristopher Cerrillo Callejas
 *
 */
public class SegUserServiceImpl extends BaseService implements SegUserService {
	
	private SegUserDao userDao;	
	private CaAddressDao addressDao;
	
	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.secirity.SegUserService#serUserDao(iresmas.persistence.dao.security.SegUserDao)
	 */
	public void setUserDao(SegUserDao userDao) {
		this.userDao = userDao;
	}
	
	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.secirity.SegUserService#setAddressDao(iresmas.persistence.dao.component.address.CaAddressDao)
	 */
	public void setAddressDao(CaAddressDao addressDao){
		this.addressDao = addressDao;
	}
	
	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.secirity.SegUserService#getUser(java.lang.Integer)
	 */
	public SegUser getUser(Integer idUser) {
		SegUser user = userDao.getUser(idUser);
		return user;
	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.secirity.SegUserService#getUsers()
	 */
	public List<SegUser> getUsers() {
		List<SegUser> userList = userDao.getUsers();
		return userList;
	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.secirity.SegUserService#removeUser(java.lang.Integer)
	 */
	public void removeUser(Integer idUser) {
		if (log.isDebugEnabled()) {
            log.debug("removing user: " + idUser);
        }
		userDao.removeUser(idUser);

	}

	/* (non-Javadoc)
	 * @see iresmas.bussiness.service.definition.secirity.SegUserService#saveUser(iresmas.persistence.entity.security.SegUser)
	 */
	public void saveUser(SegUser user) throws UserExistException {
		try {
			addressDao.saveAddress(user.getAddress());
			String password = user.getPassword();
			user.setPassword(StringUtil.encodePassword(password, BussinesConstants.ENC_ALGORITHM));
            userDao.saveUser(user);
        } catch (DataIntegrityViolationException e) {
            throw new UserExistException("User '" + user.getUserName() + "' already exists!");
        }

	}

	public String loginService(String userName, String password) {
		String passwordEctr = StringUtil.encodePassword(password, BussinesConstants.ENC_ALGORITHM);
		SegUser user = userDao.getUserByName(userName, passwordEctr);
		if (user.getUserName().equals(userName) & user.getPassword().equals(passwordEctr)) {
			return "access";
		} else {
			return "nelputo";
		}
		
	}
	
	

}
