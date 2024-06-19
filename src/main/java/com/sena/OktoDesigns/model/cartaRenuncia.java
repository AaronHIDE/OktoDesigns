package com.sena.OktoDesigns.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class cartaRenuncia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String letterName; 
	private String nameBoss; 
	private String cargueBoss; 
	private String companyBoss; 
	private String companyAddress; 
	private String numberBoss; 
	private String destinatary; 
	private String company; 
	private String renunceDate;
	private String weeks;
	private String yourName;
	private String yourId;
	private String yourPhone;
	
	public cartaRenuncia () {
		
	}
	
	@ManyToOne
	private Usuario usuario;
	

	public cartaRenuncia(Integer id, String letterName, String nameBoss, String cargueBoss, String companyBoss,
			String companyAddress, String numberBoss, String destinatary, String company, String renunceDate,
			String weeks, String yourName, String yourId, String yourPhone) {
		super();
		Id = id;
		this.letterName = letterName;
		this.nameBoss = nameBoss;
		this.cargueBoss = cargueBoss;
		this.companyBoss = companyBoss;
		this.companyAddress = companyAddress;
		this.numberBoss = numberBoss;
		this.destinatary = destinatary;
		this.company = company;
		this.renunceDate = renunceDate;
		this.weeks = weeks;
		this.yourName = yourName;
		this.yourId = yourId;
		this.yourPhone = yourPhone;
	}




	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getLetterName() {
		return letterName;
	}

	public void setLetterName(String letterName) {
		this.letterName = letterName;
	}

	public String getNameBoss() {
		return nameBoss;
	}

	public void setNameBoss(String nameBoss) {
		this.nameBoss = nameBoss;
	}

	public String getCargueBoss() {
		return cargueBoss;
	}

	public void setCargueBoss(String cargueBoss) {
		this.cargueBoss = cargueBoss;
	}

	public String getCompanyBoss() {
		return companyBoss;
	}

	public void setCompanyBoss(String companyBoss) {
		this.companyBoss = companyBoss;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getNumberBoss() {
		return numberBoss;
	}

	public void setNumberBoss(String numberBoss) {
		this.numberBoss = numberBoss;
	}

	public String getDestinatary() {
		return destinatary;
	}

	public void setDestinatary(String destinatary) {
		this.destinatary = destinatary;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getRenunceDate() {
		return renunceDate;
	}

	public void setRenunceDate(String renunceDate) {
		this.renunceDate = renunceDate;
	}

	public String getWeeks() {
		return weeks;
	}

	public void setWeeks(String weeks) {
		this.weeks = weeks;
	}

	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}

	public String getYourId() {
		return yourId;
	}

	public void setYourId(String yourId) {
		this.yourId = yourId;
	}

	public String getYourPhone() {
		return yourPhone;
	}

	public void setYourPhone(String yourPhone) {
		this.yourPhone = yourPhone;
	}

	@Override
	public String toString() {
		return "cartaRenuncia [Id=" + Id + ", letterName=" + letterName + ", nameBoss=" + nameBoss + ", cargueBoss="
				+ cargueBoss + ", companyBoss=" + companyBoss + ", companyAddress=" + companyAddress + ", numberBoss="
				+ numberBoss + ", destinatary=" + destinatary + ", company=" + company + ", renunceDate=" + renunceDate
				+ ", weeks=" + weeks + ", yourName=" + yourName + ", yourId=" + yourId + ", yourPhone=" + yourPhone
				+ "]";
	}
	
	
	public void setUsuario(Usuario u) {
		// TODO Auto-generated method stub
		
	}
}