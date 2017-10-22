package resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import source.Volunteer;

@Configuration
@Import({ MagicConfig.class })
@ImportResource("resource/config.xml")
public class AppConfig {

	@Bean()
	public Volunteer volunteer() {
		return new Volunteer();
	}

}
