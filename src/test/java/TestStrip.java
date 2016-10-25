import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestStrip {

	protected final Logger logger = LoggerFactory.getLogger(TestStrip.class);

	@Test
	public void test() throws Exception {
		try {
			String mimeType = StringUtils.strip("\"application/pdf\"", "\"");
			Assert.assertEquals(mimeType, "application/pdf");
			
			mimeType = StringUtils.strip("application/pdf", "\"");
			Assert.assertEquals(mimeType, "application/pdf");
			
			mimeType = StringUtils.strip("application/\"pdf", "\"");
			Assert.assertEquals(mimeType, "application/\"pdf");	
			
			mimeType = StringUtils.strip("\"application/\"pdf\"", "\"");
			Assert.assertEquals(mimeType, "application/\"pdf");				
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
