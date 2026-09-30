package Responsi;

class pegawai {
    private String namaPegawai;
    private int gaji;

    public pegawai(String namaPegawai, int gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }

    // Getter and Setter
    public String getNamaPegawai() {
        return namaPegawai;
    }
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + gaji);
    }

}

class PegawaiTetap extends pegawai {
    private int tunjangan;

    public PegawaiTetap(String namaPegawai, int gaji, int tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }

    // Getter and Setter
    public int getTunjangan() {
        return tunjangan;
    }
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }


    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }

    @Override
    public String toString() {
        System.out.println("\n----Info Pegawai Tetap----");
        System.out.println("Nama\t: " + getNamaPegawai());
        System.out.println("Gaji\t: " + getGaji() + (" Juta"));
        System.out.println("Tunjangan\t: " + getTunjangan() + (" Juta"));
        return null;
    }

}

class PegawaiKontrak extends pegawai {
    private int lamaKontrak;

    public PegawaiKontrak(String namaPegawai, int gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }

    // Getter and Setter
    public int getLamaKontrak() {
        return lamaKontrak;
    }
    public void setLamaKontrak(int lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak: " + lamaKontrak);
    }

    @Override
    public String toString() {
        System.out.println("\n----Info Pegawai Tetap----");
        System.out.println("Nama\t: " + getNamaPegawai());
        System.out.println("Gaji\t: " + getGaji() + " Juta");
        System.out.println("Lama Kontrak\t: " + getLamaKontrak() + " Bulan");
        return null;
    }
}

