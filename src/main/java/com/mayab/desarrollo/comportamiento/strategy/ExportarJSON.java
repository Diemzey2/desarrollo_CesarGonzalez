package com.mayab.desarrollo.comportamiento.strategy;

import java.util.List;

class ExportarJSON implements Exportable {
    public String export(List<Articulo> articulos) {
        // código para exportar a JSON
        return "Exportando en JSON: " + articulos.toString();
    }
}