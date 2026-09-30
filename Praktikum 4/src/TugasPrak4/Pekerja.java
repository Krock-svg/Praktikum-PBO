package TugasPrak4;

public class Pekerja extends Manusia {
    private int gaji;

    // Construktor
    public Pekerja (String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    // Getter and Setter
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public String toString() {
        System.out.println("----Info Pekerja----");
        System.out.println("\tNama : " + getNama());
        System.out.println("\tUsia : " + getUsia());
        System.out.println("\tPekerjaan : " + getPekerjaan());
        System.out.println("\tGaji : " + getGaji());
        return null;
    }
}


