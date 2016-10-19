package mx.edu.utng.tacho.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name="instructor")
public class Instructor implements Serializable {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="instructor")
	private long idInstructor;
	
	@Column(length=40)
	private String nombre;
	
	@Column(length=40)
	private String especialidad;
	
	private int sueldo;
	
	@Column (length=40)
	private String nacionalidad;
	
	
public Instructor() {
		idInstructor = 0L;
	}


public long getId() {
	return idInstructor;
}


public void setId(long id) {
	this.idInstructor = id;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getEspecialidad() {
	return especialidad;
}


public void setEspecialidad(String especialidad) {
	this.especialidad = especialidad;
}


public int getSueldo() {
	return sueldo;
}


public void setSueldo(int sueldo) {
	this.sueldo = sueldo;
}


public String getNacionalidad() {
	return nacionalidad;
}


public void setNacionalidad(String nacionalidad) {
	this.nacionalidad = nacionalidad;
}






	
}
