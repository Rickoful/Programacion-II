/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion;

/**
 *
 * @author mauri
 */
import java.util.Random;
import java.util.Scanner;

class JuegoAdivinaNumero extends Juego {

    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
    }

    public boolean validaNumero(int num) {
        return (num >= 0 && num <= 10);
    }

    public void juega() {
        Scanner sc = new Scanner(System.in);
        reiniciaPartida(3);

        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(11);
        System.out.println("Adivina un numero entre 0 y 10");

        while (true) {
            System.out.print("Introduce tu numero: ");
            int intento = sc.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("Numero invalido intenta de nuevo.");
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("Acertaste!!!!!");
                actualizaRecord();
                break;
            } else {
                if (!quitaVida()) {
                    System.out.println("El numero era: " + numeroAAdivinar);
                    break;
                } else {
                    if (intento < numeroAAdivinar) {
                        System.out.println("Pista: El numero es mayor.");
                    } else {
                        System.out.println("Pista: El numero es menor.");
                    }
                }
            }
        }
    }
}
