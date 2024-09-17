public class JumlahArray {
    public static void main(String[] args) {
        int[] bilangan = {5, 8, 12, 3, 7};
        int jumlah = 0;

        for (int b : bilangan) {
            jumlah += b;
        }

        System.out.println("Jumlah elemen: " + jumlah);
    }
}
