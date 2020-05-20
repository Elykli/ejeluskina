package jtm.activity05;

import jtm.activity04.Transport;
import jtm.activity04.Road;

public class Vehicle extends Transport {

	protected int numberOfWheels;
	
	public Vehicle(String id, float consumption, int tankSize, int numberOfWheels) {
		super(id, consumption, tankSize);
		this.numberOfWheels = numberOfWheels;
	}

	@Override
	public String move (Road road) {
		
		if(road instanceof WaterRoad) 
			return "Cannot drive on "+ road.toString();
		float distance = road.getDistance()/(float) 1;
        float consumption = getConsumption();
        float neededFuel = (distance/100)*consumption;
        float fuel = getFuelInTank();
        float remainingFuel = fuel-neededFuel;
        setFuelInTank(remainingFuel);
        return super.getType() + " is driving on " + road.toString() + " with " + numberOfWheels + " wheels";
	}
	
	
}
