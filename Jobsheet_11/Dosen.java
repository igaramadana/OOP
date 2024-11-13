package Jobsheet_11;

public class Dosen extends Pegawai {
	public String nidn;

	public Dosen(String nip, String nama, String nind) {
		super(nip, nama);
		this.nidn = nind;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("NIDN	: " + nidn);
	}

	public void mengajar() {
		System.out.println("Membuat rencana pembelajaran");
		System.out.println("Menyusun materi");
        System.out.println("Melaksananakan PBM");
        System.out.println("Melakukan evaluasi");
	}
}