package com.sena.OktoDesigns.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

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
	private String experiencia1;
	private String experiencia2;
	private String experiencia3;
	private String experiencia4;
	//Habilidades Personales y Laborales 
	private String habilidad1;
	private String habilidad2;
	private String habilidad3;
	private String habilidad4;
	//Educacion o formacion academica
	private String educacion1;
	private String educacion2;
	private String educacion3;
	private String educacion4;
	//Referencias personales o laborales
	private String referencia1;
	private String referencia2;
	private String referencia3;
	private String referencia4;
	//Contactos de las referencias
	private String telefono_referencia1;
	private String telefono_referencia2;
	private String telefono_referencia3;
	private String telefono_referencia4;

	@ManyToOne
	private Usuario usuario;
	
	public Formato() {
		// TODO Auto-generated constructor stub
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

	public String getExperiencia1() {
		return experiencia1;
	}

	public void setExperiencia1(String experiencia1) {
		this.experiencia1 = experiencia1;
	}

	public String getExperiencia2() {
		return experiencia2;
	}

	public void setExperiencia2(String experiencia2) {
		this.experiencia2 = experiencia2;
	}

	public String getExperiencia3() {
		return experiencia3;
	}

	public void setExperiencia3(String experiencia3) {
		this.experiencia3 = experiencia3;
	}

	public String getExperiencia4() {
		return experiencia4;
	}

	public void setExperiencia4(String experiencia4) {
		this.experiencia4 = experiencia4;
	}

	public String getHabilidad1() {
		return habilidad1;
	}

	public void setHabilidad1(String habilidad1) {
		this.habilidad1 = habilidad1;
	}

	public String getHabilidad2() {
		return habilidad2;
	}

	public void setHabilidad2(String habilidad2) {
		this.habilidad2 = habilidad2;
	}

	public String getHabilidad3() {
		return habilidad3;
	}

	public void setHabilidad3(String habilidad3) {
		this.habilidad3 = habilidad3;
	}

	public String getHabilidad4() {
		return habilidad4;
	}

	public void setHabilidad4(String habilidad4) {
		this.habilidad4 = habilidad4;
	}

	public String getEducacion1() {
		return educacion1;
	}

	public void setEducacion1(String educacion1) {
		this.educacion1 = educacion1;
	}

	public String getEducacion2() {
		return educacion2;
	}

	public void setEducacion2(String educacion2) {
		this.educacion2 = educacion2;
	}

	public String getEducacion3() {
		return educacion3;
	}

	public void setEducacion3(String educacion3) {
		this.educacion3 = educacion3;
	}

	public String getEducacion4() {
		return educacion4;
	}

	public void setEducacion4(String educacion4) {
		this.educacion4 = educacion4;
	}

	public String getReferencia1() {
		return referencia1;
	}

	public void setReferencia1(String referencia1) {
		this.referencia1 = referencia1;
	}

	public String getReferencia2() {
		return referencia2;
	}

	public void setReferencia2(String referencia2) {
		this.referencia2 = referencia2;
	}

	public String getReferencia3() {
		return referencia3;
	}

	public void setReferencia3(String referencia3) {
		this.referencia3 = referencia3;
	}

	public String getReferencia4() {
		return referencia4;
	}

	public void setReferencia4(String referencia4) {
		this.referencia4 = referencia4;
	}

	public String getTelefono_referencia1() {
		return telefono_referencia1;
	}

	public void setTelefono_referencia1(String telefono_referencia1) {
		this.telefono_referencia1 = telefono_referencia1;
	}

	public String getTelefono_referencia2() {
		return telefono_referencia2;
	}

	public void setTelefono_referencia2(String telefono_referencia2) {
		this.telefono_referencia2 = telefono_referencia2;
	}

	public String getTelefono_referencia3() {
		return telefono_referencia3;
	}

	public void setTelefono_referencia3(String telefono_referencia3) {
		this.telefono_referencia3 = telefono_referencia3;
	}

	public String getTelefono_referencia4() {
		return telefono_referencia4;
	}

	public void setTelefono_referencia4(String telefono_referencia4) {
		this.telefono_referencia4 = telefono_referencia4;
	}

	public Formato(Integer id, String nombre_completo, String cargo, String documento, String telefono, String email,
			String direccion, String experiencia1, String experiencia2, String experiencia3, String experiencia4,
			String habilidad1, String habilidad2, String habilidad3, String habilidad4, String educacion1,
			String educacion2, String educacion3, String educacion4, String referencia1, String referencia2,
			String referencia3, String referencia4, String telefono_referencia1, String telefono_referencia2,
			String telefono_referencia3, String telefono_referencia4) {
		super();
		this.id = id;
		this.nombre_completo = nombre_completo;
		this.cargo = cargo;
		this.documento = documento;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
		this.experiencia1 = experiencia1;
		this.experiencia2 = experiencia2;
		this.experiencia3 = experiencia3;
		this.experiencia4 = experiencia4;
		this.habilidad1 = habilidad1;
		this.habilidad2 = habilidad2;
		this.habilidad3 = habilidad3;
		this.habilidad4 = habilidad4;
		this.educacion1 = educacion1;
		this.educacion2 = educacion2;
		this.educacion3 = educacion3;
		this.educacion4 = educacion4;
		this.referencia1 = referencia1;
		this.referencia2 = referencia2;
		this.referencia3 = referencia3;
		this.referencia4 = referencia4;
		this.telefono_referencia1 = telefono_referencia1;
		this.telefono_referencia2 = telefono_referencia2;
		this.telefono_referencia3 = telefono_referencia3;
		this.telefono_referencia4 = telefono_referencia4;
	}

	@Override
	public String toString() {
		return "Formato [id=" + id + ", nombre_completo=" + nombre_completo + ", cargo=" + cargo + ", documento="
				+ documento + ", telefono=" + telefono + ", email=" + email + ", direccion=" + direccion
				+ ", experiencia1=" + experiencia1 + ", experiencia2=" + experiencia2 + ", experiencia3=" + experiencia3
				+ ", experiencia4=" + experiencia4 + ", habilidad1=" + habilidad1 + ", habilidad2=" + habilidad2
				+ ", habilidad3=" + habilidad3 + ", habilidad4=" + habilidad4 + ", educacion1=" + educacion1
				+ ", educacion2=" + educacion2 + ", educacion3=" + educacion3 + ", educacion4=" + educacion4
				+ ", referencia1=" + referencia1 + ", referencia2=" + referencia2 + ", referencia3=" + referencia3
				+ ", referencia4=" + referencia4 + ", telefono_referencia1=" + telefono_referencia1
				+ ", telefono_referencia2=" + telefono_referencia2 + ", telefono_referencia3=" + telefono_referencia3
				+ ", telefono_referencia4=" + telefono_referencia4 + "]";
	}

	public void setUsuario(Usuario u) {
		// TODO Auto-generated method stub
		
	}

	
	
}
