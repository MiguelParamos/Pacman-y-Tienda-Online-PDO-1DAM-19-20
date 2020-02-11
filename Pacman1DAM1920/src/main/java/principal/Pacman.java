/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author cenec
 */
public class Pacman extends Elemento{
    private int velocidad;
    private boolean estaVivo;
    private byte direccionQueMira;
    private int numeroVidas;
    private int puntuacion;
    
    /**
     * Getter de la variable velocidad
     * @return 
     */
    public int getVelocidad(){
        return this.velocidad;
    }
    
    /**
     * Getter de la variable estaVivo
     * @return 
     */
    public boolean getEstaVivo(){
        return this.estaVivo;
    }
    
    /**
     * Getter de la variable direccionQueMira
     * @return 
     */
    public byte getDireccionQueMira(){
        return this.direccionQueMira;
    }
    
    /**
     * Getter de la variable estaVivo
     * @return 
     */
    public int getNumeroVidas(){
        return this.numeroVidas;
    }
    
    /**
     * Getter de la variable estaVivo
     * @return 
     */
    public int getPuntuacion(){
        return this.puntuacion;
    }
    
    /**
     * Setter de velocidad
     * @param v velocidad
     */
    public void setVelocidad(int v){
        this.velocidad = v;
    }
    
    /**
     * Setter de boolean estaVivo
     * @param v Bolean de si está vivo
     */
    public void setEstaVivo(boolean v){
        this.estaVivo = v;
    }
    /**
     * 
     * Setter de direccion que mira
     * @param d direccion
     */
    public void setDireccionQueMira(byte d){
        this.direccionQueMira = d;
    }
    
    /**
     * Setter de numero de vidas
     * @param n numero de vidas
     */
    public void setNumeroVidas(int n){
        this.numeroVidas = n;
    }
    
    /**
     * Setter de puntuacion
     * @param p velocidad
     */
    public void setPuntuacion(int p){
        this.puntuacion = p;
    }
}