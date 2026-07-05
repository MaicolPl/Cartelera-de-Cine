/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.cartelera;

/**
 *
 * @author usuario
 */
public class Compra {
    private Cine cine;
    private Funcion funcion;

    private String nombre;
    private String telefono;
    private String correo;

    public Compra(Cine cine, Funcion funcion, String nombre, String telefono, String correo) {
        this.cine = cine;
        this.funcion = funcion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    public Cine getCine() {
        return cine;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }
    public String getResumen() {

        return "CINE: " + cine.getUbicacion() + "\n"
             + "PELICULA: " + funcion.getPelicula().getNombre() + "\n"
             + "DIA: " + funcion.getDia() + "\n"
             + "HORA: " + funcion.getHora() + "\n"
             + "ASIENTOS: "+"["+funcion.getAsientosFormateados()+"]"+"\n"
             + "CLIENTE: " + nombre + "\n"
             + "TELEFONO: " + telefono + "\n"
             + "CORREO: " + correo + "\n";
    }    
}
