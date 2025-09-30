/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratica4;

/**
 *
 * @author mauri
 */
class EmpleadoTiempoHorario extends Empleado {

    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoTiempoHorario(String nombre, double horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalarioMensual() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String toString() {
        return super.toString()
                + " Tipo: Tiempo Horario"
                + " Horas: " + horasTrabajadas
                + " Tarifa: " + tarifaPorHora
                + " Mensual: " + calcularSalarioMensual();
    }
}