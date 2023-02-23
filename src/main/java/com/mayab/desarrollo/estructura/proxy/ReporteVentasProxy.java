package com.mayab.desarrollo.estructura.proxy;

class ReporteVentasProxy implements ReporteVentas {
    private ReporteVentas reporteVentas;
    private String tipoEmpleado;

    public ReporteVentasProxy(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
        reporteVentas = new ReporteVentasImpl();
    }

    public void leer() {
        reporteVentas.leer();
    }

    public void escribir() {
        if (tipoEmpleado.equals("Administrador")) {
            reporteVentas.escribir();
        } else {
            System.out.println("❌ Error: " + tipoEmpleado + " no tiene permisos para escribir el informe de ventas.");
        }
    }
}