package Extras;

import Principal.FrmExtras;
import Extras.Clases.ListaNumeros;
import Principal.ListaUsuarios;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrmNumLitToCifras extends javax.swing.JFrame {

    //boolean okCalcular = false;
    //boolean okCompTxt = false;
    int Bits;

    ArrayList<Integer> Cifras = new ArrayList<>();

    int n1;
    int n2;
    int n3;
    Boolean okN1 = false;
    Boolean okN2 = false;
    Boolean okN3 = false;

    int contRec = 0; //borrable
    int intActual = -1;
    String strActual = "";

    ListaNumeros Lista = new ListaNumeros();

    public FrmNumLitToCifras() {
        initComponents();
        setLocationRelativeTo(null);
        actualizarLabels();
        actualizarBits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbNum1 = new javax.swing.JLabel();
        lbNum2 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        lbNum3 = new javax.swing.JLabel();
        txtNum3 = new javax.swing.JTextField();
        LabelBits = new javax.swing.JLabel();
        LbAddTextBits = new javax.swing.JLabel();
        LabelBits1 = new javax.swing.JLabel();
        lbIconVerify3 = new javax.swing.JLabel();
        lbIconVerify1 = new javax.swing.JLabel();
        lbIconVerify2 = new javax.swing.JLabel();
        LbAddTextBits1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNum1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbNum1.setForeground(new java.awt.Color(0, 0, 0));
        lbNum1.setText("Num1");
        jPanel1.add(lbNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 420, 60));

        lbNum2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbNum2.setForeground(new java.awt.Color(0, 0, 0));
        lbNum2.setText("Num2");
        jPanel1.add(lbNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 420, 70));

        txtNum1.setBackground(new java.awt.Color(255, 255, 153));
        txtNum1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum1KeyTyped(evt);
            }
        });
        jPanel1.add(txtNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 180, 50));

        txtNum2.setBackground(new java.awt.Color(255, 255, 153));
        txtNum2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum2KeyTyped(evt);
            }
        });
        jPanel1.add(txtNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 180, 50));

        lbNum3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbNum3.setForeground(new java.awt.Color(0, 0, 0));
        lbNum3.setText("Num3");
        jPanel1.add(lbNum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 420, 70));

        txtNum3.setBackground(new java.awt.Color(255, 255, 153));
        txtNum3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNum3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum3KeyTyped(evt);
            }
        });
        jPanel1.add(txtNum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 180, 50));

        LabelBits.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        LabelBits.setForeground(new java.awt.Color(0, 0, 0));
        LabelBits.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LabelBits, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 25, 70, 50));

        LbAddTextBits.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        LbAddTextBits.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(LbAddTextBits, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 40, 20));

        LabelBits1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        LabelBits1.setForeground(new java.awt.Color(0, 0, 0));
        LabelBits1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LabelBits1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 60, 50));

        lbIconVerify3.setText(" ");
        jPanel1.add(lbIconVerify3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 50, 40));

        lbIconVerify1.setText(" ");
        jPanel1.add(lbIconVerify1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 245, 50, 40));

        lbIconVerify2.setText(" ");
        jPanel1.add(lbIconVerify2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 50, 40));

        LbAddTextBits1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        LbAddTextBits1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(LbAddTextBits1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 20, 20));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NumACifras.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnCalcular.setBackground(new java.awt.Color(204, 255, 255));
        btnCalcular.setText("COMPROBAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 270, 60));

        btnContinuar.setBackground(new java.awt.Color(204, 255, 255));
        btnContinuar.setText("SIGUIENTE");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 270, 60));

        btnSalir.setBackground(new java.awt.Color(204, 255, 255));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        //okCalcular=false;
        actualizarLabels();
        okN1 = false;
        okN2 = false;
        okN3 = false;
        
        txtNum1.setBackground(new Color(255, 255, 153));
        txtNum2.setBackground(new Color(255, 255, 153));
        txtNum3.setBackground(new Color(255, 255, 153));
        txtNum1.setText("");
        txtNum2.setText("");
        txtNum3.setText("");
        txtNum1.setEditable(true);
        txtNum2.setEditable(true);
        txtNum3.setEditable(true);
        lbIconVerify3.setIcon(null);
        lbIconVerify1.setIcon(null);
        lbIconVerify2.setIcon(null);
        LbAddTextBits.setText("");
    }//GEN-LAST:event_btnContinuarActionPerformed

    public void actualizarBits() {
        LabelBits.setText(String.valueOf(ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].getBits()));
    }

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        Bits = 0;
        
        okN1 = compTxt(txtNum1, n1, lbIconVerify1, okN1);
        okN2 = compTxt(txtNum2, n2, lbIconVerify2, okN2);
        okN3 = compTxt(txtNum3, n3, lbIconVerify3, okN3);
        
        String StrBits;
        if (Bits > 0) {
            StrBits = "+" + Bits;
            LbAddTextBits.setForeground(new Color(103, 141, 88));
        } else {
            StrBits = Bits + "";
            LbAddTextBits.setForeground(new Color(239, 99, 81));
        }
        
        LbAddTextBits.setText(StrBits);
        actualizarBits();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private Boolean compTxt(JTextField txt, int rpta, javax.swing.JLabel ico, Boolean ok) {
        if (!ok) {
            if ("".equals(txt.getText())) {
                //Incorrecta
                ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconFalseExtraMYM.png")));
                Bits -= 3;
                ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].OpIncorrecta();
                return false;
            } else if (Integer.parseInt(txt.getText()) == rpta) {
                //Correcta
                ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconTrueExtraMYM.png")));
                ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].OpCorrecta();
                Bits += 5;
                txt.setEditable(false);
                return true;
            } else {
                //Incorrecta
                ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconFalseExtraMYM.png")));
                ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario].OpIncorrecta();
                Bits -= 3;
                return false;
            }
        } else {
            return true;
        }
    }

    private void txtNum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum1KeyTyped
        int key = evt.getKeyChar();

        boolean num = key >= 48 && key <= 57;

        if (!num) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNum1KeyTyped

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        new FrmExtras().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNum2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum2KeyTyped
        int key = evt.getKeyChar();

        boolean num = key >= 48 && key <= 57;

        if (!num) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNum2KeyTyped

    private void txtNum3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum3KeyTyped
        int key = evt.getKeyChar();

        boolean num = key >= 48 && key <= 57;

        if (!num) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNum3KeyTyped

    private int GenerarRandom(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    private void actualizarLabels() {
        n1 = RandomLabel(lbNum1);
        n2 = RandomLabel(lbNum2);
        n3 = RandomLabel(lbNum3);
    }

    private String numToString(int num) {
        String str = Lista.GENERAL.get(num);
        String strNum = String.valueOf(num);
        int cif = 0;
        int numTemp;

        if (intActual == 100) {
            str = Lista.GENERAL.get(-100);
        }

        if (str == null) {
            str = "";
            for (int i = num; i >= 1; i /= 10) {
                cif++;
            } //Cantidad de cifras

            if (num > 1000) {
                numTemp = num / 1000;
                if (numTemp == 1) {
                    str += "mil";
                } else {
                    str += numToString(numTemp) + " mil";
                }
                str += " " + numToString(num - (numTemp * 1000));
            } else {
                numTemp = Integer.parseInt(strNum.substring(0, 1)) * (int) (Math.pow(10, cif - 1)); //1er digito

                //System.out.println("NumTemp: " + numTemp);
                if (num == numTemp) {
                    return "Error";
                }
                str += numToString(numTemp);
                if (num - numTemp > 9 || numTemp > 99) {
                    str += " " + numToString(num - numTemp);
                } else {
                    str += " y " + numToString(num - numTemp);
                }
            }
        }
        contRec++;
        //System.out.println(contRec + "   " + num);
        return str;
    }

    private int RandomLabel(JLabel label) {
        Cifras.clear();
        contRec = 0;
        int cif = 0;
        
        int caso = GenerarRandom(1, 6);
        switch (caso) {
            case 1:
                intActual = GenerarRandom(0, 999);
                break;
            case 2:
                intActual = GenerarRandom(0, 999);
                break;
            case 3:
                intActual = GenerarRandom(0, 9999);
                break;
            default:
                intActual = GenerarRandom(0, 99);
        }
        
        

        for (int i = intActual; i >= 1; i /= 10) {
            cif++;
        } //Cantidad de cifras

        strActual = numToString(intActual).toLowerCase();
        strActual = strActual.replace("uno mil", "un mil");
        strActual = strActual.toUpperCase().charAt(0) + strActual.substring(1, strActual.length());

        label.setText("<html>" + strActual + ":<html>");

        return intActual;
    }

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
            java.util.logging.Logger.getLogger(FrmNumLitToCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNumLitToCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNumLitToCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNumLitToCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNumLitToCifras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel LabelBits;
    private javax.swing.JLabel LabelBits1;
    private javax.swing.JLabel LbAddTextBits;
    private javax.swing.JLabel LbAddTextBits1;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbIconVerify1;
    private javax.swing.JLabel lbIconVerify2;
    private javax.swing.JLabel lbIconVerify3;
    private javax.swing.JLabel lbNum1;
    private javax.swing.JLabel lbNum2;
    private javax.swing.JLabel lbNum3;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtNum3;
    // End of variables declaration//GEN-END:variables
}
