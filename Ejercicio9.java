import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int T1;
        int T2;
        int Promedio = 0;
        int Contador = 0;

        do {
            System.out.println("Ingrese la primer temperatura");
            T1 = leer.nextInt();

            System.out.println("Ingrese la Segunda temperatura");
            T2 = leer.nextInt();
            System.out.print("\n");
            if (T1 >= 5 && T1 <= 15) {
                Promedio += T1;
                Contador++;
            }
            if (T2 >= 5 && T2 <= 15) {
                Promedio += T2;
                Contador++;
            }
        } while (T1 > 0);

        System.out.println(
                "El primedio de las temperaturas entre 5 y 15 grados es de: " + (float) Promedio / (float) Contador);

    }

}
