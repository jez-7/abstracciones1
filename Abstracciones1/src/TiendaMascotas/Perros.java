package TiendaMascotas;

public class Perros extends Mascota {
    private double peso;
    private boolean muerde;

    public Perros(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }


    @Override
    public void sonido() {
        System.out.println("Los perros ladran");

    }
}
