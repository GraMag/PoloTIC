package vectores;

import java.util.Scanner;

/*
*    En tres vectores diferentes se guardan los datos de temperaturas máximas y
*    mínimas de 5 ciudades de Misiones. En el primer vector se guardan los
*    nombres de las ciudades, en el segundo las temperaturas mínimas alcanzadas
*    y en el tercero las temperaturas máximas alcanzadas en la última semana. Se
*    necesita un programa que permita la carga de las ciudades, sus temperaturas
*    mínimas y máximas; además, deberá poder informar por pantalla cual fue la
*    ciudad con la temperatura más baja y cual con la temperatura más alta (dando
*    a conocer al mismo tiempo la cantidad de grados).
*/
public class Vectores {

    public static void main(String[] args) {
        
        // Declaro variables
        String city[] = new String[5];
        double tempMin[] = new double[5];
        double tempMax[] = new double[5];
        double min = 0;
        double max = 0;
		
        Scanner sc = new Scanner(System.in); 	// Creo scanner

        // Recorro el vector para asignar los datos
        for (int i = 0; i < city.length; i++) {

            // Ingreso datos
            System.out.println("Ciudad: ");
            city[i] = sc.nextLine();
            System.out.println("Temperatura Minima: ");
            tempMin[i] = sc.nextDouble();
            System.out.println("Temperatura Maxima: ");
            tempMax[i] = sc.nextDouble();
            while(tempMax[i]<tempMin[i]){
                System.out.println("La temperatura maxima no puede ser menor que la minima. Volvé a intentarlo: ");
                tempMax[i] = sc.nextDouble();    
            }
            sc.nextLine();
            System.out.println();
    
            // Busco maximos y minismo
            if(i == 0) {            // 1ra vuelta
                max = tempMax[i];
                min = tempMin[i];
            }
            if(tempMax[i] > max) {  // Maximo
                max = tempMax[i];
            }
            if(tempMin[i] < min) {  // Minimo
                min = tempMin[i];
            }
        }
        sc.close(); //cierro el scanner

        // Muestro resultados en pantalla
        for (int i = 0; i < city.length; i++) {
            if(tempMax[i] == max && tempMin[i] == min){
                System.out.println(city[i] + " registra la temperatura más baja con " + min + "° y la más alta con " + max + "°");
            } else if (tempMax[i] == max) {
                System.out.println(city[i] + "registra la temperatura más alta con " + max + "°");
            } else if (tempMin[i] == min){
                System.out.println(city[i] + " registra la temperatura más baja con " + min + "°");
            }
        }
    }
}
