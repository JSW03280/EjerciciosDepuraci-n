package ejercicios_depuracion;

public class Ejercicio9 {

    public static void main(String[] args) {
        int a, b;

        for (a = 1, b = 1; a + b < 10; a++, b += 2) {
            System.out.println("a = " + a + " b = " + b + " a + b= " + (a + b));
        }
    }
}
