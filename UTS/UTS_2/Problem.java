package UTS_2;

public class Problem extends ItemProject {
    protected String status;
    protected String penugasan;

    public Problem(String id, String judul, String deskripsi, String status, String penugasan) {
        super(id, judul, deskripsi);
        this.status = status;
        this.penugasan = penugasan;
    }

    public void updateStatus(String statusBaru) {
        this.status = statusBaru;
        System.out.println("Status diupdate menjadi: " + statusBaru);
    }
}
