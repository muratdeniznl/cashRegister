package org.airport;

public class Airplane {

    private String planeIdentification;
    private int maxNumberOfPassengers;
    private int currentNumberOfPassengers;
    private boolean isFlying;
    private double cruiseSpeed;

    public Airplane() {
    }
    public Airplane(String planeIdentification, int maxNumberOfPassengers,boolean isFlying, double cruiseSpeed) {
        this.planeIdentification = planeIdentification;
        this.maxNumberOfPassengers = maxNumberOfPassengers;
        this.isFlying = isFlying;
        this.cruiseSpeed = cruiseSpeed;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "planeIdentification='" + planeIdentification + '\'' +
                '}';
    }

    public String getPlaneIdentification() {
        return planeIdentification;
    }

    public void setPlaneIdentification(String planeIdentification) {
        this.planeIdentification = planeIdentification;
    }

    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }

    public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public int getCurrentNumberOfPassengers() {
        return currentNumberOfPassengers;
    }

    public void setCurrentNumberOfPassengers(int currentNumberOfPassengers) {
        this.currentNumberOfPassengers = currentNumberOfPassengers;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public double getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(double cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }

    public void loadPassengers(int passengers){
        currentNumberOfPassengers+=passengers;
        if(currentNumberOfPassengers<=maxNumberOfPassengers){
            System.out.println("Airplane " +planeIdentification+ " loads " + currentNumberOfPassengers + " passengers.");
        }else{

            System.out.println("Airplane " +planeIdentification+ " charges "+ maxNumberOfPassengers+ " passengers, "+(currentNumberOfPassengers-maxNumberOfPassengers)+" do not fit");
        }
    }

    public void unloadPassengers(){
        System.out.println("Airplane "+planeIdentification + " discharges " + currentNumberOfPassengers + " passengers.");
        currentNumberOfPassengers=0;
    }

    public void takeOff() {
        if (isFlying) {
            System.out.println("Airplane "+planeIdentification+" can not take off, because we are already flying.");
        } else {
            System.out.println("Airplane "+planeIdentification+" rises.");
            isFlying = true;
        }
    }

    public void land(){
        if(isFlying) {
            System.out.println("Plane " + planeIdentification+" lands.");
            isFlying = false;
        }
            else{
                System.out.println("Airplane "+ planeIdentification+" can not land, because we are still on the ground.");
            }
    }

}
