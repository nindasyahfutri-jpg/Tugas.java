interface BisaTerbang {

    void terbang();
    
}

class burung implements BisaTerbang{
    @Override 
    public void terbang(){
        System.out.println("Burung terbang menggunakan sayap");
    }
}

class helikopter implements BisaTerbang{
    @Override 
    public void terbang(){
        System.out.println("Helikopter terbang menggunakan baling-baling");
    }
}

public class nterface{
    public static void main(String[]args){
        BisaTerbang burung = new burung();
        BisaTerbang helikopter = new helikopter();

        burung.terbang();
        helikopter.terbang();

    }
}