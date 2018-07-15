import java. util.Scanner;
import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Demostración Heap Sort\n");
        int n, i;

        //Preguntamos a usuario # de elementos en array:
        System.out.println("Tamaño de elementos en el arreglo: ");
        n = lector.nextInt();
        int array[] = new int[n];

        for (i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println("Posición de arreglo "+i+" = " +array[i]);
        }

        //Llamamos el método HeapSort e ingresamos el contador de nano segundos

        long startTime = System.nanoTime();

            sort(array);

        long endTime = System.nanoTime();
        long deltaTime = endTime - startTime;

        //Imprimimos los elementos después del sorting:

            System.out.println("\nElementos después del HeapSort ");
            for (i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
                System.out.println();
            }

        //Mostramos en pantalla tiempo transcurrido de algoritmo

        System.out.println("");
        System.out.println("Tiempo en nano segundos de HeapSort para " +n+ " elementos: " +deltaTime);
    }
}



