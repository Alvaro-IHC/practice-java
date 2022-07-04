public class Ejercicio14 {
    // Dado dos vectores de A y B, hallar el producto escalar de A por B
    public static void main(String[] args) {
        int A[] = {4, 3, 9};
        int B[] = {6, 9, 2};
        
        if (A.length != B.length) {
            System.out.println("No es posible realizar el producto escalar");
            return;
        }

        int res = 0;
        for (int i = 0; i < A.length; i++) {
            res += A[i] * B[i];
        }
        System.out.println("El producto escalar es " + res); 
    }
}
