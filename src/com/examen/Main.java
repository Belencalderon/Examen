package com.examen;

public class Main {
    public static void main (String [] arg)
    {
        Empleado empleado = new Empleado("María");
        empleado.setNombre("Sandra");
        empleado.setApellido("Calderon");
        empleado.imprimirNombre();
        empleado.trabajar();
        empleado.respirar();
        empleado.dormir();

        Persona persona=new Persona();
        persona.setNombre("Belen");
        persona.setApellido("Antonio");
        persona.imprimirNombre();
        persona.respirar();
        persona.dormir();
    }
}
