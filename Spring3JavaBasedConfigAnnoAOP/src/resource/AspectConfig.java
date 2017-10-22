package resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import source.aop.annotated.Anno;

@Configuration
public class AspectConfig {

	@Bean
	public Anno magician() {
		return new Anno();
	}

}
