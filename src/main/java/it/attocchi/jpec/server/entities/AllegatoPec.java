package it.attocchi.jpec.server.entities;

import it.attocchi.jpa2.entities.AbstractEntityMarksWithIdLong;
import it.attocchi.jpa2.entities.EntityMarks;

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

import org.apache.commons.io.FilenameUtils;

@Entity
@SequenceGenerator(name = "genallegatopec", sequenceName = "pec.allegati_id_seq", initialValue = 1, allocationSize = 1)
@Table(schema = "pec", name = "allegati")
public class AllegatoPec extends AbstractEntityMarksWithIdLong<AllegatoPec> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genallegatopec")
	@Column(name = "id")
	private long id;

	@Column(name = "id_messaggio")
	private long idMessaggio;

	@Column(name = "data")
	private byte[] data;

	@Column(name = "file_name")
	private String fileName;

	@Column(name = "content_type")
	private String contetType;

	@Column(name = "size")
	private long size;

	@Column(name = "store_file_name")
	private String storeFileName;

	@Column(name = "store_path")
	private String storePath;

	@Column(name = "store_url")
	private String storeUrl;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "dataCreazione", column = @Column(name = "dt_creazione")), @AttributeOverride(name = "dataModifica", column = @Column(name = "ts_modifica")), @AttributeOverride(name = "dataCancellazione", column = @Column(name = "dt_cancellazione")), @AttributeOverride(name = "utenteCreazioneId", column = @Column(name = "id_utente_creazione")), @AttributeOverride(name = "utenteModificaId", column = @Column(name = "id_utente_modifica")), @AttributeOverride(name = "utenteCancellazioneId", column = @Column(name = "id_utente_cancellazione")) })
	private EntityMarks entityMarks;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdMessaggio() {
		return idMessaggio;
	}

	public void setIdMessaggio(long idMessaggio) {
		this.idMessaggio = idMessaggio;
	}

	@Override
	public EntityMarks getEntityMarks() {
		return entityMarks;
	}

	@Override
	public void setEntityMarks(EntityMarks entityMarks) {
		this.entityMarks = entityMarks;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContetType() {
		return contetType;
	}

	public void setContetType(String contetType) {
		this.contetType = contetType;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getStoreFileName() {
		return storeFileName;
	}

	public void setStoreFileName(String storeFileName) {
		this.storeFileName = storeFileName;
	}

	public String getStorePath() {
		return storePath;
	}

	public void setStorePath(String storePath) {
		this.storePath = storePath;
	}

	public String getOnlyFileName() {
		return FilenameUtils.getName(fileName);
	}

	// public StreamedContent getStreamedContent() {
	// InputStream in = new ByteArrayInputStream(data);
	// return new DefaultStreamedContent(in, contetType, getOnlyFileName());
	// }
}
