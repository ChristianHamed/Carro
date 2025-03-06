/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carro.entidades;

import mx.itson.carro.envm.TipoMotor;

/**
 *
 * @author alumnog
 */
public class carro {

    /**
     * @return the kilometraje
     */
    public double getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    private String color;
    private int año;
    private String marca;
    private double kilometraje;
    private TipoMotor tipoMotor;
    
    /**
     * Calcula el tiempo que tarda el carro en recorrer una distancia.
     * @param distancia Distancia que recorre el carro.
     * @param velocidad Velocidad a la que viaja el carro.
     * @return Tiempo en el que llegara el carro.
     */
    
   public double calcularTiempo(double distancia, double velocidad) {
    this.kilometraje += distancia;
    // La linea de arriba es lo mismo que esta de abajo
    //this.kilometraje = this.kilometraje + distancia;
    double tiempo = distancia / velocidad;
    return tiempo;
    
    //retunr distancia / velocidad;
   }

    public void setTipoMotor(TipoMotor tipoMotor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   

} 
