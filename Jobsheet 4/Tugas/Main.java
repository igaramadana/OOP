package Tugas;

public class Main {
    public static void main(String[] args) {
        Produk laptop = new Produk("Laptop", 7000000);
        Produk smartphone = new Produk("Smartphone", 4000000);
        Produk radio = new Produk("Radio", 200000);

        Kasir kasir1 = new Kasir("Squidward");
        Customer customer1 = new Customer("Mr. Krab");
        Order order1 = new Order(customer1, kasir1);

        order1.setProducts(laptop, 1);
        order1.setProducts(smartphone, 2);
        order1.setProducts(radio, 3);
        System.out.println();

        order1.receipt();
    }
}
