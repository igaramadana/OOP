package Percobaan4.Modifikasi;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen() {
        System.out.println("Objek dari class Dosen dibuat");
    }

    public String getAllInfo() {
        String info = "";
        info += "NIP        : " + this.nip + "\n";
        info += "Nama       : " + this.nama + "\n";
        info += "Gaji       : " + this.gaji + "\n";
        info += "NIDN       : " + this.nidn + "\n";

        return info;
    }
}
