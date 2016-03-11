package it.attocchi.jpec.server.entities;

import it.attocchi.jpa2.entities.AbstractEntityMarksWithIdLong;
import it.attocchi.jpa2.entities.EntityMarks;
import it.attocchi.jpec.server.bl.RegolaPecEventoEnum;

import java.util.logging.Logger;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="genregolapec", sequenceName="pec.regole_id_seq", initialValue=1, allocationSize=1)
@Table(schema = "pec", name = "regole")
public class RegolaPec extends AbstractEntityMarksWithIdLong<RegolaPec> {

	protected static final Logger logger = Logger.getLogger(RegolaPec.class.getName());

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="genregolapec")
	@Column(name = "id")
	private long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "note")
	private String note;

	@Column(name = "evento")
	@Enumerated(EnumType.STRING)
	private RegolaPecEventoEnum evento;

	@Column(name = "criterio")
	private String criterio;

	@Column(name = "azione")
	private String azione;

	@Column(name = "classe")
	private String classe;
	
	@Column(name = "ordine")
	private Integer ordine;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "dataCreazione", column = @Column(name = "dt_creazione")), @AttributeOverride(name = "dataModifica", column = @Column(name = "ts_modifica")), @AttributeOverride(name = "dataCancellazione", column = @Column(name = "dt_cancellazione")), @AttributeOverride(name = "utenteCreazioneId", column = @Column(name = "id_utente_creazione")), @AttributeOverride(name = "utenteModificaId", column = @Column(name = "id_utente_modifica")), @AttributeOverride(name = "utenteCancellazioneId", column = @Column(name = "id_utente_cancellazione")) })
	private EntityMarks entityMarks;
	
	@Override
	public EntityMarks getEntityMarks() {
		return entityMarks;
	}

	public void setEntityMarks(EntityMarks entityMarks) {
		this.entityMarks = entityMarks;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public RegolaPecEventoEnum getEvento() {
		return evento;
	}

	public void setEvento(RegolaPecEventoEnum evento) {
		this.evento = evento;
	}

	public String getCriterio() {
		return criterio;
	}

	public void setCriterio(String criterio) {
		this.criterio = criterio;
	}

	public String getAzione() {
		return azione;
	}

	public void setAzione(String azione) {
		this.azione = azione;
	}

	public Integer getOrdine() {
		return ordine;
	}

	public void setOrdine(Integer ordine) {
		this.ordine = ordine;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
}
