/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.roteiro;
import classes.Ponts;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Roteiro {
    public static void menuOptions1() {
        System.out.println("---------- ESCOLHA UMA DAS OPÇÕES ---------");
        System.out.println("1- Quadrado");
        System.out.println("2- Triângulo");
    }
    
    public static void menuOptionsSquare() {
        System.out.println("1- Preencher os pontos(coordenadas) do quadrado");
        System.out.println("2- Imprimir os pontos(coordenadas)");
        System.out.println("3- Calcular distância");
        System.out.println("4- Verificar se os lados formam um quadrado");
        System.out.println("5- Calcular área");
        System.out.println("6- Calcular perimetro");
        System.out.println("0- Sair");
    }
    
    public static void menuOptionsTriangle() {
        System.out.println("1- Preencher os pontos(coordenadas) do triângulo");
        System.out.println("2- Imprimir os pontos(coordenadas)");
        System.out.println("3- Calcular distância");
        System.out.println("4- Verificar tipos do triângulo");
        System.out.println("5- Calcular área");
        System.out.println("6- Calcular perimetro");
        System.out.println("0- Sair");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc = 0;
        Ponts p1, p2, p3;

        do {
            menuOptions1();
            System.out.print("Digite sua opção: ");
            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    menuOptionsSquare();
                    // Aqui você pode adicionar a lógica para lidar com a escolha do usuário para o quadrado
                    break;
                case 2:
                    menuOptionsTriangle();
                    // Aqui você pode adicionar a lógica para lidar com a escolha do usuário para o triângulo
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opc != 0);
    }
}


