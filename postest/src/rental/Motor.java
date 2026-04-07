package rental;

public class Motor extends Kendaraan {
    int kapasitasMesin;

    public Motor(String nomorPolisi, String merk, int tahunProduksi, double hargaSewa, int kapasitasMesin){
        super(nomorPolisi, merk, tahunProduksi, hargaSewa);
        this.kapasitasMesin = kapasitasMesin;
    }
    @Override
    public double hitungHargaSewa(int hari){
        double totalHargaSewa = super.hitungHargaSewa(hari);
        if (kapasitasMesin >= 250){
            totalHargaSewa = totalHargaSewa + (hari * 25000);
        } 
        return totalHargaSewa;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Kapasitas Mesin \t: " + this.kapasitasMesin + " CC");
    }

}
