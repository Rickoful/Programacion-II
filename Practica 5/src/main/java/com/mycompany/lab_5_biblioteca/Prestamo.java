/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_5_biblioteca;

/**
 *
 * @author mauri
 */
public class Prestamo {
    protected  String fechaP,fechaDe;
    protected Libro libro;
    protected Estudiante estudiante;

    public Prestamo(String fechaP, String fechaDe, Estudiante estudiante,Libro libro) {
        this.fechaP = fechaP;
        this.fechaDe = fechaDe;
        this.libro = libro;
        this.estudiante = estudiante;
    }
    
    public void mostrarInfo(){
        System.out.println("Se presto libro: "+ libro.getTitulo() + "al estudiante: "+ estudiante.getNombre());
        System.out.println("Fecha prestamo: "+ fechaP + "fecha devolucion "+fechaDe);
    }
}
