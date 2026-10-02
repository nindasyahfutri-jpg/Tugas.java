

import java.util.InputMismatchException;
import java.util.Scanner;
public class Praktik3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan umur :");

            int umur = input.nextInt();

            System.out.println("Umur anda :" + umur);

        }catch (InputMismatchException e){

            System.out.println("Input harus berupa angka");
        }
    }
}