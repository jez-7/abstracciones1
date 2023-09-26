package Ejercicio3;

public abstract class Numerica {
    public abstract String toString(); //convierte el número a String.
    public abstract boolean equals(Object ob); //compara el objeto con el parámetro.
    public abstract Numerica sumar(Numerica numero); //retorna la suma de los dos números.
    public abstract Numerica restar(Numerica numero); //retorna la resta de los dos números.
    public abstract Numerica multiplicar(Numerica numero); //retorna la multiplicación de los dos números.
    public abstract Numerica dividir(Numerica numero); //retorna la división de los dos números.


}
