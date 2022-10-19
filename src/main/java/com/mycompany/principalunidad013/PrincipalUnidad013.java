/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principalunidad013;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class PrincipalUnidad013 {

    public static void main(String[] args) {

        var entrada = new Scanner(System.in);
        System.out.println("ingrese la dimension del arreglo");
        var extension = entrada.nextInt();
        var arreglo = new int[extension];

        for (int i = 0; i < extension; i++) {
            System.out.println("Ingrese los datos del vector en la poscicion " + i);
            var numero = entrada.nextInt();
            
            
            arreglo[i] = numero;
            
        }
        System.out.println("el arreglo ingresado es: ");
        for (int i = 0; i < extension; i++) {
            System.out.println(arreglo[i]);
        } 

    }
}

