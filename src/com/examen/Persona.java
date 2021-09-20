package com.examen;

public class Persona extends SerHumano {

    protected String nombre;
    private String apellido;

    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

//Constructor

    public Persona(){

    }
    public void imprimirNombre(){
        System.out.println("Nombre de la Persona es: "+apellido+" "+nombre);
    }

    public void dormir(){
        System.out.println("ZzzzZzzZ");
    }
    }
