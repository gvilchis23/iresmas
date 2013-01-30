/**
 * 
 */
package iresmas.persistence.dao.hibernate.security;

import java.util.List;

import iresmas.persistence.dao.hibernate.BaseDaoHibernate;
import iresmas.persistence.dao.security.SegRoleDao;
import iresmas.persistence.entity.security.SegRole;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public class SegRoleDaoHibernate extends BaseDaoHibernate implements SegRoleDao {

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.security.SegRoleDao#getRole(java.lang.Integer)
	 */
	public SegRole getRole(Integer idIresmasRole) {
		return (SegRole)getHibernateTemplate().get(SegRole.class, idIresmasRole);
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.security.SegRoleDao#getRoles()
	 */
	public List<SegRole> getRoles() {
		List<SegRole> roleList = null;
		roleList = (List<SegRole>)getHibernateTemplate().find("from SegRole order by ROLENAME");
		return roleList;
	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.security.SegRoleDao#removeRole(java.lang.Integer)
	 */
	public void removeRole(Integer idIresmasRole) {
		SegRole role = getRole(idIresmasRole);
		getHibernateTemplate().delete(role);

	}

	/* (non-Javadoc)
	 * @see iresmas.persistence.dao.security.SegRoleDao#saveRole(iresmas.persistence.entity.security.SegRole)
	 */
	public void saveRole(SegRole role) {
		getHibernateTemplate().saveOrUpdate(role);

	}

}
