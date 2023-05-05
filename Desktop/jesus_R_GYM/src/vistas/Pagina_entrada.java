
package vistas;

import entidades.Usuarios;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class Pagina_entrada extends javax.swing.JFrame {
    
     public static Administracion ingreAdmin;
     public static Operaciones_Asistencia ingreAsistenciaOA;
     public static Administracion abrePG_entrada;
    
   
     Usuarios usuar;
    UIManager UI;

   
    public Pagina_entrada(Usuarios usuar) {
        initComponents();
        txtUsuario_id.setVisible (false);
        this.setTitle ("MODULO-ENTRADA");
       
        this.setDefaultCloseOperation (JFrame.DO_NOTHING_ON_CLOSE);
        this.setExtendedState (Pagina_entrada.MAXIMIZED_BOTH);
       
        setIconImage(getIconImage());

        this.usuar = usuar;

        if (usuar.getIdRol () == 1 || usuar.getIdRol () == 2) {

            txtUsuario_id.setText ("" + usuar.getIdusuario ());

            btnMod_admin.setVisible (true);
        } else {
            //btnMod_admin.setEnabled(false);
        }
         if (usuar.getIdRol () == 3) {
              txtUsuario_id.setText ("" + usuar.getIdusuario ());
         }
    }

    public Pagina_entrada () {
        initComponents ();
        this.setTitle ("MODULO ENTRADA");
        

    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logoVentana.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondoEntrada = new javax.swing.JPanel();
        PanelBlanco2 = new javax.swing.JPanel();
        PanelBlanco3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PanelVerde = new javax.swing.JPanel();
        PanelAmarillo = new javax.swing.JPanel();
        txtUsuario_id = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnIngresarPago = new javax.swing.JButton();
        btnMod_admin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFondoEntrada.setBackground(new java.awt.Color(255, 255, 255));
        PanelFondoEntrada.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelBlanco2.setBackground(new java.awt.Color(255, 255, 255));
        PanelBlanco2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelBlanco2MouseClicked(evt);
            }
        });
        PanelBlanco2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelBlanco3.setBackground(new java.awt.Color(255, 255, 255));
        PanelBlanco3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelBlanco3MouseClicked(evt);
            }
        });
        PanelBlanco3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SALIR");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelBlanco3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        PanelBlanco2.add(PanelBlanco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 560, 290, 30));

        PanelFondoEntrada.add(PanelBlanco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 290, 30));

        PanelVerde.setBackground(new java.awt.Color(0, 204, 0));
        PanelVerde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelVerdeMouseClicked(evt);
            }
        });
        PanelFondoEntrada.add(PanelVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 430, 30));

        PanelAmarillo.setBackground(new java.awt.Color(255, 255, 0));
        PanelAmarillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelAmarilloMouseClicked(evt);
            }
        });
        PanelFondoEntrada.add(PanelAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 510, 30));
        PanelFondoEntrada.add(txtUsuario_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 50, 30));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asistDiaria5.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asistDiaria6.png"))); // NOI18N
        btnSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asistDiaria6.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        PanelFondoEntrada.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 560, 290, 30));

        btnIngresarPago.setBackground(new java.awt.Color(255, 255, 0));
        btnIngresarPago.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnIngresarPago.setForeground(new java.awt.Color(0, 51, 102));
        btnIngresarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asistDiaria.png"))); // NOI18N
        btnIngresarPago.setBorder(null);
        btnIngresarPago.setBorderPainted(false);
        btnIngresarPago.setContentAreaFilled(false);
        btnIngresarPago.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asistDiaria2.png"))); // NOI18N
        btnIngresarPago.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asistDiaria.png"))); // NOI18N
        btnIngresarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarPagoActionPerformed(evt);
            }
        });
        PanelFondoEntrada.add(btnIngresarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 560, 30));

        btnMod_admin.setBackground(new java.awt.Color(0, 204, 0));
        btnMod_admin.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnMod_admin.setForeground(new java.awt.Color(0, 51, 102));
        btnMod_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asistDiaria3.png"))); // NOI18N
        btnMod_admin.setBorderPainted(false);
        btnMod_admin.setContentAreaFilled(false);
        btnMod_admin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asistDiaria4.png"))); // NOI18N
        btnMod_admin.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asistDiaria3.png"))); // NOI18N
        btnMod_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMod_adminActionPerformed(evt);
            }
        });
        PanelFondoEntrada.add(btnMod_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 510, 360, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoListo.jpg"))); // NOI18N
        PanelFondoEntrada.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1300, 700));

        getContentPane().add(PanelFondoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelVerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelVerdeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelVerdeMouseClicked

    private void PanelAmarilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelAmarilloMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelAmarilloMouseClicked

    private void btnMod_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMod_adminActionPerformed
        
         if (usuar.getIdRol() == 3){
             UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "No Esta Autorizado a Ingresar a Este Modulo",
                    "ADMINISTRACION", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
            
            
        }else if (ingreAdmin != null) {
            
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de ADMINISTRACION se encuentra abierto",
                    "ADMINISTRACION", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
            
            
            
        }else if (ingreAdmin == null) {

              Pagina_entrada.ingreAdmin = null;
            this.dispose();
	   
            ingreAdmin = new Administracion(usuar);
            ingreAdmin.setVisible(true);
	}
    }//GEN-LAST:event_btnMod_adminActionPerformed

    private void btnIngresarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarPagoActionPerformed

        if (Administracion.ingreAsistenciaADM != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de Asistencia esta abierto en ADMINISTRACION",
                    "ASISTENCIAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
            return;
        }
        if (ingreAsistenciaOA == null) {

	   
            ingreAsistenciaOA = new Operaciones_Asistencia(usuar);
            ingreAsistenciaOA.setVisible(true);
	}
    }//GEN-LAST:event_btnIngresarPagoActionPerformed

    private void PanelBlanco3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBlanco3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelBlanco3MouseClicked

    private void PanelBlanco2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBlanco2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelBlanco2MouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Pagina_entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagina_entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagina_entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagina_entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Pagina_entrada().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAmarillo;
    private javax.swing.JPanel PanelBlanco2;
    private javax.swing.JPanel PanelBlanco3;
    private javax.swing.JPanel PanelFondoEntrada;
    private javax.swing.JPanel PanelVerde;
    private javax.swing.JButton btnIngresarPago;
    private javax.swing.JButton btnMod_admin;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtUsuario_id;
    // End of variables declaration//GEN-END:variables


     // FUNCION  PARA  MOSTRAR  LAS  IMAGENES  EN  EL  TITULO  DE  LAS  VENTANAS
  

    /* FUNCION  PARA  COLOCAR  ICONO  A LAS  VENTANAS DE DIALOGOS  DE LOS JOPCIONPANEL*/
    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }



}
