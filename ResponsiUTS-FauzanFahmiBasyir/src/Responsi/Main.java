package Responsi;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Elektronik laptop = new Elektronik("Laptop Acer", 10000000, 3);
        laptop.toString();

        Makanan roti = new Makanan("Roti 'O", 15000, LocalDate.of(2026, 05, 15));
        roti.toString();

        PegawaiTetap pegawai = new PegawaiTetap("Suherman", 20, 30);
        pegawai.toString();

        PegawaiKontrak magang = new PegawaiKontrak("Bunga", 5, 3);
        magang.toString();
    }
}
