public class Ejercicio4 {
    // Dado un numero n mayor a 1000, hallar el antepenultimo digito
    public static void main(String[] args) {
        int n = 1234;
        int res = n / 100;
        res = res % 10;
        System.out.println("El antepenultimo digito de " + n + " es " + res);
    }
}
