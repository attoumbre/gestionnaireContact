package com.example.gestioncontact.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
//@Table(name = "users_iggf") pour renommer la table dans la bd
public class Users implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -217848397421400788L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	//@Column(name = "nom_user")on peut faire ainsi pour ignorer les properties
	private String nomUser;
	private String prenomUser;
	
	
	
	public Users() {
		super();
	}
	public Users(String nomUser, String prenomUser) {
		super();
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomUser() {
		return nomUser;
	}
	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}
	public String getPrenomUser() {
		return prenomUser;
	}
	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}
	
	

}

