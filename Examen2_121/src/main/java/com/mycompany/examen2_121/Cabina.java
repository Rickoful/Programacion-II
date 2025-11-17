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
public class Cabina {
    private int nroCabina;
    private List <Persona> personasAbordo;

    public Cabina(int nroCabina) {
        this.nroCabina = nroCabina;
        this.personasAbordo=new ArrayList<>();
    }
    
    public void agregarPersonas(Persona p){
        personasAbordo.add(p);
    }

    public int getNroCabina() {
        return nroCabina;
    }

    public void setNroCabina(int nroCabina) {
        this.nroCabina = nroCabina;
    }
    
}
