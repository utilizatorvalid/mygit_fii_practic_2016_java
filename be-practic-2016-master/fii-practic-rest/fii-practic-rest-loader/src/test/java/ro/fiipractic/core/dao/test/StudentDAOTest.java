package ro.fiipractic.core.dao.test;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ro.fiipractic.core.dao.GrupaDAO;
import ro.fiipractic.core.dao.StudentDAO;

import ro.fiipractic.core.entity.Student;

/**
 * JUnit test for {@link GrupaDAO}.
 * 
 * @author CosminS
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-config/spring-root.xml")
public class StudentDAOTest {

	@Autowired
	private StudentDAO studentDAO;
	

	/**
	 * Dummy test for checking the persistence.
	 */
	@Test
	public void testCreate() {
		Student student = new Student();
		
		
		
		student.setNume("GrozaVasile");
		//student.setAnStudiu(2);
		student.setMatricol("444");
		student.setId(1);
		System.out.println(student.getId());
		System.out.println(student.getNume());
		//System.out.println(student.getAnStudiu());
		System.out.println(student.getMatricol());
		
		student = studentDAO.create(student);
		
		assertNotNull(student.getId());
		
	}
}