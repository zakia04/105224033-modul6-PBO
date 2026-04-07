package rental;

public class Kendaraan {
    String nomorPolisi;
    String merk;
    int tahunProduksi;
    double hargaSewa;

    public Kendaraan(String nomorPolisi, String merk, int tahunProduksi, double hargaSewa){
        this.nomorPolisi = nomorPolisi;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.hargaSewa = hargaSewa;
        
    }

    public void displayInfo(){
        System.out.println("Nomor Polisi \t\t: " + this.nomorPolisi);
        System.out.println("Merk Kendaraan \t\t: " + this.merk);
        System.out.println("Tahun Produksi Kendaraan: " + this.tahunProduksi);
        System.out.println("Harga Sewa Awal\t\t: " + this.hargaSewa);
    }

    public double hitungHargaSewa(int hari){
        double totalHargaSewa =  hari * hargaSewa;
        if (tahunProduksi < 2015){
            totalHargaSewa = totalHargaSewa - (totalHargaSewa * 0.1);
        }
        return totalHargaSewa;
    }

    
}
