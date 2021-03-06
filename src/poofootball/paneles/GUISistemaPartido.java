/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poofootball.paneles;

import finalprojectpoofootballevents.*;
import java.util.ArrayList;
import poofootball.paneles.*;

/**
 *
 * @author Daniela Roman
 */
public class GUISistemaPartido extends javax.swing.JFrame {

    DesignPreviewGUI DesignPreview;

    public static ArrayList<Persona> listaPersonasRegistradas;
    public static ArrayList<Partido> listaPartidosRegistrados;
    public static ArrayList<Equipo> listaEquiposRegistrados;
    public static ArrayList<Apuesta> listaApuestasRealizadas;
    public static ArrayList<Estadio> listaEstadiosRegistrados;
    public static ArrayList<Boleto> listaBoletosVendidos;

    RegistrarPersonasPanel pnlRegistrarPersonas;
    RegistrarEstadioPanel pnlRegistrarEstadio;
    RegistrarPartidoPanel pnlRegistrarPartido;
    RegistrarEquipoPanel pnlRegistrarEquipo;

    VerEstadiosPanel pnlVerEstadios;
    VerPartidosPanel pnlVerPartido;
    VerEquiposPanel pnlVerEquipo;
    VerPersonasPanel pnlVerPersonas;

    VenderBoletosPanel pnlVenderBoletos;
    ApuestasPanel pnlApuestas;

    /**
     * Creates new form GUISistemaPartido
     */
    public GUISistemaPartido() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        
        listaPersonasRegistradas = new ArrayList<>();
        listaPartidosRegistrados = new ArrayList<>();
        listaEquiposRegistrados = new ArrayList<>();
        listaApuestasRealizadas = new ArrayList<>();
        listaEstadiosRegistrados = new ArrayList<>();
        listaBoletosVendidos = new ArrayList<>();

        DesignPreview = new DesignPreviewGUI();
        pnlRegistrarPartido = new RegistrarPartidoPanel();
        pnlRegistrarPersonas = new RegistrarPersonasPanel();
        pnlRegistrarEstadio = new RegistrarEstadioPanel();
        pnlRegistrarEquipo = new RegistrarEquipoPanel();

        pnlVerEstadios = new VerEstadiosPanel();
        pnlVerPartido = new VerPartidosPanel();
        pnlVerEquipo = new VerEquiposPanel();
        pnlVerPersonas = new VerPersonasPanel();
        
        pnlVenderBoletos = new VenderBoletosPanel();
        pnlApuestas = new ApuestasPanel();
        
        CargarBaseDeDatos.llenarDatosApuestas();
        CargarBaseDeDatos.llenarDatosBoletos();
        CargarBaseDeDatos.llenarDatosEquipos();
        CargarBaseDeDatos.llenarDatosEstadios();
        CargarBaseDeDatos.llenarDatosPartidos();
        CargarBaseDeDatos.llenarDatosPersonas();
        
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnIngresar = new javax.swing.JMenu();
        mnIngresarEquipo = new javax.swing.JMenuItem();
        mnIngresarEstadio = new javax.swing.JMenuItem();
        mnIngresarPersona = new javax.swing.JMenuItem();
        mnIngresarPartido = new javax.swing.JMenuItem();
        mnMostrarRegistros = new javax.swing.JMenu();
        mnVerEquipos = new javax.swing.JMenuItem();
        mnVerEstadio = new javax.swing.JMenuItem();
        mnVerPersonas = new javax.swing.JMenuItem();
        mnVerPartidos = new javax.swing.JMenuItem();
        mnVenderBoletos = new javax.swing.JMenu();
        mnApuestas = new javax.swing.JMenu();
        mnAutores = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnIngresar.setText("Ingresar");

        mnIngresarEquipo.setText("Equipo");
        mnIngresarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIngresarEquipoActionPerformed(evt);
            }
        });
        mnIngresar.add(mnIngresarEquipo);

        mnIngresarEstadio.setText("Estadio");
        mnIngresarEstadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIngresarEstadioActionPerformed(evt);
            }
        });
        mnIngresar.add(mnIngresarEstadio);

        mnIngresarPersona.setText("Persona");
        mnIngresarPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnIngresarPersonaMouseClicked(evt);
            }
        });
        mnIngresarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIngresarPersonaActionPerformed(evt);
            }
        });
        mnIngresar.add(mnIngresarPersona);

        mnIngresarPartido.setText("Partido");
        mnIngresarPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIngresarPartidoActionPerformed(evt);
            }
        });
        mnIngresar.add(mnIngresarPartido);

        jMenuBar1.add(mnIngresar);

        mnMostrarRegistros.setText("Mostrar registros");

        mnVerEquipos.setText("Equipo");
        mnVerEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVerEquiposActionPerformed(evt);
            }
        });
        mnMostrarRegistros.add(mnVerEquipos);

        mnVerEstadio.setText("Estadio");
        mnVerEstadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVerEstadioActionPerformed(evt);
            }
        });
        mnMostrarRegistros.add(mnVerEstadio);

        mnVerPersonas.setText("Persona");
        mnVerPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVerPersonasActionPerformed(evt);
            }
        });
        mnMostrarRegistros.add(mnVerPersonas);

        mnVerPartidos.setText("Partido");
        mnVerPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVerPartidosActionPerformed(evt);
            }
        });
        mnMostrarRegistros.add(mnVerPartidos);

        jMenuBar1.add(mnMostrarRegistros);

        mnVenderBoletos.setText("Vender Boleto");
        mnVenderBoletos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnVenderBoletosMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnVenderBoletos);

        mnApuestas.setText("Apuestas");
        mnApuestas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnApuestasMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnApuestas);

        mnAutores.setText("Autores");
        mnAutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnAutoresMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnAutores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 982, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnAutoresMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_mnAutoresMouseClicked
    {//GEN-HEADEREND:event_mnAutoresMouseClicked
        // TODO add your handling code here:
        DesignPreview.setVisible(true);
    }//GEN-LAST:event_mnAutoresMouseClicked

    private void mnIngresarPersonaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_mnIngresarPersonaMouseClicked
    {//GEN-HEADEREND:event_mnIngresarPersonaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnIngresarPersonaMouseClicked

    private void mnIngresarPersonaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnIngresarPersonaActionPerformed
    {//GEN-HEADEREND:event_mnIngresarPersonaActionPerformed
        // TODO add your handling code here:
        limpiarGUI();
        pnlRegistrarPersonas.setVisible(true);
        pnlRegistrarPersonas.setSize(510, 510);
        pnlRegistrarPersonas.setLocation(400, 100);
        add(pnlRegistrarPersonas);
        revalidate();
        repaint();
    }//GEN-LAST:event_mnIngresarPersonaActionPerformed


    private void mnIngresarEstadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIngresarEstadioActionPerformed
        // TODO add your handling code here:
        limpiarGUI();
        pnlRegistrarEstadio.setVisible(true);
        pnlRegistrarEstadio.setSize(460, 350);
        pnlRegistrarEstadio.setLocation(450,150);
        add(pnlRegistrarEstadio);
        revalidate();
        repaint();
    }//GEN-LAST:event_mnIngresarEstadioActionPerformed

    private void mnIngresarPartidoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnIngresarPartidoActionPerformed
    {//GEN-HEADEREND:event_mnIngresarPartidoActionPerformed
         // TODO add your handling code here:
        pnlRegistrarPartido.actualizarListaEquipos();
        pnlRegistrarPartido.actualizarListaEquiposGanadores();
        pnlRegistrarPartido.actualizarListaEstadios();
        limpiarGUI();
        pnlRegistrarPartido.setVisible(true);
        pnlRegistrarPartido.setSize(657, 497);
        pnlRegistrarPartido.setLocation(300, 100);
        add(pnlRegistrarPartido);
        revalidate();
        repaint();
    }//GEN-LAST:event_mnIngresarPartidoActionPerformed

    private void mnIngresarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIngresarEquipoActionPerformed
        // TODO add your handling code here:
        limpiarGUI();
        pnlRegistrarEquipo.setVisible(true);
        pnlRegistrarEquipo.setSize(491, 309);
        pnlRegistrarEquipo.setLocation(450,150);
        add(pnlRegistrarEquipo);
        revalidate();
        repaint();
    }//GEN-LAST:event_mnIngresarEquipoActionPerformed

    private void mnVerPartidosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnVerPartidosActionPerformed
    {//GEN-HEADEREND:event_mnVerPartidosActionPerformed
        // TODO add your handling code here:
        limpiarGUI();
        pnlVerPartido.setVisible(true);
        pnlVerPartido.setSize(610, 464);
        pnlVerPartido.setLocation(350, 100);
        pnlVerPartido.verPartidosTabla();
        add(pnlVerPartido);
        revalidate();
        repaint(); 
    }//GEN-LAST:event_mnVerPartidosActionPerformed


    private void mnVerEstadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVerEstadioActionPerformed
        // TODO add your handling code here:
        limpiarGUI();
        pnlVerEstadios.setVisible(true);
        pnlVerEstadios.setSize(610, 464);
        pnlVerEstadios.setLocation(350, 100);
        pnlVerEstadios.verEstadiosTabla();
        add(pnlVerEstadios);
        revalidate();
        repaint();

    }//GEN-LAST:event_mnVerEstadioActionPerformed

    private void mnVerEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVerEquiposActionPerformed
        // TODO add your handling code here:
        limpiarGUI();
        pnlVerEquipo.setVisible(true);
        pnlVerEquipo.setSize(610, 464);
        pnlVerEquipo.setLocation(350, 100);
        pnlVerEquipo.verEquiposTabla();
        add(pnlVerEquipo);
        revalidate();
        repaint();
    }//GEN-LAST:event_mnVerEquiposActionPerformed

    private void mnVenderBoletosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnVenderBoletosMouseClicked
        // TODO add your handling code here:
        limpiarGUI();
        pnlVenderBoletos.actualizarListaPartidos();
        pnlVenderBoletos.setVisible(true);
        pnlVenderBoletos.setSize(683, 459);
        pnlVenderBoletos.setLocation(350, 100);
        add(pnlVenderBoletos);
        revalidate();
        repaint();

    }//GEN-LAST:event_mnVenderBoletosMouseClicked

    private void mnApuestasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnApuestasMouseClicked
        // TODO add your handling code here:
        limpiarGUI();
        pnlApuestas.actualizarListaEquipos();
        pnlApuestas.actualizarListaPartidos();
        pnlApuestas.setVisible(true);
        pnlApuestas.setSize(490, 485);
        pnlApuestas.setLocation(350, 100);
        add(pnlApuestas);
        revalidate();
        repaint();

    }//GEN-LAST:event_mnApuestasMouseClicked

    private void mnVerPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVerPersonasActionPerformed
        // TODO add your handling code here:
        limpiarGUI();
        pnlVerPersonas.setVisible(true);
        pnlVerPersonas.setSize(610, 464);
        pnlVerPersonas.setLocation(350, 100);
        pnlVerPersonas.verPersonasTabla();
        add(pnlVerPersonas);
        revalidate();
        repaint();
    }//GEN-LAST:event_mnVerPersonasActionPerformed

    private void limpiarGUI() {
        pnlRegistrarPersonas.setVisible(false);
        pnlRegistrarEstadio.setVisible(false);
        pnlRegistrarEquipo.setVisible(false);
        pnlRegistrarPartido.setVisible(false);
        pnlVerEquipo.setVisible(false);
        pnlVerEstadios.setVisible(false);
        pnlVerPartido.setVisible(false);
        pnlApuestas.setVisible(false);
        pnlVenderBoletos.setVisible(false);
        pnlVerPersonas.setVisible(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUISistemaPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUISistemaPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUISistemaPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUISistemaPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUISistemaPartido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenu mnApuestas;
    private javax.swing.JMenu mnAutores;
    private javax.swing.JMenu mnIngresar;
    private javax.swing.JMenuItem mnIngresarEquipo;
    private javax.swing.JMenuItem mnIngresarEstadio;
    private javax.swing.JMenuItem mnIngresarPartido;
    private javax.swing.JMenuItem mnIngresarPersona;
    private javax.swing.JMenu mnMostrarRegistros;
    private javax.swing.JMenu mnVenderBoletos;
    private javax.swing.JMenuItem mnVerEquipos;
    private javax.swing.JMenuItem mnVerEstadio;
    private javax.swing.JMenuItem mnVerPartidos;
    private javax.swing.JMenuItem mnVerPersonas;
    // End of variables declaration//GEN-END:variables
}
