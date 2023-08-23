/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reloj;

/**
 *
 * @author Acer
 */
public class Mundo {
   private int hora,minutos,segundos;

    public Mundo(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Mundo() {
        this.hora=00;
        this.minutos=00;
        this.segundos=00;
        
    }
    //get y set

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora>=0&&hora<=23){this.hora = hora;}
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if(minutos>=0&&minutos<=59){this.minutos = minutos;}
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
        if(segundos>=0&&segundos<=59){this.segundos = segundos;}
    }
    //tostring

    @Override
    public String toString() {
        return "mundo{" + hora +":" + minutos + ":" + segundos + '}';
    }
    
    public void actual (int hora, int min, int seg){
    
    this.hora=hora;
    this.minutos=min;
    this.segundos=seg;
    
    }
}
