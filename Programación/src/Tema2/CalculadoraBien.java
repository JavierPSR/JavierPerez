package Tema2;

public class CalculadoraBien {

    public int dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            System.out.println("El divisor no puede ser 0");
            return 0;
        } else {
            return dividendo / divisor;
        }
    }

    public static void main(String[] args) {
        CalculadoraBien calculadora = new CalculadoraBien();

        int dividendo = 80;
        int divisor = 4;

        int resultado = calculadora.dividir(dividendo, divisor);

        System.out.println("La división de " + dividendo + " entre " + divisor + " es " + resultado);
    }
}