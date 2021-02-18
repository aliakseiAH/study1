package eugene;

public abstract class Plane implements LoadAmmunition {
    private double weight;
    private int maxTonsOfFuel;
    private double tonsOfFuel;
    private double weightOfAmmunition;
    private double weightFull;


    public double getTonsOfFuel() {
        return tonsOfFuel;
    }

    public double getWeight() {
        return weight;
    }

    public Plane(double weight, int maxTonsOfFuel) {
        this.weight = weight;
        this.maxTonsOfFuel = maxTonsOfFuel;


    }

    public double fuelPlane(double tons) {
        if (tons + this.tonsOfFuel <= maxTonsOfFuel)
            this.tonsOfFuel = this.tonsOfFuel + tons;
        else
            System.out.println("Too much fuel in the tank, its going outside, fuck you, commander");
        return tonsOfFuel;
    }


    public double weightFull() {
        this.weightFull = getWeight() + getTonsOfFuel();
        return this.weightFull;
    }

    public double getWeightOfAmmunition() {
        this.weightOfAmmunition = loadAmmunition();
        return weightOfAmmunition;
    }

    public double fly() {
        return (this.weightFull - this.weightOfAmmunition);


    }
}

//1137.1428571428569
//1137.1428571428569

