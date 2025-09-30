/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplicacion;

public class Aplicacion {
    public static void main(String[] args) {
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        JuegoAdivinarPar juego2 = new JuegoAdivinarPar(3);
        JuegoAdivinarImpar juego3 = new JuegoAdivinarImpar(3);

        System.out.println("-----Juego Normal-----");
        juego1.juega();

        System.out.println("\n-----Juego Pares-----");
        juego2.juega();

        System.out.println("\n-----Juego Impares-----");
        juego3.juega();
    }
}
