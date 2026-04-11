import java.util.ArrayList;
import perusahaan.*; // semua class

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Karyawan>kar = new ArrayList<>(); //buat objek di array 
        kar.add(new Karyawan("K-001", "Ade", 2020, 7500000, 2.0));
        kar.add(new Developer("D-001", "Rini", 2018, 8500000, 4.0, "Senior", 20));
        kar.add(new Developer("D-002", "Rizki", 2024, 4500000, 2.8, "Mid", 15));
        kar.add(new Manajer("M-001", "Budi", 2015, 9000000, 4.8, "IT", 10));
        kar.add(new Manajer("M-002", "Tono", 2025, 8000000, 3.5, "HR", 3));
           
        double totalAnggaranGaji = 0;
        Karyawan highestEarner = kar.get(0);
        double totalRating = 0;
        for (Karyawan list : kar) {
            list.displayInfo();
            System.out.printf("Total Gaji Bulan ini: Rp%,.0f%n", list.hitungGajiTotal()); //format untuk penulisan gaji dari karyawan
            totalAnggaranGaji += list.hitungGajiTotal(); // akumulasi gaji karyawan

            if (list.hitungGajiTotal() > highestEarner.hitungGajiTotal()){
                highestEarner = list; //update karyawan gaji tertinggi
            }

            totalRating += list.getRatingKinerja(); 
        }
        double meanRating = totalRating / kar.size(); // untuk hitung rata rata rating

        System.out.printf("\n Total Anggaran Perusahaan: Rp%,.0f%n ", totalAnggaranGaji);
        System.out.println("Nama Karyawan dengan Gaji Tertinggi: " + highestEarner.getNama());
        System.out.printf(" Rata-rata Rating Kinerja: %.2f%n", meanRating);
    }
}
