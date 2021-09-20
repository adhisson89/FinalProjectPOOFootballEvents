/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpoofootballevents;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Daniela Roman
 */
public class Persona implements Serializable{
    
    private String nombre;
    private String apellido;
    private String numCedula;
    private int edad;
    private String correoElectronico;

    public Persona(String nombre, String apellido, String numCedula, int edad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCedula = numCedula;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
    public static Persona buscarPersonaPorCI(ArrayList<Persona> lista, String cedulaBuscar) {
        Persona personaEncontrada = null;
        for (Persona p : lista) {
            if (p.getNumCedula().equals(cedulaBuscar)) {
                personaEncontrada = p;
                break;
            }
        }
        return personaEncontrada;
    }
    
}
