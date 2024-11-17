/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_final;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Andrey
 */
public class Proyecto_final {

    public static void main(String[] args) {
        File fichero = new File("src/main/java/archivos/Usuarios.txt");
        File directorio = new File("src/main/java/archivos");
        if (!directorio.exists()) {
            directorio.mkdirs();
        }
        if (!fichero.exists()) {
            fichero.mkdirs(); 
                }
        VentanaInicioSesion ventana1= new VentanaInicioSesion();
        ventana1.setVisible(true);
        
        
    }
}
