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
public class Estadio {
    
    private String capacidad;
    
    private String ciudad;
    private String nombreEstadio;

    public Estadio(String capacidad, String ciudad, String nombreEstadio) {
        this.capacidad = capacidad;
        this.ciudad = ciudad;
        this.nombreEstadio = nombreEstadio;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombreEstadio() {
        return nombreEstadio;
    }

    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

}
