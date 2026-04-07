package game;

public class HeroStrength extends Hero {
    String tipe = "strength";
    //no 3
    public HeroStrength(String nama, double health, double attackPower) {
        super(nama, health, attackPower);
        this.tipe = "strength";
    }

    //no 4
    @Override
    public void display(){
        super.display();
        System.out.println("Tipe Hero: " + this.tipe);
        System.out.println("\n");
    }

    public void terimaSerangan(double damage){
        double damageDiterima = damage - (0.5 * damage);
        System.out.println("Karakter " + this.nama + " menerima damage sebesar " + damageDiterima);
        System.out.println("\n");

    }
}
