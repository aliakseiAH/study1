package eugene;

import java.util.Scanner;

public class Helicopter extends Assault {
    private int maxNumberOfTroops;
    private int numberOfTroops;

    public Helicopter(double weight, int maxTonsOfFuel, int numberOfTroops, int maxNumberOfTroops) {
        super(weight, maxTonsOfFuel);
        this.numberOfTroops = numberOfTroops;
        this.maxNumberOfTroops = maxNumberOfTroops;
    }

    public void loadUnloadTroops(int numberOfTroops) {
        if (numberOfTroops<=maxNumberOfTroops) {
            this.numberOfTroops = this.numberOfTroops + numberOfTroops;
        } if (this.numberOfTroops<0) {
            System.out.println("It cant be people less then null");
        }
        else System.out.println("Too many troops, fuck you, commander");
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
