package antech.car;

import org.springframework.stereotype.Component;

import antech.interfaces.Car;
@Component("swift")
public class Swift implements Car {

	@Override
	public void specs() {
		// TODO Auto-generated method stub
		System.out.println("Hatchback From Suzuki");
	}
	

}
