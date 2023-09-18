package Ejercicio1;

public class LibrosDeTextos extends Libro {
    private String facultad;
    private String curso;

    public LibrosDeTextos(String titulo, String autor, double precio, String facultad, String curso) {
        super(titulo, autor, precio);
        this.facultad = facultad;
        this.curso = curso;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: " + precio);
        System.out.println("Facultad: " + facultad);
        System.out.println("Curso: " + curso);

    }
}