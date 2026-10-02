import java.util.Scanner;

interface Pembayaran {
    void bayar(int jumlah);
}

class Transfer implements Pembayaran {
    public void bayar(int jumlah) {
        System.out.println("Pembayaran berhasil: " + jumlah);
        System.out.println("Melalui: Transfer");
    }
}

class COD implements Pembayaran {
    public void bayar(int jumlah) {
        System.out.println("Pembayaran berhasil: " + jumlah);
        System.out.println("Melalui: COD");
    }
}

class EWallet implements Pembayaran {
    public void bayar(int jumlah) {
        System.out.println("Pembayaran berhasil: " + jumlah);
        System.out.println("Melalui: E-Wallet");
    }
}

public class pembayaran1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== PROGRAM PEMBAYARAN =====");

        System.out.print("Masukkan jumlah pembayaran: ");
        int jumlah = input.nextInt();

        System.out.println("\nPilih metode pembayaran:");
        System.out.println("1. Transfer");
        System.out.println("2. COD");
        System.out.println("3. E-Wallet");

        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();

        Pembayaran pembayaran;

        if (pilihan == 1) {
            pembayaran = new Transfer();
        } else if (pilihan == 2) {
            pembayaran = new COD();
        } else if (pilihan == 3) {
            pembayaran = new EWallet();
        } else {
            System.out.println("Pilihan tidak tersedia.");
            input.close();
            return;
        }

        System.out.println();
        pembayaran.bayar(jumlah);

        input.close();
    }
}
