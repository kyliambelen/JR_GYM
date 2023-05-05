package vistas;

import dao.CalculadorasDao;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Calculadora extends javax.swing.JFrame {

    CalculadorasDao metodox = new CalculadorasDao();

    public Calculadora() {
        initComponents();
          setIconImage(getIconImage());
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtMostrar = new javax.swing.JTextField();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_mas = new javax.swing.JButton();
        btn_menos = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_raiz = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btnalcuadrado = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setFocusCycleRoot(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 50, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMostrar.setEditable(false);
        txtMostrar.setBackground(new java.awt.Color(102, 102, 102));
        txtMostrar.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        txtMostrar.setForeground(new java.awt.Color(255, 255, 255));
        txtMostrar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMostrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtMostrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMostrarKeyPressed(evt);
            }
        });
        jPanel1.add(txtMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 340, 40));

        btn_4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_4.setText("4");
        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_4MouseClicked(evt);
            }
        });
        jPanel1.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 50, 50));

        btn_5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_5.setText("5");
        btn_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_5MouseClicked(evt);
            }
        });
        jPanel1.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 50, 50));

        btn_6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_6.setText("6");
        btn_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_6MouseClicked(evt);
            }
        });
        jPanel1.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 50, 50));

        btn_7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_7.setText("7");
        btn_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_7MouseClicked(evt);
            }
        });
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        btn_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_7KeyPressed(evt);
            }
        });
        jPanel1.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 50, 50));

        btn_8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_8.setText("8");
        btn_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_8MouseClicked(evt);
            }
        });
        jPanel1.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 50, 50));

        btn_9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_9.setText("9");
        btn_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_9MouseClicked(evt);
            }
        });
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 50, 50));

        btn_0.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_0.setText("0");
        btn_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_0MouseClicked(evt);
            }
        });
        jPanel1.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 100, 50));

        btn_mas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_mas.setText("+");
        btn_mas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_masMouseClicked(evt);
            }
        });
        jPanel1.add(btn_mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 50, 50));

        btn_menos.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btn_menos.setText("-");
        btn_menos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_menosMouseClicked(evt);
            }
        });
        jPanel1.add(btn_menos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 50, 50));

        btn_multiplicacion.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btn_multiplicacion.setText("*");
        btn_multiplicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_multiplicacionMouseClicked(evt);
            }
        });
        jPanel1.add(btn_multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 50, 50));

        btn_division.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_division.setText("/");
        btn_division.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_divisionMouseClicked(evt);
            }
        });
        jPanel1.add(btn_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 50, 50));

        btn_raiz.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_raiz.setText("Raiz");
        btn_raiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_raizMouseClicked(evt);
            }
        });
        jPanel1.add(btn_raiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 140, 50));
        btn_raiz.getAccessibleContext().setAccessibleDescription("");

        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimpiar.setText("C");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 140, 50));

        btn_1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_1.setText("1");
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_1MouseClicked(evt);
            }
        });
        jPanel1.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 50, 50));

        btn_2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_2.setText("2");
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_2MouseClicked(evt);
            }
        });
        jPanel1.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 50, 50));

        btn_3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_3.setText("3");
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_3MouseClicked(evt);
            }
        });
        jPanel1.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 50, 50));

        btn_igual.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_igual.setText("=");
        btn_igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_igualMouseClicked(evt);
            }
        });
        jPanel1.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 70, 50));

        btn_punto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_punto.setText(".");
        btn_punto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_puntoMouseClicked(evt);
            }
        });
        jPanel1.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 50, 50));

        btnalcuadrado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnalcuadrado.setText("^2");
        btnalcuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnalcuadradoMouseClicked(evt);
            }
        });
        btnalcuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalcuadradoActionPerformed(evt);
            }
        });
        jPanel1.add(btnalcuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 140, 50));

        btn_salir.setText("EXIT");
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salirMouseClicked(evt);
            }
        });
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 70, 50));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 440, 300));

        jPanel2.setBackground(new java.awt.Color(36, 174, 96));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setDoubleBuffered(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 440, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseClicked

        txtMostrar.setText(metodox.concatenamiento("1"));
    }//GEN-LAST:event_btn_1MouseClicked

    private void btn_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseClicked
        txtMostrar.setText(metodox.concatenamiento("2"));
    }//GEN-LAST:event_btn_2MouseClicked

    private void btn_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseClicked
        txtMostrar.setText(metodox.concatenamiento("3"));
    }//GEN-LAST:event_btn_3MouseClicked

    private void btn_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseClicked
 txtMostrar.setText(metodox.concatenamiento("4"));    }//GEN-LAST:event_btn_4MouseClicked

    private void btn_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MouseClicked
        txtMostrar.setText(metodox.concatenamiento("5"));
    }//GEN-LAST:event_btn_5MouseClicked

    private void btn_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseClicked
        txtMostrar.setText(metodox.concatenamiento("6"));// TODO add your handling code here:
    }//GEN-LAST:event_btn_6MouseClicked

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed


    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MouseClicked
        txtMostrar.setText(metodox.concatenamiento("7"));

    }//GEN-LAST:event_btn_7MouseClicked

    private void btn_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_8MouseClicked
        txtMostrar.setText(metodox.concatenamiento("8")); // TODO add your handling code here:
    }//GEN-LAST:event_btn_8MouseClicked

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_9MouseClicked
        txtMostrar.setText(metodox.concatenamiento("9")); // TODO add your handling code here:
    }//GEN-LAST:event_btn_9MouseClicked

    private void btn_0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_0MouseClicked
        txtMostrar.setText(metodox.concatenamiento("0"));  // TODO add your handling code here:
    }//GEN-LAST:event_btn_0MouseClicked

    private void btn_puntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_puntoMouseClicked
        txtMostrar.setText(metodox.concatenamiento(".")); // TODO add your handling code here:
    }//GEN-LAST:event_btn_puntoMouseClicked

    private void btn_igualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_igualMouseClicked
        txtMostrar.setText("" + metodox.resultado(txtMostrar.getText()));
    }//GEN-LAST:event_btn_igualMouseClicked

    private void btn_masMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_masMouseClicked
        metodox.suma(txtMostrar.getText());
    }//GEN-LAST:event_btn_masMouseClicked

    private void btn_menosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menosMouseClicked
        metodox.resta(txtMostrar.getText());
    }//GEN-LAST:event_btn_menosMouseClicked

    private void btn_multiplicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_multiplicacionMouseClicked
        metodox.multiplicacion(txtMostrar.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_btn_multiplicacionMouseClicked

    private void btn_divisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_divisionMouseClicked
        metodox.division(txtMostrar.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_btn_divisionMouseClicked

    private void btn_raizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_raizMouseClicked
        metodox.raiz(txtMostrar.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_btn_raizMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        metodox.alcuadrado(txtMostrar.getText());

    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtMostrar.setText("0");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnalcuadradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnalcuadradoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnalcuadradoMouseClicked

    private void btnalcuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalcuadradoActionPerformed
        metodox.alcuadrado(txtMostrar.getText());
    }//GEN-LAST:event_btnalcuadradoActionPerformed

    private void btn_7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_7KeyPressed

    }//GEN-LAST:event_btn_7KeyPressed

    private void txtMostrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMostrarKeyPressed


    }//GEN-LAST:event_txtMostrarKeyPressed

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirMouseClicked

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed

        Control_pagos.ingreCalculadora = null;

        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    public static void main(String args[]) {
        /* Set the windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_mas;
    private javax.swing.JButton btn_menos;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_raiz;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btnalcuadrado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtMostrar;
    // End of variables declaration//GEN-END:variables

  /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    // FUNCION  PARA  MOSTRAR  LAS  IMAGENES  EN  EL  TITULO  DE  LAS  VENTANAS
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logoVentana.png"));
        return retValue;
    }

    /* FUNCION  PARA  COLOCAR  ICONO  A LAS  VENTANAS DE DIALOGOS  DE LOS JOPCIONPANEL*/
    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

}
