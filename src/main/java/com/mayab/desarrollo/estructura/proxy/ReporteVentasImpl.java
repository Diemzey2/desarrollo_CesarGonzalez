package com.mayab.desarrollo.estructura.proxy;

class ReporteVentasImpl implements ReporteVentas {
    public void leer() {
        System.out.println("Leyendo reporte de ventas...");
    }

    public void escribir() {
        System.out.println("✅ Escribiendo reporte de ventas...");
    }
}