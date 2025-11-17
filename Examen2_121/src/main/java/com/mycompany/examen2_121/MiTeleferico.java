/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen2_121;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mauri
 */
public class MiTeleferico {
    private float cantidadIngresos;
    private List <Linea>lineas;

    public MiTeleferico() {
        this.lineas=new ArrayList<>();
    }
    public boolean agregarPersonaFila(Persona p,String linea){
        for (Linea l : lineas) {
            if(l.getColor().equalsIgnoreCase(linea)){
                l.agregarPersonas(p);
                return true;
            }
        }
        return false;
    }
    public boolean agregarCabina(String linea){
        for (Linea l : lineas) {
            if (l.getColor().equalsIgnoreCase(linea)) {
                l.agregarCabina(nroCab);
                return true;
            }
        }
        return false;
    }
}
