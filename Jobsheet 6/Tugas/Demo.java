package Tugas;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Run dengan Constructor tidak Berparameter");
        System.out.println("2. Run dengan Constructor Berparameter");
        System.out.print("Pilih: ");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                Processor proc1 = new Processor();
                proc1.nama = "Intel i9";
                proc1.price = 5000000;
                proc1.merk = "Intel";
                proc1.jumlahCore = 8;
                proc1.clockSpeed = 3.6;
                proc1.tipeSocket = "LGA1700";
                proc1.detailInfo();
                proc1.overclock(4.0);
                System.out.println();
                Memori ram1 = new Memori();
                ram1.nama = "Corsair Vengeance";
                ram1.price = 1500000;
                ram1.merk = "Corsair";
                ram1.kapasitasGB = 16;
                ram1.tipeMemori = "DDR4";
                ram1.detailInfo();
                ram1.tambahKapasitas(8);
                System.out.println("==========================================================");
                proc1.detailInfo();
                System.out.println();
                ram1.detailInfo();
                break;
            case 2:
                Processor proc2 = new Processor("Intel i9", 5000000, "Intel", 8, 3.6, "LGA1200");
                proc2.detailInfo();
                proc2.overclock(4.0);
                System.out.println();
                Memori ram2 = new Memori("Corsair Vengeance", 1500000, "Corsair", 16, "DDR4");
                ram2.detailInfo();
                ram2.tambahKapasitas(8);
                System.out.println("==========================================================");
                proc2.detailInfo();
                System.out.println();
                ram2.detailInfo();
                break;
            default:
                System.out.println("Input tidak Valid");
                break;
        }

    }
}
