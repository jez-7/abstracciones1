package TiendaMascotas;
import TiendaMascotas.*;

public class Main {
    public static void main(String[] args) {


        PerroPequeño perropequeño = new PerroPequeño("Rocco", 6, "Marrón",
                10, false, "caniche");
        PerroMediano perromediano = new PerroMediano("Toby", 1, "Blanco",
                26, true, "bulldog");
        PerroGrande perrogrande = new PerroGrande("Max", 4, "Negro",
                50, true, "Doberman");
        GatoPeloCorto gatopelocorto = new GatoPeloCorto("Kitty", 2, "Naranja",
                1, 3, "Manx");
        GatoSinPelo gatosinpelo = new GatoSinPelo("Olivia", 4, "Gris",
                2, 4, "donsky");
        GatoPeloLargo gatopelolargo = new GatoPeloLargo("Mario", 7, "Blanco",
                4, 4, "Angora");

        System.out.println("Perro pequeño: es un "+perropequeño.getRaza()+", se llama " +
                perropequeño.nombre + ", tiene " + perropequeño.edad+" meses, es de color "
                + perropequeño.color+", pesa " +perropequeño.getPeso()+ " kg, muerde? "
                +perropequeño.isMuerde());
        System.out.println("Perro mediano: es un "+perromediano.getRaza()+", se llama " +
                perromediano.nombre + ", tiene " + perromediano.edad+" años, es de color "
                + perromediano.color+", pesa " +perromediano.getPeso()+ " kg, muerde? "
                +perromediano.isMuerde());
        System.out.println("Perro grande: es un "+perrogrande.getRaza()+", se llama " +
                perrogrande.nombre + ", tiene " + perrogrande.edad+" años, es de color "
                + perrogrande.color+", pesa " +perrogrande.getPeso()+ " kg, muerde? "
                +perrogrande.isMuerde());

        perropequeño.sonido();

        System.out.println("Gato pelo corto: es un "+gatopelocorto.getRaza()+", se llama " +
                gatopelocorto.nombre + ", tiene " + gatopelocorto.edad+" años, es de color "
                + gatopelocorto.color+", salta " +gatopelocorto.getAlturaDeSalto()+ " metros de alto, y "
                +gatopelocorto.getLongitudDeSalto()+ " metros de longitud");
        System.out.println("Gato sin pelo: es un "+gatosinpelo.getRaza()+", se llama " +
                gatosinpelo.nombre + ", tiene " + gatosinpelo.edad+" años, es de color "
                + gatosinpelo.color+", salta " +gatosinpelo.getAlturaDeSalto()+ " metros de alto, y "
                +gatosinpelo.getLongitudDeSalto()+ " metros de longitud");
        System.out.println("Gato pelo largo: es un "+gatopelolargo.getRaza()+", se llama " +
                gatopelolargo.nombre + ", tiene " + gatopelolargo.edad+" años, es de color "
                + gatopelolargo.color+", salta " +gatopelolargo.getAlturaDeSalto()+ " metros de alto, y "
                +gatopelolargo.getLongitudDeSalto()+ " metros de longitud");
        gatopelocorto.sonido();






    }
}
