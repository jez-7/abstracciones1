package Ejercicio1;

public class Novelas extends Libro{
    private String tipo;

    public Novelas(String titulo, String autor, double precio, String tipo) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public void imprimirInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: " + precio);
        System.out.println("tipo: " + tipo);


    }
}
