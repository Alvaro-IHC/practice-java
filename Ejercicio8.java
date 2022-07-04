public class Ejercicio8 {
    // Generar un vector de n elementos impares que no sean divisibles de 3 y 5
    public static void main(String[] args) {
        int n = 6;
        int arrRes[] = new int[n];
        int posicion = 0;
        int iterador = 1;
        while (posicion < n) {
            if (iterador%3 != 0 && iterador%5 != 0) {
                arrRes[posicion] = iterador;
                posicion++;
            }
            iterador += 2;
        }
        System.out.print("El vector resultante es [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arrRes[i] + " ");
        }
        System.out.println("]");    
    }
}
