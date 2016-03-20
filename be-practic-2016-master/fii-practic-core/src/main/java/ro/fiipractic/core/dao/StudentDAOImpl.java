
package ro.fiipractic.core.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import ro.fiipractic.core.entity.Student;

/**
 * 
 * DAO implementation for {@link Student}.
 * 
 * @author CosminS
 *
 */
@Repository
@Transactional
public class StudentDAOImpl implements StudentDAO {

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
	 * ro.fiipractic.core.dao.StudentDAO#create(ro.fiipractic.core.entity.Student)
	 */


	@Override
	public Student create(Student student) {
		
		getCurrentSession().save(student);
		return student;
	}
}