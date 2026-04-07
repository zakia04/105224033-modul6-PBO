package game;

public class Hero {
    String nama;
    double health;
    double attackPower;

    //no 1
    public Hero(String nama, double health, double attackPower) {
        this.nama = nama;
        this.health = health;
        this.attackPower = attackPower;
    }

    //no2
    public void display(){
        System.out.println("Nama Hero: " + this.nama);
        System.out.println("Jumlah Darah: " + this.health);
        System.out.println("Kekuatan Serangan: " + this.attackPower);
        System.out.println("\n");
    }

    public void berlatih(){
        this.attackPower += 10;
        System.out.println("Karakkter " + this.nama + " sedang berlatih");
        System.out.println("\n");
    }

    public void terimaSerangan(double damage){
        this.health -= damage;
        System.out.println("Karakter " + this.nama + " menerima damage sebesar " + damage);
        System.out.println("\n");
    }
    
}
