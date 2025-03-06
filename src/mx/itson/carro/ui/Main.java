/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carro.ui;

import java.util.Scanner;
import mx.itson.carro.entidades.carro;



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
            
    /*carro bmw = new carro();
    bmw.marca = "BMW";
    bmw.color = "Negro";
    bmw.año = 2022;
    */       
    
    
    //Inocamos al metodo contenido en la clase Carro
    double tiempo = bmw.calcularTiempo(distancia, velocidad);
    
    //System.out.println("El tiempo que le tomara es " + tiempo);
    System.out.println("El tiempo que le tomara al " + bmw.getMarca() +
            " de color " + bmw.getColor() +
            " y cuyo modelo es " + bmw.getAño() +
            " sera " + tiempo + 
            " y ahora su kilometraje es de " + bmw.getKilometraje());
    
    
    
     }
    
}
