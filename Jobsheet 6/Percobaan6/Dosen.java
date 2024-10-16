package Percobaan6;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen(String nip, String nama, double gaji, String nidn) {
        System.out.println("Objek dari class Dosen dibuat dengan constructor berparameter");
    }

    public String getInfo() {
        return "NIDN       : " + nidn;
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}
