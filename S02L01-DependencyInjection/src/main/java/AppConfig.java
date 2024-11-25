import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import antech.car.Corolla;
import antech.car.Swift;
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
	
	@Bean("V6Engine")
	public V6 v6(){
		return new V6();
	}
	
	@Bean("V8Engine")
	public V8 v8(){
		return new V8();
	}
}
