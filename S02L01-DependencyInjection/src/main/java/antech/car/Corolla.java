package antech.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import antech.interfaces.Car;
@Component("corolla")
public class Corolla implements Car {
	
	@Autowired(required= false)
	Engine engine;
	
	@Override
	public void specs() {
		// TODO Auto-generated method stub
		System.out.println("Sedan from Toyota with Engine as " + engine.type);
		
	}

}
