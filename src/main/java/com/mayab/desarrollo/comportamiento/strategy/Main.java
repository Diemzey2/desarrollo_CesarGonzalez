package com.mayab.desarrollo.comportamiento.strategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------STRATEGY-------");
        System.out.println("----CESAR GONZALEZ------");
        System.out.println("-------00404288--------\n");
        Articulo art1 = new Articulo("art1", 10.0, 2);
        Articulo art2 = new Articulo("art2", 20.0, 3);
        Articulo art3 = new Articulo("art3", 30.0, 4);

        Reporte reporte = new ReporteMensual();
        reporte.agregarArticulo(art1);
        reporte.agregarArticulo(art2);
        reporte.agregarArticulo(art3);


        reporte.exportar();
    }
}