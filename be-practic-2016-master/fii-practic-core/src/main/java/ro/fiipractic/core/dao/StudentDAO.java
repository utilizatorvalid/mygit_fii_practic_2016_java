package ro.fiipractic.core.dao;

import ro.fiipractic.core.base.AbstractDAO;

import ro.fiipractic.core.entity.Student;

/**
 * DAO interface for {@link Student}.
 * 
 * @author CosminS
 *
 */
public interface StudentDAO extends AbstractDAO {

	/**
	 * Creates a group.
	 * 
	 * @param grupa
	 *            the group to be created.
	 * @return the created group.
	 */
	
	public Student create(Student stud);
}