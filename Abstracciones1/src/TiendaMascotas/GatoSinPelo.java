package TiendaMascotas;

public class GatoSinPelo extends Gatos  {
    private String Raza;

    public GatoSinPelo(String nombre, int edad, String color, int alturaDeSalto, int longitudDeSalto, String raza) {
        super(nombre, edad, color, alturaDeSalto, longitudDeSalto);
        Raza = raza;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }
}
