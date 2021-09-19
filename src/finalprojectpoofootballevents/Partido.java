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
    private String resultado;
    private String horaPartido;
    private String equipo1;
    private String equipo2;

    public Partido(String fecha, String resultado, String horaPartido, String equipo1, String equipo2) {
        this.fecha = fecha;
        this.resultado = resultado;
        this.horaPartido = horaPartido;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getHoraPartido() {
        return horaPartido;
    }

    public void setHoraPartido(String horaPartido) {
        this.horaPartido = horaPartido;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }
    
    
    
}
