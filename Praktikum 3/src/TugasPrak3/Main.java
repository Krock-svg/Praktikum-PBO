package TugasPrak3;

public class Main {
    public static void main(String[] args) {
        Mobil pertama = new Mobil("Nissan GT-R", "VR38DETT", 2007, "Godzilla");
        pertama.displayInfo();
        pertama.startEngine();

        System.out.println("\n");

        Mobil kedua = new Mobil("Chevrolet", "Corvette C8", 2020, "Ongoing");
        kedua.displayInfo();
        kedua.startEngine();
    }
}
