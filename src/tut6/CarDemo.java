package tut6;

public class CarDemo {
    public static void main(String[] args) {
        Car myHybrid = new Car(60); // efficiency of 30 miles per liter
        myHybrid.addGas(2); // Tank 2 liters
        myHybrid.drive(100); // Drive 100 kms
        double gasLeft = myHybrid.getGasInTank(); // Get gas remaining in tank
    }
}
