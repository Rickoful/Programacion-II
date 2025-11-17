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
public class Linea {
    private String color;
    private int cantidadCabinas;
    private List <Persona> filaPersonas;
    private List <Cabina> cabinas;

    public Linea(String color) {
        this.color = color;
        this.cabinas=new ArrayList<>();
        this.filaPersonas=new ArrayList<>();
    }
    public void agregarPersonas(Persona p){
        filaPersonas.add(p);
    }
    
    public void agregarCabina(int nroCab){
        cabinas.add(new Cabina(nroCab));
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidadCabinas() {
        return cantidadCabinas;
    }

    public void setCantidadCabinas(int cantidadCabinas) {
        this.cantidadCabinas = cantidadCabinas;
    }
    
}
