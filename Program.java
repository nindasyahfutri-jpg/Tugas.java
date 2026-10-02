abstract class BangunDatar {
    abstract double hitungLuas();
}

class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungLuas() {
        return sisi * sisi;
    }
}

class Lingkaran extends BangunDatar {
    double r;

    Lingkaran(double r) {
        this.r = r;
    }

    @Override
    double hitungLuas() {
        return Math.PI * r * r;
    }
}

public class Program {
    public static void main(String[] args) {

        Persegi persegi = new Persegi(5);
        Lingkaran lingkaran = new Lingkaran(7);

        System.out.println("Luas Persegi = " + persegi.hitungLuas());
        System.out.println("Luas Lingkaran = " + lingkaran.hitungLuas());
    }
}
