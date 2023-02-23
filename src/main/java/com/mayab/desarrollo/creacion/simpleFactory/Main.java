package com.mayab.desarrollo.creacion.simpleFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("----PATRON SIMPLE F.----");
        System.out.println("-----CESAR GONZALEZ-----");
        System.out.println("--------00404288--------\n");
        FabricaTriangulo fabrica = new FabricaTriangulo();
        Triangulo triangulo = fabrica.crearTriangulo(3, 3, 3);
        System.out.println("y mis lados son: "+ triangulo.getLadoA() + " " + triangulo.getLadoB() + " " + triangulo.getLadoC());
    }

}