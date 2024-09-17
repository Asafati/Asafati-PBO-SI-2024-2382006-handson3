public class Keywordbreak {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                break; // Hentikan loop saat i == 2
            }
            System.out.println("Iterasi ke-" + i);
        }
    }
}
