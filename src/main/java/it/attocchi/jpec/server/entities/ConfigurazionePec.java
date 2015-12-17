package it.attocchi.jpec.server.entities;

import it.attocchi.jpa2.JpaController;
import it.attocchi.jpa2.entities.AbstractEntityWithIdString;
import it.attocchi.jpec.server.bl.ConfigurazionePecEnum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(schema = "generale", name = "costante")
public class ConfigurazionePec extends AbstractEntityWithIdString {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nome")
	private String nome;

	@Column(name = "valore")
	private String valore;

	@Column(name = "descrizione")
	private String descrizione;

	@Column(name = "tipocostante")
	private String tipocostante;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getTipocostante() {
		return tipocostante;
	}

	public void setTipocostante(String tipocostante) {
		this.tipocostante = tipocostante;
	}

	@Override
	public String getId() {
		return getNome();
	}

}
