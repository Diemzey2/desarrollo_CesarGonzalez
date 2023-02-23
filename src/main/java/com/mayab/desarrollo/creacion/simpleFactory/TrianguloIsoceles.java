package com.mayab.desarrollo.creacion.simpleFactory;

public class TrianguloIsoceles extends Triangulo {
    public TrianguloIsoceles(int LadoA, int LadoB) {
        super(LadoA, LadoB, LadoA);

        System.out.println("Soy un triangulo Isoceles");
    }
}
