/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen3_121;

/**
 *
 * @author mauri
 */
public class Examen3_121 {
    public static void main(String[] args) {
        Consultorio.creaConsulta();
        Consultorio.creaMedico();
        Consultorio.CargarConsultas();
        Consultorio.CargarMedicos();
        
        Consultorio.eliminarConsulta("Jorge","Lopez");
    }
}
