
ALTER TABLE pec.messaggi ADD COLUMN segnatura_xml varchar;

-- cambia il filtro delle ricevute soloRicevuteConRiferimento quindi cercare quante sono:
-- xRicevuta  ma senza xRiferimentoMessageID
select x_ricevuta, x_riferimento_message_id from pec.messaggi;
select * from pec.messaggi WHERE x_ricevuta <> '' and (x_riferimento_message_id is null or x_riferimento_message_id = '');

-- nuova configurazione regola per segnatura confermaricezione
INSERT INTO pec.regole
(azione, classe, criterio, dt_creazione, evento, nome, note, ordine)
VALUES
(NULL, 'it.attocchi.jpec.server.protocollo.impl.InviaSegnaturaConferma', '', null, 'AGGIORNA_SEGNATURA', 'Processa Segnatura', 'processa i messaggi ricevuti e crea le risposte segnature', NULL);

select * from pec.regole;
