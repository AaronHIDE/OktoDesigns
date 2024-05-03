package com.sena.OktoDesigns.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Formato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre_completo;
	private String cargo;
	//Informacion Personal
	private String documento;
	private String telefono;
	private String email;
	private String direccion;
	//Experiencia Laboral
	private String experiencia;
	//Habilidades Personales y Laborales 
	private String habilidad;
	//Educacion o formacion academica
	private String educacion;
	//Referencias personales o laborales
	private String referencia ;
	//Contactos de las referencias
	private String telefono_referencia;

	public Formato() {
		// TODO Auto-generated constructor stub
	}

	public Formato(Integer id, String nombre_completo, String cargo, String documento, String telefono, String email,
			String direccion, String experiencia, String habilidad, String educacion, String referencia,
			String telefono_referencia) {
		super();
		this.id = id;
		this.nombre_completo = nombre_completo;
		this.cargo = cargo;
		this.documento = documento;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
		this.experiencia = experiencia;
		this.habilidad = habilidad;
		this.educacion = educacion;
		this.referencia = referencia;
		this.telefono_referencia = telefono_referencia;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public String getEducacion() {
		return educacion;
	}

	public void setEducacion(String educacion) {
		this.educacion = educacion;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getTelefono_referencia() {
		return telefono_referencia;
	}

	public void setTelefono_referencia(String telefono_referencia) {
		this.telefono_referencia = telefono_referencia;
	}

	@Override
	public String toString() {
		return "Formato [id=" + id + ", nombre_completo=" + nombre_completo + ", cargo=" + cargo + ", documento="
				+ documento + ", telefono=" + telefono + ", email=" + email + ", direccion=" + direccion
				+ ", experiencia=" + experiencia + ", habilidad=" + habilidad + ", educacion=" + educacion
				+ ", referencia=" + referencia + ", telefono_referencia=" + telefono_referencia + "]";
	}
	
}
