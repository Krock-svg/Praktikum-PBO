package praktikum3;

class Hewan {
    // Atribut privat (Encapsulation)
    private String nama;
    private int umur;

    // Constructor untuk inisialisasi awal
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Method perilaku hewan
    public void suara() {
        System.out.println("Hewan bersuara");
    }

    public void berlari() {
        System.out.println("Hewan sedang berlari");
    }

    public void info() {
        System.out.println("Nama: " + getNama() + ", Umur: " + getUmur() + " tahun");
    }
}
