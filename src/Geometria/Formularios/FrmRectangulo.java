package Geometria.Formularios;

import java.awt.Color;
import javax.swing.JOptionPane;
import Geometria.Clases.*;
import Geometria.Formularios.*;
import Principal.*;

public class FrmRectangulo extends javax.swing.JFrame {

    int baseAnt = 0;
    int alturaAnt = 0;

    Punto centro = new Punto();
    Rectangulo rect1 = new Rectangulo();
    Boolean isNum;
    Color bg;

    public FrmRectangulo() {
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
        lbl_base = new javax.swing.JLabel();
        txf_base = new javax.swing.JTextField();
        lbl_altura = new javax.swing.JLabel();
        txf_altura = new javax.swing.JTextField();
        PanelContenedor = new javax.swing.JPanel();
        PanelGrafico = new javax.swing.JPanel();
        lbl_per = new javax.swing.JLabel();
        lbl_area = new javax.swing.JLabel();
        btn_atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelBackground.setBackground(new java.awt.Color(153, 255, 153));
        PanelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_title.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(153, 0, 0));
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("RECTÁNGULO");
        PanelBackground.add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 390, 70));

        lbl_base.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        lbl_base.setForeground(new java.awt.Color(0, 0, 0));
        lbl_base.setText("BASE: ");
        PanelBackground.add(lbl_base, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 120, -1));

        txf_base.setBackground(new java.awt.Color(255, 255, 255));
        txf_base.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_baseActionPerformed(evt);
            }
        });
        PanelBackground.add(txf_base, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 110, 30));

        lbl_altura.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        lbl_altura.setForeground(new java.awt.Color(0, 0, 0));
        lbl_altura.setText("ALTURA: ");
        PanelBackground.add(lbl_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 120, -1));

        txf_altura.setBackground(new java.awt.Color(255, 255, 255));
        txf_altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_alturaActionPerformed(evt);
            }
        });
        PanelBackground.add(txf_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 110, 30));

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

        PanelBackground.add(PanelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 350, 320));

        lbl_per.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        lbl_per.setForeground(new java.awt.Color(204, 0, 0));
        lbl_per.setText("PERÍMETRO: ");
        PanelBackground.add(lbl_per, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        lbl_area.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        lbl_area.setForeground(new java.awt.Color(204, 0, 0));
        lbl_area.setText("ÁREA: ");
        PanelBackground.add(lbl_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        btn_atras.setText("ATRÁS");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        PanelBackground.add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarExtrasTxf() {
        lbl_per.setText("PERÍMETRO: " + rect1.per());
        lbl_area.setText("ÁREA: " + rect1.area());
    }

    private void ValidarYGraficar() {
        Grafico.dibujarRectangulo(PanelGrafico.getGraphics(), centro, baseAnt, alturaAnt, bg);

        centro.x = PanelGrafico.getWidth() / 2;
        centro.y = PanelGrafico.getHeight() / 2;
        centro.x -= rect1.getBase() / 2;
        centro.y -= rect1.getAltura() / 2;

        Grafico.dibujarRectangulo(PanelGrafico.getGraphics(), centro, rect1.getBase(), rect1.getAltura(), Color.black);

        baseAnt = rect1.getBase();
        alturaAnt = rect1.getAltura();

        actualizarExtrasTxf();
    }

    private void txf_alturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_alturaActionPerformed
        try {
            rect1.setAltura(Integer.parseInt(txf_altura.getText()));
            isNum = true;
        } catch (NumberFormatException e) {
            isNum = false;
            JOptionPane.showMessageDialog(null, "Error, ingrese un número");
        }

        if (isNum) {
            if (rect1.getAltura() > 0 && rect1.getAltura() < 300) {
                if (Double.parseDouble(txf_altura.getText()) % 1 == 0) {
                    ValidarYGraficar();
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese una altura entera");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una altura entre 0 y 300.");
            }
        }
    }//GEN-LAST:event_txf_alturaActionPerformed

    private void txf_baseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_baseActionPerformed
        try {
            rect1.setBase(Integer.parseInt(txf_base.getText()));
            isNum = true;
        } catch (NumberFormatException e) {
            isNum = false;
            JOptionPane.showMessageDialog(null, "Error, ingrese un número");
        }

        if (isNum) {
            if (rect1.getBase() > 0 && rect1.getBase() < 300) {
                if (Double.parseDouble(txf_base.getText()) % 1 == 0) {
                    ValidarYGraficar();
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese una base entera");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una base entre 0 y 300.");
            }
        }
    }//GEN-LAST:event_txf_baseActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRectangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRectangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRectangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRectangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmRectangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBackground;
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JPanel PanelGrafico;
    private javax.swing.JButton btn_atras;
    private javax.swing.ButtonGroup group_editable;
    private javax.swing.JLabel lbl_altura;
    private javax.swing.JLabel lbl_area;
    private javax.swing.JLabel lbl_base;
    private javax.swing.JLabel lbl_per;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTextField txf_altura;
    private javax.swing.JTextField txf_base;
    // End of variables declaration//GEN-END:variables
}
