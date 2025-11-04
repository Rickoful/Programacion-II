/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_5_biblioteca;

/**
 *
 * @author mauri
 */
public class Lab_5_Biblioteca {

    public static void main(String[] args) {
        Autor a1 = new Autor("Juan Perez", "Bolivia");
        Autor a2 = new Autor("Maria Gomez", "Argentina");

        Libro li1 = new Libro("Introduccion a Java", "978-1",new String[]{"Portada", "Contenido pagina 1", "Contenido pagina 2"});
        Libro li2 = new Libro("Algoritmos y Estructuras", "978-2",new String[]{"Portada", "Capitulo 1", "Capitulo 2", "Indice"});

        Biblioteca biblioteca = new Biblioteca("Biblioteca UMSA", "Lunes-Viernes", "08:00", "18:00");

        biblioteca.agregarAutor(a1);
        biblioteca.agregarAutor(a2);
        biblioteca.agregarLibro(li1);
        biblioteca.agregarLibro(li2);

        Estudiante estudiante = new Estudiante("29323", "Ana Torres");

        biblioteca.mostrar();

        biblioteca.prestarLibro("","",estudiante, li1);

        System.out.println("--- Leyendo libro1 ---");
        li1.leer();

        biblioteca.cerrarBiblioteca();
        biblioteca.mostrar();
    }
}
