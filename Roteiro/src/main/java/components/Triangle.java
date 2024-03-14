/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;
import classes.Ponts;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Triangle {
    private Ponts[] ponts;
    
    public Triangle() {
        ponts[3] = new Ponts();
        
        for(int i = 0; i < 3; i++) {
            ponts = new Ponts[i];
        }
    }

    public Ponts[] getPonts() {
        return ponts;
    }

    public void setPonts(Ponts[] ponts) {
        this.ponts = ponts;
    }
    
    public void printPonts() {
        for(int i = 0; i < ponts.length; i++) {
            System.out.println("Ponto X"+i + ": " 
                    + ponts[i].getX() + ", " 
                    + ponts[i].getY());
        }
    }
    
    public double calculateDistance() {
        double difX = ponts[0].getX() - ponts[1].getX();
        double difY = ponts[0].getY() - ponts[1].getY();
        difX = Math.pow(difX, 2);
        difY = Math.pow(difY, 2);
        double result = Math.sqrt(difX + difY);
        
        return result;
    }
    
    public double calculateDet() {
        double det = 
                ponts[0].getX() * ponts[1].getY() +
                ponts[1].getX() * ponts[2].getY() + //Até aqui é a primeira parcela
                ponts[2].getX() * ponts[0].getY() -
                ponts[0].getY() * ponts[2].getX() -
                ponts[2].getY() * ponts[1].getX() -
                ponts[1].getY() * ponts[0].getX(); //Até aqui é a segunda parcela           
        
        return det;
    }
    
    public boolean isCollinear() {
        double determinant = calculateDet();
        
        return determinant == 0; //se det=0, logo return true;
    }
    
    public double calculateArea() {
        boolean verifyPontsCollinear = isCollinear();
        double areaTriangle = calculateDet();
        
        if(!verifyPontsCollinear) {
            System.out.println("Os pontos do seu triangulo não são colineares, "
                    + "porque seu determinante é diferente de zero");
        } else {
            System.out.println("Calculando área do triangulo: ");
            areaTriangle /= 2;
        }
        return areaTriangle;
    }
    
    public void calculatePerimeter() {
        double areaTriangle = calculateArea();
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
