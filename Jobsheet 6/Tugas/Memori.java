package Tugas;

public class Memori extends ComputerParts {
    int kapasitasGB;
    String tipeMemori;

    // Constructor tanpa parameter
    public Memori() {
        super();
        this.kapasitasGB = 0;
        this.tipeMemori = "Unknown";
    }

    // Constructor dengan parameter
    public Memori(String nama, double price, String merk, int kapasitasGB, String tipeMemori) {
        super(nama, price, merk);
        this.kapasitasGB = kapasitasGB;
        this.tipeMemori = tipeMemori;
    }

    public void tambahKapasitas(int tambahanGB) {
        this.kapasitasGB += tambahanGB;
        System.out.println("Kapasitas Memori bertambah menjadi: " + kapasitasGB + " GB");
    }

    @Override
    public void detailInfo() {
        super.detailInfo();
        System.out.println("Kapasitas Memori: " + kapasitasGB + " GB");
        System.out.println("Tipe Memori: " + tipeMemori);
    }
}
