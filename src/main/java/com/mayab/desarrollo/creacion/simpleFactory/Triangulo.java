package com.mayab.desarrollo.creacion.simpleFactory;

public class Triangulo{
    private int LadoA;
    private int LadoB;
    private int ladoC;

    public Triangulo(int LadoA, int LadoB, int LadoC){
        this.LadoA = LadoA;
        this.LadoB = LadoB;
        this.ladoC = LadoC;

    }

    public int getLadoA(){
        return LadoA;
    }

    public int getLadoB(){
        return LadoB;
    }

    public int getLadoC(){
        return ladoC;
    }
}

