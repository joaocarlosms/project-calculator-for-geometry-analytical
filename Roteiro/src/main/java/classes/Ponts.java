/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ponts {
    private double x;
    private double y;
    
    public Ponts() {
        this.x = 0.0;
        this.y = 0.0;
    }
    
    public Ponts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ponts{" + "x=" + x + ", y=" + y + '}';
    }
    
    public double calculateDistance(Ponts another) {
        double difX = another.getX() - this.x;
        double difY = another.getY() - this.y;
        difX = Math.pow(difX, 2);
        difY = Math.pow(difY, 2);
        double result = Math.sqrt(difX + difY);
        
        return result;
    }
    
    public double calculateDet(Ponts p2, Ponts p3) {
        double det = 
                this.x * p2.getY() +
                p2.getX() * p3.getY() + //Até aqui é a primeira parcela
                p3.getX() * this.y -
                this.y * p2.getX() -
                p2.getY() * p3.getX() -
                p3.getY() * this.x; //Até aqui é a segunda parcela           
        
        return det;
    }
    
    public boolean isCollinear(Ponts p2, Ponts p3) {
        double determinant = calculateDet(p2, p3);
        
        return determinant == 0; //se det=0, logo return true;
    }
    
    public double calculateArea(Ponts p2, Ponts p3) {
        boolean verifyPontsCollinear = isCollinear(p2, p3);
        double areaTriangle = calculateDet(p2, p3);
        
        if(!verifyPontsCollinear) {
            System.out.println("Os pontos do seu triangulo não são colineares, "
                    + "porque seu determinante é diferente de zero");
        } else {
            System.out.println("Calculando área do triangulo: ");
            areaTriangle /= 2;
        }
        return areaTriangle;
    }
    
    public void calculatePerimeter(Ponts p2, Ponts p3) {
        double areaTriangle = calculateArea(p2, p3);
        double p = areaTriangle / 3;
        p *= 3;
        
        System.out.println("Perimetro do triangulo: "+ p);
    }
    
    public String sidesOfTriangle() {
        Scanner reader = new Scanner(System.in);
        double[] sides = new double[3];
        System.out.println("Informe o valor dos lados desse triangulo: ");
        
        for(int i = 0; i < sides.length; i++){
            sides[i] = reader.nextDouble();
        }
        
        if(sides[1] == sides[2] && sides[2] == sides[3]) {
            return "Equilátero";
        }
        else if(
                (sides[1] == sides[2] && sides[2] != sides[3]) ||
                (sides[2] == sides[3] && sides[3] != sides[1]) ||
                (sides[1] == sides[3] && sides[3] != sides[2])
                ){
            return "Isosceles";
        }
        else if(
                (sides[1] != sides[2] &&
                sides[2] != sides[3] && 
                sides[1] != sides[3]) 
                ) {
            return "Escaleno";
        }
        return null;
    }
}
