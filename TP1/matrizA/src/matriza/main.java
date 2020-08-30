package matriza;

/**
 * Llevar a cabo un programa que permite cargar completamente con números 5
 * una matriz de 4x5 (4 filas, 5 columnas).
 */
public class main {

    public static void main(String[] args) {
        
        int matrix[][] = new int[4][5]; // Declaro la matriz
		
        // Recorro la matriz asignando 5 en todas las posiciones y se muestran en pantalla        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = 5;
                System.out.print(matrix[i][j]);
            }
            System.out.println(""); 
        }
    }
}