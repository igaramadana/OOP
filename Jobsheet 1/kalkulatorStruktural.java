import java.util.Scanner;

public class kalkulatorStruktural {
    static double hasil, angka1, angka2;
    static String operasi;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*** KALKULATOR SEDERHANA ***");
        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        System.out.print("Operasi (+, -, *, /): ");
        operasi = input.next();

        switch (operasi) {
            case "+":
                operasiTambah();
                break;
            case "-":
                operasiKurang();
                break;
            case "*":
                operasiPerkalian();
                break;
            case "/":
                operasiPembagian();
                break;
            default:
                System.out.println("Operasi tidak Valid!");
                break;
        }
    }

    public static void operasiTambah() {
        hasil = angka1 + angka2;
        System.out.println("Hasil: " + hasil);
    }

    public static void operasiKurang() {
        hasil = angka1 - angka2;
        System.out.println("Hasil: " + hasil);
    }

    public static void operasiPerkalian() {
        hasil = angka1 * angka2;
        System.out.println("Hasil: " + hasil);
    }

    public static void operasiPembagian() {
        if (angka2 != 0) {
            hasil = angka1 / angka2;
            System.out.println("Hasil: " + hasil);
        } else {
            System.out.println("Pembagian dengan 0 tidak diperbolehkan!");
        }
    }
}
