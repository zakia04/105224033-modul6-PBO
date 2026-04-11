package perusahaan;

public class Developer extends Karyawan {
    private String level; 
    private int jumlahBugFix;

    public Developer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String level, int jumlahBugFix){
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.level = level;
        this.jumlahBugFix = jumlahBugFix;
    }

    public String getLevel(){
        return this.level;
    }

    public int getJumlahBugFix(){
        return this.jumlahBugFix;
    }

    public double hitungGajiTotal(){
        double gajiSementara = super.hitungGajiTotal();

        if (getRatingKinerja() >= 3.0){
            gajiSementara += jumlahBugFix * 50000; //bonus per bug
        }
        //tunjangan untuk level
        if (level.equalsIgnoreCase("junior")){
            return gajiSementara;
        } else if (level.equalsIgnoreCase( "mid")){
            return gajiSementara + 1500000;
        } else if (level.equalsIgnoreCase( "senior")){
            return gajiSementara + 3000000;
        }
        return gajiSementara;
    }

    public void displayInfo(){
        super.displayInfo();
    }
}
