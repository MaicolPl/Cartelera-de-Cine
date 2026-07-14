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
    private ImageIcon fondo;
    private String duracion;
    private String enlace;

   public Pelicula(String nombre, String descripcion, String rutaImagen, String duracion,String rutaImagenFondo,String enlace) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.enlace= enlace;
        this.portada = new ImageIcon(getClass().getResource(rutaImagen));
        this.fondo = new ImageIcon(getClass().getResource(rutaImagenFondo));
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
    public ImageIcon getFondo() {
        return fondo;
    }
    public String getDuracion() {
        return duracion;
    }
    public String getEnlace() {
        return enlace;
    }    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pelicula)) {
            return false;
        }
        Pelicula otra = (Pelicula) obj;
        return nombre != null && nombre.equals(otra.nombre);
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode() : 0;
    }

}
