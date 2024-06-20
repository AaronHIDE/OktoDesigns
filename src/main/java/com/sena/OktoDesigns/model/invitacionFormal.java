package com.sena.OktoDesigns.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class invitacionFormal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String rolydepartamento;
	private String empresa;
	private String asunto;
	private String ciudad_fecha;
	private String destinatario;
	private String evento;
	private String fecha_evento;
	private String ubicacion;
	private String area;
	private String fecha_limite;
	private String nombre2;
	private String cargo;
	private String info;
	
	@ManyToOne
	private Usuario usuario;
	
public invitacionFormal() {
	// TODO Auto-generated constructor stub
}

public invitacionFormal(Integer id, String nombre, String rolydepartamento, String empresa, String asunto,
		String ciudad_fecha, String destinatario, String evento, String fecha_evento, String ubicacion, String area,
		String fecha_limite, String nombre2, String cargo, String info) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.rolydepartamento = rolydepartamento;
	this.empresa = empresa;
	this.asunto = asunto;
	this.ciudad_fecha = ciudad_fecha;
	this.destinatario = destinatario;
	this.evento = evento;
	this.fecha_evento = fecha_evento;
	this.ubicacion = ubicacion;
	this.area = area;
	this.fecha_limite = fecha_limite;
	this.nombre2 = nombre2;
	this.cargo = cargo;
	this.info = info;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getRolydepartamento() {
	return rolydepartamento;
}

public void setRolydepartamento(String rolydepartamento) {
	this.rolydepartamento = rolydepartamento;
}

public String getEmpresa() {
	return empresa;
}

public void setEmpresa(String empresa) {
	this.empresa = empresa;
}

public String getAsunto() {
	return asunto;
}

public void setAsunto(String asunto) {
	this.asunto = asunto;
}

public String getCiudad_fecha() {
	return ciudad_fecha;
}

public void setCiudad_fecha(String ciudad_fecha) {
	this.ciudad_fecha = ciudad_fecha;
}

public String getDestinatario() {
	return destinatario;
}

public void setDestinatario(String destinatario) {
	this.destinatario = destinatario;
}

public String getEvento() {
	return evento;
}

public void setEvento(String evento) {
	this.evento = evento;
}

public String getFecha_evento() {
	return fecha_evento;
}

public void setFecha_evento(String fecha_evento) {
	this.fecha_evento = fecha_evento;
}

public String getUbicacion() {
	return ubicacion;
}

public void setUbicacion(String ubicacion) {
	this.ubicacion = ubicacion;
}

public String getArea() {
	return area;
}

public void setArea(String area) {
	this.area = area;
}

public String getFecha_limite() {
	return fecha_limite;
}

public void setFecha_limite(String fecha_limite) {
	this.fecha_limite = fecha_limite;
}

public String getNombre2() {
	return nombre2;
}

public void setNombre2(String nombre2) {
	this.nombre2 = nombre2;
}

public String getCargo() {
	return cargo;
}

public void setCargo(String cargo) {
	this.cargo = cargo;
}

public String getInfo() {
	return info;
}

public void setInfo(String info) {
	this.info = info;
}

@Override
public String toString() {
	return "invitacionFormal [id=" + id + ", nombre=" + nombre + ", rolydepartamento=" + rolydepartamento + ", empresa="
			+ empresa + ", asunto=" + asunto + ", ciudad_fecha=" + ciudad_fecha + ", destinatario=" + destinatario
			+ ", evento=" + evento + ", fecha_evento=" + fecha_evento + ", ubicacion=" + ubicacion + ", area=" + area
			+ ", fecha_limite=" + fecha_limite + ", nombre2=" + nombre2 + ", cargo=" + cargo + ", info=" + info + "]";
}


}


