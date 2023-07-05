package org.airport;

public class Application {
    public static void main(String[] args) {
//        System.out.println("Test");
        Airplane airplane = new Airplane();

        Airplane airplane1 = new Airplane("ABC123",33,false,750);
        Airplane airplane2 = new Airplane("DDD888",23,true,700);
        Airplane airplane3 = new Airplane("ZXC456",50,false,700);
        airplane1.loadPassengers(10);
        airplane1.land();
        airplane1.takeOff();
        airplane1.takeOff();
        airplane1.land();
        airplane1.unloadPassengers();

//        airplane1.loadPassengers();
//        airplane1.land();
//        airplane1.takeOff();
//        airplane2.loadPassengers();
//        airplane2.takeOff();
//        airplane1.land();
//        airplane1.unloadPassengers();
//        airplane2.takeOff();
//        airplane2.land();
//        airplane2.unloadPassengers();

        Airplane [] airplanes = {airplane1, airplane2,airplane3};
        Airport airport = new Airport("Zoetermeer", airplanes);
        System.out.println(airport);

        System.out.println(airport.getAvailablePlane());
        airport.load(43);

//        airplane1.unloadPassengers();

    }
}