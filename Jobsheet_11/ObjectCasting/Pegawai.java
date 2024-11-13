package Jobsheet_11.ObjectCasting;

public class Pegawai {
	public String nama;
	public String nip;

    public Pegawai(){
    }

	public Pegawai(String nip, String nama) {
		this.nama = nama;
		this.nip = nip;
	}

    public void displayInfo() {
        System.out.println("NIP     : " + nip);
        System.out.println("Nama    : " + nama);
    }
}
