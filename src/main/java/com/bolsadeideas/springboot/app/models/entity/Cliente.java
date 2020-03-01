package com.bolsadeideas.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "clientes")
//siempre se importa de javax.persistence
//por nomenclatura tiene que escribirse en plural y minúscula. En el table se indica el nombre de la tabla que se mapea.
//los Entity implementan la interfaz Serializable ya que van a persistirse y para ello se hace una transferencia en bytes.
//Se trabaja con serialización: el proceso mediante el cual se transforma un objeto en una secuencia de bytes para almacenarlo 
//o transmitirlo a la memoria o base de datos o json o xml o cuando trabajamos con sesiones HTTP.
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	// el Long con mayúscula, de referencia de una clase. Nos permite trabajar con
	// conversiones de tipo (???)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// si el nombre del atributo es igual al nombre del campo de la tabla, no es
	// necesario indicar el name.
	@Column(name = "name")
	private String nombre;

	@Column(name = "surname")
	private String apellido;

	private String email;

	// la clase Date tiene que ser de java.util
	@Column(name = "created_at")
	@Temporal(TemporalType.DATE) // indica el formato en que se va a guardar en la tabla de la base de datos
	private Date createdAt;

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
