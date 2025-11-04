/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_5_biblioteca;

/**
 *
 * @author mauri
 */
public class Horario {
    private String DiasAp, HoraAp, HoraCie;

    public Horario(String DiasAp, String HoraAp, String HoraCie) {
        this.DiasAp = DiasAp;
        this.HoraAp = HoraAp;
        this.HoraCie = HoraCie;
    }
    public void mostrarHorario() {
            System.out.println("Horario: " + DiasAp + " " + HoraAp + " - " + HoraCie);
        }
}
