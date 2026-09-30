package TugasPrak5;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Oyen";
        kucing.usia = 5;
        kucing.jumlahKaki = 4;
        kucing.suara = "Miaw Miaw";
        kucing.tampilkanInfo();

        Anjing anjing = new Anjing();
        anjing.nama = "Bull";
        anjing.usia = 7;
        anjing.jumlahKaki = 4;
        anjing.suara = "Guk";
        anjing.tampilkanInfo();
    }
}
