public class Mahasiswa {

    String nama;
    int nilai;

    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;

        if (nilai < 0 || nilai > 100) {
            throw new IllegalArgumentException("Nilai harus antara 0 sampai 100.");
        }

        this.nilai = nilai;
    }

    public void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("Nilai : " + nilai);
    }

    public static void main(String[] args) {

        try {
            Mahasiswa mhs = new Mahasiswa("Ninda", 85);
            mhs.tampilkanData();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}