package com.mayab.desarrollo.creacion.builder;

public class Main {
    public static void main(String[] args) {

        //Creamos sala 1
        SalaBuilder sala1Builder = new SalaBuilder();
        sala1Builder.conSofa4(1);
        sala1Builder.conMesaCentro();
        sala1Builder.conLampara();
        SalaBuilder.Sala sala1 = sala1Builder.construir();

        // Creamos sala 2
        SalaBuilder sala2Builder = new SalaBuilder();
        sala2Builder.conSofa3(1);
        sala2Builder.conSofa1(2);
        sala2Builder.conMesaLateral();
        sala2Builder.conLampara();
        SalaBuilder.Sala sala2 = sala2Builder.construir();

        System.out.println("-------BUILDER--------");
        System.out.println("----CESAR GONZALEZ----");
        System.out.println("-------00404288-------\n");

        // Mostrar los detalles de cada sala
        System.out.println("👉 Detalles de la sala 1:");
        System.out.println("Sofá4: " + sala1.getSofa4());
        System.out.println("Mesa central: " + sala1.tieneMesaCentro());
        System.out.println("Lámpara: " + sala1.tieneLampara());

        System.out.println("----------------------------");

        System.out.println("\n👉 Detalles de la sala 2:");
        System.out.println("Sofá3: " + sala2.getSofa3());
        System.out.println("Sofá1: " + sala2.getSofa1());
        System.out.println("Mesa lateral: " + sala2.tieneMesaLateral());
        System.out.println("Lámpara: " + sala2.tieneLampara());
    }
}

