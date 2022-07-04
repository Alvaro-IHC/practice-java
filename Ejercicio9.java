import java.util.Scanner;

public class Ejercicio9 {
    // LLenar un vector solo de elementos pares
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int arrRes[] = new int[100];
        int posicion = 0;
        boolean salir = false;
        System.out.println("Ingrese 00 para salir");
        while (!salir) {
            String leido = lector.nextLine();
            if (leido.equals("00")) {
                salir = true;
                continue;
            }
            int numeroLeido = Integer.parseInt(leido);
            if (numeroLeido%2 == 0) {
                arrRes[posicion] = numeroLeido;
                posicion++;
            }
        }
        System.out.print("El vector resultante es [ ");
        for (int i = 0; i < posicion; i++) {
            System.out.print(arrRes[i] + " ");
        }
        System.out.println("]");
        lector.close();
    }
}
