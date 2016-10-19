package mx.edu.utng.tacho.datos;

import org.hibernate.HibernateException;

import mx.edu.utng.tacho.modelo.Instructor;


public class InstructorDAO extends DAO<Instructor> {
	public InstructorDAO() {
		super(new Instructor());	
	}
	
	public Instructor getOneById(Instructor instructor) throws HibernateException {
		return super.getOneById(instructor.getId());
	}
}
