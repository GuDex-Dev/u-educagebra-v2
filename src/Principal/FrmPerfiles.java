package Principal;

public class FrmPerfiles extends javax.swing.JFrame {
    
    /**
     * Creates new form FrmPerfiles
     */
    public FrmPerfiles() {
        //hola buenas
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        new ListaUsuarios();
        
        btnP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsPerfil/IconIncog.png")));
        btnP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsPerfil/IconIncog.png")));
        btnP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsPerfil/IconIncog.png")));
        btnP4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsPerfil/IconIncog.png")));
        
        btnP1.setOpaque(false);
        btnP1.setContentAreaFilled(false);
        btnP1.setBorderPainted(false);
        btnP2.setOpaque(false);
        btnP2.setContentAreaFilled(false);
        btnP2.setBorderPainted(false);
        btnP3.setOpaque(false);
        btnP3.setContentAreaFilled(false);
        btnP3.setBorderPainted(false);
        btnP4.setOpaque(false);
        btnP4.setContentAreaFilled(false);
        btnP4.setBorderPainted(false);
        
        if (ListaUsuarios.matrizUsuarios[0].existo) {
            btnP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsPerfil/Icon1.png")));
        }      
        if (ListaUsuarios.matrizUsuarios[1].existo) {
            btnP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsPerfil/Icon2.png")));
        }      
        if (ListaUsuarios.matrizUsuarios[2].existo) {
            btnP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsPerfil/Icon3.png")));
        }      
        if (ListaUsuarios.matrizUsuarios[3].existo) {
            btnP4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsPerfil/Icon4.png")));
        }     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnP1 = new javax.swing.JButton();
        btnP2 = new javax.swing.JButton();
        btnP3 = new javax.swing.JButton();
        btnP4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnP1.setBorderPainted(false);
        btnP1.setPreferredSize(new java.awt.Dimension(110, 120));
        btnP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 168, 110, 120));

        btnP2.setPreferredSize(new java.awt.Dimension(110, 120));
        btnP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 168, 110, 120));

        btnP3.setPreferredSize(new java.awt.Dimension(110, 120));
        btnP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 168, 110, 120));

        btnP4.setPreferredSize(new java.awt.Dimension(110, 120));
        btnP4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 168, 110, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPerfiles.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        btnCerrar.setText("jButton2");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP1ActionPerformed
        ListaUsuarios.posUsuario = 0;
        
        System.out.println(ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].existo);
        
        if (ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].existo) {
            new FrmMain().setVisible(true);
            this.setVisible(false);
        } else {
            new FrmRegistro().setVisible(true);
            this.setVisible(false);
        }       
    }//GEN-LAST:event_btnP1ActionPerformed

    private void btnP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP2ActionPerformed
        ListaUsuarios.posUsuario = 1;
        
        if (ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].existo) {
            new FrmMain().setVisible(true);
            this.setVisible(false);
        } else {
            new FrmRegistro().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnP2ActionPerformed

    private void btnP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP3ActionPerformed
        ListaUsuarios.posUsuario = 2;
        
        if (ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].existo) {
            new FrmMain().setVisible(true);
            this.setVisible(false);
        } else {
            new FrmRegistro().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnP3ActionPerformed

    private void btnP4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP4ActionPerformed
        ListaUsuarios.posUsuario = 3;
        
        if (ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].existo) {
            new FrmMain().setVisible(true);
            this.setVisible(false);
        } else {
            new FrmRegistro().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnP4ActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPerfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPerfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPerfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPerfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPerfiles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnP1;
    private javax.swing.JButton btnP2;
    private javax.swing.JButton btnP3;
    private javax.swing.JButton btnP4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
