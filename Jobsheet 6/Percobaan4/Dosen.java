package Percobaan4;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen() {
        System.out.println("Objek dari class Dosen dibuat");
    }

    public String getAllInfo() {
        String info = "";
        info += "NIP        : " + nip + "\n";
        info += "Nama       : " + nama + "\n";
        info += "Gaji       : " + gaji + "\n";
        info += "NIDN       : " + nidn + "\n";

        return info;
    }
}
