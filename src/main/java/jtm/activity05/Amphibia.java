package jtm.activity05;

import jtm.activity04.Transport;
import jtm.activity04.Road;

public class Amphibia extends Transport {

	private int numberOfWheels;
	private byte sails;
	
	public Amphibia(String id, float consumption, int tankSize, byte sails, int numberOfWheels) {
		super(id, consumption, tankSize);
		this.sails = sails;
		this.numberOfWheels = numberOfWheels;
	}
	
	@Override
	public String move (Road road) {
		String message = " ";
		if(road.getClass() == Road.class) {
			message = super.getId() + " " + this.getClass().getSimpleName() + "is driving on " +
		road.toString() + "with " + numberOfWheels + "wheels";
		}else {
			message = super.getId() + " " + this.getClass().getSimpleName() + " is sailing on " +
					road.toString() + "with " + sails + "sails";
		}
		return message;
	}
	
	
	
	
	
}
