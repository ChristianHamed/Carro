/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carro.entidades;

/**
 *
 * @author alumnog
 */
public class EquipoSonido {

    /**
     * @return the marca
     */
    private String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the precio
     */
    private float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the tieneBluetooth
     */
    private boolean isTieneBluetooth() {
        return tieneBluetooth;
    }

    /**
     * @param tieneBluetooth the tieneBluetooth to set
     */
    public void setTieneBluetooth(boolean tieneBluetooth) {
        this.tieneBluetooth = tieneBluetooth;
    }

    /**
     * @return the musica
     */
    public String getMusica() {
        return musica;
    }

    /**
     * @param musica the musica to set
     */
    public void setMusica(String musica) {
        this.musica = musica;
    }
    
    private String marca;
    private float precio;
    private boolean tieneBluetooth;
    private String musica; 
}
