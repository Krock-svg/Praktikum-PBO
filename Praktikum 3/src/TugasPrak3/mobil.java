package TugasPrak3;

class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String status;

    public Mobil(String merk, String model, int tahun, String status) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.status = status;
    }

    public String get_merk() {
        return merk;
    }

    public void set_merk(String merk) {
        this.merk = merk;
    }

    public String get_model() {
        return model;
    }

    public void set_model(String model) {
        this.model = model;
    }

    public int get_tahun() {
        return tahun;
    }

    public void set_tahun(int tahun) {
        this.tahun = tahun;
    }

    public String get_status() {
        return status;
    }

    public void set_status(String status) {
        this.status = status;
    }

    public void displayInfo() {
        System.out.println("Merk: " + get_merk() + "\nModel:" + get_model() + "\nTahun: " + get_tahun() + "\nStatus: " + get_status());
    }

    public void startEngine() {
        System.out.println("Mesin mobil " + get_merk() + " menyala");
    }
}

