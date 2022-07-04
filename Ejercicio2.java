public class Ejercicio2 {
    // Calcular A*B*C*D mediante sumas sucesivas
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 6;
        int d = 7;
        int res = 0;
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < b; k++) {
                    res += a;
                }
            }
        }
        System.out.println("El resultado de " + a + " * " + b + " * "  + c + " * " + d  + " = " + res);
    }
}
