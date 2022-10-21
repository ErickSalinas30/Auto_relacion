/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalunidad013;

/**
 *
 * @author usuario
 */
public class LugarMatriculacion {
    String descripcion;
    String telefono;
    String provincia;
    String cuidad;
    
    public String mostrarInfo(){
        return "El lugar de matriculacion es: "+this.descripcion+" ubicado en la provincia de "
                +this.provincia+" en la cuidad de "+this.cuidad+" y el telefono del lugar es"
                +this.telefono;
    }
    
}
