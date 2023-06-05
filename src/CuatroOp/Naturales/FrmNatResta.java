
package CuatroOp.Naturales;

import Principal.FrmCuatroOp;
import Principal.Clases.ListaUsuarios;
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;


public class FrmNatResta extends javax.swing.JFrame {
    int max = 100, min = 1;
    Boolean okCalcular = false;

    /**
     * Creates new form VentanaResta
     */
    public FrmNatResta() {
        initComponents();
        this.setLocationRelativeTo(null);
        actualizarLabels();
        actualizarBits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNum2 = new javax.swing.JLabel();
        lbNum1 = new javax.swing.JLabel();
        LabelBits = new javax.swing.JLabel();
        LbAddTextBits = new javax.swing.JLabel();
        resul = new javax.swing.JTextField();
        lbRpta = new javax.swing.JLabel();
        lbIconVerify = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNum2.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        lbNum2.setForeground(new java.awt.Color(0, 0, 0));
        lbNum2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNum2.setText("15");
        getContentPane().add(lbNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 90, 50));

        lbNum1.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        lbNum1.setForeground(new java.awt.Color(0, 0, 0));
        lbNum1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNum1.setText("15");
        getContentPane().add(lbNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 90, 50));

        LabelBits.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        LabelBits.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(LabelBits, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 18, 30, 20));

        LbAddTextBits.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        LbAddTextBits.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(LbAddTextBits, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 43, 20, 20));

        resul.setBackground(new java.awt.Color(255, 255, 255));
        resul.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
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
        getContentPane().add(resul, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 80, 50));

        lbRpta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbRpta.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbRpta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 250, 30));

        lbIconVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconNat.png"))); // NOI18N
        getContentPane().add(lbIconVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 118, -1, -1));

        lbFondo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RestaNatural.png"))); // NOI18N
        lbFondo.setText("jLabel1");
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 330));

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 90, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 100, -1));

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

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int resta, num1, num2, result;

        if (resul.getText().length() != 0) {
            num1 = Integer.parseInt(lbNum1.getText());
            num2 = Integer.parseInt(lbNum2.getText());
            resta = num1 - num2;
            result = Integer.parseInt(resul.getText());

            if (!okCalcular && num1 > num2) {
                if (resta == result) {
                    btnContinuar.setEnabled(true);
                    ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].OpCorrecta();
                    lbIconVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconTrueNat.png")));
                    LbAddTextBits.setText("+5");
                    actualizarBits();
                    LbAddTextBits.setForeground(new Color(103, 141, 88));
                    okCalcular = true;
                } else {
                    ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].OpIncorrecta();
                    actualizarBits();
                    LbAddTextBits.setText("-3");
                    LbAddTextBits.setForeground(new Color(239, 99, 81));
                    lbIconVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconFalseNat.png")));
                }
            }
            else{
            }

        } else {
            JOptionPane.showMessageDialog(null, "Agrega un número antes de calcular :D");
        }

    }//GEN-LAST:event_btnCalcularActionPerformed

    public void actualizarBits() {
        LabelBits.setText(String.valueOf(ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].getBits()));
    }
    
    private void actualizarLabels() {
        int num1, num2;

        Random r1 = new Random();
        num1 = r1.nextInt(max - min + 1) + min;
        num2 = r1.nextInt(num1 - min + 1) + min;

        lbNum1.setText(String.valueOf(num1));
        lbNum2.setText(String.valueOf(num2));
        resul.setText("");
        LbAddTextBits.setText("");
    }
    
    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        okCalcular = false;
        lbIconVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconNat.png")));
        actualizarLabels();
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void resulKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resulKeyTyped
        char t = evt.getKeyChar();
        if (t < '0' || t > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_resulKeyTyped

    private void resulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resulActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        FrmCuatroOp Prin = new FrmCuatroOp();
        Prin.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(FrmNatResta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNatResta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNatResta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNatResta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNatResta().setVisible(true);
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
    private javax.swing.JLabel lbNum1;
    private javax.swing.JLabel lbNum2;
    private javax.swing.JLabel lbRpta;
    private javax.swing.JTextField resul;
    // End of variables declaration//GEN-END:variables
}
