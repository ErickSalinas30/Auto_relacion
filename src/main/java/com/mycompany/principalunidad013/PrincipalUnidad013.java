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
/*        

        var arreglo1 = new Arreglo();

        var vector1 = arreglo1.crearVector(3);
        System.out.println("Vector 1: ");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print(vector1[i] + " ");
        }
        var arreglo2 = new Arreglo();
        System.out.print("\n");
        var vector2 = arreglo2.crearVector(3);
        System.out.println("Vector 2: ");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print(vector2[i] + " ");
        }
        System.out.print("\n");
        var arreglo3 = new Arreglo();
        var vectorSumado = arreglo3.sumaVector(vector1, vector2);
        System.out.println("El vector resultante es: ");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print(vectorSumado[i] + " ");
        }
        System.out.print("\n");
        var arreglo4 = new Arreglo();
        var matriz1 = arreglo4.crearMatriz(3, 4);
        System.out.println("Matriz 1: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {

                System.out.print(matriz1[i][j] + " ");
            }
            System.out.print("\n");
        }
        var arreglo5 = new Arreglo();
        System.out.print("\n");
        
        var matriz2 = arreglo5.crearMatriz(3, 4);
        System.out.println("Matriz 2: ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.print("\n");
        }
        var arreglo6 = new Arreglo();
        var matrizSumada = arreglo6.sumaMatriz(matriz1, matriz2);
        System.out.println("\nLa matriz resultante es:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print(matrizSumada[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
            
      
*/    
  
        var propietario1 = new Propietario();
        propietario1.nombre="Juan Pérez";
        propietario1.direccion="París y Oslo";
        propietario1.telefono="0984357604";
        propietario1.yearNacimiento=1981;
        
        var propietario2 = new Propietario();
        propietario2.nombre="Carlos López";
        propietario2.direccion="Gran Colombia y Lamar";
        propietario2.telefono="09843578596";
        propietario2.yearNacimiento=1980;
        
        var lugar1 = new LugarMatriculacion();
        lugar1.cuidad="Cuenca";
        lugar1.descripcion="Centro de matriculacion de Capulispamba";
        lugar1.provincia="Azuay";
        lugar1.telefono="0965214835";
        
        var lugar2 = new LugarMatriculacion();
        lugar2.cuidad="Gualaceo";
        lugar2.descripcion="Centro de matriculacion vehicular de Gualaceo";
        lugar2.provincia="Azuay";
        lugar2.telefono="0958472531";
        
        
        var auto1 = new Auto();
        auto1.color="Amarillo";
        auto1.cilindrajeMotor=1600;
        auto1.marca="Toyota";
        auto1.placa="AGF0526";
        auto1.precio=18000;
        auto1.year=2018;
        auto1.owner=propietario2;
        auto1.lugar=lugar1;
        
        
        var auto2 = new Auto();
        auto2.color="Azul";
        auto2.cilindrajeMotor=2500;
        auto2.marca="Chevrolet";
        auto2.placa="UAF0526";
        auto2.precio=18000;
        auto2.year=2010;
        auto2.owner=propietario1;
        auto2.lugar=lugar2;
        
        System.out.println(auto1.mostrarInfo());
        System.out.println(auto2.mostrarInfo());
    
    }
    
   

}      
       