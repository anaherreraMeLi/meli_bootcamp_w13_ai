package com.bootcamp.calculadorEdad.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;

@RestController
public class AgeController {
    @GetMapping("/{dia}/{mes}/{anio}")
    public String calcularEdad(@PathVariable("dia") int dia, @PathVariable("mes") int mes, @PathVariable("anio") int anio) {
        LocalDate hoy = LocalDate.now();
        LocalDate cumple = LocalDate.of(anio, mes, dia);

        Period p = Period.between(cumple, hoy);

        return p.getYears() + " años " + p.getMonths() + " meses";
    }

//    @GetMapping(path = "/{day}/{month}/{year}")
//    public String read(@PathVariable int day,
//                       @PathVariable int month,
//                       @PathVariable int year){
//
//        LocalDate now = LocalDate.now();
//
//        LocalDate past = LocalDate.of(year,month,day);
//
//        // int edad = now.getYear() - past.getYear();
//
//        return "edad : " + past.until(now).getYears();
//    }
}