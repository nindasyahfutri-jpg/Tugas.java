import java.util.Scanner;
import java.util.InputMismatchException;

public class Umur {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan umur: ");
            int umur = input.nextInt();

            System.out.println("Umur Anda: " + umur);
        } catch (InputMismatchException e) {
            System.out.println("Input umur harus berupa angka.");
        }

        input.close();
    }
}
