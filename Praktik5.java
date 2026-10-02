class Rekening{
    private double saldo;

    Rekening(double saldo){
        this.saldo = saldo;
    }
    public void tarik(double jumlah){
        if (jumlah > saldo){
            throw new IllegalArgumentException(
                    "saldo tidak cukup untuk melakukan penarikan!");
        }
        saldo -= jumlah;
        System.out.println(
                "penarikan sebesar: "+ jumlah + "berhasil. Saldo tersisa" + saldo);
    }
}
public class Praktik5 {
    public static void main(String[] args){
        Rekening rekening = new Rekening(500000);
    try{
        rekening.tarik(600000);
    }catch (IllegalArgumentException e){
        System.out.println(e.getMessage());
    }
    System.out.println("Program tetap berjalan");
    }
}
