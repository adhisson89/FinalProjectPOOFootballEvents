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

    public String getNumCedula()
    {
        return numCedula;
    }

    public void setNumCedula(String numCedula)
    {
        this.numCedula = numCedula;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    
    
}
