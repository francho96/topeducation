package com.TopEducation.TopEducation.services;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CalcularCuotas {
    public int calcularDescuento(String tipoColegio, int anoEgreso){
        int aux = 0;
        if(tipoColegio.equals("Municipal")){
            aux += 20;
        }
        if(tipoColegio.equals("Subvencionado")){
            aux += 10;
        }
        if(2023 - anoEgreso < 1){
            aux += 15;
        }
        if(2023 - anoEgreso >= 1 || 2023 - anoEgreso < 3){
            aux += 8;
        }
        if(2023 - anoEgreso >= 3 || 2023 - anoEgreso < 5){
            aux += 4;
        }
        return aux;
    }
}
