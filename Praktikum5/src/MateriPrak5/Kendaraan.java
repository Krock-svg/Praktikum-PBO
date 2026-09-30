package MateriPrak5;


// Kelas Induk
class Kendaraan {
    String nama;
    int kecepatan;

    public void tampilkanInfo() {
        System.out.println("\nNama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}

// Kelas Turunan Mobil
class Mobil extends Kendaraan {
    int jumlahPintu;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

// Kelas Turunan SepedaMotor
class SepedaMotor extends Kendaraan {
    String jenisMesin;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}













