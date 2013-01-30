/**
 * 
 */
package iresmas.persistence.dao.hibernate.security;

import iresmas.persistence.dao.hibernate.BaseDaoHibernate;
import iresmas.persistence.dao.security.SegUserDao;
import iresmas.persistence.entity.security.SegUser;

import java.util.List;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public class SegUserDaoHibernate extends BaseDaoHibernate implements SegUserDao {

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.security.SegUserDao#getUser(java.lang.Integer)
	 */
	public SegUser getUser(Integer idUser) {
		return (SegUser) getHibernateTemplate().get(SegUser.class, idUser);
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.security.SegUserDao#removeUser(java.lang.Integer)
	 */
	public void removeUser(Integer idUser) {
		SegUser user = getUser(idUser);
		getHibernateTemplate().delete(user);
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.security.SegUserDao#saveUser(iresmas.persistence.entity.security.SegUser)
	 */
	public void saveUser(SegUser user) {
		getHibernateTemplate().saveOrUpdate(user);
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.security.SegUserDao#getUsers()
	 */
	public List<SegUser> getUsers() {
		List<SegUser> userList = null;
		userList = (List<SegUser>)getHibernateTemplate().find("from SegUser order by FIRSTNAME");
		return userList;
	}

	public SegUser getUserByName(String userName, String password) {
		SegUser user = null;
//		userCrit.setUserName(userName);
//		userCrit.setPassword(password);
		List<SegUser> userlist = (List<SegUser>)getHibernateTemplate().find("from SegUser user where USERNAME=?",userName);
//		Object[] o = {userName,password};
//		SegUser user = (SegUser)getHibernateTemplate().find("from SegUser where USERNAME=? and PASSWORD=?" , o);
		if (!userlist.isEmpty()) {
			for (SegUser segUser : userlist) {
				user = segUser;
			}
		}
		return user;
	}

}
