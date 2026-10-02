abstract class Pengguna {

    String nama;
    String id;

    Pengguna(String n, String i) {
        nama = n;
        id = i;
    }

    abstract void tampilPeran();
}

interface DapatMeminjam {

    void pinjamBuku();
}

class Mahasiswa extends Pengguna implements DapatMeminjam {

    Mahasiswa(String n, String i) {
        super(n, i);
    }

    void tampilPeran() {
        System.out.println("Nama : " + nama);
        System.out.println("ID   : " + id);
        System.out.println("Peran: Mahasiswa");
    }

    public void pinjamBuku() {
        System.out.println(nama + " meminjam buku Pemrograman Java");
    }
}

class Dosen extends Pengguna implements DapatMeminjam {

    Dosen(String n, String i) {
        super(n, i);
    }

    void tampilPeran() {
        System.out.println("Nama : " + nama);
        System.out.println("ID   : " + id);
        System.out.println("Peran: Dosen");
    }

    public void pinjamBuku() {
        System.out.println(nama + " meminjam buku Data Mining");
    }
}

class Buku {

    class DetailBuku {

        String judul;
        String penulis;
        int tahunTerbit;

        DetailBuku(String j, String p, int t) {
            judul = j;
            penulis = p;
            tahunTerbit = t;
        }

        void tampilBuku() {
            System.out.println("Judul         : " + judul);
            System.out.println("Penulis       : " + penulis);
            System.out.println("Tahun Terbit  : " + tahunTerbit);
        }
    }
}

class Penyimpanan<T> {

    T data;

    void setData(T nilai) {
        data = nilai;
    }

    T getData() {
        return data;
    }
}

public class Perpustakaan {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("SISTEM PERPUSTAKAAN");
        System.out.println("================================");
        System.out.println();

        Mahasiswa mahasiswa =
                new Mahasiswa("Budi", "M001");

        mahasiswa.tampilPeran();
        System.out.println();
        mahasiswa.pinjamBuku();

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();

        Dosen dosen =
                new Dosen("Andi", "D001");

        dosen.tampilPeran();
        System.out.println();
        dosen.pinjamBuku();

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();

        Buku buku = new Buku();

        Buku.DetailBuku detail =
                buku.new DetailBuku(
                        "Pemrograman Java",
                        "John Doe",
                        2025
                );

        detail.tampilBuku();

        System.out.println();
        System.out.println("================================");
    }
}
