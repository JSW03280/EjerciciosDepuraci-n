package ejercicios_depuracion;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int suma  = 0, num;

        System.out.print("Introduzca un número: ");
        num = teclado.nextInt();

        while (num >= 0) { 
            suma += num;

            System.out.print("Introduzca un número: ");
            num = teclado.nextInt();
        }

        System.out.println("La suma es: " + suma);
    }
}
