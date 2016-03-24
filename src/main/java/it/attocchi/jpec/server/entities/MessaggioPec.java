package it.attocchi.jpec.server.entities;

import it.attocchi.jpa2.entities.AbstractEntityMarksWithIdLong;
import it.attocchi.jpa2.entities.EntityMarks;
import it.attocchi.utils.HtmlUtils;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name = "genmessaggiopec", sequenceName = "pec.messaggi_id_seq", initialValue = 1, allocationSize = 1)
@Table(schema = "pec", name = "messaggi")
public class MessaggioPec extends AbstractEntityMarksWithIdLong<MessaggioPec> {

	public enum Folder {
		IN,
		OUT
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genmessaggiopec")
	@Column(name = "id")
	private long id;

	@Column(name = "destinatari")
	// @Lob
	private String destinatari;

	@Column(name = "destinatari_cc")
	// @Lob
	private String destinatariCC;

	@Column(name = "destinatari_ccn")
	// @Lob
	private String destinatariCCN;

	@Column(name = "oggetto")
	// @Lob
	private String oggetto;

	@Column(name = "messaggio")
	// @Lob
	private String messaggio;

	@Column(name = "protocollo")
	private String protocollo;

	@Column(name = "data_invio")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInvio;

	@Column(name = "stato_inviato")
	private boolean inviato;

	@Column(name = "stato_accettato", nullable = false)
	private boolean accettato;

	@Column(name = "stato_consegnato", nullable = false)
	private boolean consegnato;

	@Column(name = "stato_anomalia", nullable = false)
	private boolean anomalia;

	@Column(name = "errore_invio")
	private String erroreInvio;

	@Column(name = "accettato_id")
	private Long accettatoIdMessaggio;

	@Column(name = "consegnato_id")
	private Long consegnatoIdMessaggio;

	@Column(name = "anomalia_id")
	private Long anomaliaIdMessaggio;

	@Column(name = "folder")
	private String folder;

	@Column(name = "eml_file")
	private String emlFile;

	// @Column(name = "id_utente", nullable = false)
	// private int idUtente;

	@Column(name = "mittente_email")
	private String emailMittente;
	@Column(name = "mittente_nome")
	private String nomeMittente;
	@Column(name = "mittente_username")
	private String usernameMittente;

	/* Dati Messaggi Ricevuti */

	@Column(name = "data_ricezione")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataRicezione;

	@Column(name = "data_invio_originale")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInvioOriginale;

	@Column(name = "processato")
	private boolean processato;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "dataCreazione", column = @Column(name = "dt_creazione")), @AttributeOverride(name = "dataModifica", column = @Column(name = "ts_modifica")), @AttributeOverride(name = "dataCancellazione", column = @Column(name = "dt_cancellazione")), @AttributeOverride(name = "utenteCreazioneId", column = @Column(name = "id_utente_creazione")), @AttributeOverride(name = "utenteModificaId", column = @Column(name = "id_utente_modifica")), @AttributeOverride(name = "utenteCancellazioneId", column = @Column(name = "id_utente_cancellazione")) })
	private EntityMarks entityMarks;

	@Column(name = "stato_inoltrato")
	private boolean inoltrato;

	@Column(name = "inoltrato_id_utente")
	private long inotratoIdUtente;

	@Column(name = "inoltrato_destinatari")
	private String inoltratoDestinatari;

	@Column(name = "inoltrato_data")
	@Temporal(TemporalType.TIMESTAMP)
	private Date inotratoData;

	@Column(name = "letto")
	private boolean letto;

	@Column(name = "letto_id_utente")
	private long lettoIdUtente;

	@Column(name = "letto_data")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lettoData;

	@Column(name = "postacert_file")
	private String postacertFile;

	@Column(name = "postacert_body")
	private String postacertBody;

	@Column(name = "postacert_subject")
	private String postacertSubject;	

	@Column(name = "postacert_contenttype")
	private String postacertContentType;

	@Column(name = "archiviato")
	private boolean archiviato;

	@Column(name = "archiviato_id_utente")
	private long archiviatoIdUtente;

	@Column(name = "archiviato_data")
	@Temporal(TemporalType.TIMESTAMP)
	private Date archiviatoData;

	@Column(name = "message_id")
	private String messageID;

	@Column(name = "x_riferimento_message_id")
	private String xRiferimentoMessageID;

	@Column(name = "x_ricevuta")
	private String xRicevuta;

	@Column(name = "x_tipo_ricevuta")
	private String xTipoRicevuta;

	@Column(name = "mailbox")
	private String mailbox;

	@Column(name = "url_documentale")
	private String urlDocumentale;

	@Column(name = "daticert_xml")
	private String daticertxml;

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

	@Override
	public EntityMarks getEntityMarks() {
		return entityMarks;
	}

	public void setEntityMarks(EntityMarks entityMarks) {
		this.entityMarks = entityMarks;
	}

	public boolean isInviato() {
		return inviato;
	}

	public void setInviato(boolean inviato) {
		this.inviato = inviato;
	}

	public boolean isAccettato() {
		return accettato;
	}

	public void setAccettato(boolean accettato) {
		this.accettato = accettato;
	}

	public boolean isConsegnato() {
		return consegnato;
	}

	public void setConsegnato(boolean consegnato) {
		this.consegnato = consegnato;
	}

	public Date getDataRicezione() {
		return dataRicezione;
	}

	public void setDataRicezione(Date dataRicezione) {
		this.dataRicezione = dataRicezione;
	}

	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

	public Long getAccettatoIdMessaggio() {
		return accettatoIdMessaggio;
	}

	public void setAccettatoIdMessaggio(Long accettatoIdMessaggio) {
		this.accettatoIdMessaggio = accettatoIdMessaggio;
	}

	public Long getConsegnatoIdMessaggio() {
		return consegnatoIdMessaggio;
	}

	public void setConsegnatoIdMessaggio(Long consegnatoIdMessaggio) {
		this.consegnatoIdMessaggio = consegnatoIdMessaggio;
	}

	public Long getAnomaliaIdMessaggio() {
		return anomaliaIdMessaggio;
	}

	public void setAnomaliaIdMessaggio(Long anomaliaIdMessaggio) {
		this.anomaliaIdMessaggio = anomaliaIdMessaggio;
	}

	public boolean isAnomalia() {
		return anomalia;
	}

	public void setAnomalia(boolean anomalia) {
		this.anomalia = anomalia;
	}

	public String getEmlFile() {
		return emlFile;
	}

	public void setEmlFile(String emlFile) {
		this.emlFile = emlFile;
	}

	public String getEmailMittente() {
		return emailMittente;
	}

	public void setEmailMittente(String emailMittente) {
		this.emailMittente = emailMittente;
	}

	public String getNomeMittente() {
		return nomeMittente;
	}

	public void setNomeMittente(String nomeMittente) {
		this.nomeMittente = nomeMittente;
	}

	public String getUsernameMittente() {
		return usernameMittente;
	}

	public void setUsernameMittente(String usernameMittente) {
		this.usernameMittente = usernameMittente;
	}

	public boolean isProcessato() {
		return processato;
	}

	public void setProcessato(boolean processato) {
		this.processato = processato;
	}

	public Date getDataInvioOriginale() {
		return dataInvioOriginale;
	}

	public void setDataInvioOriginale(Date dataInvioOriginale) {
		this.dataInvioOriginale = dataInvioOriginale;
	}

	public boolean isInoltrato() {
		return inoltrato;
	}

	public void setInoltrato(boolean inoltrato) {
		this.inoltrato = inoltrato;
	}

	public long getInotratoIdUtente() {
		return inotratoIdUtente;
	}

	public void setInotratoIdUtente(long inotratoIdUtente) {
		this.inotratoIdUtente = inotratoIdUtente;
	}

	public Date getInotratoData() {
		return inotratoData;
	}

	public void setInotratoData(Date inotratoData) {
		this.inotratoData = inotratoData;
	}

	public String getInoltratoDestinatari() {
		return inoltratoDestinatari;
	}

	public void setInoltratoDestinatari(String inoltratoDestinatari) {
		this.inoltratoDestinatari = inoltratoDestinatari;
	}

	public String getStatoDescrizione() {
		String res = "";

		if (!isInviato()) {
			res = "Da Inviare";
		} else if (isAnomalia()) {
			res = "Anomalia";
		} else if (isInviato() && !isAccettato() && !isConsegnato()) {
			res = "Inviato";
		} else if (isInviato() && isAccettato() && !isConsegnato()) {
			res = "Accettato";
		} else if (isInviato() && isAccettato() && isConsegnato()) {
			res = "Consegnato";
		}

		if (isInoltrato()) {
			res = "Inoltrato";
		}

		return res;
	}

	public static MessaggioPec createNew(String utente, Folder folder, String mailboxName) {
		MessaggioPec messaggioPec = new MessaggioPec();

		messaggioPec.folder = folder.name();
		messaggioPec.mailbox = mailboxName;

		messaggioPec.setProcessato(false);

		messaggioPec.setLetto(false);

		return messaggioPec;
	}

	// /**
	// * Meccanismo Lazy Load per Stream del Messaggio
	// *
	// * @return
	// */
	// public StreamedContent getConsegnatoFile() {
	//
	// StreamedContent file = null;
	//
	// if (consegnatoIdMessaggio > 0) {
	//
	// Messaggio m = JPA
	// String emlPath =
	// InputStream stream = ((ServletContext)
	// FacesContext.getCurrentInstance().getExternalContext().getContext()).getResourceAsStream("/images/optimusprime.jpg");
	// // file = new DefaultStreamedContent(stream, "image/jpg",
	// "downloaded_optimus.jpg");
	//
	// file = new DefaultStreamedContent(stream);
	// }
	//
	// return file;
	//
	// }

	public String getMessaggioHtml() {
		// return
		// HtmlUtils.encodeForEscape(HtmlUtils.encodeWebUrl(getMessaggio()));
		return HtmlUtils.encodeForEscape(getMessaggio());
	}

	public boolean isLetto() {
		return letto;
	}

	public void setLetto(boolean letto) {
		this.letto = letto;
	}

	public long getLettoIdUtente() {
		return lettoIdUtente;
	}

	public void setLettoIdUtente(long lettoIdUtente) {
		this.lettoIdUtente = lettoIdUtente;
	}

	public Date getLettoData() {
		return lettoData;
	}

	public void setLettoData(Date lettoData) {
		this.lettoData = lettoData;
	}

	public String getPostacertFile() {
		return postacertFile;
	}

	public void setPostacertFile(String postacertFile) {
		this.postacertFile = postacertFile;
	}

	public String getPostacertSubject() {
		return postacertSubject;
	}

	public void setPostacertSubject(String postacertSubject) {
		this.postacertSubject = postacertSubject;
	}

	public String getPostacertBody() {
		return postacertBody;
	}

	public void setPostacertBody(String postacertBody) {
		this.postacertBody = postacertBody;
	}

	public String getPostacertBodyHtml() {
		return HtmlUtils.encodeForEscape(getPostacertBody());
	}

	public String getPostacertContentType() {
		return postacertContentType;
	}

	public void setPostacertContentType(String postacertContentType) {
		this.postacertContentType = postacertContentType;
	}

	// public String getOggettoAbbreviate() {
	// String res = oggetto;
	// int max = ConfigurazionePec.get().getLayoutColumnMaxChar();
	// if (StringUtils.isNotBlank(res) && max > 0) {
	// res = StringUtils.abbreviate(res, max);
	// }
	// return res;
	// }

	public boolean isArchiviabile() {
		return false; // StringUtils.isNotEmpty(getOggetto()) &&
						// !getOggetto().startsWith(MessaggioPecBL.OGGETTO_POSTA_CERTIFICATA);
	}

	public boolean isArchiviato() {
		return archiviato;
	}

	public void setArchiviato(boolean archiviato) {
		this.archiviato = archiviato;
	}

	public long getArchiviatoIdUtente() {
		return archiviatoIdUtente;
	}

	public void setArchiviatoIdUtente(long archiviatoIdUtente) {
		this.archiviatoIdUtente = archiviatoIdUtente;
	}

	public Date getArchiviatoData() {
		return archiviatoData;
	}

	public void setArchiviatoData(Date archiviatoData) {
		this.archiviatoData = archiviatoData;
	}

	public String getMessageID() {
		return messageID;
	}

	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}

	public String getxRiferimentoMessageID() {
		return xRiferimentoMessageID;
	}

	public void setxRiferimentoMessageID(String xRiferimentoMessageID) {
		this.xRiferimentoMessageID = xRiferimentoMessageID;
	}

	public String getxRicevuta() {
		return xRicevuta;
	}

	public void setxRicevuta(String xRicevuta) {
		this.xRicevuta = xRicevuta;
	}

	public String getxTipoRicevuta() {
		return xTipoRicevuta;
	}

	public void setxTipoRicevuta(String xTipoRicevuta) {
		this.xTipoRicevuta = xTipoRicevuta;
	}

	public String getMailbox() {
		return mailbox;
	}

	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}

	public String getDestinatariCC() {
		return destinatariCC;
	}

	public void setDestinatariCC(String destinatariCC) {
		this.destinatariCC = destinatariCC;
	}

	public String getDestinatariCCN() {
		return destinatariCCN;
	}

	public void setDestinatariCCN(String destinatariCCN) {
		this.destinatariCCN = destinatariCCN;
	}

	public String getErroreInvio() {
		return erroreInvio;
	}

	public void setErroreInvio(String erroreInvio) {
		this.erroreInvio = erroreInvio;
	}

	public String getUrlDocumentale() {
		return urlDocumentale;
	}

	public void setUrlDocumentale(String urlDocumentale) {
		this.urlDocumentale = urlDocumentale;
	}

	public String getDaticertxml() {
		return daticertxml;
	}

	public void setDaticertxml(String daticertxml) {
		this.daticertxml = daticertxml;
	}
}
