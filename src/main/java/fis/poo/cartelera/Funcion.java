/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.cartelera;

/**
 *
 * @author usuario
 */
public class Funcion {
    private Pelicula pelicula;
    private String dia;
    private String hora;
    private int boletosGeneral;
    private int boletosNino;
    private int boletos3RaEdad;
    private boolean[][] asientos;
    

    public Funcion(Pelicula pelicula, String dia, String hora) {
        this.pelicula = pelicula;
        this.dia = dia;
        this.hora = hora;
        asientos = new boolean[5][10];
       
    }
    
    public String getAsientosFormateados() {

        StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 5; i++) {
               for (int j = 0; j < 10; j++) {

                   if (asientos[i][j]) {

                       sb.append((char) ('A' + i))
                         .append(j + 1)
                         .append(", ");
                   }
               }
           }

            if (sb.length() > 2) {
                sb.setLength(sb.length() - 2);
            }

            return sb.toString();
        }

    public void limpiarAsientos() {

    for (int i = 0; i < asientos.length; i++) {

        for (int j = 0; j < asientos[i].length; j++) {

            asientos[i][j] = false;

        }

    }

}
    

    public Pelicula getPelicula() {
        return pelicula;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public int getBoletosGeneral() {
        return boletosGeneral;
    }

    public void setBoletosGeneral(int boletosGeneral) {
        this.boletosGeneral = boletosGeneral;
    }

    public int getBoletosNino() {
        return boletosNino;
    }

    public void setBoletosNino(int boletosNino) {
        this.boletosNino = boletosNino;
    }

    public int getBoletos3RaEdad() {
        return boletos3RaEdad;
    }

    public void setBoletos3RaEdad(int boletos3RaEdad) {
        this.boletos3RaEdad = boletos3RaEdad;
    }

   public double getTotal() {
    return boletosGeneral * 5.50 + boletosNino * 3.50 +boletos3RaEdad*2.25;
}

    public boolean[][] getAsientos() {
        return asientos;
    }
    public void setDia(String dia) {
    this.dia = dia;
}

    public void setHora(String hora) {
    this.hora = hora;
}
   
}
