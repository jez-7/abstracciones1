package Ejercicio3;

public class Main {
    public static void main(String[] args) {

        Fraccion fr1 = new Fraccion(1, 2);
        Fraccion fr2 = new Fraccion(1, 3);


        Numerica resultadoSuma = fr1.sumar(fr2);
        Numerica resultadoResta = fr1.restar(fr2);
        Numerica resultadoMultiplicación = fr1.multiplicar(fr2);
        Numerica resultadoDivisión = fr1.dividir(fr2);


        System.out.println("Fracción 1: " + fr1.toString());
        System.out.println("Fracción 2: " + fr1.toString());
        System.out.println("Resultado de la suma: " + resultadoSuma.toString());
        System.out.println("Resultado de la resta: " + resultadoResta.toString());
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicación.toString());
        System.out.println("Resultado de la división: " + resultadoDivisión.toString());
    }
}