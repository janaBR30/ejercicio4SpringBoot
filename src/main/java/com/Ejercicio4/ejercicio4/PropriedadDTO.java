
package com.Ejercicio4.ejercicio4;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PropriedadDTO {
   
    private Long id_propriedad;
    private String tipo_propriedad;
    private String direccion;
    private Double valor_alquiler;
    private String nombre;
    private String apellido;

    public PropriedadDTO() {
    }

    public PropriedadDTO(Long id_propriedad, String tipo_propriedad, String direccion, Double valor_alquiler, String nombre, String apellido) {
        this.id_propriedad = id_propriedad;
        this.tipo_propriedad = tipo_propriedad;
        this.direccion = direccion;
        this.valor_alquiler = valor_alquiler;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
}
