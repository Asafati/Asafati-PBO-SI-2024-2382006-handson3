public class SkipDanBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue; // Lewati angka yang habis dibagi 3
            }
            if (i > 15) {
                break; // Hentikan setelah mencapai angka 15
            }
            System.out.println(i);
        }
    }
}
