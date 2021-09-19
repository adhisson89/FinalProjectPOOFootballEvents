/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poofootball.paneles;

import finalprojectpoofootballevents.*;

/**
 *
 * @author jg175
 */
public class RegistrarPartidoPanel extends javax.swing.JPanel
{
    
    /**
     * Creates new form RegistrarPartidoPanel
     */
    public RegistrarPartidoPanel()
    {
        initComponents();
        actualizarListaEquipos();
        actualizarListaEstadios();
    }
    
    private void actualizarListaEquipos() {
        cmbEquipo1.removeAllItems();
        cmbEquipo2.removeAllItems();
        for(Equipo equipo : GUISistemaPartido.equiposRegistrados) {
            cmbEquipo1.addItem(equipo.getNombre());
            cmbEquipo2.addItem(equipo.getNombre());
        }
    }
    
    private void actualizarListaEstadios() {
        cmbEstadio.removeAllItems();
        for(Estadio estadio : GUISistemaPartido.estadiosRegistrados) {
            cmbEstadio.addItem(estadio.getNombreEstadio());
        }
    }
    
    private void actualizarListaEquiposGanadores() {
        cmbEquipoGanador.removeAllItems();
        if(cmbEquipo1.getSelectedIndex() != -1 && cmbEquipo2.getSelectedIndex() != -1) {
            cmbEquipoGanador.addItem(GUISistemaPartido.equiposRegistrados.get(cmbEquipo1.getSelectedIndex()).getNombre());
            cmbEquipoGanador.addItem(GUISistemaPartido.equiposRegistrados.get(cmbEquipo2.getSelectedIndex()).getNombre());
        }
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbEquipo1 = new javax.swing.JComboBox<>();
        cmbEstadio = new javax.swing.JComboBox<>();
        cmbEquipo2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbEquipoGanador = new javax.swing.JComboBox<>();
        btnRegistrarPartido = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Registrar Partido");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Fecha:");

        jLabel3.setText("Hora:");

        jLabel4.setText("Equipo 1:");

        jLabel5.setText("Equipo 2:");

        jLabel6.setText("Estadio:");

        cmbEquipo1.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                cmbEquipo1ItemStateChanged(evt);
            }
        });
        cmbEquipo1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmbEquipo1ActionPerformed(evt);
            }
        });

        cmbEquipo2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmbEquipo2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Equipo ganador:");

        btnRegistrarPartido.setText("Registrar partido");
        btnRegistrarPartido.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegistrarPartidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbEquipoGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbEquipo2, 0, 107, Short.MAX_VALUE)
                                    .addComponent(cmbEstadio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cmbEquipo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(125, 125, 125)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtHora)))
                        .addGap(32, 32, 32))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(btnRegistrarPartido)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmbEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmbEquipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbEquipoGanador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnRegistrarPartido)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(240, 240, 240))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarPartidoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegistrarPartidoActionPerformed
    {//GEN-HEADEREND:event_btnRegistrarPartidoActionPerformed
        // TODO add your handling code here:
        String fecha = txtFecha.getText();
        String hora = txtHora.getText();
        Equipo ganador = null;
        Equipo equipo1 = GUISistemaPartido.equiposRegistrados.get(cmbEquipo1.getSelectedIndex());
        Equipo equipo2 = GUISistemaPartido.equiposRegistrados.get(cmbEquipo2.getSelectedIndex());
        if(cmbEquipoGanador.getSelectedIndex() == 0) {
            ganador = equipo1;
        } else if(cmbEquipoGanador.getSelectedIndex() == 1) {
            ganador = equipo2;
        }
        Estadio estadio = GUISistemaPartido.estadiosRegistrados.get(cmbEstadio.getSelectedIndex());
        Partido partido = new Partido(fecha, ganador, hora, equipo1, equipo2, estadio);
        GUISistemaPartido.partidosRegistrados.add(partido);
    }//GEN-LAST:event_btnRegistrarPartidoActionPerformed

    private void cmbEquipo1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cmbEquipo1ItemStateChanged
    {//GEN-HEADEREND:event_cmbEquipo1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEquipo1ItemStateChanged

    private void cmbEquipo1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmbEquipo1ActionPerformed
    {//GEN-HEADEREND:event_cmbEquipo1ActionPerformed
        // TODO add your handling code here:
        actualizarListaEquiposGanadores();
    }//GEN-LAST:event_cmbEquipo1ActionPerformed

    private void cmbEquipo2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmbEquipo2ActionPerformed
    {//GEN-HEADEREND:event_cmbEquipo2ActionPerformed
        // TODO add your handling code here:
        actualizarListaEquiposGanadores();
    }//GEN-LAST:event_cmbEquipo2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarPartido;
    private javax.swing.JComboBox<String> cmbEquipo1;
    private javax.swing.JComboBox<String> cmbEquipo2;
    private javax.swing.JComboBox<String> cmbEquipoGanador;
    private javax.swing.JComboBox<String> cmbEstadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    // End of variables declaration//GEN-END:variables
}
