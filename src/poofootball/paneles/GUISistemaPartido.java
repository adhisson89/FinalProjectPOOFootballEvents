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

    static ArrayList<Persona> listaPersonasRegistradas;
    static ArrayList<Partido> listaPartidosRegistrados;
    static ArrayList<Equipo> listaEquiposRegistrados;
    static ArrayList<Apuesta> listaApuestasRealizadas;
    static ArrayList<Estadio> listaEstadiosRegistrados;
    static ArrayList<Boleto> listaBoletosVendidos;

    RegistrarPersonasPanel pnlRegistrarPersonas;
    RegistrarEstadioPanel pnlRegistrarEstadio;
    RegistrarPartidoPanel pnlRegistrarPartido;
    RegistrarEquipoPanel pnlRegistrarEquipo;

    
    VerEstadiosPanel pnlVerEstadios;
    VerPartidosPanel pnlVerPartido;
    VerEquiposPanel pnlVerEquipo;


    /**
     * Creates new form GUISistemaPartido
     */
    public GUISistemaPartido() {
        initComponents();
        
        listaPersonasRegistradas = new ArrayList<Persona>();
        listaPartidosRegistrados = new ArrayList<Partido>();
        listaEquiposRegistrados = new ArrayList<Equipo>();
        listaApuestasRealizadas = new ArrayList<Apuesta>();
        listaEstadiosRegistrados = new ArrayList<Estadio>();
        listaBoletosVendidos = new ArrayList<Boleto>();

        DesignPreview = new DesignPreviewGUI();
        pnlRegistrarPartido = new RegistrarPartidoPanel();
        pnlRegistrarPersonas = new RegistrarPersonasPanel();
        pnlRegistrarEstadio = new RegistrarEstadioPanel();
        pnlRegistrarEquipo = new RegistrarEquipoPanel();

        
        pnlVerEstadios = new VerEstadiosPanel();
        pnlVerPartido = new VerPartidosPanel();
        pnlVerEquipo = new VerEquiposPanel();


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
        nuevo = new javax.swing.JMenu();
        mnIngresarEquipo = new javax.swing.JMenuItem();
        mnIngresarEstadio = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnIngresarPartido = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mnVerEquipos = new javax.swing.JMenuItem();
        mnVerEstadio = new javax.swing.JMenuItem();
        mnVerPersonas = new javax.swing.JMenuItem();
        mnVerPartidos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnApuestas = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nuevo.setText("Ingresar");

        mnIngresarEquipo.setText("Equipo");
        mnIngresarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIngresarEquipoActionPerformed(evt);
            }
        });
        nuevo.add(mnIngresarEquipo);

        mnIngresarEstadio.setText("Estadio");
        mnIngresarEstadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIngresarEstadioActionPerformed(evt);
            }
        });
        nuevo.add(mnIngresarEstadio);

        jMenuItem2.setText("Persona");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        nuevo.add(jMenuItem2);

        mnIngresarPartido.setText("Partido");
        mnIngresarPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIngresarPartidoActionPerformed(evt);
            }
        });
        nuevo.add(mnIngresarPartido);

        jMenuBar1.add(nuevo);

        jMenu7.setText("Mostrar registros");

        mnVerEquipos.setText("Equipo");
        mnVerEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVerEquiposActionPerformed(evt);
            }
        });
        jMenu7.add(mnVerEquipos);

        mnVerEstadio.setText("Estadio");
        mnVerEstadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVerEstadioActionPerformed(evt);
            }
        });
        jMenu7.add(mnVerEstadio);

        mnVerPersonas.setText("Persona");
        jMenu7.add(mnVerPersonas);

        mnVerPartidos.setText("Partido");
        mnVerPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVerPartidosActionPerformed(evt);
            }
        });
        jMenu7.add(mnVerPartidos);

        jMenuBar1.add(jMenu7);

        jMenu2.setText("Vender Boleto");
        jMenuBar1.add(jMenu2);

        mnApuestas.setText("Apuestas");
        jMenuBar1.add(mnApuestas);

        jMenu1.setText("Autores");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

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

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenu1MouseClicked
    {//GEN-HEADEREND:event_jMenu1MouseClicked
        // TODO add your handling code here:
        DesignPreview.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenuItem2MouseClicked
    {//GEN-HEADEREND:event_jMenuItem2MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem2ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        limpiarGUI();
        pnlRegistrarPersonas.setVisible(true);
        pnlRegistrarPersonas.setSize(500, 500);
        add(pnlRegistrarPersonas);
        revalidate();
        repaint();
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    private void mnIngresarEstadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIngresarEstadioActionPerformed
        // TODO add your handling code here:
        limpiarGUI();
        pnlRegistrarEstadio.setVisible(true);
        pnlRegistrarEstadio.setSize(500, 500);
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
        pnlRegistrarPartido.setSize(500, 500);
        add(pnlRegistrarPartido);
        revalidate();
        repaint();
    }//GEN-LAST:event_mnIngresarPartidoActionPerformed

    private void mnIngresarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIngresarEquipoActionPerformed
        // TODO add your handling code here:
        limpiarGUI();
        pnlRegistrarEquipo.setVisible(true);
        pnlRegistrarEquipo.setSize(500,500);
        add(pnlRegistrarEquipo);
        revalidate();
        repaint();
    }//GEN-LAST:event_mnIngresarEquipoActionPerformed

    private void mnVerPartidosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnVerPartidosActionPerformed
    {//GEN-HEADEREND:event_mnVerPartidosActionPerformed
        // TODO add your handling code here:
        limpiarGUI();
        pnlVerPartido.setVisible(true);
        pnlVerPartido.setSize(500,500);
        add(pnlVerPartido);
        revalidate();
        repaint();
        pnlVerPartido.actualizarTabla();
    }//GEN-LAST:event_mnVerPartidosActionPerformed


    private void mnVerEstadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVerEstadioActionPerformed
        // TODO add your handling code here:
        limpiarGUI();
        pnlVerEstadios.setVisible(true);
        pnlVerEstadios.setSize(500,500);
        add(pnlVerEstadios);
        revalidate();
        repaint();
        
    }//GEN-LAST:event_mnVerEstadioActionPerformed

    private void mnVerEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVerEquiposActionPerformed
        // TODO add your handling code here:
        limpiarGUI();
        pnlVerEquipo.setVisible(true);
        pnlVerEquipo.setSize(700,700);
        add(pnlVerEquipo);
        revalidate();
        repaint();
    }//GEN-LAST:event_mnVerEquiposActionPerformed

    private void limpiarGUI() {
        pnlRegistrarPersonas.setVisible(false);
        pnlRegistrarEstadio.setVisible(false);
        pnlRegistrarEquipo.setVisible(false);
        pnlRegistrarPartido.setVisible(false);
        pnlVerEquipo.setVisible(false);
        pnlVerEstadios.setVisible(false);
        pnlVerPartido.setVisible(false);
        

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenu mnApuestas;
    private javax.swing.JMenuItem mnIngresarEquipo;
    private javax.swing.JMenuItem mnIngresarEstadio;
    private javax.swing.JMenuItem mnIngresarPartido;
    private javax.swing.JMenuItem mnVerEquipos;
    private javax.swing.JMenuItem mnVerEstadio;
    private javax.swing.JMenuItem mnVerPartidos;
    private javax.swing.JMenuItem mnVerPersonas;
    private javax.swing.JMenu nuevo;
    // End of variables declaration//GEN-END:variables
}
