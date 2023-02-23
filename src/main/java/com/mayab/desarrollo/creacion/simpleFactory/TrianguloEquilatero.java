package com.mayab.desarrollo.creacion.simpleFactory;

public class TrianguloEquilatero extends Triangulo {
    public TrianguloEquilatero(int sideLenght){
        super(sideLenght, sideLenght, sideLenght);
        System.out.println("Soy un triangulo equilatero");
    }
}
