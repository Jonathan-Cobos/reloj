/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reloj;

/**
 *
 * @author Acer
 */
public class Reloj {

    public static void main(String[] args) {
     
     Mundo reloj= new Mundo();
        System.out.println(reloj.toString());
        reloj.actual(15, 30, 04);
              System.out.println(reloj.toString());  
    }
}
