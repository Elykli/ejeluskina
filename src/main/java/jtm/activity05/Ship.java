package jtm.activity05;

import jtm.activity04.Transport;
import jtm.activity04.Road;
public class Ship extends Transport {

	protected byte sails;
	
	public Ship(String id, byte sails) {
		super(id, 0f, 0);
		this.sails = sails;
	}
	
	@Override
	public String move (Road road) {
		String message = " ";
		if( road instanceof WaterRoad) {
			message = super.getId() + "is sailing on " 
					+ road.toString() + "with " + sails + "sails ";
 		}else {
 			message = "Cannot sail on " + road.toString();
 		}
		return message;
	}

	

	

}
