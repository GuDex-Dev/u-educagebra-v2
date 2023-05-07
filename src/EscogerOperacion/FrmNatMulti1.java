package EscogerOperacion;

import CuatroOp.Naturales.*;
import Principal.FrmCuatroOp;
import Principal.ListaUsuarios;
import java.awt.Color;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FrmNatMulti1 extends javax.swing.JFrame {

    Boolean okCalcular = false;

    public FrmNatMulti1() {
        initComponents();
        this.setLocationRelativeTo(null);

        actualizarBits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        resul = new javax.swing.JTextField();
        lbIconVerify = new javax.swing.JLabel();
        LbAddTextBits = new javax.swing.JLabel();
        LabelBits = new javax.swing.JLabel();
        lbNum1 = new javax.swing.JTextField();
        lbNum2 = new javax.swing.JTextField();
        lbFondoo = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resul.setBackground(new java.awt.Color(255, 255, 255));
        resul.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
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
        jPanel1.add(resul, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 70, 40));

        lbIconVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconNat.png"))); // NOI18N
        jPanel1.add(lbIconVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 118, -1, -1));

        LbAddTextBits.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        LbAddTextBits.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(LbAddTextBits, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 43, 20, 20));

        LabelBits.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        LabelBits.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(LabelBits, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 18, 30, 20));

        lbNum1.setBackground(new java.awt.Color(255, 255, 255));
        lbNum1.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
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
        jPanel1.add(lbNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 70, 40));

        lbNum2.setBackground(new java.awt.Color(255, 255, 255));
        lbNum2.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
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
        jPanel1.add(lbNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 70, 40));

        lbFondoo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MultiNatural.png"))); // NOI18N
        jPanel1.add(lbFondoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, -1));

        btnContinuar.setText("Continuar");
        btnContinuar.setEnabled(false);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 100, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 100, 20));

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
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 14, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int multi, num1, num2, result;

        if (resul.getText().length() != 0) {
            num1 = Integer.parseInt(lbNum1.getText());
            num2 = Integer.parseInt(lbNum2.getText());
            multi = num1 * num2;
            result = Integer.parseInt(resul.getText());

            if (!okCalcular) {
                if (multi == result) {
                    btnContinuar.setEnabled(true);
                    ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].OpCorrecta();
                    lbIconVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconTrueNat.png")));
                    LbAddTextBits.setText("+5");
                    actualizarBits();
                    LbAddTextBits.setForeground(new Color(103, 141, 88));
                    okCalcular = true;
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
            }

        } else {
            JOptionPane.showMessageDialog(null, "Agrega un número antes de calcular :D");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void resulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resulActionPerformed

    }//GEN-LAST:event_resulActionPerformed

    public void actualizarBits() {

        LabelBits.setText(String.valueOf(ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].getBits()));
    }

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        lbNum1.setEditable(true);
        lbNum2.setEditable(true);
        resul.setEditable(true);
        lbNum1.setText("");
        lbNum2.setText("");
        resul.setText("");
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

    private void resulKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resulKeyTyped

        char t = evt.getKeyChar();
        if (t < '0' || t > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_resulKeyTyped

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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNatMulti1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBits;
    private javax.swing.JLabel LbAddTextBits;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbFondoo;
    private javax.swing.JLabel lbIconVerify;
    private javax.swing.JTextField lbNum1;
    private javax.swing.JTextField lbNum2;
    private javax.swing.JTextField resul;
    // End of variables declaration//GEN-END:variables

}
