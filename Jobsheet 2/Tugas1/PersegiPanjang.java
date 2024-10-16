package Tugas1;

public class PersegiPanjang {
    int panjang;
    int lebar;

    public void displayInfo() {
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
        System.out.println("Luas Persegi Panjang: " + getLuas());
        System.out.println("Keliling Persegi Panjang: " + getKeliling());
    }

    public int getLuas() {
        return panjang * lebar;
    }

    public int getKeliling() {
        return 2 * (panjang + lebar);
    }
}
