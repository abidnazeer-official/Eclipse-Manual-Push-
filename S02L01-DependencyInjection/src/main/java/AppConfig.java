import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import antech.car.Corolla;
import antech.car.Swift;
import antech.specs.EngineType;
import antech.specs.V6;
import antech.specs.V8;

@Configuration
@ComponentScan("antech")
public class AppConfig {

	@Bean("swift") 
	public Swift swift() {
	return new Swift();
	}
	
	@Bean("corolla")
	public Corolla corolla(){
		return new Corolla();
	}
	
	@Bean("Unknown")
	public EngineType type(){
		return new EngineType();
	}
	
	@Bean("V6Engine")
	public EngineType V6type() {
		return new EngineType("V6 Engine");
	}
	
}
