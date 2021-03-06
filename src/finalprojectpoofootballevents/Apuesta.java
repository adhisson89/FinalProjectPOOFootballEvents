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
public class Apuesta implements Serializable{
    
    private double montoApuesta;
    private Equipo equipo;
    private String apuesta;
    private ArrayList <Persona> personas;
    private ArrayList <Partido> partidos;
    
    
    public Apuesta(double montoApuesta, Equipo equipo, String apuesta) {
        this.montoApuesta = montoApuesta;
        this.equipo = equipo;
        this.apuesta = apuesta;
        this.partidos = new ArrayList<>();
        this.personas = new ArrayList<>();
    }
    
    public void agregarPartido(Partido p){
        this.partidos.add(p);
    }
    
    public void agregarPersona(Persona p){
        this.personas.add(p);
    }
}
