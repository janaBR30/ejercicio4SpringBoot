
package com.Ejercicio4.ejercicio4;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Propriedad {
    private Long id_propriedad;
    private String tipo_propriedad;
    private String direccion;
    private Double metros_cuadrados;
    private Double valor_alquiler;

    public Propriedad() {
    }

    public Propriedad(Long id_propriedad, String tipo_propriedad, String direccion, Double metros_cuadrados, Double valor_alquiler) {
        this.id_propriedad = id_propriedad;
        this.tipo_propriedad = tipo_propriedad;
        this.direccion = direccion;
        this.metros_cuadrados = metros_cuadrados;
        this.valor_alquiler = valor_alquiler;
    }
    
    
    
    
}
