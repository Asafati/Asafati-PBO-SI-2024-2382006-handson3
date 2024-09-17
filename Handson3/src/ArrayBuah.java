public class ArrayBuah {
    public static void main(String[] args) {
        String[] buah = {"Apel", "Mangga", "Jeruk", "Pisang"};

        // Menggunakan for loop biasa
        for (int i = 0; i < buah.length; i++) {
            System.out.println(buah[i]);
        }

        // Menggunakan enhanced for loop
        for (String b : buah) {
            System.out.println(b);
        }

        // Menggunakan while loop
        int i = 0;
        while (i < buah.length) {
            System.out.println(buah[i]);
            i++;
        }

        // Menggunakan do-while loop
        i = 0;
        do {
            System.out.println(buah[i]);
            i++;
        } while (i < buah.length);
    }
}
