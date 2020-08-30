package matrizb;

import java.util.Scanner;

/**
 * Llevar a cabo un programa que permita cargar mediante teclado una matriz de
 * 3 x 3 (3 filas, 3 columnas) con razas de perros. Una vez cargada la misma,
 * será necesario realizar un recorrido por la misma y mostrar los datos
 * cargados por pantalla.
 */
public class main {

    public static void main(String[] args) {
        String dogs[][] = new String[3][3]; // Declaro matriz

        Scanner sc = new Scanner(System.in); // Creo scanner

        // Recorro la matriz ingresando datos
        for (int i = 0; i < dogs.length; i++) {
            for (int j = 0; j < dogs.length; j++) {
                System.out.println("Ingrese raza ");
                dogs[i][j] = sc.nextLine();
            }
        }

        // Recorro la matriz mostrando datos
        for (int i = 0; i < dogs.length; i++) {
            for (int j = 0; j < dogs.length; j++) {
                System.out.print("\t" + dogs[i][j] + " ");
            }
            System.out.println();
        }
    }   
}