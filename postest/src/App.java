import java.util.ArrayList;
import rental.*;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
        daftarKendaraan.add(new Motor("B 1234 ABC", "Yamaha Aerox", 2018, 100000, 150));
        daftarKendaraan.add(new Motor("B 4321 GHI", "Honda Vario", 2018, 200000, 250));
        daftarKendaraan.add(new Mobil ("B 5678 DEF", "Toyota", 2013, 300000, 7));
        daftarKendaraan.add(new Mobil("B 9854 HYQ", "BYD", 2018, 700000, 4));
        
        for (Kendaraan dafKen : daftarKendaraan) {
            System.out.println("======= Kendaraan ke-" + (daftarKendaraan.indexOf(dafKen) + 1) + " =======");
            dafKen.displayInfo();
            System.out.println("Total Biaya Sewa 5 Hari : " + dafKen.hitungHargaSewa(5));
            System.out.println(); 
        }   

    }
}
