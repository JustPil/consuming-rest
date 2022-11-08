package justpil.consumingrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestApplication {
	private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestApplication.class, args);
	}

	@Bean
	public RestTemplate template(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate template) {
		return args -> {
			Quote quote;
			try {
				quote = template.getForObject("https://quoters.apps.pcfone.io/api/random", Quote.class);
			} catch(Exception e) {
				Value value = new Value();
				value.setId(-1);
				value.setQuote("Website down");
				quote = new Quote();
				quote.setValue(value);
				quote.setType("N/A");
			}
			assert quote != null;
			log.info(quote.toString());
		};
	}
}
