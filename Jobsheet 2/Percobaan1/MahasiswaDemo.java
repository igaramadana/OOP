package Percobaan1;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "2341760083";
        m2.nama = "Iga Ramadana Sahputra";
        m2.alamat = "Malang";
        m2.kelas = "2C";

        m1.displayBiodata();
        System.out.println();
        m2.displayBiodata();
    }
}
