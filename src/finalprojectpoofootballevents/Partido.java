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
public class Partido {
    
    private String fecha;
    private Equipo resultadoGanador;
    private String horaPartido;
    private Equipo equipo1;
    private Equipo equipo2;
    private Estadio estadio;

    public Partido(String fecha, Equipo resultadoGanador, String horaPartido, Equipo equipo1, Equipo equipo2, Estadio estadio)
    {
        this.fecha = fecha;
        this.resultadoGanador = resultadoGanador;
        this.horaPartido = horaPartido;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.estadio = estadio;
    }

    public String getFecha()
    {
        return fecha;
    }

    public Equipo getResultadoGanador()
    {
        return resultadoGanador;
    }

    public String getHoraPartido()
    {
        return horaPartido;
    }

    public Equipo getEquipo1()
    {
        return equipo1;
    }

    public Equipo getEquipo2()
    {
        return equipo2;
    }

    public Estadio getEstadio()
    {
        return estadio;
    }

    
}
