/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalunidad013;

/**
 *
 * @author usuario
 */
public class Auto {
    String placa;
    String marca;
    int year;
    String color;
    double precio;
    int cilindrajeMotor;
    Propietario owner;
    LugarMatriculacion lugar;

    public String mostrarInfo() {
        var retorno = " El auto tiene placa: " + this.placa + " es de marca: "
                + this.marca + ". El propietario es: " + this.owner.nombre
                + " la dirección del propietario es: " + this.owner.direccion
                + " . El auto cuesta "+this.precio+ " USD y es modelo: "
                + this.year+"El lugar de matriculacion es "
                +this.lugar.descripcion+" ubicado en la cuidad de "+this.lugar.cuidad
                +" provincia "+ this.lugar.provincia+" contactanos al "+this.lugar.telefono;
        

        return retorno;
        
    }

    public String getProvincia() {
        var retorno = "";
        var primeraLetra="";
        primeraLetra=this.placa.substring(0,1);
        switch(primeraLetra){
            case "A":
                retorno="Azuay";
                break;
           case "P":
                retorno="Pichincha";
                break;
           case "G":
                retorno="Guayas";
                break;
            case "U":
                retorno="Cañar";
                break;
            default:
                retorno="Provincia no definida";
        }
        return retorno;
    }

    public String getPaisMarca() {
        var retorno = "";
        if (this.marca.equals("Chevrolet")) {
            retorno = "EE.UU";
        } else {
            if (this.marca.equals("Toyota")) {
                retorno = "Japón";
            } else {
                retorno = "No definido";
            }
        }
        return retorno;
    }

    public int getNumeroContinente() {
        //1: Africa 2:America 3:Asia 4:Europa 5:Oceania
        var retorno = 0;
        var marcaPais=this.getPaisMarca();
        switch(marcaPais){
            case "EE.UU":
                retorno=2;
                break;
            case "Japón":
                retorno=3;
                break;
            default:
                retorno=0;
        }
        return retorno;
    }
    
    public double calcularIVA(){
        var retorno=0.0d;
      
        
        return retorno;
    }
    
    public int calcularEdad(int yearActual){
        var retorno=0;    
        
        
        return retorno;
    }
    
    //10% por cada año de uso
    //La depreciacion no puede exceder el precio
    public double calcularDepreciacion(int yearActual){
        var retorno=0.0d;
        var edad=this.calcularEdad(yearActual);
    
        
        return retorno;
    }
    
    /*
    Edad 0-5: 10% del precio
    Edad 5-10: 8% del precio
    Edad 10-15: 7% del precio
    Edad >15: 6% del precio
    */
    
    public double calcularCostoMatricula(int yearActual){
        var retorno=0.0d;
        var edad=this.calcularEdad(yearActual);
    
        
        return retorno;
    }
    
      /*
    Edad 0-5 y precio menos de 10000 SI
    Edad 10-15 y precio de 10000 a 20000 SI
    Edad >15 y precio de 20000 a 30000 SI
    Edad >15 NO
     */
    public boolean sePuedeAsegurar(int yearActual){
        var retorno=false;
        var edad=this.calcularEdad(yearActual);
        if(edad<=5 && this.precio<10000)
        {
            retorno=true;
        }else{
            
        }
        return retorno;
    }
    
    public boolean esClasico(int yearActual, int yearClasico){
        var retorno=false;
        
        return retorno;
    }
}
