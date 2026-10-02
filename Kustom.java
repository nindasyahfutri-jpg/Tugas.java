class SaldoTidakCukupException extends Exception {
    public SaldoTidakCukupException(
        String pesan
    ) {
        super(pesan);
    }
}


class Rekening {
    private double saldo;
    Rekening(double saldo) {
        this.saldo = saldo;
    }


    void tarik(double jumlah)
        throws SaldoTidakCukupException {
        if (jumlah > saldo) {
            throw new SaldoTidakCukupException
            ("Saldo tidak mencukupi." );

        }
        saldo -= jumlah;
        System.out.println( "Penarikan berhasil.");
        System.out.println("Sisa saldo: Rp" + saldo);
    }
}


public class Kustom {
    public static void main(String[] args) {
        Rekening rekening =
            new Rekening(500000);
        try {
            rekening.tarik(7000);
        } catch (SaldoTidakCukupException e) 
            {
            System.out.println("Transaksi gagal: "+ e.getMessage());
                }
        System.out.println( "Terima kasih.");
    }
}