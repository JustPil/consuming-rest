package justpil.consumingrest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class ConsumingRestApplicationTests {
	@Autowired
	private RestTemplate template;

	@Test
	public void contextLoads() {
		assert template != null;
	}
}
