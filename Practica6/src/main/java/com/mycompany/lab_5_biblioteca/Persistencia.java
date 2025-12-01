/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_5_biblioteca;

/**
 *
 * @author mauri
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Persistencia {

    public static void guardarLibros(ArrayList<Libro> lista) {
        try (FileWriter writer = new FileWriter("libros.json")) {
            Gson gson = new Gson();
            gson.toJson(lista, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void guardarEstudiantes(ArrayList<Estudiante> lista) {
        try (FileWriter writer = new FileWriter("estudiantes.json")) {
            Gson gson = new Gson();
            gson.toJson(lista, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void guardarPrestamos(ArrayList<Prestamo> prestamos) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter("prestamos.json")) {
            gson.toJson(prestamos, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Libro> cargarLibros() {
        try (FileReader reader = new FileReader("libros.json")) {
            Gson gson = new Gson();
            return gson.fromJson(reader, new TypeToken<ArrayList<Libro>>() {}.getType());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public static ArrayList<Estudiante> cargarEstudiantes() {
        try (FileReader reader = new FileReader("estudiantes.json")) {
            Gson gson = new Gson();
            return gson.fromJson(reader, new TypeToken<ArrayList<Estudiante>>() {}.getType());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public static ArrayList<Prestamo> cargarPrestamos() {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("prestamos.json")) {
            return gson.fromJson(reader, new TypeToken<ArrayList<Prestamo>>() {}.getType());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
