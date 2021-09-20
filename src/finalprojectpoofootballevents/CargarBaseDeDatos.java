/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpoofootballevents;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;
import poofootball.paneles.GUISistemaPartido;

/**
 *
 * @author Adhisson
 */
public class CargarBaseDeDatos {
    
    public static void llenarDatos() {
        
        try {
            FileInputStream fisPer = new FileInputStream("registroPersonas.noabrir");
            ObjectInputStream oisPer = new ObjectInputStream(fisPer);
            Persona p = (Persona) oisPer.readObject();
            GUISistemaPartido.listaPersonasRegistradas.add(p);
            while (p != null) {
                p = (Persona) oisPer.readObject();
                GUISistemaPartido.listaPersonasRegistradas.add(p);
            }
            oisPer.close();
            
            FileInputStream fisPart = new FileInputStream("registroPartidos.noabrir");
            ObjectInputStream oisPart = new ObjectInputStream(fisPart);
            Partido pa = (Partido) oisPart.readObject();
            GUISistemaPartido.listaPartidosRegistrados.add(pa);
            while (pa != null) {
                pa = (Partido) oisPart.readObject();
                GUISistemaPartido.listaPartidosRegistrados.add(pa);
            }
            oisPart.close();
            
            FileInputStream fisEqu = new FileInputStream("registroEquipos.noabrir");
            ObjectInputStream oisEqu = new ObjectInputStream(fisEqu);
            Equipo eq = (Equipo) oisEqu.readObject();
            GUISistemaPartido.listaEquiposRegistrados.add(eq);
            while (eq != null) {
                eq = (Equipo) oisEqu.readObject();
                GUISistemaPartido.listaEquiposRegistrados.add(eq);
            }
            oisEqu.close();
            
            FileInputStream fisApu = new FileInputStream("registroApuestas.noabrir");
            ObjectInputStream oisApu = new ObjectInputStream(fisApu);
            Apuesta ap = (Apuesta) oisApu.readObject();
            GUISistemaPartido.listaApuestasRealizadas.add(ap);
            while (eq != null) {
                ap = (Apuesta) oisApu.readObject();
                GUISistemaPartido.listaApuestasRealizadas.add(ap);
            }
            oisApu.close();
            
            FileInputStream fisEst = new FileInputStream("registroEstadios.noabrir");
            ObjectInputStream oisEst = new ObjectInputStream(fisEst);
            Estadio es = (Estadio) oisEst.readObject();
            GUISistemaPartido.listaEstadiosRegistrados.add(es);
            while (eq != null) {
                es = (Estadio) oisEst.readObject();
                GUISistemaPartido.listaEstadiosRegistrados.add(es);
            }
            oisEst.close();
            
            FileInputStream fisBol = new FileInputStream("registroBoletos.noabrir");
            ObjectInputStream oisBol = new ObjectInputStream(fisBol);
            Boleto bo = (Boleto) oisBol.readObject();
            GUISistemaPartido.listaBoletosVendidos.add(bo);
            while (eq != null) {
                bo = (Boleto) oisBol.readObject();
                GUISistemaPartido.listaBoletosVendidos.add(bo);
            }
            oisBol.close();
            
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, ioe);
        } catch (ClassNotFoundException cnt) {
            JOptionPane.showMessageDialog(null, cnt);
        }

        
        
    }
    
    
    
}
