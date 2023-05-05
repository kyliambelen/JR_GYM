package vistas;

import entidades.Supervisor_class;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class Supervisor_facturacion extends javax.swing.JFrame {

    Supervisor_class pass;

    public Supervisor_facturacion() {
        initComponents();
       
    }

    public Supervisor_facturacion(Supervisor_class userr) {

        initComponents();
        this.setTitle("Activar/Desactivar");
        setIconImage(getIconImage());
        this.setLocationRelativeTo(this);
       
        labelEliminar.setText("DESACTIVADO");
        labelAnularTodo.setText("DESACTIVADO");
        this.pass = pass;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelFondoP = new javax.swing.JPanel();
        JPanelBannerP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JTbtnActiva1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        JTbtnActiva2 = new javax.swing.JToggleButton();
        btnSalidaS = new javax.swing.JButton();
        labelEliminar = new javax.swing.JLabel();
        labelAnularTodo = new javax.swing.JLabel();
        labelElimina_todo = new javax.swing.JLabel();
        LabelLogo_jr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 418));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelFondoP.setBackground(new java.awt.Color(0, 0, 51));
        JPanelFondoP.setMinimumSize(new java.awt.Dimension(400, 508));
        JPanelFondoP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelBannerP.setBackground(new java.awt.Color(0, 102, 204));
        JPanelBannerP.setAutoscrolls(true);
        JPanelBannerP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DESACTIVAR / ACTIVAR");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JPanelBannerP.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 340, 50));

        JPanelFondoP.add(JPanelBannerP, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 350, 50));
        JPanelFondoP.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 90, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 204), null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ELIMINAR PAGO ");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, 30));

        JTbtnActiva1.setFont(new java.awt.Font("Arial Black", 1, 8)); // NOI18N
        JTbtnActiva1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onOff1.png"))); // NOI18N
        JTbtnActiva1.setToolTipText("");
        JTbtnActiva1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        JTbtnActiva1.setContentAreaFilled(false);
        JTbtnActiva1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JTbtnActiva1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onOff2.png"))); // NOI18N
        JTbtnActiva1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onOff1.png"))); // NOI18N
        JTbtnActiva1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onOff2.png"))); // NOI18N
        JTbtnActiva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTbtnActiva1ActionPerformed(evt);
            }
        });
        jPanel1.add(JTbtnActiva1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 40, 30));

        jLabel4.setBackground(new java.awt.Color(0, 188, 91));
        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ANULAR FACTURACION");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, 30));

        JTbtnActiva2.setFont(new java.awt.Font("Arial Black", 1, 8)); // NOI18N
        JTbtnActiva2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onOff1.png"))); // NOI18N
        JTbtnActiva2.setToolTipText("");
        JTbtnActiva2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 188, 91)));
        JTbtnActiva2.setContentAreaFilled(false);
        JTbtnActiva2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JTbtnActiva2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onOff1.png"))); // NOI18N
        JTbtnActiva2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onOff2.png"))); // NOI18N
        JTbtnActiva2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTbtnActiva2ActionPerformed(evt);
            }
        });
        jPanel1.add(JTbtnActiva2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 40, 30));

        btnSalidaS.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnSalidaS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/equis.png"))); // NOI18N
        btnSalidaS.setToolTipText("");
        btnSalidaS.setBorderPainted(false);
        btnSalidaS.setContentAreaFilled(false);
        btnSalidaS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/equis2.png"))); // NOI18N
        btnSalidaS.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/equis.png"))); // NOI18N
        btnSalidaS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaSActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalidaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 40, 40));

        labelEliminar.setBackground(new java.awt.Color(224, 230, 248));
        labelEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelEliminar.setForeground(new java.awt.Color(0, 102, 204));
        labelEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEliminar.setOpaque(true);
        jPanel1.add(labelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 100, 30));

        labelAnularTodo.setBackground(new java.awt.Color(224, 230, 248));
        labelAnularTodo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelAnularTodo.setForeground(new java.awt.Color(0, 102, 204));
        labelAnularTodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAnularTodo.setOpaque(true);
        jPanel1.add(labelAnularTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 100, 30));
        jPanel1.add(labelElimina_todo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 80, 30));

        LabelLogo_jr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelLogo_jr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo11.png"))); // NOI18N
        jPanel1.add(LabelLogo_jr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, 140));

        JPanelFondoP.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 70, 350, 300));

        getContentPane().add(JPanelFondoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTbtnActiva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTbtnActiva1ActionPerformed
      
        if (JTbtnActiva1.isSelected()) {
            JTbtnActiva1.setBackground(new Color(0, 0, 254));
            labelEliminar.setText("ACTIVADO");
            Control_pagos.btnEliminarPagoP.setVisible(true);

        } else {
            JTbtnActiva1.setBackground(new Color(0, 0, 0));
            labelEliminar.setText("DESACTIVADO");
            Control_pagos.btnEliminarPagoP.setVisible(false);
        }
    }//GEN-LAST:event_JTbtnActiva1ActionPerformed

    private void JTbtnActiva2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTbtnActiva2ActionPerformed
        
       
        if (JTbtnActiva2.isSelected()) {
            JTbtnActiva2.setBackground(new Color(0, 145, 0));
            labelAnularTodo.setText("ACTIVADO");
            Control_pagos.btnAnularPagosP.setVisible(true);

        } else {
            JTbtnActiva2.setBackground(new Color(0, 0, 0));
            labelAnularTodo.setText("DESACTIVADO");
            Control_pagos.btnAnularPagosP.setVisible(false);
        }
    }//GEN-LAST:event_JTbtnActiva2ActionPerformed

    private void btnSalidaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaSActionPerformed

        Control_pagos.Login_activar = null;
        this.dispose();
    }//GEN-LAST:event_btnSalidaSActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Supervisor_facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supervisor_facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supervisor_facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supervisor_facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supervisor_facturacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelBannerP;
    private javax.swing.JPanel JPanelFondoP;
    private javax.swing.JToggleButton JTbtnActiva1;
    private javax.swing.JToggleButton JTbtnActiva2;
    private javax.swing.JLabel LabelLogo_jr;
    private javax.swing.JButton btnSalidaS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel labelAnularTodo;
    public static javax.swing.JLabel labelElimina_todo;
    public static javax.swing.JLabel labelEliminar;
    // End of variables declaration//GEN-END:variables

    
    /*  ******************************************************************************************************************************************************  */

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
