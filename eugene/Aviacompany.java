package eugene;

public class Aviacompany {
    public static void main(String[] args) {
        Fighter su27 = new Fighter(32, 8);
        //su27.loadAmmunition();
        su27.fuelPlane(7.8);
        System.out.println(su27.weightFull());
        System.out.println(su27.fly());

    }
}
