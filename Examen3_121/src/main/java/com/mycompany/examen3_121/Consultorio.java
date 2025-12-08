/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen3_121;

/**
 *
 * @author mauri
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Consultorio {
    public String Consultas;
    public String medicos;
    
    public static void creaConsulta() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Consulta con1 = new Consulta("Juan", "Perez","Junio",1,232456,12,2025);
        Consulta con2 = new Consulta("Jorge", "Lopez","Agosto",2,123441,23,2025);
        Consulta con3 = new Consulta("Lula", "Dasilva","Enero",1,236056,3,2025);
        Consulta con4 = new Consulta("Jasinta", "Mamani","Diciembre",3,223422,25,2025);
        Consulta con5 = new Consulta("Julian", "Valdez","Noviembre",2,123123,2,2025);
        Consulta con6 = new Consulta("Anastasia", "Curran","Mayo",3,987634,23,2025);
        Consulta con7 = new Consulta("Lilo", "Huaman","Febrero",3,234252,4,2025);
        Consulta con8 = new Consulta("Chuliman", "Condori","Enero",1,9987457,1,2026);
        Consulta con9 = new Consulta("Patty", "Cahuasa","Septiembre",2,4343225,28,2025);
        
        List<Consulta> lista = new ArrayList<>();
        lista.add(con1);
        lista.add(con2);
        lista.add(con3);
        lista.add(con4);
        lista.add(con5);
        lista.add(con6);
        lista.add(con7);
        lista.add(con8);
        lista.add(con9);
        String Consultas = gson.toJson(lista);
        try {
            FileWriter writer = new FileWriter("Consulta.json");
            writer.write(Consultas);
            writer.close(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void creaMedico() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Medico med1 = new Medico(1,12,"Alvaro","Jimenez");
        Medico med2 = new Medico(2,10, "Carlos","Martinez");
        Medico med3 = new Medico(3,13,"Roger","Alegre");
        List<Medico> lista = new ArrayList<>();
        lista.add(med1);
        lista.add(med2);
        lista.add(med3);
        String medicos = gson.toJson(lista);
        try {
            FileWriter writer = new FileWriter("Medico.json");
            writer.write(medicos);
            writer.close(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void CargarConsultas() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            Type tipolista = new TypeToken<List<Consulta>>() {
            }.getType();
            FileReader reader =new FileReader("Consulta.json");
            List<Consulta> lista = gson.fromJson(reader,tipolista);
            reader.close();
            // System.out.println(c.nombrePaciente + " " + c.apellidoPaciente+" "+c.idMed+" "+c.ci+" "+c.dia+" ");
            StringBuilder sb = new StringBuilder();
            for (Consulta c : lista) sb.append(c).append("\n");
                System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void CargarMedicos() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            Type tipolista = new TypeToken<List<Medico>>() {
            }.getType();
            FileReader reader =new FileReader("Medico.json");
            List<Medico> lista = gson.fromJson(reader,tipolista);
            reader.close();
            StringBuilder sb = new StringBuilder();
            for (Medico m : lista) sb.append(m).append("\n");
                System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public static void eliminarConsulta(String nombre, String apellido) {
    Gson gson = new Gson();

    List<Consulta> lista = new ArrayList<>();
    try {
        FileReader reader = new FileReader("Consulta.json");
        Type tipo = new TypeToken<List<Consulta>>(){}.getType();
        lista = gson.fromJson(reader, tipo);
        reader.close();
    } catch (IOException e) {
            e.printStackTrace();
        }
    boolean encontrado = false;
    List<Consulta> listaNueva = new ArrayList<>();
    
    for (int i = 0; i < lista.size(); i++) {
        Consulta c = lista.get(i);
        if (c.nombrePaciente.equalsIgnoreCase(nombre) && c.apellidoPaciente.equalsIgnoreCase(apellido)) {
            System.out.println("Encontrada y eliminada: " + c.nombrePaciente + " " + c.apellidoPaciente);
            encontrado = true;
        } else {
            listaNueva.add(c);
        }
    }

    try {
        FileWriter writer = new FileWriter("Consulta.json");
        gson.toJson(listaNueva, writer);
        writer.close();
        System.out.println("-------Lista Actualizada---------");
        StringBuilder sb = new StringBuilder();
            for (Consulta c : listaNueva) sb.append(c).append("\n");
                System.out.println(sb.toString());
    } catch (IOException e) {
            e.printStackTrace();
        }
}
    
}
