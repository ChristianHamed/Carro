/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carro.ui;

import java.util.Scanner;
import mx.itson.carro.entidades.EquipoSonido;
import mx.itson.carro.entidades.Propietario;
import mx.itson.carro.entidades.carro;
//import mx.itson.carro.envm.TipoCajaCambio;
//import mx.itson.carro.envm.TipoMotor;



/**
 *
 * @author alumnog
 */
public class Main {
    
    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Ingrese la distancia recorrida:");
    double distancia = sc.nextDouble();
    
    System.out.println("Ingrese la velocidad a la que viaja el carro:");
    double velocidad = sc.nextDouble();
    
    // Generamos una instancia de la clase Carro
    carro bmw = new carro();
    bmw.setMarca("BMW");
    bmw.setColor("Negro");
    bmw.setAño(2021);
    bmw.setKilometraje(10000);
    //bmw.setTipoMotor(TipoMotor.HIBRIDO);
    //bmw.setTipoCajaCambio(TipoCajaCambio.ESTANDAR);
            
    Propietario prop = new Propietario();
    prop.setNombre ("Eduardo Vargas Luna");
    prop.setDomicilio ("Calle 23 colonia cengro");
    prop.setTelefono("6221734422");
    prop.setEmail("eduardo_vargas@gmail.com");
    
    bmw.setPropietario(prop);
    
    /*carro bmw = new carro();
    bmw.marca = "BMW";
    bmw.color = "Negro";
    bmw.año = 2022;
    */       
   
    EquipoSonido e = new EquipoSonido();
    e.setMarca("Sony");
    e.setPrecio(5000);
    e.setTieneBluetooth(true);
    e.setMusica("Corridos tumbados con Kalimba");
    
    bmw.setEstereo(e);
    
    //Inocamos al metodo contenido en la clase Carro
    double tiempo = bmw.calcularTiempo(distancia, velocidad);
    
    //System.out.println("El tiempo que le tomara es " + tiempo);
    System.out.println("El tiempo que le tomara al " + bmw.getMarca() +
            " de color " + bmw.getColor() +
            " y cuyo modelo es " + bmw.getAño() +
            " sera " + tiempo + 
            " y ahora su kilometraje es de " + bmw.getKilometraje() +
            ". El propietario de este carro es " + bmw.getPropietario().getNombre()
    + " y esta escuchando " + bmw.getEstereo(). getMusica());
    
    
    
     }
    
}
