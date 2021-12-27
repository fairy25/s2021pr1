package tut6;

public class Car {
    // attributes?
    double efficiency; // km/liter
    double gas; // liters

    // constructor
    public Car(double e) {
        efficiency = e;
        gas = 0;
    }

    // methods?
    public void addGas(double g) {
        gas += g;
    }

    public void drive(double km) {
        double gasUsed = km / efficiency;
        if (gasUsed <= gas) {
            gas -= gasUsed;
            System.out.println("Car drove for "
                    + km + "km and used " + gasUsed + " liters of gas.");
        } else {
            km = gas * efficiency;
            System.out.println("Car drove for "
                    + km + "km and used up all " + gas + " liters of gas.");
            gas = 0; // out of gas
        }
    }

    public double getGasInTank() {
        return gas;
    }
}
