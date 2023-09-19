package TiendaMascotas;

public class PerroMediano extends Perros{
    private String Raza;

    public PerroMediano(String nombre, int edad, String color, double peso, boolean muerde, String raza) {
        super(nombre, edad, color, peso, muerde);
        Raza = raza;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }
}
