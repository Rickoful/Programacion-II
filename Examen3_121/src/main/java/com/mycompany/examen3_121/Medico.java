/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen3_121;

/**
 *
 * @author mauri
 */
public class Medico {
    private int idMed,aniosExperiencia;
    private String nombreMed,apellidoMed;

    public Medico(int idMed, int aniosExperiencia, String nombreMed, String apellidoMed) {
        this.idMed = idMed;
        this.aniosExperiencia = aniosExperiencia;
        this.nombreMed = nombreMed;
        this.apellidoMed = apellidoMed;
    }

    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getNombreMed() {
        return nombreMed;
    }

    public void setNombreMed(String nombreMed) {
        this.nombreMed = nombreMed;
    }

    public String getApellidoMed() {
        return apellidoMed;
    }

    public void setApellidoMed(String apellidoMed) {
        this.apellidoMed = apellidoMed;
    }

    @Override
    public String toString() {
        return "Medico{" + "idMed=" + idMed + ", aniosExperiencia=" + aniosExperiencia + ", nombreMed=" + nombreMed + ", apellidoMed=" + apellidoMed + '}';
    }
    
    
}
