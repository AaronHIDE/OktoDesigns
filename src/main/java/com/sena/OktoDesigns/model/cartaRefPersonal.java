package com.sena.OktoDesigns.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity

public class cartaRefPersonal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String ciudad;
	private String fecha;
	private String nombre1;
	private String cedula1;
	private String expedicion1;
	private String nombre2;
	private String cedula2;
	private String expedicion2;
	private String tiempo;
	private String imgFirma;
	private String nombre3;
	private String cedula3;
	private String telefono;

	@ManyToOne
	private Usuario usuario;

	public cartaRefPersonal() {
		// TODO Auto-generated constructor stub
	}

	public cartaRefPersonal(Integer id, String ciudad, String fecha, String nombre1, String cedula1, String expedicion1,
			String nombre2, String cedula2, String expedicion2, String tiempo, String imgFirma, String nombre3,
			String cedula3, String telefono) {
		super();
		this.id = id;
		this.ciudad = ciudad;
		this.fecha = fecha;
		this.nombre1 = nombre1;
		this.cedula1 = cedula1;
		this.expedicion1 = expedicion1;
		this.nombre2 = nombre2;
		this.cedula2 = cedula2;
		this.expedicion2 = expedicion2;
		this.tiempo = tiempo;
		this.imgFirma = imgFirma;
		this.nombre3 = nombre3;
		this.cedula3 = cedula3;
		this.telefono = telefono;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getCedula1() {
		return cedula1;
	}

	public void setCedula1(String cedula1) {
		this.cedula1 = cedula1;
	}

	public String getExpedicion1() {
		return expedicion1;
	}

	public void setExpedicion1(String expedicion1) {
		this.expedicion1 = expedicion1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getCedula2() {
		return cedula2;
	}

	public void setCedula2(String cedula2) {
		this.cedula2 = cedula2;
	}

	public String getExpedicion2() {
		return expedicion2;
	}

	public void setExpedicion2(String expedicion2) {
		this.expedicion2 = expedicion2;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	public String getImgFirma() {
		return imgFirma;
	}

	public void setImgFirma(String imgFirma) {
		this.imgFirma = imgFirma;
	}

	public String getNombre3() {
		return nombre3;
	}

	public void setNombre3(String nombre3) {
		this.nombre3 = nombre3;
	}

	public String getCedula3() {
		return cedula3;
	}

	public void setCedula3(String cedula3) {
		this.cedula3 = cedula3;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "cartaRefPersonal [id=" + id + ", ciudad=" + ciudad + ", fecha=" + fecha + ", nombre1=" + nombre1
				+ ", cedula1=" + cedula1 + ", expedicion1=" + expedicion1 + ", nombre2=" + nombre2 + ", cedula2="
				+ cedula2 + ", expedicion2=" + expedicion2 + ", tiempo=" + tiempo + ", imgFirma=" + imgFirma
				+ ", nombre3=" + nombre3 + ", cedula3=" + cedula3 + ", telefono=" + telefono + "]";
	}

	public void setUsuario(Usuario u) {
		// TODO Auto-generated method stub
		
	}
}
