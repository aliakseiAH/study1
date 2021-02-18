package eugene;

import java.util.Scanner;

public class Fighter extends Plane {




    public Fighter(double weight, int maxTonsOfFuel) {
        super(weight, maxTonsOfFuel);

    }

    public double loadAmmunition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity of AA missiles: ");
        int quantityOfMissileAirToAir = sc.nextInt();
        System.out.println("Enter quantity of cannon rounds: ");
        int quantityOfCannonRound = sc.nextInt();
        sc.close();
        return  quantityOfMissileAirToAir*Ammunition.weightOfMissileAirToAir+quantityOfCannonRound*Ammunition.weightOfCannonRound;

    }




}
