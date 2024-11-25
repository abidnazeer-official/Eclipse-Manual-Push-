package antech.specs;

import org.springframework.stereotype.Component;

import antech.interfaces.Engine;

@Component("V8Engine")
public class V8 implements Engine{

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "V8 Engine";
	}

}
