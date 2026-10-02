//Contoh Throws

import java.io.FileReader;
import java.io.IOException;

public class Praktik4 {
    static void bacaFile () throws IOException {

        FileReader file = new FileReader( "data.txt");
        file.close();
    }

    public static void main(String[] args) {
        try {
            bacaFile();
        } catch (IOException ex) {
            System.out.println("File tidak ditemukan");
        }
    }
}