package com.mayab.desarrollo.estructura.proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------PROXY--------");
        System.out.println("----CESAR GONZALEZ------");
        System.out.println("-------00404288--------\n");

        System.out.println("ADMINISTRADOR");
        ReporteVentas reporte = new ReporteVentasProxy("Administrador");
        reporte.leer();
        reporte.escribir();

        System.out.println("VENDEDOR");
        ReporteVentas reporte2 = new ReporteVentasProxy("Vendedor️");
        reporte2.leer();
        reporte2.escribir();
    }
}