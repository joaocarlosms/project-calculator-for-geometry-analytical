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
        for(int i = 0; i < ponts.length; i++) {
            if(ponts[i] != ponts[i + 1])
        }
    }
    
    public double calculateDistance(Ponts p, Ponts q) {
        double dist = (Math.pow(p.getX() - 
                q.getX(), 2)) + (
                Math.pow(p.getY() - q.getY(), 2));
        
        return dist;
    }
    
    public double calculatePerimeter() {
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
    
    public double calculateArea() {
        //verify square
        
        double result = Math.pow(calculateDistance(ponts[0], ponts[1]), 2);
        
        return result;
    }
}
