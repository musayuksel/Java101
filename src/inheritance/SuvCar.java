package inheritance;

public class SuvCar extends Car {//SuvCar is a child class of Car => suvCar is a Car
    int towingCapacityKg;

    public SuvCar(String make, String model, int year, int towingCapacity) {
        super(make, model, year);
        this.towingCapacityKg = towingCapacity;
    }

    public int getTowingCapacity() {
        return towingCapacityKg;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacityKg = towingCapacity;
    }

    public String getCarInformation() {
        return "Make: " + make + ". Model: " + model + ". Year: " + year + ". Towing Capacity(Kg): " + towingCapacityKg + ".";
    }
}

