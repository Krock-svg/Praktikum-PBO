package TugasPrak5;


// Kelas Induk
public class Hewan {
    String nama;
    int usia;

    public void tampilkanInfo() {
        System.out.println("\nNama Hewan: " + nama);
        System.out.println("Usia: " + usia);
    }
}

// Kelas menengah Hewan darat
class HewanDarat extends Hewan {
    int jumlahKaki;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Kaki: " + jumlahKaki);
    }
}

// Kelas turunan Kucing
class Kucing extends HewanDarat {
    String suara;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara: " + suara);
    }
}

// Kelas turunan Anjing
class Anjing extends HewanDarat {
    String suara;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara: " + suara);
    }
}




