public class Praktik1 {
    public static void main(String[]args){
        try {

            int[] data = {10, 20, 30};

            int number = Integer.parseInt("abc");

            System.out.println(data[5]);

        } catch (NumberFormatException e) {

            System.out.println("Format angka salah");

        } catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Index array tidak tersedia");
        }
    }
}