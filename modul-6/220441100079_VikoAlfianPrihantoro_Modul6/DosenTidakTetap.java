package last;

public class DosenTidakTetap extends Dosen {
    private int jamMengajar;
    private double honorPerJam;

    // Constructor
    public DosenTidakTetap(String nama, String nik, int umur, char jenisKelamin, int jamMengajar, double honorPerJam) {
        super(nama, nik, umur, jenisKelamin);
        this.jamMengajar = jamMengajar;
        this.honorPerJam = honorPerJam;
    }

    // Getters and Setters
    public int getJamMengajar() {
        return jamMengajar;
    }

    public void setJamMengajar(int jamMengajar) {
        this.jamMengajar = jamMengajar;
    }

    public double getHonorPerJam() {
        return honorPerJam;
    }

    public void setHonorPerJam(double honorPerJam) {
        this.honorPerJam = honorPerJam;
    }

    @Override
    public double hitungGaji() {
        return jamMengajar * honorPerJam;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("NIK: " + getNik());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Jam Mengajar: " + jamMengajar);
        System.out.println("Honor Per Jam: " + honorPerJam);
        System.out.println("Total Gaji: " + hitungGaji());
    }
}

