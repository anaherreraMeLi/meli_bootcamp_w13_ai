package com.bootcamp.CalCalorias.Controller;

import com.bootcamp.CalCalorias.Model.Plato;
import com.bootcamp.CalCalorias.Model.InfoPlato;
import com.bootcamp.CalCalorias.Service.PlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalCaloriasController {

    @Autowired
    PlatoService platoService;

    @PostMapping("/calculo")
    public ResponseEntity<InfoPlato> calCaloria(@RequestBody Plato plato){
        if (plato.getNombre() == null){
            return new ResponseEntity("Error debe ingresar un plato!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(platoService.calculo(plato), HttpStatus.OK);
    }
}
