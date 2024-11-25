package antech.specs;

import antech.interfaces.Engine;

public class EngineType implements Engine {

	String type;
	
	
	
	public EngineType() {
		type = "Unknown";
	}

	public EngineType(String type) {
		super();
		this.type = type;
	}



	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return type;
	}

}
