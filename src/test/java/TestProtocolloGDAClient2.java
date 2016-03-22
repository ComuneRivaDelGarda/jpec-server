import it.attocchi.jpec.server.protocollo.AzioneContext;
import it.attocchi.jpec.server.protocollo.impl.ProtocolloGDAClient;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class TestProtocolloGDAClient2 {

	@Test
	public void test() throws Exception {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpec-server-pu_TEST");

			AzioneContext context = AzioneContext.buildContextMessaggi(emf, null, null, "");

			ProtocolloGDAClient protocollo = new ProtocolloGDAClient();
			protocollo.inizialize(context);

			String mail = null;
			Long idSoggetto = null;
			try {
				mail = "comune.rivadelgarda@pec.aruba.it";
				idSoggetto = protocollo.getSoggetto(mail);
				System.out.println(mail + "=" + idSoggetto);
			} catch (Exception ex) {
				System.err.println(ex.getMessage());
			}
			try {
				mail = "axiastudio@pec.it";
				idSoggetto = protocollo.getSoggetto(mail);
				System.out.println(mail + "=" + idSoggetto);
			} catch (Exception ex) {
				System.err.println(ex.getMessage());
			}
			try {
				mail = "mirco.attocchi@pec.it";
				idSoggetto = protocollo.getSoggetto(mail);
				System.out.println(mail + "=" + idSoggetto);
			} catch (Exception ex) {
				System.err.println(ex.getMessage());
			}
			try {
				mail = "pectest@pec.comune.rivadelgarda.tn.it";
				idSoggetto = protocollo.getSoggetto(mail);
				System.out.println(mail + "=" + idSoggetto);
			} catch (Exception ex) {
				System.err.println(ex.getMessage());
			}
			// ProtocolloEsito esito = null;
			// // esito = protocollo.esegui();
			//
			// System.out.println(esito);

			emf.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
