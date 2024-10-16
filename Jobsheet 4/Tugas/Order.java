package Tugas;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Order {
    private Customer customer;
    private Kasir kasir;
    private ArrayList<Produk> products;
    private ArrayList<Integer> quantities;
    private int jumlahItem;
    private Date tanggalPembelian;

    // Constructor
    public Order(Customer customer, Kasir kasir) {
        this.customer = customer;
        this.kasir = kasir;
        this.products = new ArrayList<>();
        this.quantities = new ArrayList<>();
        this.jumlahItem = 0;
        this.tanggalPembelian = new Date(); // Tanggal pembelian otomatis menggunakan tanggal saat ini
    }

    // Method untuk menambahkan produk ke order
    public void setProducts(Produk produk, int quantity) {
        products.add(produk);
        quantities.add(quantity);
        jumlahItem++;
    }

    // Method untuk menampilkan struk
    public void receipt() {
        int total = 0;

        // Format mata uang Rupiah
        @SuppressWarnings("deprecation")
        Locale localeID = new Locale("id", "ID");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeID);

        // Format tanggal
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");

        // Cetak struk
        System.out.println("-------------------------------------");
        System.out.println("           Struk Pembelian           ");
        System.out.println("-------------------------------------");
        System.out.println("Tanggal Pembelian: " + dateFormat.format(tanggalPembelian));
        System.out.println("Kasir            : " + kasir.getNama());
        System.out.println("-------------------------------------");
        System.out.println("Items            : ");

        int index = 0;
        for (Produk produk : products) {
            int quantity = quantities.get(index);
            int itemTotal = produk.getHarga() * quantity;
            System.out
                    .println(produk.getNama() + " x" + quantity + "        : "
                            + currencyFormatter.format(produk.getHarga()));
            total += itemTotal;
            index++;
        }

        System.out.println("-------------------------------------");
        System.out.println("Customer         : " + customer.getNama());
        System.out.println("Total            : " + currencyFormatter.format(total));
        System.out.println("-------------------------------------");
        System.out.println("              Thank You              ");
        System.out.println("           See you again :)          ");
        System.out.println("-------------------------------------");
    }
}
