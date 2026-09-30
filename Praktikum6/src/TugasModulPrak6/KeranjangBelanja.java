package TugasModulPrak6;

import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> listProduk;

    public KeranjangBelanja() {
        this.listProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        listProduk.add(produk);
    }

    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk p : listProduk) {
            total += p.getHargaSetelahDiskon();
        }
        return total;
    }

    public void tampilkanDetailBelanja() {
        System.out.println("=== Detail Keranjang Belanja  ===");
        System.out.println("\t\tKotok Mart");
        for (Produk p : listProduk) {
            System.out.println("Produk\t: " + p.getNama());
            System.out.println("Harga Awal\t: " + p.getHarga());
            System.out.println("Diskon\t:" + p.hitungDiskon());
            System.out.println("Harga Akhir\t: " + p.getHargaSetelahDiskon());
            System.out.println("----------------------------------");
        }
        System.out.println("Total Bayar\t: Rp." + hitungTotalHargaSetelahDiskon());
    }
}
