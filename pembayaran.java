abstract class Pembayaran{
    abstract void bayar ();
}

class transfer extends Pembayaran{
    @Override 
    void bayar(){
        System.out.println ( "Pembayaran menggunakan transfer");
    }
}

class Ewallet extends Pembayaran{
    @Override 
    void bayar(){
        System.out.println ( "Pembayaran menggunakan E-Wallet");
    }
}

public class pembayaran{
    public static void main(String[]args){
        
    }

}