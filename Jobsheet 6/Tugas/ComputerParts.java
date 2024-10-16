package Tugas;

public class ComputerParts {
    String nama;
    double price;
    String merk;

    // Constructor tanpa parameter
    public ComputerParts() {
        this.nama = "Unknown";
        this.price = 0.0;
        this.merk = "Unknown";
    }

    // Constructor dengan parameter
    public ComputerParts(String nama, double price, String merk) {
        this.nama = nama;
        this.price = price;
        this.merk = merk;
    }

    public void detailInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Price: " + price);
        System.out.println("Merk: " + merk);
    }
}
