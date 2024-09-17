public class HitungCamelCase {
    public static void main(String[] args) {
        String camelCase = "iniAdalahContohCamelCase";

        int jumlahKata = 1; // Mulai dengan 1 karena kata pertama tidak memiliki huruf kapital
        for (int i = 0; i < camelCase.length(); i++) {
            if (Character.isUpperCase(camelCase.charAt(i))) {
                jumlahKata++;
            }
        }

        System.out.println("Jumlah kata: " + jumlahKata);
    }
}
