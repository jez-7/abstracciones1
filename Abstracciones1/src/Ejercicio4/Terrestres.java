package Ejercicio4;

public class Terrestres extends Vehiculo implements Motor{
    private int cantidadLlantas;
    private String uso;

    public Terrestres(int velocidadActual, int velocidadMaxima, int cantidadLlantas, String uso) {
        super(velocidadActual, velocidadMaxima);
        this.cantidadLlantas = cantidadLlantas;
        this.uso = uso;
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
        System.out.println("Cantidad de llantas: " + cantidadLlantas);
        System.out.println("Uso: " + uso);
        System.out.println("Velocidad actual: " + getVelocidadActual()+ " km/h");

    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;

    }
}
