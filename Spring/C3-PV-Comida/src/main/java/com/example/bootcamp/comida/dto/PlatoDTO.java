package com.example.bootcamp.comida.dto;

import com.example.bootcamp.comida.model.Ingrediente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlatoDTO {

public String name;
public List<Ingrediente> ingrendients;



}
