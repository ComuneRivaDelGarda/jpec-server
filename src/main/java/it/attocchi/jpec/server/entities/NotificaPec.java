package it.attocchi.jpec.server.entities;

import it.attocchi.jpa2.entities.AbstractEntityMarksWithIdLong;
import it.attocchi.jpa2.entities.EntityMarks;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name="gennotificapec", sequenceName="pec.notifiche_id_seq", initialValue=1, allocationSize=1)
@Table(schema = "pec", name = "notifiche")
public class NotificaPec extends AbstractEntityMarksWithIdLong<NotificaPec> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="gennotificapec")
	@Column(name = "id")
	private long id;

	@Column(name = "tipo")
	private String tipo;

	@Column(name = "id_messaggio_padre")
	private long idMessaggioPadre;

	@Column(name = "destinatari")
	private String destinatari;

	@Column(name = "oggetto")
	private String oggetto;

	@Column(name = "messaggio")
	private String messaggio;

	@Column(name = "allegati")
	private String allegati;

	@Column(name = "stato_inviato")
	private boolean inviato;

	@Column(name = "data_invio")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInvio;

	@Column(name = "protocollo")
	private String protocollo;

	@Column(name = "errore")
	private String errore;

	@Column(name = "mailbox")
	private String mailbox;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDestinatari() {
		return destinatari;
	}

	public void setDestinatari(String destinatari) {
		this.destinatari = destinatari;
	}

	public String getOggetto() {
		return oggetto;
	}

	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}

	public String getMessaggio() {
		return messaggio;
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

	public String getAllegati() {
		return allegati;
	}

	public void setAllegati(String allegati) {
		this.allegati = allegati;
	}

	public boolean isInviato() {
		return inviato;
	}

	public void setInviato(boolean inviato) {
		this.inviato = inviato;
	}

	public Date getDataInvio() {
		return dataInvio;
	}

	public void setDataInvio(Date dataInvio) {
		this.dataInvio = dataInvio;
	}

	public String getProtocollo() {
		return protocollo;
	}

	public void setProtocollo(String protocollo) {
		this.protocollo = protocollo;
	}

	public String getErrore() {
		return errore;
	}

	public void setErrore(String errore) {
		this.errore = errore;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public long getIdMessaggioPadre() {
		return idMessaggioPadre;
	}

	public void setIdMessaggioPadre(long idMessaggioPadre) {
		this.idMessaggioPadre = idMessaggioPadre;
	}

	public String getMailbox() {
		return mailbox;
	}

	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "dataCreazione", column = @Column(name = "dt_creazione")), @AttributeOverride(name = "dataModifica", column = @Column(name = "ts_modifica")), @AttributeOverride(name = "dataCancellazione", column = @Column(name = "dt_cancellazione")), @AttributeOverride(name = "utenteCreazioneId", column = @Column(name = "id_utente_creazione")), @AttributeOverride(name = "utenteModificaId", column = @Column(name = "id_utente_modifica")), @AttributeOverride(name = "utenteCancellazioneId", column = @Column(name = "id_utente_cancellazione")) })
	private EntityMarks entityMarks;

	@Override
	public EntityMarks getEntityMarks() {
		return entityMarks;
	}

	@Override
	public void setEntityMarks(EntityMarks entityMarks) {
		this.entityMarks = entityMarks;
	}

}
