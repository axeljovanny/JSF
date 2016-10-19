package mx.edu.utng.tacho.manejador;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import mx.edu.utng.tacho.datos.InstructorDAO;
import mx.edu.utng.tacho.modelo.Instructor;
import mx.edu.utng.tacho.modelo.Curso;


@ManagedBean
@SessionScoped
public class InstructorBean implements Serializable {
	private List<Instructor> instructores;
	private Instructor instructor;
	
	
	
	public InstructorBean() {
		instructor = new Instructor(); 
	}

    public List<Instructor> getInstructores() {
        return instructores;
    }

    public void setInstructores(List<Instructor> instructores) {
        this.instructores = instructores;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
	

	public String listar(){
		InstructorDAO dao = new InstructorDAO();
		try {
			instructores = dao.getAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Instructores";
	}
	
	public String eliminar(){
		InstructorDAO dao = new InstructorDAO();
		try {
			dao.delete(instructor);
			instructores = dao.getAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Eliminar";
	}
	
	public String agregar(){
		instructor = new Instructor();
		try{
			instructores = new InstructorDAO().getAll();
		} catch (Exception e){
			e.printStackTrace();
		}
		return "Agregar";
	}
	
	public String guardar(){
		InstructorDAO dao = new InstructorDAO();
		try {
			if (instructor.getId()!= 0) {
				dao.update(instructor);
			} else {
				dao.insert(instructor);
			}
			instructores = dao.getAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Guardar";
	}
	
	public String cancelar(){
		return "Cancelar";
	}
	
	public String editar(Instructor instructor){
		this.instructor = instructor;
		return "Editar";
	}
	
	
}
