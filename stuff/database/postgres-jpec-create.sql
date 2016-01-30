create schema pec;

CREATE TABLE pec.pec01_messaggi (
	pec01_id int8 NOT NULL,
	pec01_stato_accettato bool NOT NULL,
	pec01_accettato_id int8,
	pec01_stato_anomalia bool NOT NULL,
	pec01_anomalia_id int8,
	pec01_archiviato bool,
	pec01_archiviato_data timestamp,
	pec01_archiviato_id_utente int8,
	pec01_stato_consegnato bool NOT NULL,
	pec01_consegnato_id int8,
	pec01_data_invio timestamp,
	pec01_data_invio_originale timestamp,
	pec01_data_ricezione timestamp,
	pec01_destinatari varchar,
	pec01_mittente_email varchar(255),
	pec01_eml_file varchar(255),
	pec01_dt_cancellazione timestamp,
	pec01_dt_creazione timestamp,
	pec01_ts_modifica timestamp,
	pec01_id_utente_cancellazione int8,
	pec01_id_utente_creazione int8,
	pec01_id_utente_modifica int8,
	pec01_folder varchar(255),
	pec01_stato_inoltrato bool,
	pec01_inoltrato_destinatari varchar(255),
	pec01_inoltrato_data timestamp,
	pec01_inoltrato_id_utente int8,
	pec01_stato_inviato bool,
	pec01_letto bool,
	pec01_letto_data timestamp,
	pec01_letto_id_utente int8,
	pec01_message_id varchar(255),
	pec01_messaggio varchar,
	pec01_mittente_nome varchar(255),
	pec01_oggetto varchar,
	pec01_postacert_body varchar,
	pec01_postacert_contenttype varchar(255),
	pec01_postacert_file varchar(255),
	pec01_processato bool,
	pec01_protocollo varchar(255),
	pec01_mittente_username varchar(255),
	pec01_x_ricevuta varchar(255),
	pec01_x_riferimento_message_id varchar(255),
	pec01_x_tipo_ricevuta varchar(255),
	CONSTRAINT pec01_messaggi_pkey PRIMARY KEY (pec01_id)
);
-- CREATE INDEX pec01_messaggi_pkey ON pec.pec01_messaggi (pec01_id);
CREATE SEQUENCE pec.pec01_messaggi_pec01_id_seq START 1;

CREATE TABLE pec.pec06_regole (
	pec06_id int8 NOT NULL,
	pec06_azione varchar,
	pec06_criterio varchar,
	pec06_evento varchar(255),
	pec06_nome varchar(255),
	pec06_note varchar,
	pec06_ordine int4,
	CONSTRAINT pec06_regole_pkey PRIMARY KEY (pec06_id)
);
-- CREATE INDEX pec06_regole_pkey ON pec.pec06_regole (pec06_id);
CREATE SEQUENCE pec.pec06_regole_pec06_id_seq START 1;
