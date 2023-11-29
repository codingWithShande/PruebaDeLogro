/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shande.calculo;

/**
 *
 * @author SDrozer
 */
public class CalculadoraSueldo {
    public static double calcularAsignacionMovilidad(String area, String condicion, double sueldoBase) {
        double porcentajeAsignacion = 0.0;

        switch (condicion) {
            case "Contratado":
                switch (area) {
                    case "Planificación":
                        porcentajeAsignacion = 0.07;
                        break;
                    case "Ventas":
                        porcentajeAsignacion = 0.08;
                        break;
                    case "Marketing":
                        porcentajeAsignacion = 0.12;
                        break;
                }
                break;
            case "Estable":
                switch (area) {
                    case "Planificación":
                        porcentajeAsignacion = 0.09;
                        break;
                    case "Ventas":
                        porcentajeAsignacion = 0.12;
                        break;
                    case "Marketing":
                        porcentajeAsignacion = 0.16;
                        break;
                }
                break;
        }

        return sueldoBase * porcentajeAsignacion;
    }

    public static double calcularSueldoFinal(double sueldoBase, double asignacionMovilidad, int numeroHijos) {
        double porcentajeDescuento = 0.175;
        double asignacionPorHijo = 55.0;

        return sueldoBase + asignacionMovilidad + (numeroHijos * asignacionPorHijo) - (porcentajeDescuento * sueldoBase);
    }
}

