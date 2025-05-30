package com.sena.OktoDesigns.controller.dto;

public class UsuarioRegistroDTO {
	private Integer id;
    private String nombre;
    private String email;
    private String password;
    // Otros atributos si es necesario
    
    //GETTERS AND SETTERS
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//Constructor
	public UsuarioRegistroDTO(Integer id, String nombre, String email, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.password = password;
	}
    
	//Constructor Vacío
    public UsuarioRegistroDTO() {
    }
    
}
