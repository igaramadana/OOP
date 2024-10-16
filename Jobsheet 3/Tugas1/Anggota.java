package Tugas1;

public class Anggota {
    private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String noKtp, String nama, int limitPinjaman) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public void pinjam(int nominal) {
        if (nominal <= limitPinjaman - jumlahPinjaman) {
            jumlahPinjaman += nominal;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }

    public void angsur(int nominal) {
        double minimAngsur = 0.1 * jumlahPinjaman;

        if (nominal < minimAngsur) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        } else if (nominal <= jumlahPinjaman) {
            jumlahPinjaman -= nominal;
        } else {
            System.out.println("Angsuran melebihi jumlah pinjaman!");
        }
    }

    public String getNoKtp() {
        return noKtp;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPeminjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }
}
