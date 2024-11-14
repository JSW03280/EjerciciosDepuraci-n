package ejercicios_depuracion;

public class Ejercicio3 {

    public static void main(String[] args) {
        final int VALOR_INICIAL = 10;
        final int VALOR_FINAL = 100;
        final int  PASO = 10;

        int fahrenheit;
        double celsius;

        fahrenheit = VALOR_INICIAL;

        System.out.printf("Fahrenheit\tCelsius\n");
        while (fahrenheit <= VALOR_FINAL) { 
            celsius = 5 * (fahrenheit - 32) / 9.0;
            System.out.printf("%7d\t%8.3f\n", fahrenheit, celsius);
            fahrenheit += PASO;
        }
    }
}
