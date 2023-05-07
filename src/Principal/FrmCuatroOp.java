package Principal;

import CuatroOp.Fracciones.*;
import CuatroOp.Naturales.*;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.text.html.HTML;
import org.w3c.dom.css.RGBColor;

/**
 *
 * @author USUARIO
 */
public class FrmCuatroOp extends javax.swing.JFrame {
int clicked;
    /**
     * Creates new form LaPrincipal
     */
    public FrmCuatroOp() {
        initComponents();
        transparenciaButton();
        setLocationRelativeTo(null);
        this.setResizable(false);
        lbIniciales.setText(ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].iniciales);
        lbNombre.setText("HOLA, "+ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].getNombre());
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnnDiv = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnFracciones = new javax.swing.JButton();
        btnNaturales = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbIniciales = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSuma.setToolTipText("Sumas");
        btnSuma.setBorder(null);
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 90, 90));

        btnResta.setToolTipText("Restas");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel1.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 80, 80));

        btnnDiv.setToolTipText("Division");
        btnnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnDivActionPerformed(evt);
            }
        });
        jPanel1.add(btnnDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 80, 100));

        btnMulti.setToolTipText("Multiplicar");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });
        jPanel1.add(btnMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 80, 100));

        btnFracciones.setBackground(new java.awt.Color(126, 158, 255));
        btnFracciones.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnFracciones.setText("FRACCIONES");
        btnFracciones.setBorderPainted(false);
        btnFracciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFraccionesMouseClicked(evt);
            }
        });
        btnFracciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFraccionesActionPerformed(evt);
            }
        });
        jPanel1.add(btnFracciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, 60));

        btnNaturales.setBackground(new java.awt.Color(126, 158, 255));
        btnNaturales.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnNaturales.setText("NATURALES");
        btnNaturales.setBorderPainted(false);
        btnNaturales.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNaturales.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNaturales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNaturalesMouseClicked(evt);
            }
        });
        btnNaturales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaturalesActionPerformed(evt);
            }
        });
        jPanel1.add(btnNaturales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 160, 50));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¿QUÉ DESEAR HACER?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, 50));

        lbNombre.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(0, 0, 0));
        lbNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNombre.setText("<HTML> HOLA, KEVINCITOOOO</HTML>");
        jPanel1.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, 20));

        lbIniciales.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        lbIniciales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIniciales.setText("KM");
        jPanel1.add(lbIniciales, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 10, 40, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Matematicas2.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    public void pasarMaus(){
//    String suma, resta,div,multi;
//    suma = "Sumas";
//    resta = "Restas";
//    div = "Division";
//    multi = "Multiplicación";
//    
//    }
    public void transparenciaButton() {
        btnSuma.setOpaque(false);
        btnSuma.setContentAreaFilled(false);
        btnSuma.setBorderPainted(false);

        btnResta.setOpaque(false);
        btnResta.setContentAreaFilled(false);
        btnResta.setBorderPainted(false);

        btnMulti.setOpaque(false);
        btnMulti.setContentAreaFilled(false);
        btnMulti.setBorderPainted(false);

        btnnDiv.setOpaque(false);
        btnnDiv.setContentAreaFilled(false);
        btnnDiv.setBorderPainted(false);

    }


    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        if (clicked==1) {
            new FrmNatSuma().setVisible(true);
            this.setVisible(false); //Ocultar Jframe principal
        } else if(clicked == 2){
            new FrmFraccSuma().setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione primero que desea realizar");
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        if (clicked==1) {
            new FrmNatResta().setVisible(true);
            this.setVisible(false);
        } else if(clicked==2){
            new FrmFraccResta().setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione primero que desea realizar");
        }
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnDivActionPerformed
        if (clicked==1) {
            new FrmNatDiv().setVisible(true);
            this.setVisible(false);
        } else{
            new FrmFraccDiv().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnnDivActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        if (clicked==1) {
            new FrmNatMulti().setVisible(true);
            this.setVisible(false);
        } else{
            new FrmFraccMulti().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        new FrmMain().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnFraccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFraccionesMouseClicked
        clicked=2;
        btnFracciones.setBackground(new Color(166, 186, 248));
        btnNaturales.setBackground(new Color(126,158,255));
    }//GEN-LAST:event_btnFraccionesMouseClicked

    private void btnNaturalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNaturalesMouseClicked
        clicked=1;
        btnNaturales.setBackground(new Color(166, 186, 248));
        btnFracciones.setBackground(new Color(126,158,255));
    }//GEN-LAST:event_btnNaturalesMouseClicked

    private void btnNaturalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaturalesActionPerformed
       
    }//GEN-LAST:event_btnNaturalesActionPerformed

    private void btnFraccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFraccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFraccionesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCuatroOp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCuatroOp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCuatroOp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCuatroOp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCuatroOp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFracciones;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnNaturales;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnnDiv;
    private javax.swing.JLabel fondo;
    private javax.swing.ButtonGroup group;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbIniciales;
    private javax.swing.JLabel lbNombre;
    // End of variables declaration//GEN-END:variables
}
