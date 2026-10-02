//CONTOH THROW

public class Praktik2 {

    public static void main(String[] args) {
        
        int umur = -10;
        try{
            if(umur<0){
                throw new IllegalArgumentException("Umur tidak boleh negatif");
            }
            System.out.println("umur :" + umur);

        }catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }
    }
    
}
