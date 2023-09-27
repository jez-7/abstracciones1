package Ejercicio4;

public class Acuaticos extends Vehiculo implements Vela {
    private String tipo;
    private int capacidadPasajeros;

    public Acuaticos(int velocidadActual, int velocidadMaxima, String tipo, int capacidadPasajeros) {
        super(velocidadActual, velocidadMaxima);
        this.tipo = tipo;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void acelerar(int velocidadPasada) {
        int nuevaVelocidad = velocidadActual + velocidadPasada;
        if(nuevaVelocidad <= getVelocidadMaxima()) {
            setVelocidadActual(nuevaVelocidad);
        } else {
            setVelocidadActual(getVelocidadMaxima());
        }
    }

    @Override
    public void frenar(int velocidadPasada) {
        int nuevaVelocidad = velocidadActual - velocidadPasada;
        if (nuevaVelocidad >= 0) {
            setVelocidadActual(nuevaVelocidad);
        } else {
            setVelocidadActual(0);
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Cantidad de pasajeros: " + capacidadPasajeros);
        System.out.println("tipo: " + tipo);
        System.out.println("Velocidad actual: " + getVelocidadActual()+ " km/h");
    }

    @Override
    public void recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80) {
            setVelocidadActual(0);
        } else if (velocidadViento < 10) {
            setVelocidadActual(0);
        }

    }
}
