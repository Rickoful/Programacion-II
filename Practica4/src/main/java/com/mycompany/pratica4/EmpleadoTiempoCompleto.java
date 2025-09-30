/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratica4;

/**
 *
 * @author mauri
 */
class EmpleadoTiempoCompleto extends Empleado {

    private double salarioAnual;

    public EmpleadoTiempoCompleto(String nombre, double salarioAnual) {
        super(nombre);
        this.salarioAnual = salarioAnual;
    }

    @Override
    public double calcularSalarioMensual() {
        return salarioAnual / 12;
    }

    @Override
    public String toString() {
        return super.toString()
                + " Tipo: Tiempo Completo"
                + " Salario Anual: " + salarioAnual
                + " Mensual: " + calcularSalarioMensual();
    }
}
