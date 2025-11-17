/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen2_121;

/**
 *
 * @author mauri
 */
public class Persona {
    private String nombre;
    private int edad;
    private float pesoPersona;

    public Persona(String nombre, int edad, float pesoPersona) {
        this.nombre = nombre;
        this.edad = edad;
        this.pesoPersona = pesoPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPesoPersona() {
        return pesoPersona;
    }

    public void setPesoPersona(float pesoPersona) {
        this.pesoPersona = pesoPersona;
    }
    
}
