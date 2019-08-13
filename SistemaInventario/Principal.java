
package Com.solsoftware.interfaces;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        lblIcono = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        bntTipo = new javax.swing.JComboBox();
        panelIzquierdo = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblTipoBien = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblUbicacion = new javax.swing.JLabel();
        lblNombArtic = new javax.swing.JLabel();
        txtCodigoBarraPrinc = new javax.swing.JTextField();
        txtNombreBienPrinc = new javax.swing.JTextField();
        txtCantidadPrinc = new javax.swing.JTextField();
        txtEstadoPrinc = new javax.swing.JTextField();
        txtTipoPrinc = new javax.swing.JTextField();
        txtUbicacionPrinc = new javax.swing.JTextField();
        btnNuevBusque = new javax.swing.JButton();
        btnSalirPrinci = new javax.swing.JButton();
        panelDerecho = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtImagenPrinci = new javax.swing.JTextField();
        txtDescripPrincipal1 = new javax.swing.JTextField();
        MenuPrincipal = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        btnCerrarSesion = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnNuevoUsuario = new javax.swing.JMenuItem();
        btnNuevoArticulo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panelSuperior.setBackground(new java.awt.Color(255, 255, 255));
        panelSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/solsoftware/Imagenes/sello instituto logo.png"))); // NOI18N
        panelSuperior.add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        panelSuperior.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 180, -1));

        lblBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBuscar.setText("Buscar por :");
        panelSuperior.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        btnBuscar.setText("Buscar");
        panelSuperior.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, -1, -1));

        bntTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Codigo", "Nombre" }));
        bntTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntTipoActionPerformed(evt);
            }
        });
        panelSuperior.add(bntTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        panelIzquierdo.setBackground(new java.awt.Color(255, 255, 255));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigo.setText("Codigo Barra");

        lblCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCantidad.setText("Cantidad");

        lblTipoBien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoBien.setText("Tipo del bien");

        lblEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEstado.setText("Estado");

        lblUbicacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUbicacion.setText("Ubicacion");

        lblNombArtic.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombArtic.setText("Nombre del Articulo");

        txtCodigoBarraPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoBarraPrincActionPerformed(evt);
            }
        });

        txtNombreBienPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreBienPrincActionPerformed(evt);
            }
        });

        txtCantidadPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadPrincActionPerformed(evt);
            }
        });

        txtEstadoPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoPrincActionPerformed(evt);
            }
        });

        txtTipoPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoPrincActionPerformed(evt);
            }
        });

        txtUbicacionPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionPrincActionPerformed(evt);
            }
        });

        btnNuevBusque.setText("Nueva Busquedad");

        btnSalirPrinci.setText("Salir");

        javax.swing.GroupLayout panelIzquierdoLayout = new javax.swing.GroupLayout(panelIzquierdo);
        panelIzquierdo.setLayout(panelIzquierdoLayout);
        panelIzquierdoLayout.setHorizontalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIzquierdoLayout.createSequentialGroup()
                        .addComponent(btnSalirPrinci, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevBusque)
                        .addGap(122, 122, 122))
                    .addGroup(panelIzquierdoLayout.createSequentialGroup()
                        .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUbicacion)
                            .addComponent(lblNombArtic, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo)
                            .addComponent(lblCantidad)
                            .addComponent(lblEstado)
                            .addComponent(lblTipoBien))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUbicacionPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(txtTipoPrinc)
                            .addComponent(txtEstadoPrinc)
                            .addComponent(txtNombreBienPrinc)
                            .addComponent(txtCantidadPrinc)
                            .addComponent(txtCodigoBarraPrinc))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelIzquierdoLayout.setVerticalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigoBarraPrinc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreBienPrinc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombArtic))
                .addGap(18, 18, 18)
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadPrinc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidad))
                .addGap(18, 18, 18)
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstadoPrinc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado))
                .addGap(18, 18, 18)
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoPrinc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoBien))
                .addGap(18, 18, 18)
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUbicacionPrinc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUbicacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevBusque)
                    .addComponent(btnSalirPrinci))
                .addGap(91, 91, 91))
        );

        panelDerecho.setBackground(new java.awt.Color(255, 255, 255));

        lblImagen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblImagen.setText("Imagen");

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescripcion.setText("Descripcion");

        txtImagenPrinci.setBackground(new java.awt.Color(204, 204, 204));

        txtDescripPrincipal1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panelDerechoLayout = new javax.swing.GroupLayout(panelDerecho);
        panelDerecho.setLayout(panelDerechoLayout);
        panelDerechoLayout.setHorizontalGroup(
            panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDerechoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion)
                    .addComponent(lblImagen))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDerechoLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(txtImagenPrinci, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDerechoLayout.createSequentialGroup()
                    .addContainerGap(109, Short.MAX_VALUE)
                    .addComponent(txtDescripPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)))
        );
        panelDerechoLayout.setVerticalGroup(
            panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDerechoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescripcion)
                .addGap(155, 155, 155)
                .addComponent(lblImagen)
                .addGap(18, 18, 18)
                .addComponent(txtImagenPrinci, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelDerechoLayout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(txtDescripPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(295, Short.MAX_VALUE)))
        );

        menuArchivo.setText("Archivo");

        btnCerrarSesion.setText("Cerrar Sesion");
        menuArchivo.add(btnCerrarSesion);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(btnSalir);

        MenuPrincipal.add(menuArchivo);

        jMenu2.setText("Nuevo");

        btnNuevoUsuario.setText("Nuevo Usuario");
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(btnNuevoUsuario);

        btnNuevoArticulo.setText("Nuevo Articulo");
        btnNuevoArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoArticuloActionPerformed(evt);
            }
        });
        jMenu2.add(btnNuevoArticulo);

        MenuPrincipal.add(jMenu2);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtCodigoBarraPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoBarraPrincActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoBarraPrincActionPerformed

    private void txtNombreBienPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreBienPrincActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreBienPrincActionPerformed

    private void txtCantidadPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadPrincActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadPrincActionPerformed

    private void txtEstadoPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoPrincActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoPrincActionPerformed

    private void txtTipoPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoPrincActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoPrincActionPerformed

    private void txtUbicacionPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionPrincActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacionPrincActionPerformed

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        Persona p = new Persona();
        p.setVisible(true);



    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnNuevoArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoArticuloActionPerformed
        BienInmueble bi = new BienInmueble();
        bi.setVisible(true);
                
        

    }//GEN-LAST:event_btnNuevoArticuloActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed


    }//GEN-LAST:event_btnSalirActionPerformed

    private void bntTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntTipoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JComboBox bntTipo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JMenuItem btnCerrarSesion;
    private javax.swing.JButton btnNuevBusque;
    private javax.swing.JMenuItem btnNuevoArticulo;
    private javax.swing.JMenuItem btnNuevoUsuario;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JButton btnSalirPrinci;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombArtic;
    private javax.swing.JLabel lblTipoBien;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JPanel panelDerecho;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidadPrinc;
    private javax.swing.JTextField txtCodigoBarraPrinc;
    private javax.swing.JTextField txtDescripPrincipal1;
    private javax.swing.JTextField txtEstadoPrinc;
    private javax.swing.JTextField txtImagenPrinci;
    private javax.swing.JTextField txtNombreBienPrinc;
    private javax.swing.JTextField txtTipoPrinc;
    private javax.swing.JTextField txtUbicacionPrinc;
    // End of variables declaration//GEN-END:variables
}
