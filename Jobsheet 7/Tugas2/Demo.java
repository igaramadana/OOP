package Tugas2;

public class Demo {
    public static void main(String[] args) {
        Manusia human = new Manusia();
        Manusia dosen = new Dosen(); // dynamic method
        Manusia mahasiswa = new Mahasiswa(); // dynamic method
        Mahasiswa mahasiswa2 = new Mahasiswa(); // instansiasi untuk memanggil method didalam class Mahasiswa
        Dosen dosen2 = new Dosen(); // instansiasi untuk memanggil method didalam class Dosen

        // Memanggil method bernafas
        System.out.println("--Method Bernafas--");
        human.bernafas();
        dosen.bernafas();
        mahasiswa.bernafas();

        // Memanggil method makan
        System.out.println("--Method Makan--");
        human.makan();
        dosen.makan();
        mahasiswa.makan();

        // Memanggil method tidur
        System.out.println("--Method Tidur--");
        mahasiswa2.tidur();

        // Memanggil method lembur
        System.out.println("--Method Lembur");
        dosen2.lembur();
    }
}
