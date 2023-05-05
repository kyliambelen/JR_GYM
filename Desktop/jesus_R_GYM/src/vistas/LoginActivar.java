package vistas;

import bd.hash;
import dao.UsuariosDao;
import entidades.Supervisor_class;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class LoginActivar extends javax.swing.JFrame {

    UIManager UI;
    Supervisor_class pass;
    public static LoginActivar ingreSupervisor;

    public LoginActivar () {
        initComponents ();
        setDefaultCloseOperation (JFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle ("Activar");
         setIconImage(getIconImage());       
        this.setLocationRelativeTo (this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PAnelfondoBlanco = new javax.swing.JPanel();
        txtPassw_activar = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnEntrarP = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setFocusCycleRoot(false);
        setMinimumSize(new java.awt.Dimension(332, 290));
        setResizable(false);
        setSize(new java.awt.Dimension(332, 290));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PAnelfondoBlanco.setBackground(new java.awt.Color(255, 255, 255));
        PAnelfondoBlanco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 102, 255), null, null));
        PAnelfondoBlanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPassw_activar.setToolTipText("");
        txtPassw_activar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 0, 0), null, null));
        txtPassw_activar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassw_activarActionPerformed(evt);
            }
        });
        txtPassw_activar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassw_activarKeyPressed(evt);
            }
        });
        PAnelfondoBlanco.add(txtPassw_activar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 250, 32));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("  PASSWORD");
        PAnelfondoBlanco.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 210, -1));

        btnExit.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salgo2.png"))); // NOI18N
        btnExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salgo.png"))); // NOI18N
        btnExit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salgo2.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        PAnelfondoBlanco.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 80, 30));

        btnEntrarP.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btnEntrarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anularEntrar.png"))); // NOI18N
        btnEntrarP.setToolTipText("");
        btnEntrarP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEntrarP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEntrarP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anularEntrar2.png"))); // NOI18N
        btnEntrarP.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anularEntrar.png"))); // NOI18N
        btnEntrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarPActionPerformed(evt);
            }
        });
        PAnelfondoBlanco.add(btnEntrarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 80, 30));

        jPanel1.add(PAnelfondoBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 305, 180));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), null));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DESBLOQUEAR");
        jLabel3.setToolTipText("");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 140, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 305, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarPActionPerformed

        loginActivar ();
    }//GEN-LAST:event_btnEntrarPActionPerformed

    private void txtPassw_activarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassw_activarKeyPressed

    }//GEN-LAST:event_txtPassw_activarKeyPressed

    private void txtPassw_activarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassw_activarActionPerformed
        loginActivar ();
    }//GEN-LAST:event_txtPassw_activarActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        Operaciones_Asistencia.ingreLogin_activar = null;

        this.dispose ();
    }//GEN-LAST:event_btnExitActionPerformed
    /*  ******************************************************************************************************************************************************  */
    public void loginActivar () {

        Supervisor_class userr = new Supervisor_class ();
        UsuariosDao userDao = new UsuariosDao ();

        String pass = new String (txtPassw_activar.getPassword ());

        if (!pass.equals ("")) {

            if (userr.getRol () != 3) {

                String nuevoPass = hash.sha1 (pass);

                userr.setClave (nuevoPass);

                try {
                    if (userDao.loginBlock (userr)) {

                        Supervisor frmsupervi = new Supervisor (userr);
                        frmsupervi.setVisible (true);
                        txtPassw_activar.setText ("");
                        txtPassw_activar.requestFocus ();
                        
                        Operaciones_Asistencia.ingreLogin_activar = null;

                        this.dispose ();

                    } else {

                        UI = null;
                        UIManager.put ("OptionPane.background", new Color (255, 255, 255));
                        UIManager.put ("Panel.background", new Color (255, 255, 255));
                        UIManager.put ("OptionPane.messageFont", new FontUIResource (new Font ("Cambria", Font.BOLD, 16)));
                        UIManager.put ("OptionPane.buttonFont", new FontUIResource (new Font ("Cambria", Font.PLAIN, 20)));
                        UIManager.put ("OptionPane.messageForeground", Color.decode ("#0B0B3B"));
                        JOptionPane.showMessageDialog (this, "usted no está autorizado para ingresar AQUI...!!!",
                                "Activar", JOptionPane.INFORMATION_MESSAGE, icono ("/img/logoActivar.png", 40, 40));
                        txtPassw_activar.setText ("");
                        txtPassw_activar.requestFocus ();

                    }
                } catch (SQLException ex) {
                    Logger.getLogger (Login.class.getName ()).log (Level.SEVERE, null, ex);
                }

            } else {

                UI = null;
                UIManager.put ("OptionPane.background", new Color (255, 255, 255));
                UIManager.put ("Panel.background", new Color (255, 255, 255));
                UIManager.put ("OptionPane.messageFont", new FontUIResource (new Font ("Cambria", Font.BOLD, 16)));
                UIManager.put ("OptionPane.buttonFont", new FontUIResource (new Font ("Cambria", Font.PLAIN, 20)));
                UIManager.put ("OptionPane.messageForeground", Color.decode ("#0B0B3B"));
                JOptionPane.showMessageDialog (this, "Sus Datos Son Incorrectos",
                        "Activar", JOptionPane.INFORMATION_MESSAGE, icono ("/img/logoActivar.png", 40, 40));

                txtPassw_activar.setText ("");
                txtPassw_activar.requestFocus ();
            }

        } else {
            UI = null;
            UIManager.put ("OptionPane.background", new Color (255, 255, 255));
            UIManager.put ("Panel.background", new Color (255, 255, 255));
            UIManager.put ("OptionPane.messageFont", new FontUIResource (new Font ("Cambria", Font.BOLD, 16)));
            UIManager.put ("OptionPane.buttonFont", new FontUIResource (new Font ("Cambria", Font.PLAIN, 20)));
            UIManager.put ("OptionPane.messageForeground", Color.decode ("#0B0B3B"));
            JOptionPane.showMessageDialog (this, "Por Favor...Ingrese Sus Datos",
                    "Activar", JOptionPane.INFORMATION_MESSAGE, icono ("/img/logoActivar.png", 40, 40));
            txtPassw_activar.setText ("");
            txtPassw_activar.requestFocus ();
        }

    }

    /*  ******************************************************************************************************************************************************  */
    /**
     * @param args the command line arguments
     */
    public static void main (String args[]) {
        /* Set the windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels ()) {
                if ("windows".equals (info.getName ())) {
                    javax.swing.UIManager.setLookAndFeel (info.getClassName ());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger (LoginActivar.class.getName ()).log (java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger (LoginActivar.class.getName ()).log (java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger (LoginActivar.class.getName ()).log (java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger (LoginActivar.class.getName ()).log (java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater (() -> {
            new LoginActivar ().setVisible (true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PAnelfondoBlanco;
    private javax.swing.JButton btnEntrarP;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPassw_activar;
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
