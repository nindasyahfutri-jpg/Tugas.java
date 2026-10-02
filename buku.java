class buku { // Kelas Buku

    String judul;
    String penerbit;
    String penulis;
    String genre;
    String status;
    String halaman; // Tebal atau Tipis
    int tahunTerbit;
    int harga;

    //Tambahan Harga
    int hargaAwal;
    int hargaBaru;
    int hargaDiskon;


    void tampilData() { // method untuk menampilkan data Buku
        System.out.println("Judul       : " + judul);
        System.out.println("Penerbit    : " + penerbit);
        System.out.println("Penulis     : " + penulis);
        System.out.println("Genre       : " + genre);
        System.out.println("Status      : " + status);
        System.out.println("Halaman     : " + halaman);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Harga  Awal     : Rp" + hargaAwal);
        System.out.println("Harga  Diskon     : Rp" + hargaDiskon);
        System.out.println("Harga  Baru     : Rp" + hargaBaru);
    }

    void cekStatus() { // method untuk mengecek status Buku
        if (status.equals("Tersedia")) {
            System.out.println("Keterangan : Buku tersedia");
        } else {
            System.out.println("Keterangan : Buku sedang dipinjam");
        }
    }



    public static void main(String[] args) {

        // membuat sebuah object dari class Buku
        buku buku1 = new buku();

        buku1.judul = "Laskar Pelangi";
        buku1.penerbit = "Bentang Pustaka";
        buku1.penulis = "Andrea Hirata";
        buku1.genre = "Novel";
        buku1.status = "Tersedia";
        buku1.halaman = "Tebal";
        buku1.tahunTerbit = 2005;
        buku1.harga = 85000;
        buku1.hargaAwal = 85000;
        buku1.hargaDiskon = 10;
        buku1.hargaBaru = buku1.hargaAwal - (buku1.hargaAwal * buku1.hargaDiskon / 100);

        // menggunakan method untuk menampilkan data buku1
        buku1.tampilData();
        buku1.cekStatus();


        buku buku2 = new buku();

        buku2.judul = "Bumi";
        buku2.penerbit = "Gramedia";
        buku2.penulis = "Tere Liye";
        buku2.genre = "Fantasi";
        buku2.status = "Pinjam";
        buku2.halaman = "Tipis";
        buku2.tahunTerbit = 2014;
        buku2.harga = 75000;
        buku2.hargaAwal = 75000;
        buku2.hargaDiskon = 20;
        buku2.hargaBaru = buku2.hargaAwal - (buku2.hargaAwal * buku2.hargaDiskon / 100);

        buku2.tampilData();
        buku2.cekStatus();
    }
}

