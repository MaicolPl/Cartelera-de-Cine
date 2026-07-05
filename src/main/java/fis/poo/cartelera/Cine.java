/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.cartelera;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Cine {
    private ArrayList<Funcion> funciones;
    private ArrayList<Funcion> historial;
    private ArrayList<Compra> compras = new ArrayList<>();
    private String ubicacion;
    
    public String getUbicacion() {
    return ubicacion;
}

    public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
}

    public Cine() {
        funciones = new ArrayList<>();
        historial = new ArrayList<>();
    }
    
    
    public void agregarFuncion(Funcion funcion) {

    funciones.add(funcion);
    
}
    
    
    public ArrayList<Funcion> getFunciones() {

    return funciones;

}   
    public void agregarCompra(Compra compra) {
    compras.add(compra);
}

    public ArrayList<Compra> getCompras() {
    return compras;
}
    
  public Funcion buscarFuncion(Pelicula pelicula,String dia,String hora) {

    for (Funcion f : funciones) {

        if (f.getPelicula().equals(pelicula)
                && f.getDia().equals(dia)
                && f.getHora().equals(hora)) {

            return f;

        }

    }

    return null;

}  
    
public void limpiarTodasLasSalas() {

    for (Funcion f : funciones) {

        f.limpiarAsientos();

    }

}    


public int totalFunciones() {

    return funciones.size();

}
public void eliminarFuncion(Funcion funcion) {

    funciones.remove(funcion);

}
public void reiniciarCine() {
    limpiarTodasLasSalas();
    compras.clear();
    historial.clear();
}
public void limpiarCompras() {
    compras.clear();
}

}
