/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shande.clases;

/**
 *
 * @author SDrozer
 */
public class Empleado {
    public int codigo;
    public String nombres;
    public String apellido_paterno, apellido_materno;
    public int codigo_area;
    public int tiempo_servicio;
    public int número_hijos;
    public int sueldo_base;

    public Empleado(int codigo, String nombres, String apellido_paterno, String apellido_materno, int codigo_area, int tiempo_servicio, int número_hijos, int sueldo_base) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.codigo_area = codigo_area;
        this.tiempo_servicio = tiempo_servicio;
        this.número_hijos = número_hijos;
        this.sueldo_base = sueldo_base;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public int getCodigo_area() {
        return codigo_area;
    }

    public void setCodigo_area(int codigo_area) {
        this.codigo_area = codigo_area;
    }

    public int getTiempo_servicio() {
        return tiempo_servicio;
    }

    public void setTiempo_servicio(int tiempo_servicio) {
        this.tiempo_servicio = tiempo_servicio;
    }

    public int getNúmero_hijos() {
        return número_hijos;
    }

    public void setNúmero_hijos(int número_hijos) {
        this.número_hijos = número_hijos;
    }

    public int getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(int sueldo_base) {
        this.sueldo_base = sueldo_base;
    }
    
    
    
}
