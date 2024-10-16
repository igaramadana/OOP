package UTS_2;

public class ItemProject {
    protected String id;
    protected String judul;
    protected String deskripsi;

    public ItemProject(String id, String judul, String deskripsi) {
        this.id = id;
        this.judul = judul;
        this.deskripsi = deskripsi;
    }

    public void tampilkan() {
        System.out.println("ID          : " + id);
        System.out.println("Judul       : " + judul);
        System.out.println("Deskripsi   : " + deskripsi);
    }
}