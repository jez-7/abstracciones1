import Ejercicio1.*;

public class Main {
    public static void main(String[] args) {
        LibrosDeTextos lt1 = new LibrosDeTextos("Introducción a la programación", "John Doe",
        2500.00, "UTN", "4°2");

        Novelas no1 = new Novelas("La metamorfosis", "Franz Kafka", 4000.00,
            "Ciencia ficción");

        lt1.imprimirInformacion();
        System.out.println("-------------------------------------------------");
        no1.imprimirInformacion();


    }
}