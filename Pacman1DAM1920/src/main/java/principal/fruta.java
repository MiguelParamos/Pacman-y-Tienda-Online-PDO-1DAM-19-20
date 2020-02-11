/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 * Clase que define a las frutas del PacMan
 *
 * @author Maria y Cristina
 */
public class fruta {
   private int puntosFruta;
   private int tiempoDesaparicion;
   private String tipoFruta;

   /**
    * Constructor de la clase fruta con todos sus datos.  
    * @param puntosFruta  
    * @param tiempoDesaparicion
    * @param tipoFrutas 
    */
    public fruta(int puntosFruta, int tiempoDesaparicion, String tipoFrutas) {
        this.puntosFruta = puntosFruta;
        this.tiempoDesaparicion = tiempoDesaparicion;
        this.tipoFruta = tipoFrutas;
    }

    /**
     * getter de puntosFruta     
     * @return puntos
     */
    public int getPuntosFruta() {
        return puntosFruta;
    }

    /**
     * setter de puntosFruta    
     * @param puntosFruta puntos que da al PacMan cuando se come la fruta
     */
    public void setPuntosFruta(int puntosFruta) {
        this.puntosFruta = puntosFruta;
    }

    public int getTiempoDesaparicion() {
        return tiempoDesaparicion;
    }

    public void setTiempoDesaparicion(int tiempoDesaparicion) {
        this.tiempoDesaparicion = tiempoDesaparicion;
    }

    public String getTipoFruta() {
        return tipoFruta;
    }

    public void setTipoFruta(String tipoFruta) {
        this.tipoFruta = tipoFruta;
    }
    
    public void darPuntos(){
        
    }
   
}
