public class Latihan {

    public static void main(String[] args) {

        int[] nilai = {80, 90, 75};

        try {

            System.out.println(
                nilai[5]
            );

        } catch (
            ArrayIndexOutOfBoundsException e
        ) {

            System.out.println(
                "Index tidak ditemukan."
            );

        }

        System.out.println(
            "Program selesai."
        );
    }
}

