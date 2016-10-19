package mx.edu.utng.tacho.datos;

import org.hibernate.HibernateException;
import mx.edu.utng.tacho.modelo.Curso;

public class CursoDAO extends DAO<Curso>{

	public CursoDAO() {
		super(new Curso());	
	}
	
	public Curso getOneById(Curso curso) throws HibernateException {
		return super.getOneById(curso.getId());
	}
}

