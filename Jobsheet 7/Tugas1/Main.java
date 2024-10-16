package Tugas1;

public class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        // menghitung total sudut
        int sudutA = 60;
        int sudutB = 80;
        int totalSudutA = segitiga.totalSudut(sudutA);
        int totalSudutB = segitiga.totalSudut(sudutA, sudutB);
        System.out.println("Total Sudut A = " + totalSudutA);
        System.out.println("Total Sudut A & Sudut B = " + totalSudutB);

        // menghitung keliling
        int sisiA = 3;
        int sisiB = 4;
        int sisiC = 15;
        double keliling1 = segitiga.keliling(sisiA, sisiB, sisiC);
        double keliling2 = segitiga.keliling(sisiA, sisiB);
        System.out.println("Total Keliling 1 = " + keliling1);
        System.out.println("Total Keliling 2 = " + keliling2);
    }
}
