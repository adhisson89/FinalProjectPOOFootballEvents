/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpoofootballevents;

/**
 *
 * @author Daniela Roman
 */
public class Persona {
    
    protected String nombre;
    protected String apellido;
    protected String numCedula;
    protected int edad;

    public Persona(String nombre, String apellido, String numCedula, int edad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCedula = numCedula;
        this.edad = edad;
    }
    
    
}
