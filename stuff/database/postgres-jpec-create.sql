create schema pec;

CREATE TABLE pec.messaggi (
	id bigserial NOT NULL,
	stato_accettato bool NOT NULL,
	accettato_id bigint,
	stato_anomalia bool NOT NULL,
	anomalia_id bigint,
	archiviato bool,
	archiviato_data timestamp,
	archiviato_id_utente bigint,
	stato_consegnato bool NOT NULL,
	consegnato_id bigint,
	data_invio timestamp,
	data_invio_originale timestamp,
	data_ricezione timestamp,
	destinatari varchar,
	mittente_email varchar,
	eml_file varchar,
	
	dt_cancellazione timestamp,
	dt_creazione timestamp,
	ts_modifica timestamp,
	id_utente_cancellazione bigint,
	id_utente_creazione bigint,
	id_utente_modifica bigint,
	
	folder varchar,
	stato_inoltrato bool,
	inoltrato_destinatari varchar,
	inoltrato_data timestamp,
	inoltrato_id_utente bigint,
	stato_inviato bool,
	letto bool,
	letto_data timestamp,
	letto_id_utente bigint,
	message_id varchar,
	messaggio varchar,
	mittente_nome varchar,
	oggetto varchar,
	postacert_body varchar,
	postacert_contenttype varchar,
	postacert_file varchar,
	processato bool,
	protocollo varchar,
	mittente_username varchar,
	x_ricevuta varchar,
	x_riferimento_message_id varchar,
	x_tipo_ricevuta varchar,
	mailbox varchar,
	destinatari_cc varchar,
	destinatari_ccn varchar,
	errore_invio varchar,
	url_documentale varchar,

	CONSTRAINT messaggi_pkey PRIMARY KEY (id)
);
-- CREATE SEQUENCE pec.messaggi_id_seq START 1;

CREATE TABLE pec.regole (
	id bigserial NOT NULL,
	azione varchar,
	criterio varchar,
	evento varchar,
	nome varchar,
	note varchar,
	ordine int,
	
	dt_cancellazione timestamp,
	dt_creazione timestamp,
	ts_modifica timestamp,
	id_utente_cancellazione bigint,
	id_utente_creazione bigint,
	id_utente_modifica bigint,	
	
	CONSTRAINT regole_pkey PRIMARY KEY (id)
);
-- CREATE SEQUENCE pec.regole_id_seq START 1;

CREATE TABLE pec.allegati (
	id bigserial NOT NULL,
	id_pec01 bigint,
	data bytea,
	file_name varchar,
	content_type varchar,
	size bigint,
	store_file_name varchar,
	store_path varchar,
	store_url varchar,
	
	dt_cancellazione timestamp,
	dt_creazione timestamp,
	ts_modifica timestamp,
	id_utente_cancellazione bigint,
	id_utente_creazione bigint,
	id_utente_modifica bigint,
	
	CONSTRAINT allegati_pkey PRIMARY KEY (id)
);
-- CREATE SEQUENCE pec.allegati_id_seq START 1;

CREATE TABLE pec.notifiche (
	id bigserial NOT NULL,
	tipo varchar,
	id_messaggio_padre bigint,
	destinatari varchar,
	oggetto varchar,
	messaggio varchar,
	allegati varchar,
	stato_inviato bool,
	data_invio timestamp,
	protocollo varchar,
	errore varchar,
		
	dt_cancellazione timestamp,
	dt_creazione timestamp,
	ts_modifica timestamp,
	id_utente_cancellazione bigint,
	id_utente_creazione bigint,
	id_utente_modifica bigint,
	
	CONSTRAINT notifiche_pkey PRIMARY KEY (id)
);
-- CREATE SEQUENCE pec.notifiche_id_seq START 1;