
package parcialdos;

import java.util.Scanner;


public class Parcialdos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int matriz[][] = {{5, 7, 9}, {4, 2, 1}, {1, 1, 1}};
        
        for (int i = matriz.length -1; i >= 0; i--) {
            for (int j = matriz[0].length -1; j >= 0; j--) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println("");
        }
        
    }
    
}
