package perusahaan;

public class Manajer extends Karyawan {
    private String divisi;
    private int jumlahAnggotaTim;

    public Manajer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String divisi, int jumlahAnggotaTim){
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.divisi = divisi;
        this.jumlahAnggotaTim = jumlahAnggotaTim;
    }

    public String getDivisi(){
        return this.divisi;
    }

    public int getJumlahAnggotaTim(){
        return this.jumlahAnggotaTim;
    }

    public double hitungGajiTotal(){
        double gajiSementara = super.hitungGajiTotal();
        double tunjanganTim = jumlahAnggotaTim * 300000;

        if (getRatingKinerja() > 4.5){
            tunjanganTim += tunjanganTim * 0.2; // bonus 20% untuk rating tinggi 
        }
        return gajiSementara + tunjanganTim;
    }

    public void displayInfo(){
        super.displayInfo();
    }
}
