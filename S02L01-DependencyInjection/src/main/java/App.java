import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import antech.car.*;
import antech.interfaces.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car swift = new Swift();
//		swift.specs();
//		Car corolla = new Corolla();
//		corolla.specs();
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar = context.getBean("swift",Car.class);
		Car myCar1 = context.getBean("corolla",Car.class);
		myCar.specs();
		myCar1.specs();
		context.close();
	}

}
