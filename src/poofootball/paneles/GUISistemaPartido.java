/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poofootball.paneles;

import finalprojectpoofootballevents.DesignPreviewGUI;
import finalprojectpoofootballevents.Persona;
import java.util.ArrayList;
import poofootball.paneles.RegistrarPersonasPanel;

/**
 *
 * @author Bolivar Roman
 */
public class GUISistemaPartido extends javax.swing.JFrame {
    DesignPreviewGUI DesignPreview;
    static ArrayList<Persona> personasRegistradas;
    RegistrarPersonasPanel registrarPersonas;
    

    /**
     * Creates new form GUISistemaPartido
     */
    public GUISistemaPartido() {
        initComponents();
        DesignPreview = new DesignPreviewGUI();
        registrarPersonas = new RegistrarPersonasPanel();
        personasRegistradas = new ArrayList<Persona>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        nuevo = new javax.swing.JMenu();
        mnIngresarEquipo = new javax.swing.JMenuItem();
        mnIngresarEstadio = new javax.swing.JMenuItem();
        mnIngresarPartido = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnApuestas = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nuevo.setText("Ingresar");

        mnIngresarEquipo.setText("Equipo");
        nuevo.add(mnIngresarEquipo);

        mnIngresarEstadio.setText("Estadio");
        nuevo.add(mnIngresarEstadio);

        mnIngresarPartido.setText("Partido");
        nuevo.add(mnIngresarPartido);

        jMenuBar1.add(nuevo);

        jMenu2.setText("Vender Boleto");
        jMenuBar1.add(jMenu2);

        mnApuestas.setText("Apuestas");
        jMenuBar1.add(mnApuestas);

        jMenu6.setText("Registrar persona");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu1.setText("Autores");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
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

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenu6MouseClicked
    {//GEN-HEADEREND:event_jMenu6MouseClicked
        // TODO add your handling code here:
        limpiarGUI();
        registrarPersonas.setVisible(true);
        registrarPersonas.setSize(500, 500);
        add(registrarPersonas);
        revalidate();
        repaint();
    }//GEN-LAST:event_jMenu6MouseClicked

    private void limpiarGUI() {
        registrarPersonas.setVisible(false);
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
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu mnApuestas;
    private javax.swing.JMenuItem mnIngresarEquipo;
    private javax.swing.JMenuItem mnIngresarEstadio;
    private javax.swing.JMenuItem mnIngresarPartido;
    private javax.swing.JMenu nuevo;
    // End of variables declaration//GEN-END:variables
}