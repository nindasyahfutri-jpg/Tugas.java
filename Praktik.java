public class Praktik {
    public static void main(String[]args){

        try{
        int a = 10;
        int b = 0;

        int hasil = a/b ;

        System.out.println(hasil);

    } catch (ArithmeticException e) {

        System.out.println("Tidak dapat membagi dengan nol");

        System.out.println( "Program selesai" );
        }
    }
}
