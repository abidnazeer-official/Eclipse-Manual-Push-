package antech.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import antech.interfaces.Car;
import antech.interfaces.Engine;


public class Corolla implements Car {
	
	@Autowired
	@Qualifier("V8Engine")
	Engine engine;
	
//	public Corolla(Engine engine) {
//		engine.type = "V6";
//		this.engine = engine;
//	}
	
//	@Autowired
//	public void setEngine(Engine engine) {
//		engine.type = "V10";
//		this.engine = engine;
//	}
	
//	public Corolla(Engine engine) {
//		super();
//		this.engine = engine;
//	}
	
	@Override
	public void specs() {
		// TODO Auto-generated method stub
		System.out.println("Sedan from Toyota with Engine as " + engine.specs());
	}
}
