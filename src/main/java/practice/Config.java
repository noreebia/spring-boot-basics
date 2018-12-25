package practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

	@Bean
	@Primary
	public Thing aThing() {
		System.out.println("made!");
		return new Thing("proof yeah yeah!!", 100);
	}
	
	@Bean
	public Thing bThing() {
		System.out.println("made!");
		return new Thing("bthing!!", 111111111);
	}
	
	@Bean
	public AnnoyingClass annoy() {
		return new AnnoyingClass();
	}
}
