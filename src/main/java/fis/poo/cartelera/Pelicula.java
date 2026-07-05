/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.cartelera;

import javax.swing.ImageIcon;

/**
 *
 * @author usuario
 */
public class Pelicula {
    

    private String nombre;
    private String descripcion;
    private ImageIcon portada;
    private String duracion;

   public Pelicula(String nombre, String descripcion, String rutaImagen, String duracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.portada = new ImageIcon(getClass().getResource(rutaImagen));
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ImageIcon getPortada() {
        return portada;
    }

    public String getDuracion() {
        return duracion;
    }
    
    
}
