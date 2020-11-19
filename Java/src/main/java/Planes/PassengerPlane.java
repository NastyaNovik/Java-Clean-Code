package Planes;

import java.util.Objects;

public class PassengerPlane extends Plane{

    private int passengersCapacity;

    public PassengerPlane(String modelOfPassengerPlane, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity) {
        super(modelOfPassengerPlane, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public boolean equals(Object plane) {
        return this == plane || plane instanceof PassengerPlane || super.equals(plane) || passengersCapacity == ((PassengerPlane)plane).passengersCapacity;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity);
    }
    
    @Override
    public String toString() {
        return super.toString().replace("}",
            ", passengersCapacity=" + passengersCapacity +
            '}');
    }
}
