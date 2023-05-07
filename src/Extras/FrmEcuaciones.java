package Extras;

import Principal.FrmExtras;
import Principal.ListaUsuarios;
import java.awt.Color;

public class FrmEcuaciones extends javax.swing.JFrame {

    int num1, x, num2, num3;
    String ecuacion;
    int maxSR = 50, minSR = 2;
    int maxMM = 6, minMM = 1;
    boolean okCalcular = false;

    /**
     * Creates new form FrmEcuaciones
     */
    public FrmEcuaciones() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        nuevaOp();
        lbEcuacion.setText(ecuacion);
        System.out.println(x);
        actualizarBits();
        LbAddTextBits.setText("");
    }

    private void nuevaOp() {
        int caso = (int) (Math.random() * (4 - 1 + 1) + 1);
        switch (caso) {
            case 1: //x - n2 = n3
                num2 = (int) (Math.random() * (maxSR - minSR + 1) + minSR);
                num3 = (int) (Math.random() * (maxSR - minSR + 1) + minSR);
                x = num2 + num3;
                ecuacion = "x - " + num2 + " = " + num3;
                break;
            case 2: //x + n2 = n3
                x = (int) (Math.random() * (maxSR - minSR + 1) + minSR);
                num2 = (int) (Math.random() * (maxSR - minSR + 1) + minSR);
                num3 = x + num2;
                ecuacion = "x + " + num2 + " = " + num3;
                break;
            case 3: //n1x - n2 = n3)
                num1 = (int) (Math.random() * (maxMM - minMM + 1) + minMM);
                if (num1 == 1) {
                    num1 = 2;
                }
                x = (int) (Math.random() * (maxMM - minMM + 1) + minMM);

                num2 = (int) (Math.random() * ((num1 * x) - minSR + 1) + minSR);

                num3 = (num1 * x) - num2;
                ecuacion = num1 + "x - " + num2 + " = " + num3;
                break;
            case 4: //n1x + n2 = n3
                num1 = (int) (Math.random() * (maxMM - minMM + 1) + minMM);
                if (num1 == 1) {
                    num1 = 2;
                }
                x = (int) (Math.random() * (maxMM - minMM + 1) + minMM);

                num2 = (int) (Math.random() * (maxSR - minSR + 1) + minSR);

                num3 = (num1 * x) + num2;
                ecuacion = num1 + "x + " + num2 + " = " + num3;
                break;
            default:
                System.out.println("Error");
                break;
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

        txtResultado = new javax.swing.JTextField();
        LbAddTextBits = new javax.swing.JLabel();
        LabelBits = new javax.swing.JLabel();
        lbIconVerify = new javax.swing.JLabel();
        lbX = new javax.swing.JLabel();
        lbEcuacion = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setFont(new java.awt.Font("Consolas", 0, 48)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 150, 80));

        LbAddTextBits.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        LbAddTextBits.setForeground(new java.awt.Color(0, 0, 0));
        LbAddTextBits.setText("+5");
        getContentPane().add(LbAddTextBits, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 20, 20));

        LabelBits.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        LabelBits.setForeground(new java.awt.Color(0, 0, 0));
        LabelBits.setText("500");
        getContentPane().add(LabelBits, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 25, 70, 50));
        getContentPane().add(lbIconVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 100, 110));

        lbX.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbX.setForeground(new java.awt.Color(0, 0, 0));
        lbX.setText("x =");
        getContentPane().add(lbX, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 100, 80));

        lbEcuacion.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbEcuacion.setForeground(new java.awt.Color(0, 0, 0));
        lbEcuacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEcuacion.setText("1x     +     2     =   5");
        getContentPane().add(lbEcuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 460, 100));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ecuaciones.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnSalir.setBackground(new java.awt.Color(204, 255, 255));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        btnCalcular.setText("jButton1");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 220, 60));

        btnContinuar.setText("jButton1");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 210, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        new FrmExtras().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if (!okCalcular) {
            if (Integer.parseInt(txtResultado.getText()) == x) {
                lbIconVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconTrueExtraMYM.png")));
                ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].OpCorrecta();
                LbAddTextBits.setForeground(new Color(103, 141, 88));
                LbAddTextBits.setText("+5");
                actualizarBits();
                okCalcular = true;
            } else {
                lbIconVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconFalseExtraMYM.png")));
                ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].OpIncorrecta();
                LbAddTextBits.setForeground(new Color(239, 99, 81));
                LbAddTextBits.setText("-3");      
                actualizarBits();
            }
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    public void actualizarBits() {
        LabelBits.setText(String.valueOf(ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].getBits()));
    }

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        nuevaOp();
        lbEcuacion.setText(ecuacion);
        System.out.println(x);
        lbIconVerify.setIcon(null);
        txtResultado.setText("");
        okCalcular = false;
    }//GEN-LAST:event_btnContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEcuaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEcuaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEcuaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEcuaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEcuaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel LabelBits;
    private javax.swing.JLabel LbAddTextBits;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lbEcuacion;
    private javax.swing.JLabel lbIconVerify;
    private javax.swing.JLabel lbX;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
