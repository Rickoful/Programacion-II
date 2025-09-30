/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pratica4;

/**
 *
 * @author mauri
 */
import java.util.Scanner;

public class Practica4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado[] empleados = new Empleado[5];

        for (int i = 0; i < 3; i++) {
            System.out.print("Nombre del empleado tiempo completo " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            System.out.print("Salario anual: ");
            double salario = sc.nextDouble();
            sc.nextLine(); 
            empleados[i] = new EmpleadoTiempoCompleto(nombre, salario);
        }

        for (int i = 3; i < 5; i++) {
            System.out.print("Nombre del empleado tiempo horario " + (i - 2) + ": ");
            String nombre = sc.nextLine();
            System.out.print("Horas trabajadas: ");
            double horas = sc.nextDouble();
            System.out.print("Tarifa por hora: ");
            double tarifa = sc.nextDouble();
            sc.nextLine(); 
            empleados[i] = new EmpleadoTiempoHorario(nombre, horas, tarifa);
        }

        System.out.println("\n--- Lista de Empleados ---");
        for (Empleado e : empleados) {
            System.out.println(e.toString());
        }
    }
}
