package UTS_2;

public class Main {
    public static void main(String[] args) {
        Bug bugKritis = new Bug("BUG-001", "Aplikasi Crash saat Login",
                "Aplikasi crash ketika user mencoba login dengan kredensial yang valid",
                "Terbuka", "Iga Ramadana S.", "Kritis",
                "  1. Buka aplikasi\n  2. Masukkan kredensial valid\n  3. Klik login\n  4. Amati crash");

        bugKritis.tampilkan();
        bugKritis.updateStatus("On Progress ");
        bugKritis.eskalasi();
    }
}
