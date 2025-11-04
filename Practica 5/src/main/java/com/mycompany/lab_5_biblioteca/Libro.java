/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_5_biblioteca;

/**
 *
 * @author mauri
 */
import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private String isbn;
    private List<Pagina> paginas;

    public Libro(String titulo, String isbn, String[] cont) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = new ArrayList<>();
        for (int i = 0; i < cont.length; i++) {
            this.paginas.add(new Pagina(i + 1, cont[i]));
        }
    }
    public String getTitulo() { 
        return titulo; 
    }
    public String getIsbn() {
        return isbn; 
    }

    public void leer() {
        System.out.println("Libro: " + titulo);
        System.out.println("ISBN: " + isbn);
        for (Pagina p : paginas) {
            p.mostrarPagina();
        }
    }
}
