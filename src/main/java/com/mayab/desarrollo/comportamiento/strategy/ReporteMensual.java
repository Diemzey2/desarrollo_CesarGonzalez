package com.mayab.desarrollo.comportamiento.strategy;

class ReporteMensual extends Reporte {
    public ReporteMensual() {
        super();
        exportable = new ExportarPDF(); // exportar a PDF
    }
}