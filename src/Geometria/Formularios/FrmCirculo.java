package Geometria.Formularios;

import java.awt.Color;
import javax.swing.JOptionPane;
import Geometria.Clases.*;
import Geometria.Formularios.*;
import Principal.*;

public class FrmCirculo extends javax.swing.JFrame {

    int radAnt = 0;

    Punto centro = new Punto();
    Circulo circ1 = new Circulo();
    Boolean isNum;
    Color bg;

    public FrmCirculo() {
        initComponents();
        setLocationRelativeTo(null);
        centro.x = PanelGrafico.getWidth() / 2;
        centro.y = PanelGrafico.getHeight() / 2;
        bg = PanelGrafico.getBackground();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group_editable = new javax.swing.ButtonGroup();
        PanelBackground = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_radio = new javax.swing.JLabel();
        txf_radio = new javax.swing.JTextField();
        PanelContenedor = new javax.swing.JPanel();
        PanelGrafico = new javax.swing.JPanel();
        lbl_per = new javax.swing.JLabel();
        lbl_area = new javax.swing.JLabel();
        lbl_diam = new javax.swing.JLabel();
        btn_atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelBackground.setBackground(new java.awt.Color(255, 204, 204));
        PanelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_title.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(153, 0, 0));
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("CÍRCULO");
        PanelBackground.add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 390, 70));

        lbl_radio.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        lbl_radio.setForeground(new java.awt.Color(0, 0, 0));
        lbl_radio.setText("RADIO: ");
        PanelBackground.add(lbl_radio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 120, -1));

        txf_radio.setBackground(new java.awt.Color(255, 255, 255));
        txf_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_radioActionPerformed(evt);
            }
        });
        PanelBackground.add(txf_radio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 110, 30));

        PanelContenedor.setBackground(new java.awt.Color(102, 102, 255));

        PanelGrafico.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout PanelGraficoLayout = new javax.swing.GroupLayout(PanelGrafico);
        PanelGrafico.setLayout(PanelGraficoLayout);
        PanelGraficoLayout.setHorizontalGroup(
            PanelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        PanelGraficoLayout.setVerticalGroup(
            PanelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelContenedorLayout = new javax.swing.GroupLayout(PanelContenedor);
        PanelContenedor.setLayout(PanelContenedorLayout);
        PanelContenedorLayout.setHorizontalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(PanelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        PanelContenedorLayout.setVerticalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelBackground.add(PanelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 350, 320));

        lbl_per.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        lbl_per.setForeground(new java.awt.Color(204, 0, 0));
        lbl_per.setText("PERÍMETRO: ");
        PanelBackground.add(lbl_per, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        lbl_area.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        lbl_area.setForeground(new java.awt.Color(204, 0, 0));
        lbl_area.setText("ÁREA: ");
        PanelBackground.add(lbl_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        lbl_diam.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        lbl_diam.setForeground(new java.awt.Color(204, 0, 0));
        lbl_diam.setText("DIÁMETRO: ");
        PanelBackground.add(lbl_diam, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        btn_atras.setText("ATRÁS");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        PanelBackground.add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarExtrasTxf() {
        lbl_per.setText("PERÍMETRO: " + circ1.per());
        lbl_area.setText("ÁREA: " + circ1.area());
        lbl_diam.setText("DIÁMETRO: " + circ1.diametro());
    }

    private void ValidarYGraficar() {
        Grafico.dibujarCirculo(PanelGrafico.getGraphics(), centro, radAnt, bg);

        centro.x = PanelGrafico.getWidth() / 2;
        centro.y = PanelGrafico.getHeight() / 2;
        centro.x -= circ1.getRadio() / 2;
        centro.y -= circ1.getRadio() / 2;

        Grafico.dibujarCirculo(PanelGrafico.getGraphics(), centro, (int) circ1.getRadio(), Color.black);

        radAnt = (int) circ1.getRadio();

        actualizarExtrasTxf();
    }

    private void txf_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_radioActionPerformed
        try {
            circ1.setRadio(Double.parseDouble(txf_radio.getText()));
            isNum = true;
        } catch (NumberFormatException e) {
            isNum = false;
            JOptionPane.showMessageDialog(null, "Error, ingrese un número");
        }

        if (isNum) {
            if (circ1.getRadio() > 0 && circ1.getRadio() < 300) {
                if (circ1.getRadio() % 1 == 0) {
                    ValidarYGraficar();
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un radio entero");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un radio entre 0 y 300.");
            }
        }
    }//GEN-LAST:event_txf_radioActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        this.setVisible(false);
        new FrmGeometria().setVisible(true);
    }//GEN-LAST:event_btn_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FrmCirculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBackground;
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JPanel PanelGrafico;
    private javax.swing.JButton btn_atras;
    private javax.swing.ButtonGroup group_editable;
    private javax.swing.JLabel lbl_area;
    private javax.swing.JLabel lbl_diam;
    private javax.swing.JLabel lbl_per;
    private javax.swing.JLabel lbl_radio;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTextField txf_radio;
    // End of variables declaration//GEN-END:variables
}
