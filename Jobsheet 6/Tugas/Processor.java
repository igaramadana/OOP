package Tugas;

public class Processor extends ComputerParts {
    int jumlahCore;
    double kecepatanClock;
    String tipeSocket;
    public double clockSpeed;

    // Constructor tanpa parameter
    public Processor() {
        super();
        this.jumlahCore = 0;
        this.kecepatanClock = 0.0;
        this.tipeSocket = "Unknown";
    }

    // Constructor dengan parameter
    public Processor(String nama, double price, String merk, int jumlahCore, double kecepatanClock, String tipeSocket) {
        super(nama, price, merk);
        this.jumlahCore = jumlahCore;
        this.kecepatanClock = kecepatanClock;
        this.tipeSocket = tipeSocket;
    }

    public void overclock(double kecepatanBaru) {
        this.kecepatanClock = kecepatanBaru;
        System.out.println("Processor di-overclock ke: " + kecepatanBaru + " GHz");
    }

    @Override
    public void detailInfo() {
        super.detailInfo();
        System.out.println("Jumlah Core: " + jumlahCore);
        System.out.println("Kecepatan Clock: " + kecepatanClock + " GHz");
        System.out.println("Tipe Socket: " + tipeSocket);
    }
}
