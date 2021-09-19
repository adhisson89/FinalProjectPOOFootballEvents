/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpoofootballevents;

import java.util.*;

/**
 *
 * @author Daniela Roman
 */
public class Equipo {
    
    private String nombre;
    private ArrayList<Boolean> racha;
    //private boolean rachaGanadora[];

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public ArrayList<Boolean> getRacha()
    {
        return racha;
    }

    public void setRacha(ArrayList<Boolean> racha)
    {
        this.racha = racha;
    }
    
    private void determinarPartidoAnterior(boolean resultadoAnterior) {
        racha.add(resultadoAnterior);
    }
}
