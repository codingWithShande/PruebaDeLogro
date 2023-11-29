/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shande.modelado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarDatosEnArchivo {

    public static void guardarDatos(String datos, String rutaArchivo, String nombreArchivo) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo + nombreArchivo, true))) {
            datos += System.lineSeparator();
            escritor.write(datos + System.lineSeparator());

            System.out.println("Los datos se han agregado en " + rutaArchivo + nombreArchivo + " exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public static String leerDatos(String rutaArchivo, String nombreArchivo) {
        StringBuilder datos = new StringBuilder();

        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo + nombreArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {

                datos.append(linea).append(System.lineSeparator());

            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return datos.toString();
    }
    
}
