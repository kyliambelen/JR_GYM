package vistas;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
import entidades.Supervisor_class;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class Supervisor extends javax.swing.JFrame {

    UIManager UI;
    Supervisor_class pass;

    public Supervisor() {
        initComponents();
        this.setTitle("Activar/Desactivar");
        setIconImage(getIconImage());
    }

    public Supervisor(Supervisor_class userr) {

        initComponents();
        this.setTitle("Activar/Desactivar");
        setIconImage(getIconImage());
        this.setLocationRelativeTo(this);
        labelEliminar.setText("DESACTIVADO");
        labelElimina_todo.setText("DESACTIVADO");
        LabelCobrar.setText("DESACTIVADO");
        labelPago_pendiente.setText("ACTIVADO");
        this.pass = pass;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelFondoP = new javax.swing.JPanel();
        JPanelBannerP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JTbtnActiva1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        JTbtnActiva2 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        JTbtnActiva3 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        JTbtnActiva4 = new javax.swing.JToggleButton();
        labelPago_pendiente = new javax.swing.JLabel();
        labelEliminar = new javax.swing.JLabel();
        LabelCobrar = new javax.swing.JLabel();
        labelElimina_todo = new javax.swing.JLabel();
        btnSalidaS = new javax.swing.JButton();
        LabelLogo_jr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(370, 460));
        setResizable(false);

        JPanelFondoP.setBackground(new java.awt.Color(0, 0, 51));
        JPanelFondoP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelBannerP.setBackground(new java.awt.Color(0, 102, 204));
        JPanelBannerP.setAutoscrolls(true);
        JPanelBannerP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DESACTIVAR / ACTIVAR");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JPanelBannerP.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, -2, 330, 50));

        JPanelFondoP.add(JPanelBannerP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 330, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 204), null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(153, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ELIMINAR ");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, 30));

        JTbtnActiva1.setFont(new java.awt.Font("Arial Black", 1, 8)); // NOI18N
        JTbtnActiva1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onOff1.png"))); // NOI18N
        JTbtnActiva1.setToolTipText("");
        JTbtnActiva1.setBorderPainted(false);
        JTbtnActiva1.setContentAreaFilled(false);
        JTbtnActiva1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JTbtnActiva1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onOff2.png"))); // NOI18N
        JTbtnActiva1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onOff2.png"))); // NOI18N
        JTbtnActiva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTbtnActiva1ActionPerformed(evt);
            }
        });
        jPanel1.add(JTbtnActiva1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 40, 30));

        jLabel4.setBackground(new java.awt.Color(255, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ELIMINAR TODO ");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, 30));

        JTbtnActiva2.setFont(new java.awt.Font("Arial Black", 1, 8)); // NOI18N
        JTbtnActiva2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onOff1.png"))); // NOI18N
        JTbtnActiva2.setToolTipText("");
        JTbtnActiva2.setBorderPainted(false);
        JTbtnActiva2.setContentAreaFilled(false);
        JTbtnActiva2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JTbtnActiva2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onOff2.png"))); // NOI18N
        JTbtnActiva2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onOff2.png"))); // NOI18N
        JTbtnActiva2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTbtnActiva2ActionPerformed(evt);
            }
        });
        jPanel1.add(JTbtnActiva2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 40, 30));

        jLabel3.setBackground(new java.awt.Color(0, 204, 0));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("COBRAR");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 110, 30));

        JTbtnActiva3.setFont(new java.awt.Font("Arial Black", 1, 8)); // NOI18N
        JTbtnActiva3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onOff1.png"))); // NOI18N
        JTbtnActiva3.setToolTipText("");
        JTbtnActiva3.setBorderPainted(false);
        JTbtnActiva3.setContentAreaFilled(false);
        JTbtnActiva3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JTbtnActiva3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onOff2.png"))); // NOI18N
        JTbtnActiva3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onOff2.png"))); // NOI18N
        JTbtnActiva3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTbtnActiva3ActionPerformed(evt);
            }
        });
        jPanel1.add(JTbtnActiva3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 40, 30));

        jLabel6.setBackground(new java.awt.Color(0, 102, 153));
        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PAGO PENDIENTE");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 110, 30));

        JTbtnActiva4.setFont(new java.awt.Font("Arial Black", 1, 8)); // NOI18N
        JTbtnActiva4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onOff1.png"))); // NOI18N
        JTbtnActiva4.setSelected(true);
        JTbtnActiva4.setToolTipText("");
        JTbtnActiva4.setBorderPainted(false);
        JTbtnActiva4.setContentAreaFilled(false);
        JTbtnActiva4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JTbtnActiva4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onOff2.png"))); // NOI18N
        JTbtnActiva4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onOff2.png"))); // NOI18N
        JTbtnActiva4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTbtnActiva4ActionPerformed(evt);
            }
        });
        jPanel1.add(JTbtnActiva4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 40, 30));

        labelPago_pendiente.setBackground(new java.awt.Color(224, 230, 248));
        labelPago_pendiente.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        labelPago_pendiente.setOpaque(true);
        jPanel1.add(labelPago_pendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 130, 30));

        labelEliminar.setBackground(new java.awt.Color(224, 230, 248));
        labelEliminar.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        labelEliminar.setOpaque(true);
        jPanel1.add(labelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 130, 30));

        LabelCobrar.setBackground(new java.awt.Color(224, 230, 248));
        LabelCobrar.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        LabelCobrar.setOpaque(true);
        jPanel1.add(LabelCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 130, 30));

        labelElimina_todo.setBackground(new java.awt.Color(224, 230, 248));
        labelElimina_todo.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        labelElimina_todo.setOpaque(true);
        jPanel1.add(labelElimina_todo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 130, 30));

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
        jPanel1.add(btnSalidaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 40, 40));

        LabelLogo_jr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelLogo_jr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo11.png"))); // NOI18N
        jPanel1.add(LabelLogo_jr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 140));

        JPanelFondoP.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 330, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelFondoP, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelFondoP, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTbtnActiva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTbtnActiva1ActionPerformed
         
        if (JTbtnActiva1.isSelected()) {
            JTbtnActiva1.setBackground(new Color(0, 0, 254));
            labelEliminar.setText("ACTIVADO");
            Operaciones_Asistencia.btnEliminar.setEnabled(true);

        } else {
            JTbtnActiva1.setBackground(new Color(0, 0, 0));
            labelEliminar.setText("DESACTIVADO");
            Operaciones_Asistencia.btnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_JTbtnActiva1ActionPerformed

    private void JTbtnActiva2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTbtnActiva2ActionPerformed
        
        
        if (JTbtnActiva2.isSelected()) {
            JTbtnActiva2.setBackground(new Color(0, 145, 0));
            labelElimina_todo.setText("ACTIVADO");
            Operaciones_Asistencia.btnEliminar_todo.setEnabled(true);

        } else {
            JTbtnActiva2.setBackground(new Color(0, 0, 0));
            labelElimina_todo.setText("DESACTIVADO");
            Operaciones_Asistencia.btnEliminar_todo.setEnabled(false);
        }
    }//GEN-LAST:event_JTbtnActiva2ActionPerformed

    private void JTbtnActiva3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTbtnActiva3ActionPerformed
        
       
        if (JTbtnActiva3.isSelected()) {
            JTbtnActiva3.setBackground(new Color(253, 34, 11));
            LabelCobrar.setText("ACTIVADO");
            Operaciones_Asistencia.btnPagar.setEnabled(true);

        } else {
            JTbtnActiva3.setBackground(new Color(0, 0, 0));
            LabelCobrar.setText("DESACTIVADO");
            Operaciones_Asistencia.btnPagar.setEnabled(false);

    }//GEN-LAST:event_JTbtnActiva3ActionPerformed
    }
    private void JTbtnActiva4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTbtnActiva4ActionPerformed
        
        
        if (JTbtnActiva4.isSelected()) {

            JTbtnActiva4.setBackground(new Color(253, 34, 11));
            labelPago_pendiente.setText("ACTIVADO");
            Operaciones_Asistencia.btnVerPago_pendiente.setEnabled(true);

        } else {
            JTbtnActiva4.setBackground(new Color(0, 0, 0));
            labelPago_pendiente.setText("DESACTIVADO");
            Operaciones_Asistencia.btnVerPago_pendiente.setEnabled(false);
        }
    }//GEN-LAST:event_JTbtnActiva4ActionPerformed

    private void btnSalidaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaSActionPerformed

        Operaciones_Asistencia.ingreLogin_activar = null;
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
            java.util.logging.Logger.getLogger(Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Supervisor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelBannerP;
    private javax.swing.JPanel JPanelFondoP;
    private javax.swing.JToggleButton JTbtnActiva1;
    private javax.swing.JToggleButton JTbtnActiva2;
    private javax.swing.JToggleButton JTbtnActiva3;
    private javax.swing.JToggleButton JTbtnActiva4;
    public static javax.swing.JLabel LabelCobrar;
    private javax.swing.JLabel LabelLogo_jr;
    private javax.swing.JButton btnSalidaS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel labelElimina_todo;
    public static javax.swing.JLabel labelEliminar;
    public static javax.swing.JLabel labelPago_pendiente;
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
