package com.examen;
import java.lang.*;

public class Empleado extends Persona implements Trabajo{

    public Empleado (String nuevoNombre){
        this.nombre=nuevoNombre;
    }

    @Override
    public void imprimirNombre(){
        System.out.println("Nombre compleato del Empleado: "+getNombre()+" "+getApellido());
    }

     public void trabajar(){
         System.out.println("Trabajando ... ");
     }

    public void dormir(){
        System.out.println("No molestes");
    }

}
