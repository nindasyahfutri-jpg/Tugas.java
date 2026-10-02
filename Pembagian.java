import java.util.Scanner;

public class Pembagian {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = input.nextInt();

        try {
            int hasil = bilangan1 / bilangan2;
            System.out.println("Hasil pembagian: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Tidak dapat membagi dengan nol.");
        }

        input.close();
    }
}