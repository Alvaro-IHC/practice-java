public class Ejercicio3 {
    // Calcular A^B por productos sucesivos
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
        }
        System.out.println("El resultado de " + a + " ^ " + b + " = " + res);
    }
}
