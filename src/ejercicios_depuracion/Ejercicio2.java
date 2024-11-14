package ejercicios_depuracion;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n, contador = 1;

        System.out.print("Introduzca un número: ");
        n = teclado.nextInt();

        while (contador <= n) {
            System.out.println(" * ");
            contador ++;
        }
    }
}
