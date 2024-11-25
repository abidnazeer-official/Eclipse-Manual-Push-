package antech.specs;

import org.springframework.stereotype.Component;

import antech.interfaces.Engine;

@Component("V6Engine")
public class V6 implements Engine {

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "V6 Engine";
	}

}
