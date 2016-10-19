package mx.edu.utng.tacho.manejador;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.edu.utng.tacho.datos.InstructorDAO;
import mx.edu.utng.tacho.datos.CursoDAO;
import mx.edu.utng.tacho.modelo.Instructor;
import mx.edu.utng.tacho.modelo.Curso;


@ManagedBean(name = "cursoBean")
@SessionScoped
public class CursoBean implements Serializable {
	
	private List<Curso> cursos;
	private Curso curso;
	private List<Instructor> instructores;
	
	public CursoBean() {
		curso = new Curso();
		curso.setInstructor(new Instructor());
	}

	
	

	public String listar() {
		CursoDAO dao = new CursoDAO();
		try {
			cursos = dao.getAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Cursos";
	}

	public String eliminar() {
		CursoDAO dao = new CursoDAO();
		try {
			dao.delete(curso);
			cursos = dao.getAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Eliminar";
	}
	public String agregar() {
		curso = new Curso();
		curso.setInstructor(new Instructor());
		try {
			instructores = new InstructorDAO().getAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Agregar";
	}
	public String guardar() {
		CursoDAO dao = new CursoDAO();
		try {
			if (curso.getId()!= 0) {
				dao.update(curso);
				
				
			} else {
				dao.insert(curso);
				
			}
			
			cursos = dao.getAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Guardar";
	}
	public String cancelar() {
		return "Cancelar";
	}
	public String editar(Curso curso) {
		this.curso = curso;
		try {
			instructores = new InstructorDAO().getAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Editar";
	}

	public List<Curso> getCursos() {
		return cursos;
	}


	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}


	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	public List<Instructor> getInstructores() {
		return instructores;
	}


	public void setInstructores(List<Instructor> instructores) {
		this.instructores = instructores;
	}

}