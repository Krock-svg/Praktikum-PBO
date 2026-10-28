package Tugas9;

public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        kucing.bersuara();
        kucing.info();

        anjing.bersuara();
        anjing.info();
    }
}
