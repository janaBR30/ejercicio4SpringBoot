
package com.Ejercicio4.ejercicio4.controller;

import com.Ejercicio4.ejercicio4.Inquilino;
import com.Ejercicio4.ejercicio4.Propriedad;
import com.Ejercicio4.ejercicio4.PropriedadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
  @GetMapping ("/propiedad/{id}")
  @ResponseBody
  public PropriedadDTO devolverPropiedad (@PathVariable Long id) {
      //que a través de la id buscamos la propiedad
      //trajimos al inquilino asociado a esa propiedad
      Propriedad prop = new Propriedad (15487L, "Casa", "308 Negro Arroyo Lane", 200.0, 40000.0);
      Inquilino inqui = new Inquilino (1L, "12345678", "Walter", "White","Profesor de química");
  
      PropriedadDTO propiDTO = new PropriedadDTO();
      //asignamos los datos que necesitamos de propiedad
      propiDTO.setId_propriedad(prop.getId_propriedad());
      propiDTO.setTipo_propriedad(prop.getTipo_propriedad());
      propiDTO.setDireccion(prop.getDireccion());
      propiDTO.setValor_alquiler(prop.getValor_alquiler());
      //asignamos los datos que necesitamos de Inquilino
      propiDTO.setNombre(inqui.getNombre());
      propiDTO.setApellido(inqui.getApellido());
      
      return propiDTO;      
  
  }
}
