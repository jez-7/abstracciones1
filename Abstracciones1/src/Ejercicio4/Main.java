package Ejercicio4;
public class Main {

    public static void main(String[] args) {
        // Ejemplo de uso
        Terrestres vehiculoTerrestre = new Terrestres(7, 120, 4, "Civil");
        Acuaticos vehiculoAcuatico = new Acuaticos(10, 100, "Superficie", 4);

        System.out.println("Vehiculo terrestre: ");
        vehiculoTerrestre.acelerar(30);
        vehiculoTerrestre.frenar(2);
        vehiculoTerrestre.imprimir();
        System.out.println("Revoluciones del motor del vehículo terrestre: " +
                vehiculoTerrestre.calcularRevolucionesMotor(100, 5));

        System.out.println("-------------------------------------------");

        System.out.println("Vehiculo acuatico: ");
        vehiculoAcuatico.acelerar(60);
        vehiculoAcuatico.frenar(3);
        vehiculoAcuatico.recomendarVelocidad(76);
        vehiculoAcuatico.imprimir();

    }
}
