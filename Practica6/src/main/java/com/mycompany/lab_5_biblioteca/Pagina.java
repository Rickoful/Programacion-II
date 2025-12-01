/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_5_biblioteca;

/**
 *
 * @author mauri
 */
public class Pagina {
    private int numPag;
    private String contPag;

    public Pagina(int numPag, String contPag) {
        this.numPag = numPag;
        this.contPag = contPag;
    }
    public void mostrarPagina() {
            System.out.println("pagina " + numPag + ": " + contPag);
        }
    }