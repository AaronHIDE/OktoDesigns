package com.sena.OktoDesigns.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "formatoSena")
public class FormatoSena {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre_completo;
	private String documento;
	private String fecha_nacimiento;
	private String edad;
	private String telefono_aprendiz;
	private String email_soysena;
	private String libreta_militar;
	private String direccion;
	private String estrato;
	private String ciudad;
	private String titulo_obtenido;
	private String institucion_educativa;
	private String fecha_grado;
	private String nivel;
	private String nombre_estudios;
	private String institucion_educativa2;
	private String semestres_aprobados;
	private String nombre_programa;
	private String ficha;
	private String perfil;
	private String ocupaciones;
	private String centro_formacion;
	private String ciudad_formacion;
	private String fecha_inicio;
	private String fecha_final;
	private String etapa;
	private String coordinador_academico;
	private String telefono_coordinador;
	private String email_coordinador;
	private String fecha_diligenciamiento;
	private String firma_aprendiz;
	private String funcionario;
	private String telefono_funcionario;
	private String email_funcionario;
	private String nit;
	private String centro_formacion1;
	private String representante_legal;
	private String email_representante;
	private String telefono_representante;
	private String empresa;
	private String telefono_empresa;
	private String funcionario_empresa;
	private String observaciones;
	private String fecha_diligenciamiento1;
	private String firma;

	@ManyToOne
	private Usuario usuario;

	public FormatoSena() {
		// TODO Auto-generated constructor stub
	}

	public FormatoSena(Integer id, String nombre_completo, String documento, String fecha_nacimiento, String edad,
			String telefono_aprendiz, String email_soysena, String libreta_militar, String direccion, String estrato,
			String ciudad, String titulo_obtenido, String institucion_educativa, String fecha_grado, String nivel,
			String nombre_estudios, String institucion_educativa2, String semestres_aprobados, String nombre_programa,
			String ficha, String perfil, String ocupaciones, String centro_formacion, String ciudad_formacion,
			String fecha_inicio, String fecha_final, String etapa, String coordinador_academico,
			String telefono_coordinador, String email_coordinador, String fecha_diligenciamiento, String firma_aprendiz,
			String funcionario, String telefono_funcionario, String email_funcionario, String nit,
			String centro_formacion1, String representante_legal, String email_representante,
			String telefono_representante, String empresa, String telefono_empresa, String funcionario_empresa,
			String observaciones, String fecha_diligenciamiento1, String firma, Usuario usuario) {
		super();
		this.id = id;
		this.nombre_completo = nombre_completo;
		this.documento = documento;
		this.fecha_nacimiento = fecha_nacimiento;
		this.edad = edad;
		this.telefono_aprendiz = telefono_aprendiz;
		this.email_soysena = email_soysena;
		this.libreta_militar = libreta_militar;
		this.direccion = direccion;
		this.estrato = estrato;
		this.ciudad = ciudad;
		this.titulo_obtenido = titulo_obtenido;
		this.institucion_educativa = institucion_educativa;
		this.fecha_grado = fecha_grado;
		this.nivel = nivel;
		this.nombre_estudios = nombre_estudios;
		this.institucion_educativa2 = institucion_educativa2;
		this.semestres_aprobados = semestres_aprobados;
		this.nombre_programa = nombre_programa;
		this.ficha = ficha;
		this.perfil = perfil;
		this.ocupaciones = ocupaciones;
		this.centro_formacion = centro_formacion;
		this.ciudad_formacion = ciudad_formacion;
		this.fecha_inicio = fecha_inicio;
		this.fecha_final = fecha_final;
		this.etapa = etapa;
		this.coordinador_academico = coordinador_academico;
		this.telefono_coordinador = telefono_coordinador;
		this.email_coordinador = email_coordinador;
		this.fecha_diligenciamiento = fecha_diligenciamiento;
		this.firma_aprendiz = firma_aprendiz;
		this.funcionario = funcionario;
		this.telefono_funcionario = telefono_funcionario;
		this.email_funcionario = email_funcionario;
		this.nit = nit;
		this.centro_formacion1 = centro_formacion1;
		this.representante_legal = representante_legal;
		this.email_representante = email_representante;
		this.telefono_representante = telefono_representante;
		this.empresa = empresa;
		this.telefono_empresa = telefono_empresa;
		this.funcionario_empresa = funcionario_empresa;
		this.observaciones = observaciones;
		this.fecha_diligenciamiento1 = fecha_diligenciamiento1;
		this.firma = firma;
		this.usuario = usuario;
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

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getTelefono_aprendiz() {
		return telefono_aprendiz;
	}

	public void setTelefono_aprendiz(String telefono_aprendiz) {
		this.telefono_aprendiz = telefono_aprendiz;
	}

	public String getEmail_soysena() {
		return email_soysena;
	}

	public void setEmail_soysena(String email_soysena) {
		this.email_soysena = email_soysena;
	}

	public String getLibreta_militar() {
		return libreta_militar;
	}

	public void setLibreta_militar(String libreta_militar) {
		this.libreta_militar = libreta_militar;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstrato() {
		return estrato;
	}

	public void setEstrato(String estrato) {
		this.estrato = estrato;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTitulo_obtenido() {
		return titulo_obtenido;
	}

	public void setTitulo_obtenido(String titulo_obtenido) {
		this.titulo_obtenido = titulo_obtenido;
	}

	public String getInstitucion_educativa() {
		return institucion_educativa;
	}

	public void setInstitucion_educativa(String institucion_educativa) {
		this.institucion_educativa = institucion_educativa;
	}

	public String getFecha_grado() {
		return fecha_grado;
	}

	public void setFecha_grado(String fecha_grado) {
		this.fecha_grado = fecha_grado;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getNombre_estudios() {
		return nombre_estudios;
	}

	public void setNombre_estudios(String nombre_estudios) {
		this.nombre_estudios = nombre_estudios;
	}

	public String getInstitucion_educativa2() {
		return institucion_educativa2;
	}

	public void setInstitucion_educativa2(String institucion_educativa2) {
		this.institucion_educativa2 = institucion_educativa2;
	}

	public String getSemestres_aprobados() {
		return semestres_aprobados;
	}

	public void setSemestres_aprobados(String semestres_aprobados) {
		this.semestres_aprobados = semestres_aprobados;
	}

	public String getNombre_programa() {
		return nombre_programa;
	}

	public void setNombre_programa(String nombre_programa) {
		this.nombre_programa = nombre_programa;
	}

	public String getFicha() {
		return ficha;
	}

	public void setFicha(String ficha) {
		this.ficha = ficha;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getOcupaciones() {
		return ocupaciones;
	}

	public void setOcupaciones(String ocupaciones) {
		this.ocupaciones = ocupaciones;
	}

	public String getCentro_formacion() {
		return centro_formacion;
	}

	public void setCentro_formacion(String centro_formacion) {
		this.centro_formacion = centro_formacion;
	}

	public String getCiudad_formacion() {
		return ciudad_formacion;
	}

	public void setCiudad_formacion(String ciudad_formacion) {
		this.ciudad_formacion = ciudad_formacion;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFecha_final() {
		return fecha_final;
	}

	public void setFecha_final(String fecha_final) {
		this.fecha_final = fecha_final;
	}

	public String getEtapa() {
		return etapa;
	}

	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}

	public String getCoordinador_academico() {
		return coordinador_academico;
	}

	public void setCoordinador_academico(String coordinador_academico) {
		this.coordinador_academico = coordinador_academico;
	}

	public String getTelefono_coordinador() {
		return telefono_coordinador;
	}

	public void setTelefono_coordinador(String telefono_coordinador) {
		this.telefono_coordinador = telefono_coordinador;
	}

	public String getEmail_coordinador() {
		return email_coordinador;
	}

	public void setEmail_coordinador(String email_coordinador) {
		this.email_coordinador = email_coordinador;
	}

	public String getFecha_diligenciamiento() {
		return fecha_diligenciamiento;
	}

	public void setFecha_diligenciamiento(String fecha_diligenciamiento) {
		this.fecha_diligenciamiento = fecha_diligenciamiento;
	}

	public String getFirma_aprendiz() {
		return firma_aprendiz;
	}

	public void setFirma_aprendiz(String firma_aprendiz) {
		this.firma_aprendiz = firma_aprendiz;
	}

	public String getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}

	public String getTelefono_funcionario() {
		return telefono_funcionario;
	}

	public void setTelefono_funcionario(String telefono_funcionario) {
		this.telefono_funcionario = telefono_funcionario;
	}

	public String getEmail_funcionario() {
		return email_funcionario;
	}

	public void setEmail_funcionario(String email_funcionario) {
		this.email_funcionario = email_funcionario;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getCentro_formacion1() {
		return centro_formacion1;
	}

	public void setCentro_formacion1(String centro_formacion1) {
		this.centro_formacion1 = centro_formacion1;
	}

	public String getRepresentante_legal() {
		return representante_legal;
	}

	public void setRepresentante_legal(String representante_legal) {
		this.representante_legal = representante_legal;
	}

	public String getEmail_representante() {
		return email_representante;
	}

	public void setEmail_representante(String email_representante) {
		this.email_representante = email_representante;
	}

	public String getTelefono_representante() {
		return telefono_representante;
	}

	public void setTelefono_representante(String telefono_representante) {
		this.telefono_representante = telefono_representante;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTelefono_empresa() {
		return telefono_empresa;
	}

	public void setTelefono_empresa(String telefono_empresa) {
		this.telefono_empresa = telefono_empresa;
	}

	public String getFuncionario_empresa() {
		return funcionario_empresa;
	}

	public void setFuncionario_empresa(String funcionario_empresa) {
		this.funcionario_empresa = funcionario_empresa;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getFecha_diligenciamiento1() {
		return fecha_diligenciamiento1;
	}

	public void setFecha_diligenciamiento1(String fecha_diligenciamiento1) {
		this.fecha_diligenciamiento1 = fecha_diligenciamiento1;
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "FormatoSena [id=" + id + ", nombre_completo=" + nombre_completo + ", documento=" + documento
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", edad=" + edad + ", telefono_aprendiz="
				+ telefono_aprendiz + ", email_soysena=" + email_soysena + ", libreta_militar=" + libreta_militar
				+ ", direccion=" + direccion + ", estrato=" + estrato + ", ciudad=" + ciudad + ", titulo_obtenido="
				+ titulo_obtenido + ", institucion_educativa=" + institucion_educativa + ", fecha_grado=" + fecha_grado
				+ ", nivel=" + nivel + ", nombre_estudios=" + nombre_estudios + ", institucion_educativa2="
				+ institucion_educativa2 + ", semestres_aprobados=" + semestres_aprobados + ", nombre_programa="
				+ nombre_programa + ", ficha=" + ficha + ", perfil=" + perfil + ", ocupaciones=" + ocupaciones
				+ ", centro_formacion=" + centro_formacion + ", ciudad_formacion=" + ciudad_formacion
				+ ", fecha_inicio=" + fecha_inicio + ", fecha_final=" + fecha_final + ", etapa=" + etapa
				+ ", coordinador_academico=" + coordinador_academico + ", telefono_coordinador=" + telefono_coordinador
				+ ", email_coordinador=" + email_coordinador + ", fecha_diligenciamiento=" + fecha_diligenciamiento
				+ ", firma_aprendiz=" + firma_aprendiz + ", funcionario=" + funcionario + ", telefono_funcionario="
				+ telefono_funcionario + ", email_funcionario=" + email_funcionario + ", nit=" + nit
				+ ", centro_formacion1=" + centro_formacion1 + ", representante_legal=" + representante_legal
				+ ", email_representante=" + email_representante + ", telefono_representante=" + telefono_representante
				+ ", empresa=" + empresa + ", telefono_empresa=" + telefono_empresa + ", funcionario_empresa="
				+ funcionario_empresa + ", observaciones=" + observaciones + ", fecha_diligenciamiento1="
				+ fecha_diligenciamiento1 + ", firma=" + firma + ", usuario=" + usuario + "]";
	}
	
	
}
