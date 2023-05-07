package EscogerOperacion;

import CuatroOp.Naturales.*;
import Principal.FrmCuatroOp;
import Principal.ListaUsuarios;
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

public class FrmNatDiv1 extends javax.swing.JFrame {

    Boolean okCalcular = false;

    public FrmNatDiv1() {
        initComponents();
        this.setLocationRelativeTo(null);
        actualizarBits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resul = new javax.swing.JTextField();
        lbResi = new javax.swing.JLabel();
        LbAddTextBits = new javax.swing.JLabel();
        LabelBits = new javax.swing.JLabel();
        lbIconVerify = new javax.swing.JLabel();
        lbNum2 = new javax.swing.JTextField();
        lbNum1 = new javax.swing.JTextField();
        lbFondo = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resul.setBackground(new java.awt.Color(255, 255, 255));
        resul.setFont(new java.awt.Font("Consolas", 0, 27)); // NOI18N
        resul.setForeground(new java.awt.Color(0, 0, 0));
        resul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resulActionPerformed(evt);
            }
        });
        resul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                resulKeyTyped(evt);
            }
        });
        getContentPane().add(resul, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 80, 40));

        lbResi.setBackground(new java.awt.Color(51, 51, 255));
        lbResi.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        lbResi.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbResi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 50, 40));

        LbAddTextBits.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        LbAddTextBits.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(LbAddTextBits, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 43, 20, 20));

        LabelBits.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        LabelBits.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(LabelBits, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 18, 30, 20));

        lbIconVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconNat.png"))); // NOI18N
        getContentPane().add(lbIconVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 118, -1, -1));

        lbNum2.setBackground(new java.awt.Color(255, 255, 255));
        lbNum2.setFont(new java.awt.Font("Consolas", 0, 27)); // NOI18N
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
        getContentPane().add(lbNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 80, 40));

        lbNum1.setBackground(new java.awt.Color(255, 255, 255));
        lbNum1.setFont(new java.awt.Font("Consolas", 0, 27)); // NOI18N
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
        getContentPane().add(lbNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 80, 40));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DivNatural.png"))); // NOI18N
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 330));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 100, 20));

        btnContinuar.setText("Continuar");
        btnContinuar.setEnabled(false);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 90, 20));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resulActionPerformed

    }//GEN-LAST:event_resulActionPerformed

    public void actualizarBits() {

        LabelBits.setText(String.valueOf(ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].getBits()));
    }

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int div, num1, num2, result, resi;

        if (resul.getText().length() != 0) {
            num1 = Integer.parseInt(lbNum1.getText());
            num2 = Integer.parseInt(lbNum2.getText());
            div = num1 / num2;
            resi = num1 % num2;
            result = Integer.parseInt(resul.getText());

            if (!okCalcular && num1 > num2) {
                if (div == result) {
                    btnContinuar.setEnabled(true);
                    ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].OpCorrecta();
                    lbIconVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconTrueNat.png")));
                    LbAddTextBits.setText("+5");
                    actualizarBits();
                    LbAddTextBits.setForeground(new Color(103, 141, 88));
                    okCalcular = true;
                    lbResi.setText(String.valueOf(resi));
                    lbNum1.setEditable(false);
                    lbNum2.setEditable(false);
                    resul.setEditable(false);

                } else {
                    ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].OpIncorrecta();
                    actualizarBits();
                    LbAddTextBits.setText("-3");
                    LbAddTextBits.setForeground(new Color(239, 99, 81));
                    lbIconVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconFalseNat.png")));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al ejecutar, verefique sus numeros");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Agrega un número antes de calcular :D");
        }

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void resulKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resulKeyTyped
        char t = evt.getKeyChar();
        if (t < '0' || t > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_resulKeyTyped

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        lbNum1.setEditable(true);
        lbNum2.setEditable(true);
        resul.setEditable(true);
        lbNum1.setText("");
        lbNum2.setText("");
        resul.setText("");
        lbResi.setText("");
        okCalcular = false;
        lbIconVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconNat.png")));
        int num1, num2, num3;
        btnContinuar.setEnabled(false);
        num1 = Integer.parseInt(lbNum1.getText());
        num2 = Integer.parseInt(lbNum2.getText());
        num2 = Integer.parseInt(resul.getText());
        // resul1.setText("");
        LbAddTextBits.setText("");
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        FrmCuatroOp Prin = new FrmCuatroOp();
        Prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void lbNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNum1ActionPerformed

    private void lbNum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNum1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNum1KeyTyped

    private void lbNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNum2ActionPerformed

    private void lbNum2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNum2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNum2KeyTyped

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
            java.util.logging.Logger.getLogger(FrmNatDiv1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNatDiv1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNatDiv1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNatDiv1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNatDiv1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBits;
    private javax.swing.JLabel LbAddTextBits;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbIconVerify;
    private javax.swing.JTextField lbNum1;
    private javax.swing.JTextField lbNum2;
    private javax.swing.JLabel lbResi;
    private javax.swing.JTextField resul;
    // End of variables declaration//GEN-END:variables
}