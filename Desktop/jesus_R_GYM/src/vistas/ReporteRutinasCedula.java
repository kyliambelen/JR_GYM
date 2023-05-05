package vistas;

import bd.Conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.plaf.FontUIResource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class ReporteRutinasCedula extends javax.swing.JFrame {

    UIManager UI;
    private final Conexion conexion = new Conexion();

    public static BuscarPorRutinas buscaCedula_ru;

    public ReporteRutinasCedula() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle("RUTINAS");
         setIconImage(getIconImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRutina2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAbrirCedula = new javax.swing.JButton();
        txtNombresA = new javax.swing.JTextField();
        txtCedulaRutina = new javax.swing.JTextField();
        btnBuscarRutina_cedula = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(490, 273));
        setResizable(false);
        setSize(new java.awt.Dimension(490, 273));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelRutina2.setBackground(new java.awt.Color(0, 153, 204));
        PanelRutina2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RUTINAS POR CEDULAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Extra Bold", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelRutina2.setPreferredSize(new java.awt.Dimension(490, 273));
        PanelRutina2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CEDULA");
        PanelRutina2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 80, 20));

        btnAbrirCedula.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 11)); // NOI18N
        btnAbrirCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonUnico.png"))); // NOI18N
        btnAbrirCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAbrirCedula.setContentAreaFilled(false);
        btnAbrirCedula.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonUnico2.png"))); // NOI18N
        btnAbrirCedula.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonUnico.png"))); // NOI18N
        btnAbrirCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirCedulaActionPerformed(evt);
            }
        });
        PanelRutina2.add(btnAbrirCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 90, 40, 30));

        txtNombresA.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        txtNombresA.setForeground(new java.awt.Color(102, 102, 102));
        txtNombresA.setToolTipText("");
        PanelRutina2.add(txtNombresA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 220, 30));

        txtCedulaRutina.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        txtCedulaRutina.setForeground(new java.awt.Color(102, 102, 102));
        PanelRutina2.add(txtCedulaRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 220, 30));

        btnBuscarRutina_cedula.setBackground(new java.awt.Color(0, 153, 204));
        btnBuscarRutina_cedula.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        btnBuscarRutina_cedula.setForeground(new java.awt.Color(0, 0, 153));
        btnBuscarRutina_cedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonBuscar.png"))); // NOI18N
        btnBuscarRutina_cedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnBuscarRutina_cedula.setContentAreaFilled(false);
        btnBuscarRutina_cedula.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonBuscar2.png"))); // NOI18N
        btnBuscarRutina_cedula.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonBuscar.png"))); // NOI18N
        btnBuscarRutina_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRutina_cedulaActionPerformed(evt);
            }
        });
        PanelRutina2.add(btnBuscarRutina_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 150, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoJR3.png"))); // NOI18N
        PanelRutina2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 150, 150));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        PanelRutina2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 150, 10));

        getContentPane().add(PanelRutina2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 273));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirCedulaActionPerformed

        Operaciones_rutinas REOR = null;

        buscaCedula_ru = new BuscarPorRutinas(REOR, true);
        buscaCedula_ru.setVisible(true);
    }//GEN-LAST:event_btnAbrirCedulaActionPerformed

    private void btnBuscarRutina_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRutina_cedulaActionPerformed

        mostrarRutinas_cedula();

        Operaciones_rutinas.rutinaCedula = null;
        Reportes.reportCedula = null;
        this.dispose();
    }//GEN-LAST:event_btnBuscarRutina_cedulaActionPerformed

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
            java.util.logging.Logger.getLogger(ReporteRutinasCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteRutinasCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteRutinasCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteRutinasCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteRutinasCedula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelRutina2;
    public static javax.swing.JButton btnAbrirCedula;
    private javax.swing.JButton btnBuscarRutina_cedula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtCedulaRutina;
    public static javax.swing.JTextField txtNombresA;
    // End of variables declaration//GEN-END:variables


    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
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

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void mostrarRutinas_cedula() {

        if (txtCedulaRutina.getText().isEmpty()) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Ingrese El Numero de La Cedula",
                    "RUTINAS", JOptionPane.PLAIN_MESSAGE, icono("/img/panelfacturas.png", 60, 60));

        } else {

            try {
                Connection conn = conexion.conectar();

                JasperReport reporte = null;

                Map parametro = new HashMap();

                parametro.put("cedula", txtCedulaRutina.getText());
                parametro.put("ruta_img", ReporteRutinasCedula.class.getResource("/reportes/logo1.png"));

                reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reportVerRutinas_porCedulas.jasper"));

                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);

                JasperViewer view = new JasperViewer(jprint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                view.setVisible(true);
                view.setTitle("RUTINAS");
            } catch (Exception e) {
            }

        }

    }

}
