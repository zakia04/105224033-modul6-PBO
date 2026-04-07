package rental;

public class Mobil extends Kendaraan{
    int kapasitasPenumpang;

    public Mobil(String nomorPolisi, String merk, int tahunProduksi, double hargaSewa, int kapasitasPenumpang){
        super(nomorPolisi, merk, tahunProduksi, hargaSewa);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }


    public double hitungHargaSewa(int hari){
        double totalHargaSewa = super.hitungHargaSewa(hari);
        totalHargaSewa += hari * 50000;
        if(kapasitasPenumpang > 5){
            totalHargaSewa = totalHargaSewa + 50000;
        }
        return totalHargaSewa;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Kapasitas Penumpang \t: " + this.kapasitasPenumpang + " Orang");
    }
}
