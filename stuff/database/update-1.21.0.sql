
ALTER TABLE pec.messaggi ADD COLUMN segnatura_xml varchar;

-- cambia il filtro delle ricevute soloRicevuteConRiferimento quindi cercare quante sono:
-- xRicevuta  ma senza xRiferimentoMessageID
select x_ricevuta, x_riferimento_message_id from pec.messaggi;
select * from pec.messaggi WHERE x_ricevuta <> '' and (x_riferimento_message_id is null or x_riferimento_message_id = '');