package Tugas1;

public class Segitiga {
    private int sudut;

    // method untuk menghitung total sudut dengan 1 parameter
    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    // method untuk menghitung total sudut dengan 2 parameter
    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    // method untuk menghitung keliling segitiga dengan 3 parameter
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // method untuk menghitung keliling segitiga siku-siku dengan 2 parameter
    public double keliling(int sisiA, int sisiB) {
        double sisiC = Math.sqrt(Math.pow(sisiA, 2)) + Math.sqrt(Math.pow(sisiB, 2));
        // Menghitung keliling segitiga (jumlah dari ketiga sisi)
        return sisiC;
    }
}
