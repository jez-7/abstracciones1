package Ejercicio1;

public abstract class Libro {
    protected String titulo;
    protected String autor;
    protected double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public abstract void imprimirInformacion();

}
