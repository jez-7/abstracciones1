package Ejercicio3;

public class Fraccion extends Numerica {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null) return false;
        Fraccion fraccion = (Fraccion) ob;
        return numerador == fraccion.numerador && denominador == fraccion.denominador;
    }


    @Override
    public Numerica sumar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otraFracción = (Fraccion) numero;
            int nuevoDenominador = this.denominador * otraFracción.denominador;
            int nuevoNumerador = (this.numerador * otraFracción.denominador) + (otraFracción.numerador * this.denominador);
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        } else {
            throw new IllegalArgumentException("No se puede sumar una Fracción con otro tipo de número.");
        }
    }

    @Override
    public Numerica restar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otraFracción = (Fraccion) numero;
            int nuevoDenominador = this.denominador * otraFracción.denominador;
            int nuevoNumerador = (this.numerador * otraFracción.denominador) - (otraFracción.numerador * this.denominador);
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        } else {
            throw new IllegalArgumentException("No se puede restar una Fracción con otro tipo de número.");
        }
    }

    @Override
    public Numerica multiplicar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otraFracción = (Fraccion) numero;
            int nuevoNumerador = this.numerador * otraFracción.numerador;
            int nuevoDenominador = this.denominador * otraFracción.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        } else {
            throw new IllegalArgumentException("No se puede multiplicar una Fracción con otro tipo de número.");
        }    }

    @Override
    public Numerica dividir(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otraFracción = (Fraccion) numero;
            if (otraFracción.numerador == 0) {
                throw new ArithmeticException("No se puede dividir por cero.");
            }
            int nuevoNumerador = this.numerador * otraFracción.denominador;
            int nuevoDenominador = this.denominador * otraFracción.numerador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        } else {
            throw new IllegalArgumentException("No se puede dividir una Fracción por otro tipo de número.");
        }
    }
}

