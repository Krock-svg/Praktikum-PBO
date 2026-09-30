package MateriPrak5;

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota";
        mobil.kecepatan = 180;
        mobil.jumlahPintu = 4;
        mobil.tampilkanInfo();

        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Astrea";
        motor.kecepatan = 120;
        motor.jenisMesin = "4-tak";
        motor.tampilkanInfo();
    }
}
