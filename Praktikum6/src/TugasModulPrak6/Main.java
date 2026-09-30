package TugasModulPrak6;

public class Main {
    public static void main(String[] args) {
        Produk buku1 = new Buku("Keajaiban Toko Kelontong Namiya", 100000);
        Produk laptop = new Elektronik("Laptop Asus", 6500000);
        Produk jersey = new Pakaian("Jersey Arsenal Asli", 150000);

        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(laptop);
        keranjang.tambahProduk(jersey);

        keranjang.tampilkanDetailBelanja();
    }
}
