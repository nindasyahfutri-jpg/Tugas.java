interface Pembayaran {
    void bayar();
}

class TransferBank implements Pembayaran {
    @Override
    public void bayar() {
        System.out.println("Pembayaran melalui Transfer Bank");
    }
}

class EWallet implements Pembayaran {
    @Override
    public void bayar() {
        System.out.println("Pembayaran melalui E-Wallet");
    }
}

class KartuKredit implements Pembayaran {
    @Override
    public void bayar() {
        System.out.println("Pembayaran melalui Kartu Kredit");
    }
}

public class Pembayaran2 {

    public static void main(String[] args) {

        TransferBank transfer = new TransferBank();
        EWallet ewallet = new EWallet();
        KartuKredit kartu = new KartuKredit();

        transfer.bayar();
        ewallet.bayar();
        kartu.bayar();
    }
}
