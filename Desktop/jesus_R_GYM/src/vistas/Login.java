
package vistas;

import bd.hash;
import dao.UsuariosDao;
import entidades.Usuarios;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class Login extends javax.swing.JFrame {

      int xMouse, yMouse;
     UIManager UI;
    public Login() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/img/logoVentana.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PanelPrincipal_login = new javax.swing.JPanel();
        JpanelBanner = new javax.swing.JPanel();
        panelX = new javax.swing.JPanel();
        labelX = new javax.swing.JLabel();
        jLabelSisfaven = new javax.swing.JLabel();
        txtUsuarioLogin = new javax.swing.JTextField();
        txtpassLogin = new javax.swing.JPasswordField();
        btnEntrarL = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(37, 37, 71));
        jLabel7.setText("© DISEÑADO POR MIGUEL A. RODRIGUEZ");

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(820, 430));
        setResizable(false);
        setSize(new java.awt.Dimension(820, 430));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal_login.setBackground(new java.awt.Color(79, 147, 254));
        PanelPrincipal_login.setMinimumSize(new java.awt.Dimension(820, 430));
        PanelPrincipal_login.setPreferredSize(new java.awt.Dimension(820, 430));
        PanelPrincipal_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JpanelBanner.setOpaque(false);
        JpanelBanner.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JpanelBannerMouseDragged(evt);
            }
        });
        JpanelBanner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JpanelBannerMousePressed(evt);
            }
        });
        JpanelBanner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelX.setBackground(new java.awt.Color(63, 50, 60));
        panelX.setMinimumSize(new java.awt.Dimension(50, 50));
        panelX.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelXMouseDragged(evt);
            }
        });
        panelX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelXMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelXMousePressed(evt);
            }
        });
        panelX.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelX.setBackground(new java.awt.Color(79, 147, 254));
        labelX.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        labelX.setForeground(new java.awt.Color(204, 204, 0));
        labelX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelX.setText("X");
        labelX.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelX.setMaximumSize(new java.awt.Dimension(50, 50));
        labelX.setMinimumSize(new java.awt.Dimension(50, 50));
        labelX.setOpaque(true);
        labelX.setPreferredSize(new java.awt.Dimension(50, 50));
        labelX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelXMouseExited(evt);
            }
        });
        panelX.add(labelX, new org.netbeans.lib.awtextra.AbsoluteConstraints(-14, -5, 70, 60));

        JpanelBanner.add(panelX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        PanelPrincipal_login.add(JpanelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 50));
        PanelPrincipal_login.add(jLabelSisfaven, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 80));

        txtUsuarioLogin.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        txtUsuarioLogin.setForeground(new java.awt.Color(0, 153, 204));
        txtUsuarioLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 102), null));
        txtUsuarioLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioLoginMousePressed(evt);
            }
        });
        txtUsuarioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioLoginActionPerformed(evt);
            }
        });
        PanelPrincipal_login.add(txtUsuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 220, 35));

        txtpassLogin.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtpassLogin.setForeground(new java.awt.Color(0, 153, 204));
        txtpassLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 102), null));
        txtpassLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtpassLoginMousePressed(evt);
            }
        });
        txtpassLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassLoginActionPerformed(evt);
            }
        });
        PanelPrincipal_login.add(txtpassLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 220, 35));

        btnEntrarL.setBackground(new java.awt.Color(0, 153, 204));
        btnEntrarL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEntrarL.setForeground(new java.awt.Color(0, 51, 153));
        btnEntrarL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginEntrar.png"))); // NOI18N
        btnEntrarL.setBorderPainted(false);
        btnEntrarL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEntrarL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEntrarL.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginEntrar2.png"))); // NOI18N
        btnEntrarL.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginEntrar.png"))); // NOI18N
        btnEntrarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarLActionPerformed(evt);
            }
        });
        PanelPrincipal_login.add(btnEntrarL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logingym.jpg"))); // NOI18N
        PanelPrincipal_login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 434, 430));
        PanelPrincipal_login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginAvatar.png"))); // NOI18N
        PanelPrincipal_login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 130, 110));

        jLabel5.setFont(new java.awt.Font("Goudy Stout", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(37, 37, 71));
        jLabel5.setText("LOGIN");
        jLabel5.setAutoscrolls(true);
        PanelPrincipal_login.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 160, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(37, 37, 71));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TODOS LOS DERECHOS RESERVADOS");
        PanelPrincipal_login.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 210, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(37, 37, 71));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("© DISEÑADO POR MIGUEL A. RODRIGUEZ");
        PanelPrincipal_login.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 210, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/userCandado2.png"))); // NOI18N
        PanelPrincipal_login.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 45, 45));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuariologin.png"))); // NOI18N
        jLabel11.setToolTipText("");
        PanelPrincipal_login.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 60, 40));

        getContentPane().add(PanelPrincipal_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelXMouseClicked

        System.exit(0);
    }//GEN-LAST:event_labelXMouseClicked

    private void labelXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelXMouseEntered

    }//GEN-LAST:event_labelXMouseEntered

    private void labelXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelXMouseExited

    }//GEN-LAST:event_labelXMouseExited

    private void panelXMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelXMouseDragged

    }//GEN-LAST:event_panelXMouseDragged

    private void panelXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelXMouseEntered
        panelX.setBackground(Color.red);
        labelX.setForeground(Color.white);
    }//GEN-LAST:event_panelXMouseEntered

    private void panelXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelXMouseExited
        panelX.setBackground(new Color(63,50,60));
        labelX.setForeground(Color.black);
    }//GEN-LAST:event_panelXMouseExited

    private void panelXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelXMousePressed

    }//GEN-LAST:event_panelXMousePressed

    private void JpanelBannerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelBannerMouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_JpanelBannerMouseDragged

    private void JpanelBannerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelBannerMousePressed

        xMouse = evt.getX ();
        yMouse = evt.getY ();
    }//GEN-LAST:event_JpanelBannerMousePressed

    private void txtUsuarioLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioLoginMousePressed
        /* if (txtUsuarioLogin.getText ().equals ("Ingrese su nombre de usuario")) {
            txtUsuarioLogin.setText ("");
            txtUsuarioLogin.setForeground (new Color(50,231,4));
            txtUsuarioLogin.setFont (new Font ("Roboto", Font.BOLD, 20));
        }
        if (String.valueOf (txtpassLogin.getPassword ()).isEmpty ()) {
            txtpassLogin.setText ("********");
            txtpassLogin.setForeground (Color.gray);

        }*/
    }//GEN-LAST:event_txtUsuarioLoginMousePressed

    private void txtUsuarioLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioLoginActionPerformed
        txtpassLogin.requestFocus ();
    }//GEN-LAST:event_txtUsuarioLoginActionPerformed

    private void txtpassLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassLoginMousePressed
        /*if (String.valueOf (txtpassLogin.getPassword ()).equals ("********")) {
            txtpassLogin.setText ("");
            txtpassLogin.setForeground (new Color(255,223,1));

            txtpassLogin.setFont (new Font ("Roboto Black", 1,20));
        }
        if (txtUsuarioLogin.getText ().isEmpty ()) {
            txtUsuarioLogin.setText ("Ingrese su nombre de usuario");
            txtUsuarioLogin.setForeground (Color.gray);
        }*/
    }//GEN-LAST:event_txtpassLoginMousePressed

    private void txtpassLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassLoginActionPerformed
        loginUser ();
    }//GEN-LAST:event_txtpassLoginActionPerformed

    private void btnEntrarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarLActionPerformed
        loginUser ();
    }//GEN-LAST:event_btnEntrarLActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelBanner;
    private javax.swing.JPanel PanelPrincipal_login;
    private javax.swing.JButton btnEntrarL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSisfaven;
    private javax.swing.JLabel labelX;
    private javax.swing.JPanel panelX;
    private javax.swing.JTextField txtUsuarioLogin;
    private javax.swing.JPasswordField txtpassLogin;
    // End of variables declaration//GEN-END:variables

 public void loginUser () {

        Usuarios usuar = new Usuarios ();
        UsuariosDao modusu = new UsuariosDao ();

        String pass = new String (txtpassLogin.getPassword ());

        if (!txtUsuarioLogin.getText ().equals ("") && !pass.equals ("")) {

            String nuevoPass = hash.sha1 (pass);

            usuar.setUsuario (txtUsuarioLogin.getText ());
            usuar.setClave (nuevoPass);

            try {
                if (modusu.login (usuar)) {

		     Pagina_entrada pagEntrada = new Pagina_entrada(usuar);
		    pagEntrada.setVisible(true);
		    /*Pagina_entrada frmPentrada = new Pagina_entrada (usuar);
		    frmPentrada.setVisible (true);*/
                    dispose ();
                } else {

                    UI = null;
                    UI.put ("OptionPane.background", new Color (255, 255, 255));
                    UI.put ("Panel.background", new Color (255, 255, 255));
                    UI.put ("OptionPane.messageFont", new FontUIResource (new Font ("Cambria", Font.BOLD, 16)));
                    UI.put ("OptionPane.buttonFont", new FontUIResource (new Font ("Cambria", Font.PLAIN, 20)));
                    UI.put ("OptionPane.messageForeground", Color.decode ("#0B0B3B"));
                    JOptionPane.showMessageDialog (this, "Sus Datos Son Incorrectos",
                            "Login", JOptionPane.INFORMATION_MESSAGE, icono ("/img/logoLogin.png", 40, 40));
                }
            } catch (SQLException ex) {
                Logger.getLogger (Login.class.getName ()).log (Level.SEVERE, null, ex);
            }

        } else {

            UI = null;
            UI.put ("OptionPane.background", new Color (255, 255, 255));
            UI.put ("Panel.background", new Color (255, 255, 255));
            UI.put ("OptionPane.messageFont", new FontUIResource (new Font ("Cambria", Font.BOLD, 16)));
            UI.put ("OptionPane.buttonFont", new FontUIResource (new Font ("Cambria", Font.PLAIN, 20)));
            UI.put ("OptionPane.messageForeground", Color.decode ("#0B0B3B"));
            JOptionPane.showMessageDialog (this, "Por Favor...Ingrese Sus Datos",
                    "Login", JOptionPane.INFORMATION_MESSAGE, icono ("/img/logoLogin.png", 40, 40));
        }

        txtUsuarioLogin.setText ("");
        txtpassLogin.setText ("");

    }
     

 /* FUNCION  PARA  COLOCAR  ICONO  A LAS  VENTANAS DE DIALOGOS  DE LOS JOPCIONPANEL*/
    public Icon icono (String path, int width, int heigth) {
        Icon img = new ImageIcon (new ImageIcon (getClass ().getResource (path)).getImage ().getScaledInstance (width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

}
