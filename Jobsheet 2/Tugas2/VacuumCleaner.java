package Tugas2;

public class VacuumCleaner {
    public String merk;
    public String jenis;
    public int dayaHisap;
    public boolean power = false;

    public void displayInfo() {
        System.out.println("Merk    : " + merk);
        System.out.println("Jenis   : " + jenis);
        aturDaya();
        System.out.println("Status: " + (power ? "Aktif" : "Non-Aktif"));
    }

    public void powerStatus() {
        power = !power;
        System.out.println(merk + " Vacuum cleaner " + (power ? "telah diaktifkan" : "telah dimatikan"));
    }

    public int aturDaya() {
        if (dayaHisap >= 500 && dayaHisap <= 2000) {
            System.out.println("Daya hisap  : " + dayaHisap + " W");
        } else {
            System.out.println("Daya hisap tidak dapat diatur");
        }
        return dayaHisap;
    }
}
