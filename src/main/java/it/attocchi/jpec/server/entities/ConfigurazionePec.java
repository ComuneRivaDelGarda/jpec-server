package it.attocchi.jpec.server.entities;

import it.attocchi.jpa2.entities.AbstractEntityWithIdString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
