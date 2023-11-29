/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shande.clases;


/**
 *
 * @author SDrozer
 */
public class BoletaPago {
    
    public String fecha;
    public String condicion;
    public String asignacion_movilidad;
    public float afp;
    public float sueldo_final;

    public BoletaPago(String fecha, String condicion, String asignacion_movilidad, float afp, float sueldo_final) {
        this.fecha = fecha;
        this.condicion = condicion;
        this.asignacion_movilidad = asignacion_movilidad;
        this.afp = afp;
        this.sueldo_final = sueldo_final;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getAsignacion_movilidad() {
        return asignacion_movilidad;
    }

    public void setAsignacion_movilidad(String asignacion_movilidad) {
        this.asignacion_movilidad = asignacion_movilidad;
    }

    public float getAfp() {
        return afp;
    }

    public void setAfp(float afp) {
        this.afp = afp;
    }

    public float getSueldo_final() {
        return sueldo_final;
    }

    public void setSueldo_final(float sueldo_final) {
        this.sueldo_final = sueldo_final;
    }
            
            
    
}
