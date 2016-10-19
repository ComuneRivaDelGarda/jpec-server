import it.attocchi.jpec.server.bl.MessaggioPecBL;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSegnatura {

	protected final Logger logger = LoggerFactory.getLogger(TestSegnatura.class);

	@Test
	public void test() throws Exception {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpec-server-pu_TEST");

			MessaggioPecBL.aggiornaStatoMessaggi(emf, "TEST");

			// AzioneContext ctx = AzioneContext.buildContextMessaggi(emf, null,
			// messaggioDaProcessare, messaggioDaProcessare.getMailbox());
			//
			// InviaSegnaturaConferma confermaSegnatura = new
			// InviaSegnaturaConferma();
			// confermaSegnatura.inizialize(ctx);
			//
			// confermaSegnatura.esegui();

			emf.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
