public class Ejercicio6 {
    // Mostrar la suma de los elemento primos
    public static void main(String[] args) {
        int arr[] = {4, 3, 9, 3, 10, 17};
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (esPrimo(arr[i])) {
                res += arr[i];
            }
        }
        System.out.println("La suma de los primos es " + res);
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
