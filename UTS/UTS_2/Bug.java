package UTS_2;

public class Bug extends Problem {
    private String tingkatKeparahan;
    private String langkahReproduksi;

    public Bug(String id, String judul, String deskripsi, String status, String penugasan, String tingkatKeparahan,
            String langkahReproduksi) {
        super(id, judul, deskripsi, status, penugasan);
        this.tingkatKeparahan = tingkatKeparahan;
        this.langkahReproduksi = langkahReproduksi;
    }

    @Override
    public void tampilkan() {
        super.tampilkan();
        System.out.println("Status            : " + status);
        System.out.println("Penugasan         : " + penugasan);
        System.out.println("Tingkat Keparahan : " + tingkatKeparahan);
        System.out.println("Langkah Reproduksi: \n" + langkahReproduksi);
    }

    public void eskalasi() {
        System.out.println(
                "Bug dengan ID " + id + " telah ditingkatkan karena tingkat keparahannya " + tingkatKeparahan + ".");
    }
}
