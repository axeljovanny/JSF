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

@Entity
@Table(name="curso")
public class Curso implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_curso")
	private Long id;
	
	@Column(length=30)
	private String nombre;
	
	@Column(length=30)
	private String lugar;
	
	
	private int horario;
	
	@Column(length=30)
	private String categoria;
	
	@ManyToOne
	@JoinColumn(name="id_instructor")
	private Instructor instructor;
	

	 public Curso() {
		id = 0l;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getLugar() {
		return lugar;
	}


	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	public int getHorario() {
		return horario;
	}


	public void setHorario(int horario) {
		this.horario = horario;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public Instructor getInstructor() {
		return instructor;
	}


	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	
}
