/**
 * 
 */
package ro.fiipractic.core.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ro.fiipractic.core.entity.Grupa;
//import ro.fiipractic.core.entity.Student;

/**
 * 
 * DAO implementation for {@link Grupa}.
 * 
 * @author CosminS
 *
 */
@Repository
@Transactional
public class GrupaDAOImpl implements GrupaDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ro.fiipractic.core.dao.GrupaDAO#create(ro.fiipractic.core.entity.Grupa)
	 */
	@Override
	public Grupa create(Grupa grupa) {
		getCurrentSession().save(grupa);
		return grupa;
	}

}