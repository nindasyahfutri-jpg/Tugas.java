class Laptop {

    String merk;

    Laptop(String m) {
        merk = m;
    }

    // Inner Class
    class Processor {

        String namaProcessor;
        double kecepatan;

        Processor(String nama, double cepat) {
            namaProcessor = nama;
            kecepatan = cepat;
        }

        void tampilSpesifikasi() {
            System.out.println("Merk Laptop    : " + merk);
            System.out.println("Processor      : " + namaProcessor);
            System.out.println("Kecepatan      : " + kecepatan + " GHz");
        }
    }

    public static void main(String[] args) {

        Laptop laptop = new Laptop("ASUS");

        Laptop.Processor processor =
                laptop.new Processor("Intel Core i5", 2.4);

        processor.tampilSpesifikasi();
    }
}
