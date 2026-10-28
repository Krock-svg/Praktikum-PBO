package Tugas9;

abstract class Hewan {
    // Metode abstrak
    abstract void bersuara();

    // Metode dengan implementasi
    void info() {
        System.out.println("Ini adalah Hewan");
    }
}

// Kelas turunan dari Hewan
class Kucing extends Hewan {
    @Override
    void bersuara() {
       System.out.println("Kucing bersuara : MMiaawwww");
    }
}

class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Anjing bersuara : Guk Guk");
    }
}




