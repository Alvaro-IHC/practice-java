public class Ejercicio7 {
    // Generar un vector de n primeros elementos primos
    public static void main(String[] args) {
        int n = 6;
        int arrRes[] = new int[n];
        int posicion = 0;
        int iterador = 2;
        while (posicion < n) {
            if (esPrimo(iterador)) {
                arrRes[posicion] = iterador;
                posicion++;
            }
            iterador++;
        }
        System.out.print("El vector resultante es [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arrRes[i] + " ");
        }
        System.out.println("]");    
    }

    public static boolean esPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
