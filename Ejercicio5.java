public class Ejercicio5 {
    // Mostrar el menor elemento de un vector
    public static void main(String[] args) {
        int arr[] = {4, 3, 9, 3, -10, 8};
        int hipoteticMenor = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < hipoteticMenor) {
                hipoteticMenor = arr[i];
            }
        }
        System.out.println("El menor elemento del vector es " + hipoteticMenor);
    }
}