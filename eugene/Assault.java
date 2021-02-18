package eugene;

import java.util.Scanner;

public class Assault extends Plane{


    public Assault(double weight, int maxTonsOfFuel) {
        super(weight, maxTonsOfFuel);

    }
    public double loadAmmunition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity of cannon rounds: ");
        int quantityOfCannonRounds = sc.nextInt();
        System.out.println("Enter quantity of unguided missiles: ");
        int quantityOfUnguidedMissiles = sc.nextInt();
        sc.close();
        return  quantityOfCannonRounds*Ammunition.weightOfCannonRound+quantityOfUnguidedMissiles*Ammunition.weightOfUnguidedMissile;

    }
}
