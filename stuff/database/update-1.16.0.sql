
select * from generale.costante where nome = 'PEC_PROTOCOLLO_IMPL';
delete from generale.costante where nome = 'PEC_PROTOCOLLO_IMPL';

-- alter table jpec.pec06_regole drop column pec06_classe;
ALTER TABLE pec.regole ADD COLUMN classe varchar;

update pec.regole set evento = 'IMPORTA_MESSAGGIO' where evento = 'IMPORTA';
update pec.regole set evento = 'PROTOCOLLA_MESSAGGIO' where evento = 'PROTOCOLLA';

update pec.regole set classe = 'it.attocchi.jpec.server.protocollo.impl.ProtocolloGDAClient' where evento = 'PROTOCOLLA_MESSAGGIO'; 

-- abilita store EML per poter avere EML Ricevuta da Archiviare in cambio stato
update generale.costante set valore = 'true' where nome = 'PEC_ENABLE_EML_STORE';