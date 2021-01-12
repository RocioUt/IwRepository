package org.vaadin.paul.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Especialidad {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "id")
	int id;
	@Column (name = "nombre", length = 128)
	String nombre;
	
	public Especialidad () {}
	
	public int getId_() {
		return id;
	}
	
	public String getNombre_() {
		return nombre;
	}
	
	public void setNombre_(String nombre_) {
		this.nombre = nombre_;
	}
}
