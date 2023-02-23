package com.mayab.desarrollo.comportamiento.strategy;
import java.util.List;
class ExportarXML implements Exportable {
    public String export(List<Articulo> articulos) {
        // código para exportar a XML
        return "Exportando en XML: " + articulos.toString();
    }
}

