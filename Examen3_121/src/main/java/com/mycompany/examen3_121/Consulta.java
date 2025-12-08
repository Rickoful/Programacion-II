/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen3_121;

/**
 *
 * @author mauri
 */
import java.util.Scanner;
public class Consulta {
    protected String nombrePaciente,apellidoPaciente,mes;
    protected int idMed,ci,dia,anio;

    public Consulta(String nombrePaciente, String apellidoPaciente, String mes, int idMed, int ci, int dia, int anio) {
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.mes = mes;
        this.idMed = idMed;
        this.ci = ci;
        this.dia = dia;
        this.anio = anio;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    public void setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Consulta{" + "nombrePaciente=" + nombrePaciente + ", apellidoPaciente=" + apellidoPaciente + ", mes=" + mes + ", idMed=" + idMed + ", ci=" + ci + ", dia=" + dia + ", anio=" + anio + '}';
    }
    
    
}
