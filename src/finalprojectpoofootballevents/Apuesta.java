/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpoofootballevents;

import java.util.ArrayList;

/**
 *
 * @author Daniela Roman
 */
public class Apuesta {
    
    private double montoApuesta;
    
    private ArrayList <Persona> personas;
    private ArrayList <Partido> partidos;
    
    
    public Apuesta(double montoApuesta) {
        this.montoApuesta = montoApuesta;
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
