package com.mayab.desarrollo.comportamiento.strategy;

class ReporteVentas extends Reporte {
    public ReporteVentas() {
        super();
        exportable = new ExportarJSON(); // exportar por defecto a JSON
    }
}
