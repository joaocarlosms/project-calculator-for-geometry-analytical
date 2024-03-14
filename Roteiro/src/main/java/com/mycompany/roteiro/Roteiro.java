/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.roteiro;
import classes.Ponts;

/**
 *
 * @author Admin
 */
public class Roteiro {

    public static void main(String[] args) {
        Ponts p1, p2, p3;
        p1 = new Ponts();
        p1.setX(2);
        p1.setY(3);
        
        p2 = new Ponts();
        p2.setX(1);
        p2.setY(5);
        
        p3 = new Ponts();
        p3.setX(4);
        p3.setY(6);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        double distance = p1.calculateDistance(p2);
        System.out.println("Distancia entre os pontos: "+ distance);
        
        double areaTriangle = p1.calculateArea(p2, p3);
        System.out.println("A área do triangulo: "+ areaTriangle);
    }
}
