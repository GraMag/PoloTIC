/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizc;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
* En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de
* secundario. Cada fila corresponde a las notas y al promedio de cada alumno.
* • Se necesita un programa que permita a un profesor cargar en las 3
* primeras posiciones de cada fila las notas del alumno y que en la última
* columna se calculen los promedios.
* • Una vez realizados los cálculos, se desea mostrar las 3 notas de cada
* alumno y el promedio correspondiente recorriendo la matriz.
*/
public class main {

    public static void main(String[] args) {
        // Declaro variables
        double matrix[][] = new double [4][4];
        double sum;

        Scanner sc = new Scanner(System.in); // Creo Scanner
        DecimalFormat df = new DecimalFormat("#.00"); // Creo Decimal Format
     
        // Ingresar notas
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese notas del alumno " + (i+1));
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Calcular promedio
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                sum = sum + matrix[i][j];
            }
            matrix[i][3] = sum / 3;
        }
        
        // Mostrar notas
        System.out.println("                       Nota 1           Nota 2           Nota 3           Promedio");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("Notas del alumno " + (i+1) + "   ");
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] != 10) {
                System.out.print("\t " + df.format(matrix[i][j]) + "     ");
                } else {
                    System.out.print("\t" + df.format(matrix[i][j]) + "     ");
                }
            }
            System.out.println();
        }
    }
}