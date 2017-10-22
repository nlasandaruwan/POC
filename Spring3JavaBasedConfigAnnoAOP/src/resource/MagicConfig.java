package resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import source.MagicBatten;
import source.Magician;

@Configuration
public class MagicConfig {

	@Bean
	public Magician magician() {
		return new Magician();
	}

	@Bean
	public MagicBatten magicBatten() {
		return new MagicBatten();
	}
}
