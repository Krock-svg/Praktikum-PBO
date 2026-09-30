package Responsi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class produk {
    private String namaProduk;
    private int harga;

    // Constructor
    public produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public String getNamaProduk() {
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Responsi.produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }

}

class Elektronik extends produk {
    private int garansi;

    public Elektronik(String namaProduk, int harga, int garansi) {
        super(namaProduk, harga);
        this.garansi = garansi;
    }

    // Getter and Setter
    public int getGaransi() {
        return garansi;
    }
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi: " + garansi);
    }

    @Override
    public String toString() {
        System.out.println("----Info Elektronik----");
        System.out.println("Nama Produk\t: " + getNamaProduk());
        System.out.println("Harga\t: " + getHarga());
        System.out.println("Garansi\t: " + getGaransi() + " tahun");
        return null;
    }
}

class Makanan extends produk {
    private LocalDate tanggalKadaluarsa;
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Makanan(String namaProduk, int harga, LocalDate tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    // Getter and Setter
    public LocalDate getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }
    public void setTanggalKadaluarsa(LocalDate tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }

    @Override
    public String toString() {
        System.out.println("\n----Info Makanan----");
        System.out.println("Nama Produk\t: " + getNamaProduk());
        System.out.println("Harga\t: " + getHarga());
        System.out.println("Tanggal Kadaluarsa\t: " + getTanggalKadaluarsa());
        return null;
    }

}



