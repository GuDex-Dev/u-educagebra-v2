package Geometria.Formularios;

import java.awt.Color;
import javax.swing.JOptionPane;
import Geometria.Clases.*;
import Geometria.Formularios.*;
import Principal.*;

public class FrmTriangulo extends javax.swing.JFrame {
    
    Punto p0 = new Punto();
    Punto p1 = new Punto();
    Punto p2 = new Punto();
    Triangulo tri1 = new Triangulo();
    
    int i = 0;
    
    Boolean isNum;
    int scale = 1;
    
    Color bg;
    
    public FrmTriangulo() {
        initComponents();
        setLocationRelativeTo(null);
        initSlider();
        p0.definirCoord(0, PanelGrafico.getHeight() - 1);
        bg = PanelGrafico.getBackground();
        group_editable.add(check_lado2);
        group_editable.add(check_ang2);
        group_editable.add(check_lado3);
        group_editable.add(check_ang3);
        check_lado2.setEnabled(false);
        check_ang2.setEnabled(false);
        check_lado3.setEnabled(false);
        check_ang3.setEnabled(false);
        actualizarTxf();
    }
    
    private void initSlider() {
        //sld_scale.setOrientation(1);
        sld_scale.setMinimum(-50);
        sld_scale.setMaximum(50);
        sld_scale.setMajorTickSpacing(10);
        sld_scale.setPaintTicks(true);
        sld_scale.setValue(-50);
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
        lbl_lado1 = new javax.swing.JLabel();
        txf_lado1 = new javax.swing.JTextField();
        lbl_ang1 = new javax.swing.JLabel();
        txf_ang1 = new javax.swing.JTextField();
        lbl_lado2 = new javax.swing.JLabel();
        txf_lado2 = new javax.swing.JTextField();
        check_lado2 = new javax.swing.JCheckBox();
        lbl_lado2min = new javax.swing.JLabel();
        lbl_ang2 = new javax.swing.JLabel();
        txf_ang2 = new javax.swing.JTextField();
        check_ang2 = new javax.swing.JCheckBox();
        lbl_lado3 = new javax.swing.JLabel();
        txf_lado3 = new javax.swing.JTextField();
        check_lado3 = new javax.swing.JCheckBox();
        lbl_ang3 = new javax.swing.JLabel();
        txf_ang3 = new javax.swing.JTextField();
        check_ang3 = new javax.swing.JCheckBox();
        PanelContenedor = new javax.swing.JPanel();
        PanelGrafico = new javax.swing.JPanel();
        sld_scale = new javax.swing.JSlider();
        lbl_slider = new javax.swing.JLabel();
        lbl_per = new javax.swing.JLabel();
        lbl_area = new javax.swing.JLabel();
        lbl_altura = new javax.swing.JLabel();
        btn_atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelBackground.setBackground(new java.awt.Color(255, 204, 51));
        PanelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_title.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(153, 0, 0));
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("TRIÁNGULO");
        PanelBackground.add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 550, 70));

        lbl_lado1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_lado1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_lado1.setText("LADO 1: ");
        PanelBackground.add(lbl_lado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, -1));

        txf_lado1.setBackground(new java.awt.Color(255, 255, 255));
        txf_lado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_lado1ActionPerformed(evt);
            }
        });
        PanelBackground.add(txf_lado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 130, 30));

        lbl_ang1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_ang1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_ang1.setText("ÁNGULO 1: ");
        PanelBackground.add(lbl_ang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 140, -1));

        txf_ang1.setEditable(false);
        txf_ang1.setBackground(new java.awt.Color(255, 255, 255));
        txf_ang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_ang1ActionPerformed(evt);
            }
        });
        PanelBackground.add(txf_ang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 130, 30));

        lbl_lado2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_lado2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_lado2.setText("LADO 2: ");
        PanelBackground.add(lbl_lado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 140, -1));

        txf_lado2.setEditable(false);
        txf_lado2.setBackground(new java.awt.Color(255, 255, 255));
        txf_lado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_lado2ActionPerformed(evt);
            }
        });
        PanelBackground.add(txf_lado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 130, 30));

        check_lado2.setBackground(new java.awt.Color(153, 153, 255));
        check_lado2.setEnabled(false);
        check_lado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_lado2ActionPerformed(evt);
            }
        });
        PanelBackground.add(check_lado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, 30));

        lbl_lado2min.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_lado2min.setForeground(new java.awt.Color(255, 0, 51));
        lbl_lado2min.setText(" ");
        PanelBackground.add(lbl_lado2min, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 190, -1));

        lbl_ang2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_ang2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_ang2.setText("ÁNGULO 2: ");
        PanelBackground.add(lbl_ang2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 140, -1));

        txf_ang2.setEditable(false);
        txf_ang2.setBackground(new java.awt.Color(255, 255, 255));
        txf_ang2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_ang2ActionPerformed(evt);
            }
        });
        PanelBackground.add(txf_ang2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 130, 30));

        check_ang2.setBackground(new java.awt.Color(153, 153, 255));
        check_ang2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_ang2ActionPerformed(evt);
            }
        });
        PanelBackground.add(check_ang2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, 30));

        lbl_lado3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_lado3.setForeground(new java.awt.Color(0, 0, 0));
        lbl_lado3.setText("LADO 3: ");
        PanelBackground.add(lbl_lado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 140, -1));

        txf_lado3.setEditable(false);
        txf_lado3.setBackground(new java.awt.Color(255, 255, 255));
        txf_lado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_lado3ActionPerformed(evt);
            }
        });
        PanelBackground.add(txf_lado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 130, 30));

        check_lado3.setBackground(new java.awt.Color(153, 153, 255));
        check_lado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_lado3ActionPerformed(evt);
            }
        });
        PanelBackground.add(check_lado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, 30));

        lbl_ang3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_ang3.setForeground(new java.awt.Color(0, 0, 0));
        lbl_ang3.setText("ÁNGULO 3: ");
        PanelBackground.add(lbl_ang3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 140, -1));

        txf_ang3.setEditable(false);
        txf_ang3.setBackground(new java.awt.Color(255, 255, 255));
        txf_ang3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_ang3ActionPerformed(evt);
            }
        });
        PanelBackground.add(txf_ang3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 130, 30));

        check_ang3.setBackground(new java.awt.Color(153, 153, 255));
        check_ang3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_ang3ActionPerformed(evt);
            }
        });
        PanelBackground.add(check_ang3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, 30));

        PanelContenedor.setBackground(new java.awt.Color(102, 102, 255));

        PanelGrafico.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout PanelGraficoLayout = new javax.swing.GroupLayout(PanelGrafico);
        PanelGrafico.setLayout(PanelGraficoLayout);
        PanelGraficoLayout.setHorizontalGroup(
            PanelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        PanelGraficoLayout.setVerticalGroup(
            PanelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelContenedorLayout = new javax.swing.GroupLayout(PanelContenedor);
        PanelContenedor.setLayout(PanelContenedorLayout);
        PanelContenedorLayout.setHorizontalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(PanelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        PanelContenedorLayout.setVerticalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(PanelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelBackground.add(PanelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 450, 300));

        sld_scale.setOrientation(javax.swing.JSlider.VERTICAL);
        sld_scale.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sld_scaleStateChanged(evt);
            }
        });
        PanelBackground.add(sld_scale, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 30, 300));

        lbl_slider.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_slider.setForeground(new java.awt.Color(255, 102, 102));
        lbl_slider.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_slider.setText("jLabel1");
        PanelBackground.add(lbl_slider, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 306, 80, 30));

        lbl_per.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_per.setForeground(new java.awt.Color(204, 0, 0));
        lbl_per.setText("PERÍMETRO: ");
        PanelBackground.add(lbl_per, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        lbl_area.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_area.setForeground(new java.awt.Color(204, 0, 0));
        lbl_area.setText("ÁREA: ");
        PanelBackground.add(lbl_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        lbl_altura.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_altura.setForeground(new java.awt.Color(204, 0, 0));
        lbl_altura.setText("ALTURA: ");
        PanelBackground.add(lbl_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        btn_atras.setText("ATRÁS");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        PanelBackground.add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValidarYGraficar() {
        
        Grafico.dibujarLinea(PanelGrafico.getGraphics(), p0, p1, bg);
        Grafico.dibujarLinea(PanelGrafico.getGraphics(), p1, p2, bg);
        Grafico.dibujarLinea(PanelGrafico.getGraphics(), p2, p0, bg);
        
        if (tri1.getLado1() != 0) {
            p1.definirCoord((int) (tri1.getLado1() * scale), p0.y);
            if (tri1.getAng1() != 0) {
                p1.x = (int) (tri1.getLado1() * scale * Math.cos(Math.toRadians(tri1.getAng1())));
                p1.y = (int) (p0.y - (tri1.getLado1() * scale * Math.sin(Math.toRadians(tri1.getAng1()))));
            }
            Grafico.dibujarLinea(PanelGrafico.getGraphics(), p0, p1, Color.black);
            
            lbl_lado2min.setText("Mín val: " + Math.ceil(Math.ceil(p0.y - p1.y) / scale));
        }
        
        if (tri1.getLado2() != 0 && check_lado2.isSelected()) {
            tri1.setAng3(Math.toDegrees(Math.asin((p0.y - p1.y) / (tri1.getLado2() * scale))));
            
            p2.x = (int) (p1.x + (p0.y - p1.y) / Math.tan(Math.toRadians(tri1.getAng3())));
            p2.y = p0.y;
            Grafico.dibujarLinea(PanelGrafico.getGraphics(), p1, p2, Color.black);
            Grafico.dibujarLinea(PanelGrafico.getGraphics(), p0, p2, Color.black);
            
            tri1.setAng2(180 - (tri1.getAng1() + tri1.getAng3()));
            tri1.setLado3(p0.dist(p2) / scale);
        }
        
        if (tri1.getAng2() != 0 && check_ang2.isSelected()) {
            tri1.setAng3(180 - (tri1.getAng1() + tri1.getAng2()));
            p2.x = (int) (p1.x + (p0.y - p1.y) / Math.tan(Math.toRadians(tri1.getAng3())));
            p2.y = p0.y;
            Grafico.dibujarLinea(PanelGrafico.getGraphics(), p1, p2, Color.black);
            Grafico.dibujarLinea(PanelGrafico.getGraphics(), p0, p2, Color.black);
            
            tri1.setLado2(p1.dist(p2) / scale);
            tri1.setLado3(p0.dist(p2) / scale);
        }
        
        if (tri1.getLado3() != 0 && check_lado3.isSelected()) {
            p2.x = (int) (tri1.getLado3() * scale);
            p2.y = p0.y;
            Grafico.dibujarLinea(PanelGrafico.getGraphics(), p1, p2, Color.black);
            Grafico.dibujarLinea(PanelGrafico.getGraphics(), p0, p2, Color.black);
            
            tri1.setLado2(p1.dist(p2) / scale);
            tri1.setAng3(Math.toDegrees(Math.asin((p0.y - p1.y) / (tri1.getLado2() * scale))));
            tri1.setAng2(180 - (tri1.getAng1() + tri1.getAng3()));
        }
        
        if (tri1.getAng3() != 0 && check_ang3.isSelected()) {
            p2.x = (int) (p1.x + (p0.y - p1.y) / Math.tan(Math.toRadians(tri1.getAng3())));
            p2.y = p0.y;
            Grafico.dibujarLinea(PanelGrafico.getGraphics(), p1, p2, Color.black);
            Grafico.dibujarLinea(PanelGrafico.getGraphics(), p0, p2, Color.black);
            
            tri1.setLado2(p1.dist(p2) / scale);
            tri1.setAng2(180 - (tri1.getAng1() + tri1.getAng3()));
            tri1.setLado3(p0.dist(p2) / scale);
        }
        
        actualizarTxf();
        actualizarExtrasTxf();
    }
    
    private void actualizarExtrasTxf() {
        if (tri1.getLado1() == 0) {
            return;
        }
        
        if (tri1.getLado2() == 0) {
            return;
        }
        
        if (tri1.getLado3() == 0) {
            return;
        }
        
        lbl_per.setText("PERÍMETRO: " + tri1.per());
        lbl_area.setText("ÁREA: " + tri1.area());
        lbl_altura.setText("ALTURA: " + tri1.altura());
    }
    
    private void actualizarTxf() {
        txf_lado1.setText(Double.toString(tri1.getLado1()));
        txf_ang1.setText(Double.toString(tri1.getAng1()));
        txf_lado2.setText(Double.toString(tri1.getLado2()));
        txf_ang2.setText(Double.toString(tri1.getAng2()));
        txf_lado3.setText(Double.toString(tri1.getLado3()));
        txf_ang3.setText(Double.toString(tri1.getAng3()));
    }

    private void txf_lado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_lado1ActionPerformed
        try {
            tri1.setLado1(Double.parseDouble(txf_lado1.getText()));
            isNum = true;
        } catch (NumberFormatException e) {
            isNum = false;
            JOptionPane.showMessageDialog(null, "Error, ingrese un número");
        }
        
        if (isNum) {
            if (tri1.getLado1() > 0 && tri1.getLado1() < 400) {
                ValidarYGraficar();
                txf_ang1.setEditable(true);
            } else {
                tri1.setLado1(0);
                JOptionPane.showMessageDialog(null, "Ingrese un lado entre 0 y 400.");
                tri1.limpiarEdit();
                actualizarTxf();
                ValidarYGraficar();
            }
            
        }
    }//GEN-LAST:event_txf_lado1ActionPerformed

    private void txf_ang3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_ang3ActionPerformed
        try {
            tri1.setAng3(Double.parseDouble(txf_ang3.getText()));
            isNum = true;
        } catch (NumberFormatException e) {
            isNum = false;
            JOptionPane.showMessageDialog(null, "Error, ingrese un número");
        }
        
        if (isNum) {
            if (tri1.getAng3() > 0 && ((tri1.getAng1() + tri1.getAng3()) < 180)) {
                tri1.limpiarEdit();
                tri1.setAng3(Double.parseDouble(txf_ang3.getText()));
                ValidarYGraficar();
            } else {
                tri1.setAng3(0);
                JOptionPane.showMessageDialog(null, "Ingrese un ángulo entre 0 y " + (180 - tri1.getAng1()));
                tri1.limpiarEdit();
                actualizarTxf();
                ValidarYGraficar();
            }
        }
    }//GEN-LAST:event_txf_ang3ActionPerformed

    private void txf_lado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_lado3ActionPerformed
        try {
            tri1.setLado3(Double.parseDouble(txf_lado3.getText()));
            isNum = true;
        } catch (NumberFormatException e) {
            isNum = false;
            JOptionPane.showMessageDialog(null, "Error, ingrese un número");
        }
        
        if (isNum) {
            if (tri1.getLado3() > 0 && tri1.getLado3() < 400) {
                tri1.limpiarEdit();
                tri1.setLado3(Double.parseDouble(txf_lado3.getText()));
                ValidarYGraficar();
            } else {
                tri1.setLado3(0);
                JOptionPane.showMessageDialog(null, "Ingrese un lado entre 0 y 400.");
                tri1.limpiarEdit();
                actualizarTxf();
                ValidarYGraficar();
            }
        }
    }//GEN-LAST:event_txf_lado3ActionPerformed

    private void txf_ang2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_ang2ActionPerformed
        try {
            tri1.setAng2(Double.parseDouble(txf_ang2.getText()));
            isNum = true;
        } catch (NumberFormatException e) {
            isNum = false;
            JOptionPane.showMessageDialog(null, "Error, ingrese un número");
        }
        
        if (isNum) {
            if (tri1.getAng2() > 0 && ((tri1.getAng1() + tri1.getAng2()) < 180)) {
                tri1.limpiarEdit();
                tri1.setAng2(Double.parseDouble(txf_ang2.getText()));
                ValidarYGraficar();
            } else {
                tri1.setAng2(0);
                JOptionPane.showMessageDialog(null, "Ingrese un ángulo entre 0 y " + (180 - tri1.getAng1()));
                tri1.limpiarEdit();
                actualizarTxf();
                ValidarYGraficar();
            }
        }
    }//GEN-LAST:event_txf_ang2ActionPerformed

    private void txf_lado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_lado2ActionPerformed
        try {
            tri1.setLado2(Double.parseDouble(txf_lado2.getText()));
            isNum = true;
        } catch (NumberFormatException e) {
            isNum = false;
            JOptionPane.showMessageDialog(null, "Error, ingrese un número");
        }
        
        if (isNum) {
            if (tri1.getLado2() >= Math.ceil(Math.ceil(p0.y - p1.y) / scale) && tri1.getLado2() < 400) {
                tri1.limpiarEdit();
                tri1.setLado2(Double.parseDouble(txf_lado2.getText()));
                ValidarYGraficar();
            } else {
                tri1.setLado2(0);
                JOptionPane.showMessageDialog(null, "Ingrese un lado entre " + Math.ceil(Math.ceil(p0.y - p1.y) / scale) + " y 400.");
                tri1.limpiarEdit();
                actualizarTxf();
                ValidarYGraficar();
            }
        }
    }//GEN-LAST:event_txf_lado2ActionPerformed

    private void txf_ang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_ang1ActionPerformed
        try {
            tri1.setAng1(Double.parseDouble(txf_ang1.getText()));
            isNum = true;
        } catch (NumberFormatException e) {
            isNum = false;
            JOptionPane.showMessageDialog(null, "Error, ingrese un número");
        }
        
        if (isNum) {
            if (tri1.getAng1() > 0 && tri1.getAng1() < 180) {
                ValidarYGraficar();
                check_lado2.setEnabled(true);
                check_ang2.setEnabled(true);
                check_lado3.setEnabled(true);
                check_ang3.setEnabled(true);
            } else {
                tri1.setAng1(0);
                JOptionPane.showMessageDialog(null, "Ingrese un ángulo entre 0 y 180.");
                tri1.limpiarEdit();
                actualizarTxf();
                ValidarYGraficar();
            }
        }
    }//GEN-LAST:event_txf_ang1ActionPerformed
    
    private void actEditable() {
        
        if (check_lado2.isSelected()) {
            txf_lado2.setEditable(true);
        } else {
            txf_lado2.setEditable(false);
        }
        
        if (check_ang2.isSelected()) {
            txf_ang2.setEditable(true);
        } else {
            txf_ang2.setEditable(false);
        }
        
        if (check_lado3.isSelected()) {
            txf_lado3.setEditable(true);
        } else {
            txf_lado3.setEditable(false);
        }
        
        if (check_ang3.isSelected()) {
            txf_ang3.setEditable(true);
        } else {
            txf_ang3.setEditable(false);
        }
    }

    private void check_lado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_lado2ActionPerformed
        actEditable();
    }//GEN-LAST:event_check_lado2ActionPerformed

    private void check_ang2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_ang2ActionPerformed
        actEditable();
    }//GEN-LAST:event_check_ang2ActionPerformed

    private void check_lado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_lado3ActionPerformed
        actEditable();
    }//GEN-LAST:event_check_lado3ActionPerformed

    private void check_ang3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_ang3ActionPerformed
        actEditable();
    }//GEN-LAST:event_check_ang3ActionPerformed

    private void sld_scaleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sld_scaleStateChanged
        scale = sld_scale.getValue() + 51;
        lbl_slider.setText("" + scale);
        ValidarYGraficar();
    }//GEN-LAST:event_sld_scaleStateChanged

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
            java.util.logging.Logger.getLogger(FrmTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBackground;
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JPanel PanelGrafico;
    private javax.swing.JButton btn_atras;
    private javax.swing.JCheckBox check_ang2;
    private javax.swing.JCheckBox check_ang3;
    private javax.swing.JCheckBox check_lado2;
    private javax.swing.JCheckBox check_lado3;
    private javax.swing.ButtonGroup group_editable;
    private javax.swing.JLabel lbl_altura;
    private javax.swing.JLabel lbl_ang1;
    private javax.swing.JLabel lbl_ang2;
    private javax.swing.JLabel lbl_ang3;
    private javax.swing.JLabel lbl_area;
    private javax.swing.JLabel lbl_lado1;
    private javax.swing.JLabel lbl_lado2;
    private javax.swing.JLabel lbl_lado2min;
    private javax.swing.JLabel lbl_lado3;
    private javax.swing.JLabel lbl_per;
    private javax.swing.JLabel lbl_slider;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JSlider sld_scale;
    private javax.swing.JTextField txf_ang1;
    private javax.swing.JTextField txf_ang2;
    private javax.swing.JTextField txf_ang3;
    private javax.swing.JTextField txf_lado1;
    private javax.swing.JTextField txf_lado2;
    private javax.swing.JTextField txf_lado3;
    // End of variables declaration//GEN-END:variables
}
