package org.airport;

import java.util.Arrays;

public class Airport {

    private String name;
    private Airplane airplanes[];

    public Airport(String name, Airplane[] airplanes) {
        this.name = name;
        this.airplanes = airplanes;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                ", airplanes=" + Arrays.toString(airplanes) +
                '}';
    }


    public Airplane getAvailablePlane(){
        for (Airplane airplane:airplanes) {
            if(!airplane.isFlying() && airplane.getMaxNumberOfPassengers()>airplane.getCurrentNumberOfPassengers()){
                return airplane;
                //System.out.println(airplane.getPlaneIdentification());
            }

        }
        return null;
    }
    public void load(int passenger){
        getAvailablePlane().loadPassengers(passenger);

    }
}
