 
package EscogerOperacion;

import CuatroOp.Naturales.*;
import Principal.FrmCuatroOp;
import Principal.ListaUsuarios;
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class FrmNatSuma1 extends javax.swing.JFrame {

    Boolean okCalcular = false;

    public FrmNatSuma1() {
        initComponents();
        this.setLocationRelativeTo(null);
//        int n1, n2;
//        Random r1 = new Random();
//        n1 =   (r1.nextInt(99-10+1)+10);
//        n2 =    (r1.nextInt(99-10+1)+10);
//        lbNum1.setText(String.valueOf(n1));
//        lbNum2.setText(String.valueOf(n2));
        actualizarBits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LbAddTextBits = new javax.swing.JLabel();
        LabelBits = new javax.swing.JLabel();
        lbIconVerify = new javax.swing.JLabel();
        lbNum2 = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        resul1 = new javax.swing.JTextField();
        lbNum1 = new javax.swing.JTextField();
        jlbFondo = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LbAddTextBits.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        LbAddTextBits.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(LbAddTextBits, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 43, 20, 20));

        LabelBits.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        LabelBits.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(LabelBits, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 18, 30, 20));

        lbIconVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconNat.png"))); // NOI18N
        getContentPane().add(lbIconVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 118, -1, -1));

        lbNum2.setBackground(new java.awt.Color(255, 255, 255));
        lbNum2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lbNum2.setForeground(new java.awt.Color(0, 0, 0));
        lbNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbNum2ActionPerformed(evt);
            }
        });
        lbNum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lbNum2KeyTyped(evt);
            }
        });
        getContentPane().add(lbNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 80, 40));

        btnCerrar.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close-line.png"))); // NOI18N
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setFocusPainted(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCerrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 14, 30, 30));

        resul1.setBackground(new java.awt.Color(255, 255, 255));
        resul1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        resul1.setForeground(new java.awt.Color(0, 0, 0));
        resul1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resul1ActionPerformed(evt);
            }
        });
        resul1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                resul1KeyTyped(evt);
            }
        });
        getContentPane().add(resul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 80, 40));

        lbNum1.setBackground(new java.awt.Color(255, 255, 255));
        lbNum1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lbNum1.setForeground(new java.awt.Color(0, 0, 0));
        lbNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbNum1ActionPerformed(evt);
            }
        });
        lbNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lbNum1KeyTyped(evt);
            }
        });
        getContentPane().add(lbNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 80, 40));

        jlbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SumaNatural.png"))); // NOI18N
        jlbFondo.setText("jLabel1");
        getContentPane().add(jlbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 330));

        btnContinuar.setText("Continuar");
        btnContinuar.setEnabled(false);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 298, 110, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 298, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbNum2ActionPerformed

    }//GEN-LAST:event_lbNum2ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int suma, num1, num2, result;

        if (lbNum1.getText().length() != 0 &&lbNum2.getText().length() != 0 && resul1.getText().length() != 0) {
            num1 = Integer.parseInt(lbNum1.getText());
            num2 = Integer.parseInt(lbNum2.getText());
            suma = num1 + num2;
            result = Integer.parseInt(resul1.getText());

            if (!okCalcular) {
                if (suma == result) {
                    btnContinuar.setEnabled(true);
                    ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].OpCorrecta();
                    lbIconVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconTrueNat.png")));
                    actualizarBits();
                    LbAddTextBits.setText("+5");
                    LbAddTextBits.setForeground(new Color(103, 141, 88));
                    okCalcular=true;
                    lbNum1.setEditable(false);
                     lbNum2.setEditable(false);
                      resul1.setEditable(false);
//       lbNum1.setText("");
//       lbNum2.setText("");
//       resul1.setText("");
                    
                } else {
                    ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].OpIncorrecta();
                    lbIconVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconFalseNat.png")));
                    actualizarBits();
                    LbAddTextBits.setText("-3");
                    LbAddTextBits.setForeground(new Color(239, 99, 81));
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Agrega un número antes de calcular :D");
        }

    }//GEN-LAST:event_btnCalcularActionPerformed

    public void actualizarBits() {

        LabelBits.setText(String.valueOf(ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].getBits()));
    }

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
            lbNum1.setEditable(true);
                     lbNum2.setEditable(true);
                      resul1.setEditable(true);       
        lbNum1.setText("");
       lbNum2.setText("");
       resul1.setText("");
        okCalcular = false;
        lbIconVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconNat.png")));
        int num1, num2,num3;

        Random r1 = new Random();
        btnContinuar.setEnabled(false);
        num1 = Integer.parseInt(lbNum1.getText());
        num2 = Integer.parseInt(lbNum2.getText());
         num2 = Integer.parseInt(resul1.getText());
       // resul1.setText("");
        LbAddTextBits.setText("");
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void lbNum2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNum2KeyTyped

        char t = evt.getKeyChar();
        if (t < '0' || t > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_lbNum2KeyTyped

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        FrmCuatroOp Prin = new FrmCuatroOp();
        Prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void resul1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resul1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resul1ActionPerformed

    private void resul1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resul1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_resul1KeyTyped

    private void lbNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNum1ActionPerformed

    private void lbNum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNum1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNum1KeyTyped

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
            java.util.logging.Logger.getLogger(FrmNatSuma1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNatSuma1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNatSuma1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNatSuma1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNatSuma1().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBits;
    private javax.swing.JLabel LbAddTextBits;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel jlbFondo;
    private javax.swing.JLabel lbIconVerify;
    private javax.swing.JTextField lbNum1;
    private javax.swing.JTextField lbNum2;
    private javax.swing.JTextField resul1;
    // End of variables declaration//GEN-END:variables
}
