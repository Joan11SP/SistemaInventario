/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.solsoftware.interfaces;

import java.awt.Component;

/**
 *
 * @author Alexis29
 */
public class Persona extends javax.swing.JFrame {

    @Override
    public void setLocationRelativeTo(Component cmpnt) {
    }

    
    /**
     * Creates new form Persona
     */
    public Persona() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPersona = new javax.swing.JPanel();
        lblIcono = new javax.swing.JLabel();
        lblSegunNombre = new javax.swing.JLabel();
        lblIdentificacion = new javax.swing.JLabel();
        lblApellPaterno = new javax.swing.JLabel();
        lblApellMaterno = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblPrimNombre = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtApelliMaterno = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        txtApelliPaterno = new javax.swing.JTextField();
        txtDocuIdentificacion = new javax.swing.JTextField();
        txtSegunNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtPrimNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        bntAtras = new javax.swing.JButton();
        bntGuardPers = new javax.swing.JButton();
        bntTipo = new javax.swing.JComboBox();
        bntBuscar = new javax.swing.JButton();
        bntEditar = new javax.swing.JButton();
        bntLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPersona.setBackground(new java.awt.Color(255, 255, 255));
        panelPersona.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro De Personas", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/solsoftware/Imagenes/sello instituto logo.png"))); // NOI18N

        lblSegunNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSegunNombre.setText("Segundo Nombre");

        lblIdentificacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIdentificacion.setText("Documento de Identificacion");

        lblApellPaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblApellPaterno.setText("Apellido Paterno");

        lblApellMaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblApellMaterno.setText("Apellido Materno");

        lblTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelefono.setText("Telefono");

        lblTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipo.setText("Tipo");

        lblCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCorreo.setText("Correo");

        lblPrimNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrimNombre.setText("Primer Nombre");

        lblContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContraseña.setText("Contraseña");

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        txtApelliPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApelliPaternoActionPerformed(evt);
            }
        });

        txtDocuIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocuIdentificacionActionPerformed(evt);
            }
        });

        txtSegunNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegunNombreActionPerformed(evt);
            }
        });

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        txtPrimNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimNombreActionPerformed(evt);
            }
        });

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        bntAtras.setText("Atras");
        bntAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAtrasActionPerformed(evt);
            }
        });

        bntGuardPers.setText("Guardar");
        bntGuardPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGuardPersActionPerformed(evt);
            }
        });

        bntTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Docente", "Estudiante" }));
        bntTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntTipoActionPerformed(evt);
            }
        });

        bntBuscar.setText("Buscar");
        bntBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarActionPerformed(evt);
            }
        });

        bntEditar.setText("Editar");
        bntEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEditarActionPerformed(evt);
            }
        });

        bntLimpiar.setText("Limpiar");
        bntLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPersonaLayout = new javax.swing.GroupLayout(panelPersona);
        panelPersona.setLayout(panelPersonaLayout);
        panelPersonaLayout.setHorizontalGroup(
            panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPersonaLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPersonaLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelPersonaLayout.createSequentialGroup()
                                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblApellPaterno)
                                    .addComponent(lblApellMaterno)
                                    .addComponent(lblPrimNombre)
                                    .addComponent(lblSegunNombre)
                                    .addComponent(lblCorreo)
                                    .addComponent(lblTelefono)
                                    .addComponent(lblTipo))
                                .addGap(116, 116, 116))
                            .addGroup(panelPersonaLayout.createSequentialGroup()
                                .addComponent(bntAtras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bntEditar)
                                .addGap(65, 65, 65)))
                        .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSegunNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrimNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApelliPaterno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApelliMaterno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDocuIdentificacion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPersonaLayout.createSequentialGroup()
                                .addComponent(bntLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bntGuardPers))))
                    .addComponent(lblIdentificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelPersonaLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(lblIcono)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPersonaLayout.setVerticalGroup(
            panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPersonaLayout.createSequentialGroup()
                .addComponent(lblIcono)
                .addGap(18, 18, 18)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdentificacion)
                    .addComponent(txtDocuIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntBuscar))
                .addGap(18, 18, 18)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContraseña))
                .addGap(18, 18, 18)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApelliPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellPaterno))
                .addGap(18, 18, 18)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApelliMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellMaterno))
                .addGap(18, 18, 18)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrimNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrimNombre))
                .addGap(18, 18, 18)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSegunNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSegunNombre))
                .addGap(18, 18, 18)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreo))
                .addGap(18, 18, 18)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addGap(18, 18, 18)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bntTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo))
                .addGap(48, 48, 48)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bntEditar)
                        .addComponent(bntLimpiar))
                    .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bntGuardPers)
                        .addComponent(bntAtras)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAtrasActionPerformed
        
    }//GEN-LAST:event_bntAtrasActionPerformed

    private void bntGuardPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardPersActionPerformed

    }//GEN-LAST:event_bntGuardPersActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtApelliPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApelliPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApelliPaternoActionPerformed

    private void txtSegunNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegunNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegunNombreActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtPrimNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimNombreActionPerformed

    private void txtDocuIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocuIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocuIdentificacionActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void bntTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntTipoActionPerformed

    private void bntBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntBuscarActionPerformed

    private void bntEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntEditarActionPerformed

    private void bntLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Persona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAtras;
    private javax.swing.JButton bntBuscar;
    private javax.swing.JButton bntEditar;
    private javax.swing.JButton bntGuardPers;
    private javax.swing.JButton bntLimpiar;
    private javax.swing.JComboBox bntTipo;
    private javax.swing.JLabel lblApellMaterno;
    private javax.swing.JLabel lblApellPaterno;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblPrimNombre;
    private javax.swing.JLabel lblSegunNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel panelPersona;
    private javax.swing.JTextField txtApelliMaterno;
    private javax.swing.JTextField txtApelliPaterno;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDocuIdentificacion;
    private javax.swing.JTextField txtPrimNombre;
    private javax.swing.JTextField txtSegunNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
