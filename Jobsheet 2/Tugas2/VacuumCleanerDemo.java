package Tugas2;

public class VacuumCleanerDemo {
    public static void main(String[] args) {
        VacuumCleaner vacuum1 = new VacuumCleaner();
        vacuum1.merk = "Panasonic";
        vacuum1.jenis = "Bagless";
        vacuum1.dayaHisap = 500;
        vacuum1.power = false;

        VacuumCleaner vacuum2 = new VacuumCleaner();
        vacuum2.merk = "Dyson";
        vacuum2.jenis = "Bagged";
        vacuum2.dayaHisap = 3000;
        vacuum2.power = true;

        vacuum1.displayInfo();
        System.out.println();
        vacuum2.displayInfo();
    }
}
