/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;
import classes.Ponts;
/**
 *
 * @author 12289319686
 */
public class Square {
    private Ponts[] ponts;
    
    public Square() {
        ponts[4] = new Ponts();
        
        for(int i = 0; i < ponts.length; i++) {
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
    
    public boolean verifySidesSquare() {
        double lastDistance = calculateDistance(ponts[3], ponts[0]);
        
        for(int i = 0; i < ponts.length; i++) {
           double currentDistance = calculateDistance(ponts[i], ponts[i+1]);
           if(currentDistance != lastDistance){
               return false;
           }
        }
        System.out.println("Quadrado com todos os lados iguais,"
                + "logo é um quadrado equilátero");
        return true;
    }
    
    public double calculateDistance(Ponts p, Ponts q) {
        double dist = (Math.pow(p.getX() - 
                q.getX(), 2)) + (
                Math.pow(p.getY() - q.getY(), 2));
        
        return dist;
    }
    
    public double calculatePerimeter() {
        if(verifySidesSquare()) {
            double soma = 0.0;
        
            for(int i = 0; i < ponts.length; i++) {
                if(i == 3) {
                    soma += calculateDistance(ponts[0], ponts[3]);
                }
                else {
                    soma += calculateDistance(ponts[i], ponts[i+1]);
                }
            }
        return soma;
        }
        else {
            System.out.println("Os lados naão formam um quadrado");
            return 0;
        }
    }
    
    public double calculateArea() {
        if(verifySidesSquare()) {
            double result = Math.pow(calculateDistance(ponts[0], ponts[1]), 2);
        
            return result;
        }
        else {
            System.out.println("Os lados naão formam um quadrado");
            return 0;
        }
    }
}
