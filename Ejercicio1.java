class Ejercicio1 {
    // Calcular A*B por sumas sucesivas
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int res = 0;
        for (int i = 0; i < b; i++) {
            res += a;
        }
        System.out.println("El resultado de " + a + " * " + b + " = " + res);
    }
}