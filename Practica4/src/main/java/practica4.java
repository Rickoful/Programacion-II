/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mauri
 */
import java.util.Random;

public class practica4 {

    public static void main(String[] args) {
        Random rand = new Random();
        Figura[] figuras = new Figura[5];

        for (int i = 0; i < figuras.length; i++) {
            int tipo = rand.nextInt(2) + 1; 
            if (tipo == 1) {
                double lado = rand.nextInt(10) + 1;
                figuras[i] = new Cuadrado(lado);
                figuras[i].setColor("Rojo");
            } else {
                double radio = rand.nextInt(10) + 1;
                figuras[i] = new Circulo(radio);
                figuras[i].setColor("Azul");
            }
        }

        System.out.println("--- Lista de figuras ---");
        for (Figura f : figuras) {
            System.out.println(f.toString());
            if (f instanceof Coloreado) {
                System.out.println(((Coloreado) f).comoColorear());
            }
        }
    }
}
