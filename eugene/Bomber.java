package eugene;

import java.util.Scanner;

public class Bomber extends Plane {
    private int numberOfBombs;
    private int numberOFMissilesAirToSurface;

    public Bomber(double weight, int maxTonsOfFuel, int tonsOfFuel, int numberOfBombs, int numberOFMissilesAirToSurface) {
        super(weight, maxTonsOfFuel);
        this.numberOfBombs = numberOfBombs;
        this.numberOFMissilesAirToSurface = numberOFMissilesAirToSurface;
    }

    public double loadAmmunition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity of bombs: ");
        int quantityOfBombs = sc.nextInt();
        System.out.println("Enter quantity of AS missiles: ");
        int quantityOfMissilesAirToSurface = sc.nextInt();
        sc.close();
        return  quantityOfBombs*Ammunition.weightOfBomb+quantityOfMissilesAirToSurface*Ammunition.weightOfMissileAirToSurface;

    }
}
