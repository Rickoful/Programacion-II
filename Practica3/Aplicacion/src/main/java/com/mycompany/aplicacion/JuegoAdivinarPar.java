/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion;

/**
 *
 * @author mauri
 */
class JuegoAdivinarPar extends JuegoAdivinaNumero {

    public JuegoAdivinarPar(int vidas) {
        super(vidas);
    }

    public boolean validaNumero(int num) {
        if (num < 0 || num > 10) {
            return false;
        }
        if (num % 2 == 0) {
            return true;
        } else {
            System.out.println("Solo se permiten numeros pares.");
            return false;
        }
    }
}
