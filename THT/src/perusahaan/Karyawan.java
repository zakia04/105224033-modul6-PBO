package perusahaan;

public class Karyawan {
    private String idKaryawan;
    private String nama;
    private int tahunMasuk;
    private double gajiPokok;
    private double ratingKinerja;

    public Karyawan(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja){
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;
        //untuk aturan validasi rating kinerja 
        if (ratingKinerja >= 1.0 && ratingKinerja <= 5.0){
            this.ratingKinerja = ratingKinerja;
        } else {
            this.ratingKinerja = 3.0; //default input ga valid
        }
    }
    //getter & setter
    public String getIDKaryawan(){
        return this.idKaryawan;
    }

    public void setIDKaryawan(String idKaryawan){
        this.idKaryawan = idKaryawan;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getTahunMasuk(){
        return this.tahunMasuk;
    }

    public void setTahunMasuk(int tahunMasuk){
        this.tahunMasuk = tahunMasuk;
    }

    public double getGajiPokok(){
        return this.gajiPokok;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public double getRatingKinerja(){
        return this.ratingKinerja;
    }

    public double hitungGajiTotal(){
        int masaKerja = 2026 - getTahunMasuk();
        double total = masaKerja * gajiPokok; 

        if (getRatingKinerja() < 2.5){
           total = total * 0.1; //penalti untuk rating rendah
        } else {
            total = total + (total * 0.5); // bonus 50% rating baik
        }
        return total;
    }

    public void displayInfo(){
        System.out.println("\n=== INFO DATA KARYAWAN ===");
        System.out.println("ID Karyawan   : " + getIDKaryawan());
        System.out.println("Nama Karyawan : " + getNama());
        System.out.println("Tahun Masuk   : " + getTahunMasuk());
        System.out.println("Rating Kinerja: " + getRatingKinerja());
        System.out.println("Gaji Pokok    : " + getGajiPokok());
    }
}
