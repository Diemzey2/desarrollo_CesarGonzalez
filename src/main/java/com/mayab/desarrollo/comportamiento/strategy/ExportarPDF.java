package com.mayab.desarrollo.comportamiento.strategy;
import java.util.List;

class ExportarPDF implements Exportable {
    public String export(List<Articulo> articulos) {
        // código para exportar a PDF
        return "Exportando en PDF: " + articulos.toString();
    }
}
